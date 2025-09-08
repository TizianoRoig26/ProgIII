package tpToString;


import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();

        Producto p1 = new Producto(1, "Manzana", 100);
        Producto p2 = new Producto(2, "Pera", 90);
        Producto p3 = new Producto(1, "Manzana Roja", 120); // mismo código que p1
        Producto p4 = new Producto(3, "Banana", 70);
        Producto p5 = new Producto(2, "Pera Extra", 95);    // mismo código que p2

        productos.add(p1);
        productos.add(p2);
        productos.add(p3); // no se agrega
        productos.add(p4);
        productos.add(p5); // no se agrega

        // Mostrar set
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
