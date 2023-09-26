//package Clase3;

public class EjercicioClase {
    public static void main(String[] args) {
        Asignatura tallerProgramacion = new Asignatura("CIBA0", "Taller de Programacion");

        tallerProgramacion.listaEstudiantes[0] = new Estudiante("1111111-1", "Juan", "Ascencio", "Loboguerrero", 30);

        tallerProgramacion.listaEstudiantes[1] = new Estudiante("22222222-2", "Andres", "Castro", "Villa", 20);

        tallerProgramacion.listaEstudiantes[2] = new Estudiante("33333333-3", "Luis", "Pardo", "Soto", 25);

        tallerProgramacion.listaEstudiantes[1].estudia();

        tallerProgramacion.verEstudiantes();
    }
}
