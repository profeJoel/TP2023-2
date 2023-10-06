import java.util.ArrayList;

public class Reproductor{
    //private Cancion listaReproduccion[];
    private ArrayList<Cancion> listaReproduccion;
    //private int indiceLista;
    private int indiceCancionActual;
    private Cancion cancionActual;
    private int segundosTranscurridos;

    public Reproductor(){
        //this.listaReproduccion = new Cancion[5];
        this.listaReproduccion = new ArrayList<Cancion>(); 
        //this.indiceLista = -1;
        this.indiceCancionActual = -1;
        this.segundosTranscurridos = 0;
    }

    public void guardarCancion(Cancion nuevaCancion){
        // if(this.indiceLista < 5){
        //     this.indiceLista++;
        //     this.listaReproduccion[this.indiceLista] = nuevaCancion;
        // }
        // else
        //     System.out.println("No se puede agregar la cancion, lista completa...");
        this.listaReproduccion.add(nuevaCancion);
    }

    public void reproducirCancion(){
        // if(this.indiceCancionActual >= -1 && this.indiceLista > -1 && this.indiceCancionActual < 5){
        //     this.siguienteCancion();
        //     System.out.println("Cancion en reproduccion: " + this.cancionActual);
        //     for (int i = 0; i < this.cancionActual.getDuracion(); i++){
        //         System.out.println(i);
        //         this.segundosTranscurridos = i;
        //     }
        // }
        this.siguienteCancion();
        System.out.println("Cancion en reproduccion: " + this.cancionActual);
        for (int i = 0; i < this.cancionActual.getDuracion(); i++){
                System.out.println(i);
                this.segundosTranscurridos = i;
        }
    }

    public void siguienteCancion(){
        // if(this.indiceCancionActual >= -1 && this.indiceLista > -1 && this.indiceCancionActual < 5)
        //     this.indiceCancionActual++;
        // if(this.indiceCancionActual == 5 || this.indiceCancionActual > this.indiceLista)
        //     this.indiceCancionActual = 0;
        
        // this.cancionActual = this.listaReproduccion[this.indiceCancionActual];
        this.indiceCancionActual = this.listaReproduccion.indexOf(this.cancionActual) + 1;
        this.cancionActual = this.listaReproduccion.get(this.indiceCancionActual);
    }

    public void reproducirLista(){
        //for(int i=0; i<= this.indiceLista; i++)
        for(Cancion c : this.listaReproduccion)
            this.reproducirCancion();
    }


}