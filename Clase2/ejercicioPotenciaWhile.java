package Clase2;
import java.util.Scanner;

class ejercicioPotenciaWhile{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese Base");
        int base = lector.nextInt();
        System.out.println("Ingrese Exp");
        int exp = lector.nextInt();

        int pot = 1;

        while(exp > 0){
            pot = pot * base;
            exp = exp - 1;
        }

        System.out.println("La potencia es " + pot);


        
    }
}