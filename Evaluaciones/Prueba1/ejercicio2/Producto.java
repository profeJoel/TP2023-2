public class Producto{
    protected int id;
    protected String nombre;

    public Producto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String toString(){
        return "Producto: " + this.nombre + " (" + this.id + ")";
    }
}