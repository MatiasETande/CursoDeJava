package parte02DeclarandoVariables;

public class ApiJavaMath {

    public static void main(String[] args){

        //Funciones trigonométricas habituales

        double angulo90 =  Math.toRadians(90);
        double angulo45 =  Math.toRadians(45);

        System.out.println("Math.sin: "+ Math.sin(angulo90));
        System.out.println("Math.cos: "+ Math.cos(0));
        System.out.println("Math.tan: "+ Math.tan(angulo45));
        System.out.println("Math.atan: "+ Math.atan(angulo90));
        System.out.println("Math.atan2: "+ Math.atan2(90,2));

        //La función exponencial y su inversa

        System.out.println("Math.exp: "+ Math.exp(1));
        System.out.println("Math.log.: "+ Math.log(1));

        //Las dos constantes PI y e

        System.out.println("Math.PI: "+ Math.PI);
        System.out.println("Math.: "+ Math.E);




    }


}
