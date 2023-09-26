package Clase2;
import java.util.Scanner;

class ejercicioMayorMenorEdad{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = lector.nextInt();

        if(edad>=18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}