import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // Mascota primero y luego Amo
        //Version1
        //Mascota m1 = new Mascota("Jack", "Canino", "Siveriano", "12/06/2017");
        //Amo a1 = new Amo("Felipe", "00/00/2003", "Puerto Montt", m1);
        //version2
        //Amo a1 = new Amo("Felipe", "00/00/2003", "Puerto Montt", new Mascota("Jack", "Canino", "Siveriano", "12/06/2017"));

        //Version 3 - primero el Amo y luego la mascota
        Amo a1 = new Amo("Felipe", "00/00/2003", "Puerto Montt");
        a1.setMascota(new Mascota("Jack", "Canino", "Siveriano", "12/06/2017"));


        a1.verMascota();


    }
}