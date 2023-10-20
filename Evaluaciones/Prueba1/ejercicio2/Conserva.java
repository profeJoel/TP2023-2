public class Conserva extends Producto{
    private String fechaElaboracion;
    private String formato;

    public Conserva(int id, String nombre, String fechaElaboracion, String formato){
        super(id, nombre);
        this.fechaElaboracion = fechaElaboracion;
        this.formato = formato;
    }

    public String toString(){
        return "Conserva: " + this.nombre + "(" + this.id + ")" + " Fecha Elaboracion: " + this.fechaElaboracion + ", formato: " + this.formato;
    }
}