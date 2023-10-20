package Evaluaciones.Prueba1;
public class Conductor{
    private String rut;
    private String nombreCompleto;
    private String fechaNacimiento;

    public Conductor(String rut, String nombreCompleto, String fechaNacimiento){
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarDatos(){
        System.out.println(this.nombreCompleto + " (" + this.rut + ") <" + this.fechaNacimiento + ">");
    }

    public String toString(){
        return this.nombreCompleto + " (" + this.rut + ") <" + this.fechaNacimiento + ">";
    }
}