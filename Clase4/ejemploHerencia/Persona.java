//package ejemploHerencia;

public class Persona {
    protected String rut;
    protected String nombre;
    protected String apellidos;
    protected String fechaNacimiento;

    public Persona(String rut, String nombre, String apellidos, String fechaNacimiento){
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void camina(){
        System.out.println(this.nombre + " esta caminando...");
    }
    public void come(){
        System.out.println(this.nombre + " esta comiendo...");
    }
    public void habla(){
        System.out.println(this.nombre + " esta hablando...");
    }    
    public void habla(String algo){
        System.out.println(this.nombre + " esta hablando: '" + algo + "'");
    }
}
