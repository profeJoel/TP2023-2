package Clase2;
import java.util.Scanner;

public class ejercicioArregloString {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        String estudiantes[];
        estudiantes = new String[5];

        for(int posicion = 0; posicion<5; posicion++){
            System.out.println("Ingrese el nombre de un companero: ");
            estudiantes[posicion] = lector.nextLine();
        }

        //for(int posicion = 0; posicion<5; posicion++){
        for(String estudiante : estudiantes){
            System.out.println("Estudiante: " + estudiante);
        }

    }
}
