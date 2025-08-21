package integrador;

public class Producto implements Valuable{
    private String id;
    private double precio;

    public Producto(String id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }
}
