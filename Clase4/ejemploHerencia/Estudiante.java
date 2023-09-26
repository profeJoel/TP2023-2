//package ejemploHerencia;


//Estudiante es una SUBCLASE que extiende desde Persona SUPERCLASE
public class Estudiante extends Persona{
    private int generacion;
    private String carrera;

    public Estudiante(String rut, String nombre, String apellidos, String fechaNacimiento, int generacion, String carrera){
        super(rut, nombre, apellidos, fechaNacimiento);
        this.generacion = generacion;
        this.carrera = carrera;
    }

    public void estudia(){
        System.out.println(this.nombre + " esta estudiando...");
    }
}
