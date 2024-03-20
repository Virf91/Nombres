package org.example;

public class Peluche extends Juguete{
    int tamanio;

    public Peluche(String nombre, Double precio, int stock, int tamanio) {
        super(nombre, precio, stock);
        this.tamanio = tamanio;
    }

    public int gettamanio() {
        return tamanio;
    }

    public void settamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void calcularPrecio() {
       if (tamanio> 50){
           precio= precio + (precio * 0.08);
       }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tamaño: " + tamanio + " cm.");
    }

    @Override
    public int compareTo(Juguete otroJuguete) {
        return super.compareTo(otroJuguete);
    }
}
