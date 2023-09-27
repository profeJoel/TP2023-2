
//package ejemploHerencia;

public class EjemploHerencia {


    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("1111111-1", "Pablo", "Marmol", "01/01/2000",2020, "ICI");
        Profesor p1 = new Profesor("22222-2", "Joel", "Torres", "00/00/0000", "TP", "Informatica");
        Funcionario f1 = new Funcionario("33333-3", "Mario", "Vecce", "03/03/2000", "Secretario", "o201");
    
        e1.estudia();
        p1.ensena();
        f1.trabaja();
    
        e1.camina();
        p1.camina();
        f1.camina();

        // Podemos generalizar el comportamiento

        Persona[] listaPersonas = new Persona[4]; // declaracion de una lista (arreglo estatico)
        listaPersonas[0] = new Persona("0000-1", "Rodrigo", "Mora", "09/09/2003");
        listaPersonas[1] = e1;
        listaPersonas[2] = p1;
        listaPersonas[3] = f1;

        for(Persona p : listaPersonas)
            System.out.println("Persona: " + p.nombre);

        e1.habla("ola k ace..");
        
        e1.habla();
        f1.habla();
        p1.habla();
    }
    
}
