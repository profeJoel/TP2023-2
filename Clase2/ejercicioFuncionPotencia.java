package Clase2;
import java.util.Scanner;

class ejercicioFuncionPotencia{
    static int potencia(int b, int e){
        int pot = 1;
        for(e=e; e > 0; e=e-1){
            pot = pot * b;
        }
        return pot;
    }
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese Base");
        int base = lector.nextInt();
        System.out.println("Ingrese Exp");
        int exp = lector.nextInt();

        System.out.println("La potencia es " + potencia(base,exp));


        
    }
}
