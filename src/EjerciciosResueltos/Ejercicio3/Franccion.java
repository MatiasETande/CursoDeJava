package EjerciciosResueltos.Ejercicio3;

public class Franccion {

    private int dividendo;
    private int divisor;

    public Franccion(int dividendo, int divisor){
        this.dividendo=dividendo;
        this.divisor=divisor;
    }

    //Metodos
    public Franccion sumar(Franccion otraFraccion){
        Franccion resultado = new Franccion((this.getDividendo()*otraFraccion.divisor+ otraFraccion.dividendo*this.divisor),
                                            (this.divisor* otraFraccion.divisor));
        return (resultado);

    }

    public Franccion multiplicar(Franccion otraFraccion){
        Franccion resultado = new Franccion((this.dividendo*otraFraccion.dividendo),(this.divisor*otraFraccion.divisor));
        return (resultado);

    }




    //Getter

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }


    //Setter

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }


    @Override
    public String toString() {
        return dividendo +"/" + divisor ;
    }
}
