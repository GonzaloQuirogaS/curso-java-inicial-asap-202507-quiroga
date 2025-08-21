package integrador;

public class Item implements Valuable {
    private int cantidad;
    private Producto producto;

    public Item(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public double calcularPrecio() {
        return producto.calcularPrecio() * cantidad;
    }
}
