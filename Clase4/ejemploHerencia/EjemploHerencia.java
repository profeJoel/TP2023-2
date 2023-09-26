
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
    }
    
}
