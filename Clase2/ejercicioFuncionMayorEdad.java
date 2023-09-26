package Clase2;
import java.util.Scanner;

public class ejercicioFuncionMayorEdad {

    static boolean esMayorEdad(int edad){
        if(edad >= 18)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = lector.nextInt();

        if(esMayorEdad(edad))
            System.out.println("Es mayor de edad...");
        else
            System.out.println("Es menor de edad...");
    }
}
