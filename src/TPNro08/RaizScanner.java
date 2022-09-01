package TPNro08;

import java.util.Scanner;

public class RaizScanner {

    //Atributos
    private double radicando;


    //Metodos


    Scanner Leer = new Scanner(System.in);//Usado para leer por consola

    public void pedirRadicando(){

        setRadicando(Leer.nextDouble());

    }

    public void mostrarRaiz(){
        System.out.println("La Raiz cuadrada es: "+Math.sqrt(this.radicando));
    }



    //Getters

    /*public double getRadicando(){
        return this.radicando;
    }*/



    //Setters

    public void setRadicando( double numero){
        this.radicando = numero;
    }


    public static void main (String[] args){

        RaizScanner raizScanner = new RaizScanner();

        raizScanner.pedirRadicando();
        raizScanner.mostrarRaiz();



    }





}
