//package Clase3;

public class Estudiante {
    String rut;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;

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
}
