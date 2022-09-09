package EjerciciosResueltos.Ejercicio1;

public class Ejercio1 {


    public static void main(String[] args){

        Cuenta c1 = new Cuenta("Tande Matias", 200);


        System.out.println("\tBIENVENIDO");

        System.out.println("Titular: "+c1.getTitular());
        System.out.println("Cantidad: $"+c1.getCantidad());
        System.out.println("\nSe ingresan $200");

        c1.ingresar(200);
        System.out.println("Cantidad: $"+c1.getCantidad());

        System.out.println("\nSe retiran $250");
        c1.retirar(250);
        System.out.println("Cantidad: $"+c1.getCantidad());

        System.out.println(c1.toString());


    }

}
