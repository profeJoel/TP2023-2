package ejemploClase;
//package Clase3;
import java.util.Scanner;

public class Estudiante {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;

    public Estudiante(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int edad){
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    void estudia(){
        System.out.println("El estudiante " + this.nombre + " esta estudiando...");
    }

    public String toString(){
        return "Estudiante: " + this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno + " (" + this.rut + ")";
    }


    // Getters permiten obtener informacion
    public String getRut(){
        return this.rut;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }

    public int getEdad(){
        return this.edad;
    }

    //Setters son metodos que permiten modificar la informacion de un atributo PRIVATE

    public void setNombre(String nuevoNombre){
        int autorizacion;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese 1 si el usuario tiene autorizacion.");
        autorizacion = lector.nextInt();

        if(autorizacion == 1){
            this.nombre = nuevoNombre;
        }
        else{
            System.out.println("No tiene autorizacion legal para cambio de nombre...");
        }
    }
}
