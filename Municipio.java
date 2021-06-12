/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JUAN ARMANDO
 */
public class Municipio {

    //Atributos
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private int listado;

    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getListado() {
        return listado;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }
    
    //Método
    public float participacion(int votantes){
        float resultado = ((float)600/votantes)*100;
        return resultado;
    }

    public static void main(String[] args) {
        int id;
        String nombre;
        double latitud;
        double longitud;
        int listado;
        Municipio municipio = new Municipio();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el id del municipio: ");
        id = leer.nextInt();
        municipio.setId(id);

        System.out.print("Ingresa el nombre del municipio: ");
        nombre = leer.next();
        municipio.setNombre(nombre);

        System.out.print("Ingresa la latitud del municipio: ");
        latitud = leer.nextDouble();
        municipio.setLatitud(latitud);

        System.out.print("Ingresa la longitud del municipio: ");
        longitud = leer.nextDouble();
        municipio.setLongitud(longitud);

        System.out.print("Ingresa el número de listado de votantes: ");
        listado = leer.nextInt();
        municipio.setListado(listado);

        System.out.println("\nLa información del municipio es la siguiente:");
        System.out.println("ID del municipio: " + municipio.getId());
        System.out.println("Nombre del municipio: " + municipio.getNombre());
        System.out.println("Latitud del municipio: " + municipio.getLatitud());
        System.out.println("Longitud del municipio: " + municipio.getLongitud());
        System.out.println("Listado de personas del municipio: " + municipio.getListado());

        float resultado = municipio.participacion(listado);
        System.out.println("\nLa participación del municipio fue: " + resultado);

        leer.close();
    }
    
}
