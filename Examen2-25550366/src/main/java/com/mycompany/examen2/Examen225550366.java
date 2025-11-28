package com.mycompany.examen2;

import java.util.Scanner;

public class Examen225550366 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, num;
        do {
            System.out.println("Introduce un entero que sea mayor a 1 (0 si deseas terminar el programa)");
            num = teclado.nextInt();
            if (num == 0) {
                System.out.println("Finalizar programa");
                break;

            }
            if (num <= 1) {
                System.out.println("Numero invalido");
                continue;

            }
            System.out.println("Introduce (1) para imprimir los numeros primos o (2) para imprimir los numeros no primos");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 2; i <= num; i++) { //NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS
                        for (int j = 1; j <= i; j++) {//NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS
                            System.out.print("*");//NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS

                        }
                        System.out.println("");
                    }
                    continue;
                case 2:
                    for (int i = 2; i <= num; i++) {//NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS
                        for (int j = 1; j <= i; j++) {//NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS
                            System.out.print("*");//NO SUPE HACER LOS NUMEROS PRIMOS O NO PRIMOS

                        }
                        System.out.println("");
                    }
                default:
                    System.out.println("Opcion invalida");
            }
        } while (true);
    }
}
