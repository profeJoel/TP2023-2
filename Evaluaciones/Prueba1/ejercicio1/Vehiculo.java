package Evaluaciones.Prueba1;
public class Vehiculo{
    private int id;
    private String tipo;
    private String marca;
    private Conductor conductor;

    public Vehiculo(int id, String tipo, String marca, Conductor conductor){
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.conductor = conductor;
    }

    public void mostrarDatos(){
        System.out.println("Vehiculo " + this.id + " tipo " + this.tipo + "\nMarca: " + this.marca + " -> conductor: " + this.conductor);
    }
}