class Mascota{
    private String nombre;
    private String especie;
    private String raza;
    private String fechaNacimiento;

    public Mascota(String nombre, String especie, String raza, String fechaNacimiento){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void come(String comida){
        System.out.println("La mascota " + this.nombre + " esta comiendo " + comida);
    }

    public String toString(){
        return "La mascota es: " + this.nombre + " " + this.especie + " " + this.raza + " " + this.fechaNacimiento;
    }
}