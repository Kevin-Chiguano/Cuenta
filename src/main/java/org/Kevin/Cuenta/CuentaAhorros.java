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
        if(saldo<=10){

            //se desactiva la cuenta
            estado=false;
        }
        else{

            estado=true;
        }
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
    public void depositar(float cantidad) {
        super.depositar(cantidad);
    }
}
