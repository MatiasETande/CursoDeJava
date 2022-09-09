package EjerciciosResueltos.Ejercicio1;

public class Cuenta {

    public Cuenta(){
        this.titular="";
        this.cantidad=0.0f;
    }
    public Cuenta(String titular, double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }


    //Atributos
    private String titular;
    private  double cantidad;

    //Get
    public String getTitular(){ return this.titular;};
    public double getCantidad(){return this.cantidad;}

    //Set
    public void setTitular(String titular){ this.titular=titular;}
    public void setCantidad(double cantidad){this.cantidad=cantidad;}


    //Metodos

    public void ingresar(double cantidad){
        if (cantidad>0){setCantidad(getCantidad()+cantidad);}
    }

    public void retirar(double cantidad){
        if(getCantidad()-cantidad>0){
            setCantidad(getCantidad()-cantidad);
        }else {
            setCantidad(0);
        }
    }

    //toString


    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
