package org.example;

public abstract class Juguete implements Comparable<Juguete>{
    String nombre;
    Double precio;
    int stock;

    public Juguete(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $ " + precio);
        System.out.println("Cantidad en strock: " + stock);
    }
    public abstract void calcularPrecio();
    @Override
    public int compareTo(Juguete otroJuguete) {

        return String.CASE_INSENSITIVE_ORDER.compare(this.nombre, otroJuguete.nombre);
    }
}
