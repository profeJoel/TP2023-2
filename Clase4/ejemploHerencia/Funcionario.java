//package ejemploHerencia;


//Estudiante es una SUBCLASE que extiende desde Persona SUPERCLASE
public class Funcionario extends Persona{
    private String cargo;
    private String oficina;

    public Funcionario(String rut, String nombre, String apellidos, String fechaNacimiento, String cargo, String oficina){
        super(rut, nombre, apellidos, fechaNacimiento);
        this.cargo = cargo;
        this.oficina = oficina;
    }

    public void trabaja(){
        System.out.println(this.nombre + " esta trabajando...");
    }
}

