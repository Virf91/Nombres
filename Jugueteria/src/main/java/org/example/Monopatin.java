package org.example;

public class Monopatin extends Juguete{
    boolean motorizado;

    public Monopatin(String nombre, Double precio, int stock, boolean motorizado) {
        super(nombre, precio, stock);
        this.motorizado = motorizado;
    }

    public boolean isMotorizado() {
        return motorizado;
    }

    public void setMotorizado(boolean motorizado) {
        this.motorizado = motorizado;
    }

    @Override
    public void calcularPrecio() {
        if (motorizado){
            precio= precio + (precio * 0.10);
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Es motorizado? " + motorizado);
    }

    @Override
    public int compareTo(Juguete otroJuguete) {
        return super.compareTo(otroJuguete);
    }
}
