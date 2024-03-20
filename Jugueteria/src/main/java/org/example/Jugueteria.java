package org.example;


import java.util.ArrayList;
import java.util.Collections;

public class Jugueteria implements Compra{
    ArrayList<Juguete> coleccion = new ArrayList();
    public void agregarJuguete(Juguete juguete){
        coleccion.add(juguete);
    }
    public void mostrarColeccion(){
        for (Juguete juguete: coleccion) {
            juguete.mostrar();
        }
    }
    public void ordenarPorNombre(){
        Collections.sort(coleccion);
    }

    @Override
    public void compraTotal() {
        int suma=0;
        for (Juguete juguete: coleccion) {
           suma = suma + juguete.getStock();
        }
        System.out.println("La sumatoria total del stock de la jugueteria es " + suma);
    }
}
