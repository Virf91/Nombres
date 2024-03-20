package org.example;

public class JuegosDeMesa extends Juguete {
    int edad;

    public JuegosDeMesa(String nombre, Double precio, int stock, int edad) {
        super(nombre, precio, stock);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void calcularPrecio() {
        if (edad<= 12){
            precio= precio + (precio * 0.05);
        }
        if (edad >= 16){
            precio= precio + (precio * 0.07);
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Este juego es hasta " + edad + " años");
    }

    @Override
    public int compareTo(Juguete otroJuguete) {
        return super.compareTo(otroJuguete);
    }
}
