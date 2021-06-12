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
public class Seccion {
    
    //Atributos
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private int listado;
    private int municipio;
    private int distrito;

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
    public int getMunicipio() {
        return municipio;
    }
    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }
    public int getDistrito() {
        return distrito;
    }
    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }
    
    //Métodos
    public float participacion(int votantes){
        float resultado = ((float)600/votantes)*100;
        return resultado;
    }

    public int faltantes(int votantes){
        int resultado = votantes - 600;
        return resultado;
    }


    public static void main(String[] args) {
        int id;
        String nombre;
        double latitud;
        double longitud;
        int listado;
        int municipio;
        int distrito;

        Seccion seccion = new Seccion();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el id de la sección: ");
        id = leer.nextInt();
        seccion.setId(id);

        System.out.print("Ingresa el nombre de la sección: ");
        nombre = leer.next();
        seccion.setNombre(nombre);

        System.out.print("Ingresa la latitud de la sección: ");
        latitud = leer.nextDouble();
        seccion.setLatitud(latitud);

        System.out.print("Ingresa la longitud de la sección: ");
        longitud = leer.nextDouble();
        seccion.setLongitud(longitud);

        System.out.print("Ingresa el número de listado de votantes: ");
        listado = leer.nextInt();
        seccion.setListado(listado);

        System.out.print("Ingresa código del municipio de tu sección: ");
        municipio = leer.nextInt();
        seccion.setMunicipio(municipio);
        
        System.out.print("Ingresa código del distrito de tu sección: ");
        distrito = leer.nextInt();
        seccion.setDistrito(distrito);

        System.out.println("\nLa información del municipio es la siguiente:");
        System.out.println("ID de la sección: " + seccion.getId());
        System.out.println("Nombre de la sección: " + seccion.getNombre());
        System.out.println("Latitud de la sección: " + seccion.getLatitud());
        System.out.println("Longitud de la sección: " + seccion.getLongitud());
        System.out.println("Listado de personas de la sección: " + seccion.getListado());
        System.out.println("Código de municipio de la sección: " + seccion.getMunicipio());
        System.out.println("Código de distrito de la sección: " + seccion.getDistrito());


        float resultado = seccion.participacion(listado);
        System.out.println("\nLa participación de la seccion fue: " + resultado);

        float resultado2 = seccion.faltantes(listado);
        System.out.println("\nLa cantidad de faltantes fue: " + resultado2);

        leer.close();
    }
    
}
