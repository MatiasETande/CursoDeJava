package EjerciciosResueltos.Ejercicio3;

public class Ejercicio3 {


    public static void main(String[] args){

        Franccion f1 = new Franccion(3,3);
        Franccion f2 = new Franccion(3,3);
        Franccion f3 = f1.sumar(f2);


        //Nota: las fraccciones no estan simplificadas

        System.out.println("Suma: "+f3.toString());


        f3 = f1.multiplicar(f2);


        System.out.println("Multiplicacion: "+f3.toString());

    }
}
