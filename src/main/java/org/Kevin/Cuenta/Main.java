/* Author Kevin Chiguano
 * Version 1.0
 * Fecha 2024-05-20
 * Materia: Lenguajes de Programacion 2
 * : Examen 1
 */
package org.Kevin.Cuenta;

import java.util.Scanner;

/*
 * Esta clase contiene el método main que sirve como punto de entrada del programa.
 * Permite al usuario interactuar con cuentas corrientes y cuentas de ahorro.
 */
public class Main {

    /*
     * Método principal del programa.
     * Permite al usuario interactuar con cuentas corrientes y cuentas de ahorro.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salCorriente, tasaCorriente, salAhorros, tasaAhorros;
        System.out.println("\t\tDATOS DE LA CUENTA DE CORRIENTE:");
        // Solicitar y almacenar información sobre la cuenta corriente
        System.out.println("Ingrese el saldo de la cuenta corriente:");
        salCorriente = scanner.nextFloat();
        System.out.println("Ingrese la tasa anual para cuenta corriente:");
        tasaCorriente = scanner.nextFloat();

        // Crear una instancia de CuentaCorriente con la información proporcionada
        CuentaCorriente cuentaCorriente = new CuentaCorriente(salCorriente, tasaCorriente);

        // Solicitar y almacenar información sobre la cuenta de ahorros
        System.out.println("\t\tDATOS DE LA CUENTA DE AHORROS:");
        System.out.println("Ingrese el saldo de la cuenta de ahorros:");
        salAhorros = scanner.nextFloat();
        System.out.println("Ingrese la tasa anual para cuenta de ahorros:");
        tasaAhorros = scanner.nextFloat();

        // Crear una instancia de CuentaAhorros con la información proporcionada
        CuentaAhorros cuentaAhorros = new CuentaAhorros(salAhorros, tasaAhorros);

        boolean continuar = true;
        // Ciclo que permite al usuario elegir entre operaciones en cuentas corrientes, cuentas de ahorro o salir del programa
        while (continuar) {
            System.out.println("ESCOJA SU TIPO DE CUENTA:");
            System.out.println("1. Transaaciones en la cuenta corriente");
            System.out.println("2. Transacciones en la cuenta de ahorros");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Llamar al método para realizar operaciones en la cuenta corriente
                    operacionesCuentaCorriente(cuentaCorriente, scanner);
                    break;
                case 2:
                    // Llamar al método para realizar operaciones en la cuenta de ahorros
                    operacionesCuentaAhorros(cuentaAhorros, scanner);
                    break;
                case 3:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Error: Tome una opción válida.");
            }
        }

    }

    /*
     * Método para realizar operaciones en la cuenta corriente.
     * Permite al usuario depositar, retirar o imprimir información de la cuenta corriente.
     * @param cuenta La cuenta corriente en la que se realizarán las operaciones.
     * @param scanner Scanner para la entrada de datos del usuario.
     */
    private static void operacionesCuentaCorriente(CuentaCorriente cuenta, Scanner scanner) {
        boolean continuar = true;
        // Ciclo que permite al usuario realizar múltiples operaciones en la cuenta corriente antes de volver al menú principal
        while (continuar) {
            System.out.println("\t\tCUENTA DE CORRIENTE:");
            System.out.println("Operaciones en la cuenta corriente:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Imprimir información de la cuenta");
            System.out.println("4. Volver al menú principal");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Depositar dinero en la cuenta corriente
                    System.out.println("Ingrese la cantidad a depositar:");
                    float cantidadDepositar = scanner.nextFloat();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 2:
                    // Retirar dinero de la cuenta corriente
                    System.out.println("Ingrese la cantidad a retirar:");
                    float cantidadRetirar = scanner.nextFloat();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    // Imprimir información de la cuenta corriente
                    cuenta.imprimir();
                    break;
                case 4:
                    // Volver al menú principal
                    continuar = false;
                    break;
                default:
                    System.out.println("Error: Tome una opción válida.");
            }
        }
    }

    /*
     * Método para realizar operaciones en la cuenta de ahorros.
     * Permite al usuario depositar, retirar o imprimir información de la cuenta de ahorros.
     * @param cuenta La cuenta de ahorros en la que se realizarán las operaciones.
     * @param scanner Scanner para la entrada de datos del usuario.
     */
    private static void operacionesCuentaAhorros(CuentaAhorros cuenta, Scanner scanner) {
        boolean continuar = true;
        // Ciclo que permite al usuario realizar múltiples operaciones en la cuenta de ahorros antes de volver al menú principal
        while (continuar) {
            System.out.println("\t\tCUENTA DE AHORROS:");
            System.out.println("Operaciones en la cuenta de ahorros:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Imprimir información de la cuenta");
            System.out.println("4. Volver al menú principal");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Depositar dinero en la cuenta de ahorros
                    System.out.println("Ingrese la cantidad a depositar:");
                    float cantidadDepositar = scanner.nextFloat();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 2:
                    // Retirar dinero de la cuenta de ahorros
                    System.out.println("Ingrese la cantidad a retirar:");
                    float cantidadRetirar = scanner.nextFloat();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    // Imprimir información de la cuenta de ahorros
                    cuenta.imprimir();
                    break;
                case 4:
                    // Volver al menú principal
                    continuar = false;
                    break;
                default:
                    System.out.println("Error: elija una opción válida.");
            }
        }
    }
}
