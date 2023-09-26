package Clase2;
import java.util.Scanner;

class ejercicioPotenciaFor{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese Base");
        int base = lector.nextInt();
        System.out.println("Ingrese Exp");
        int exp = lector.nextInt();

        int pot = 1;

        for(exp=exp; exp > 0; exp=exp-1){
            pot = pot * base;
        }

        System.out.println("La potencia es " + pot);


        
    }
}
