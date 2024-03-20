package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Jugueteria jg = new Jugueteria();
        int tipo;
        String opc = "s";
        try {
            do {
                System.out.println("Desea cargar 1) Juego de mesa;" +
                        "2) Monopatin;" +
                        "3) Peluche ?");
                tipo = leer.nextInt();
                System.out.println("Ingrese nombre: ");
                String nombre = leer.next();
                System.out.println("Ingrese precio: ");
                double precio = leer.nextDouble();
                leer.nextLine();
                System.out.println("Ingrese stock: ");
                int stock = leer.nextInt();
                leer.nextLine();
                switch (tipo) {
                    case 1:
                        System.out.println("Ingrese edad maxima para este juego: ");
                        int edad  = leer.nextInt();
                        Juguete ludo = new JuegosDeMesa(nombre, precio, stock, edad);
                        jg.agregarJuguete(ludo);
                        break;
                    case 2:
                        System.out.println("Ingrese si es motorizado -true- de lo contrario -false-: ");
                        boolean motorizado = leer.nextBoolean();
                        Juguete mn = new Monopatin(nombre, precio, stock, motorizado);
                        jg.agregarJuguete(mn);
                        break;
                    case 3:
                        System.out.println("Ingrese el tamaño en cm: ");
                        int tam = leer.nextInt();
                        Juguete pel = new Peluche(nombre, precio, stock, tam);
                        jg.agregarJuguete(pel);
                        break;
                }

                System.out.println("Desea carga otro juguete? ");
                opc = leer.next();
            } while (!opc.equalsIgnoreCase("n"));

        } catch (InputMismatchException ie) {
            System.out.println("Error en el ingreso de los datos");
        } catch (Exception e) {
            System.out.println("Error general");
        } finally {
            System.out.println("En el bloque finally");
        }
        jg.ordenarPorNombre();
        jg.mostrarColeccion();
        jg.compraTotal();
    }
}