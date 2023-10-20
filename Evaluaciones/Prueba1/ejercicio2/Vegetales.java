public class Vegetales extends Producto{
    private String fechaCosecha;
    private String fechaVencimiento;

    public Vegetales(int id, String nombre, String fechaCosecha, String fechaVencimiento){
        super(id, nombre);
        this.fechaCosecha = fechaCosecha;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String toString(){
        return "Conserva: " + this.nombre + "(" + this.id + ")" + " Fechas: " + this.fechaCosecha + " - " + this.fechaVencimiento;
    }
}