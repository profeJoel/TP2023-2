package ejemploClase;
//package Clase3;

public class Asignatura {
    //Atributos
    String codigo;
    String nombre;
    Estudiante listaEstudiantes[];

    //Mestodos
    //El primer Metodo se llama Constructor (Builder)
    // En java tiene el mismo nombre que la clase
    // (en Python se llama __init__())
    public Asignatura(String codigo, String nombre){
        //El constructor le da identidad al objeto a traves de la palabra reservada "this"
        this.codigo = codigo; // permite obtener la informacion que se le entrega en la creacion del objeto
        this.nombre = nombre;
        this.listaEstudiantes = new Estudiante[3];
    }

    void verEstudiantes(){
        System.out.println("Lista Estudiantes asignatura: " + this.nombre);
        for(Estudiante estudiante : this.listaEstudiantes){
            System.out.println("Estudiante: " + estudiante);
        }
    }
}
