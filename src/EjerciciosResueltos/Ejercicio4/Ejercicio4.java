package EjerciciosResueltos.Ejercicio4;


import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<Integer> miLista = Arrays.asList(1,2,3,4,5);
        Vector v1 = new Vector(miLista);
        Vector v2 ;
        Vector v3 ;


        v2=v1.mulEscalar(2);
        System.out.println("v2: "+ v2.toString());

        System.out.println("Mi lista: "+v1.toString());


        v3 = v1.sumar(v2);
        v3.toString();
        System.out.println("Suma de vectores "+ v3.toString());



    }

}
