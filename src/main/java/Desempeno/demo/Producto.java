package Desempeno.demo;

public class Producto {
    public int id;
    public String nombre;
    public String producto;
    public int precio;
    public double IVA;


    public Producto(int id, String nombre, String producto, int precio, double IVA) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
        this.precio = precio;
        this.IVA = IVA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProducto() {
        return producto;
    }

    public double getIVA() {
        return precio * 0.19;
    }

    public double getPrecio() {
        return precio + getIVA();
    }
}
