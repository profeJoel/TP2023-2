public class Amo{
    private String nombre;
    private String fechaNacimiento;
    private String ciudad;
    private Mascota mascota;

    public Amo(String n, String f, String c, Mascota m){
        this.nombre = n;
        this.fechaNacimiento = f;
        this.ciudad = c;
        this.mascota = m;
    }

    public Amo(String n, String f, String c){
        this.nombre = n;
        this.fechaNacimiento = f;
        this.ciudad = c;
    }

    public void setMascota(Mascota nuevaMascota){
        this.mascota = nuevaMascota;
    }

    public void verMascota(){
        System.out.println("La mascota es: " + this.mascota);
    }
}