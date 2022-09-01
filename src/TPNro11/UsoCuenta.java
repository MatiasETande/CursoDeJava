package TPNro11;



public class UsoCuenta {

    public static void main(String[] args){

        CuentaCorriente cuenta1 = new CuentaCorriente("Tande Matias",10000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Bo Cruz",10000);

        cuenta1.enviarDinero(2500,cuenta2);

        cuenta1.mostrarDatos();
        cuenta1.mostrarSaldo();


        cuenta2.mostrarDatos();
        cuenta2.mostrarSaldo();



    }

}
