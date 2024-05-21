/* Author Kevin
 * Version 1.0
 * Fecha 2024-05-14
 * Materia: Lenguajes de Programacion 2
 */
package org.Kevin.Cuenta;
/*Esta case denominada cuenta de ahorros modela una cuenta de ahorros
que es una subclase de Cuenta. Tiene un nuevo: activa.*/

public class CuentaAhorros extends Cuenta{

    /*Atributo que identifica si una cuenta esta activa;
    * la cauenta esta activa si su saldo es mayor a 10$*/
    private boolean estado;

    /**/
    /*Constructorr de la clase cuenta Ahorros
    * @param saldo, parametro que define el saldo de la cuenta
    * @param tasa Parametro que define la tasa anual*/
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);

        //Condicional para saber el si la cuenta se encueta activa o inactiva
        System.out.println(saldo);
        if(getSaldo()<10)
            //se desactiva la cuenta
            estado=false;
        else
            estado=true;
    }

    /*Metodo que permite depositar una cantidad de dinero*/
    public void depositar(float cantidad) {
        if(estado)
            super.depositar(cantidad);
    }

    /*Metodo que recibe una cantidad de dinero a retirar
    * y actualizar el estado de la cuenta
    * @param saldo, parametro que defina la cantidad a retirar
    * de una cuenta de ahorros*/
    public void retirar(float cantidad){
        //si la cuenta esta activa, se realiza el retiro
        if(estado)
            //Invocamos el metodo retirar de la clase padre
            super.retirar(cantidad);
    }
    //depositar extracto mensual e imprimir y terminar la cuenta corriente

    public void extractoMensual(){
        if(numeroRetiro>4){
            //super.retirar(getSaldo()-1);
            comisionMensual=comisionMensual+1;
        }
        super.extractoMensual();
        if(getSaldo()<=10)
            estado=false;
        else
            estado=true;
    }
    /*Metodo que imprime los valores del saldo actual
     * estado de la cuenta, Numero de transacciones y
     * comision mensual*/
    public void imprimir(){
        System.out.println("El saldo de la cuenta es: "+getSaldo());
        System.out.println("El estado de la cuenta es: "+(estado));
        System.out.println("La comision mensual: "+comisionMensual);
        System.out.println("Numero de Transacciones realizadas: "+(getNumeroRetiro()+getNumeroConsignacion()));
    }

}
