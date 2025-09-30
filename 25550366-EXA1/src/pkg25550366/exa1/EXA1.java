package pkg25550366.exa1;

import java.util.Scanner;

public class EXA1 {

    public static void main(String[] args) {
        int pin;
        System.out.println("Introduce tu pin");
        Scanner teclado = new Scanner(System.in);
        pin = teclado.nextInt();

        if (pin == 1234) {
            double saldo = 5000;
            int menu;
            System.out.println("1. Consultar saldo "
                    + " 2. Retirar dinero"
                    + " 3. Depositar dinero");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Tu saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el monto que deseas retirar");
                    double retiro = teclado.nextDouble();
                    if (retiro <= saldo) {
                        double saldo1 = saldo - retiro;
                        System.out.println("Tu saldo es: " + saldo1);
                        break;

                    } else {
                        System.out.println("No cuentas con el saldo suficiente");
                        break;
                    }
                case 3:
                    System.out.println("Cual es el monto que deseas ingresar");
                    double montoingresar = teclado.nextDouble();
                    if (montoingresar > 1) {
                        double saldo2 = montoingresar + saldo;
                        System.out.println("Tu saldo actual es: " + saldo2);
                        break;
                    } else {
                        System.out.println("Monto invalido");
                    }

            }
        } else {
            System.out.println("Acceso denegado");

        }
    }

}
