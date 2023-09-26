package Clase2;
import java.util.Scanner;

class ejercicioSwitch{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su semestre");
        int semestre = lector.nextInt();

        switch(semestre){
            case 3:
                System.out.println("Asignaturas: CVV, FMF, T, Es, In");
                break;
            case 4: 
                System.out.println("Asignaturas: TP, ED, F2, T1, T2");
                break;
            default:
                System.out.println("No esta dentro del plan de estudios");
        }
        
    }
}