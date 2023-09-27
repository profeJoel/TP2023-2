//package ejemploHerencia;


//Profesor es una SUBCLASE que extiende desde Persona SUPERCLASE
public class Profesor extends Persona{
    private String asignaturas;
    private String area;

    public Profesor(String rut, String nombre, String apellidos, String fechaNacimiento, String asignaturas, String area){
        super(rut, nombre, apellidos, fechaNacimiento);
        this.asignaturas = asignaturas;
        this.area = area;
    }

    public void ensena(){
        System.out.println(this.nombre + " esta ensenando...");
    }

    @Override
    public void habla(){
        System.out.println(this.nombre + " esta hablando sobre las notas...");
    }
}
