package ProbandoCosas;

public class ProbandoCosas {




    public static void main(String[] args){

        Clase1 obj = new Clase2();

        obj.metodo1();


    }


}

class Clase1{

    public void metodo1(){
        System.out.println(datos);
    }

    String datos = "datos";

}

class Clase2 extends Clase1{




    public  void  metodo1(String datos){
        super.metodo1();
        datos=datos;
        System.out.println(datos);
    }

    String datos = "Muchos datos";
}

class Perros extends Clase1{


    public Perros(String nombre){

    }


}