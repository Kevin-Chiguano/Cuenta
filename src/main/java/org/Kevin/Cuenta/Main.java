package org.Kevin.Cuenta;
/*
 * Este programa simula el funcionamiento de cuentas corrientes y de ahorros.
 * Permite al usuario ingresar saldos y tasas de interés para ambas cuentas,
 * realizar transacciones como depositar y retirar dinero, e imprimir información
 * de la cuenta. Utiliza dos clases: CuentaCorriente y CuentaAhorros, que son
 * subclases de la clase abstracta Cuenta.
 *
 /* Author Kevin
 * Version 1.0
 * Fecha 2024-05-14
 * Materia: Lenguajes de Programacion 2
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salCorriente,tasaCorriente,salAhorros,tasaAhorros;
        /*Ingreso de saldo y tasa anual de la
        * cuenta Corriente*/

        System.out.println("Ingrese el saldo de la cuenta corriente:");
        salCorriente = scanner.nextFloat();
        System.out.println("Ingrese la tasa anual para cuenta corriente:");
        tasaCorriente = scanner.nextFloat();

        // Creacion de cuenta corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(salCorriente, tasaCorriente);

        /*Ingreso de saldo y tasa anual de la
         * cuenta de Ahorros*/
        System.out.println("Ingrese el saldo de la cuenta de ahorros:");
        salAhorros = scanner.nextFloat();
        System.out.println("Ingrese la tasa anual para cuenta de ahorros:");
        tasaAhorros = scanner.nextFloat();

        // Crear una cuenta de ahorros
        CuentaAhorros cuentaAhorros = new CuentaAhorros(salAhorros, tasaAhorros);

        /*Ingreso a cuenta de ahorros o
         *cuenta corriente MENU PRINCIPAL*/
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menú de operaciones:");
            System.out.println("1. Operaciones en la cuenta corriente");
            System.out.println("2. Operaciones en la cuenta de ahorros");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    transacciones(cuentaCorriente, scanner);
                    break;
                case 2:
                    transacciones(cuentaAhorros, scanner);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }

    }

    /*
     * Maneja las transacciones en una cuenta específica.
     *
     * @param cuenta   La cuenta en la que se realizarán las transacciones.
     * @param scanner  El objeto Scanner para entrada de usuario.
     */
    private static void transacciones(Cuenta cuenta, Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Operaciones en la cuenta:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Imprimir información de la cuenta");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar:");
                    float cantidadDepositar = scanner.nextFloat();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    float cantidadRetirar = scanner.nextFloat();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    cuenta.imprimir();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }
}