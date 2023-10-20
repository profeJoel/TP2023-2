package Evaluaciones.Prueba1;
public class Main{
    public static void main(String[] args) {
        Vehiculo auto1 = new Vehiculo(1, "sedan", "Nissan", new Conductor("11111111-1", "Juan Perez", "01/01/2001"));

        auto1.mostrarDatos();
    }
}