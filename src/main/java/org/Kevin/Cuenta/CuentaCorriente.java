/* Author Kevin
 * Version 1.0
 * Fecha 2024-05-14
 * Materia: Lenguajes de Programacion 2
 */
package org.Kevin.Cuenta;
/*
 * La clase CuentaCorriente extiende la clase Cuenta y
 * modela una cuenta corriente bancaria.
 */
public class CuentaCorriente extends Cuenta{
    /*Variable que almacena el monto del
    * sobregiro de la cuenta.*/
    public float sobreGiro=0;

    /*
     * Constructor de la clase CuentaCorriente.
     * @param saldo El saldo inicial de la cuenta.
     * @param tasaAnual La tasa de interés anual de la cuenta.
     */
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    /*
     * Método para realizar un retiro de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     */
    public void retirar(float cantidad){

        if(cantidad<=getSaldo()){
            super.retirar(cantidad);


        }else{
            float exedente=cantidad-getSaldo();
            super.retirar(getSaldo());
            sobreGiro+=exedente;
        }


    }

    /*
     * Método para depositar dinero en la cuenta.
     * @param cantidad La cantidad de dinero a depositar.
     */
    @Override
    public void depositar(float cantidad){
        if(sobreGiro>0){
            if(cantidad<=sobreGiro){
                sobreGiro-=cantidad;
            }
            else{
                cantidad-=sobreGiro;
                sobreGiro=0;
                super.depositar(cantidad);
            }
        }
        else {
            super.depositar(cantidad);
        }
    }

    /*
     * Método para generar un extracto mensual de la cuenta.
     */
    @Override
    public void extractoMensual() {
        super.extractoMensual();

    }

    /*
     * Método para imprimir el estado actual de la cuenta.
     */
    public void imprimir(){
        System.out.println("Saldo de la cuenta: "+getSaldo());
        System.out.println("Comision Mensual: "+comisionMensual);
        System.out.println("Numero de Transacciones realizadas: "+(getNumeroRetiro()+getNumeroConsignacion()));
        if(sobreGiro>0)
            System.out.println("Tiene un sobregiro de: "+sobreGiro);
    }
}
