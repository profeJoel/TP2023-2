import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Conserva(1,"atun", "01/01/2023","enlatado"));
        listaProductos.add(new Conserva(2,"pinna", "01/01/2022","enlatado"));
        listaProductos.add(new Vegetales(3,"lechuga", "01/10/2023","10/12/2023"));
        listaProductos.add(new Vegetales(4,"papas", "02/10/2023","31/01/2024"));

        for(Producto p : listaProductos)
            System.out.println(p);
    }
}