public class Cancion{
    private String nombre;
    private String album;
    private String artista;
    private String genero;
    private int duracion;

    public Cancion(String nombre, String album, String artista, String genero, int duracion){
        this.nombre = nombre;
        this.album = album;
        this.genero = genero;
        this.artista = artista;
        this.duracion = duracion;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public String toString(){
        return "Cancion: " + this.nombre + " - " + this.artista + " (" + this.duracion + "seg)";
    }


}