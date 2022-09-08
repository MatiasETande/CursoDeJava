package TPNro11;

import java.util.Random;

class CuentaCorriente {

    Random random = new Random();//Usado para crear numero aleatorios

    //Constructor
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = random.nextInt(999)+1;
    }


    //Atributo
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;


    //Metodos


    public void ingresoDinero(double dinero) {
        this.saldo = this.saldo + dinero;
    }

    public void retiroDinero(double dinero) {
        this.saldo = this.saldo - dinero;
    }

    public void  mostrarSaldo() {
        System.out.println("\nEl saldo de "+this.numeroCuenta+" es: "+this.saldo);
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public double getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void mostrarDatos(){
        System.out.println("Nombre Titular: "+getNombreTitular());
        System.out.format("Nro de Cuenta: %d", this.numeroCuenta);
    }

    public void enviarDinero(double dinero, CuentaCorriente cuenta) {

        this.retiroDinero(dinero);
        cuenta.ingresoDinero(dinero);


    }

}