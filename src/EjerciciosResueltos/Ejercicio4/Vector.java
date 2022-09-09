package EjerciciosResueltos.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Vector {

    private List<Integer> coordenadas;

    public Vector(List<Integer> unaLista){
        this.coordenadas = unaLista;
    }

    public Vector(){
        List<Integer> miLista = new ArrayList<Integer>();
        this.coordenadas = miLista;
    }

    //Getter

    public List<Integer> getCoordenadas(){
        return this.coordenadas;
    }
    
    
    //Metodos
    
    public Vector mulEscalar(int numero){

        List<Integer> miLista = new ArrayList<Integer>();

        for (int elemento : this.coordenadas
             ) {
            miLista.add((elemento*numero));
        }


        Vector otroVector = new Vector(miLista);

        return otroVector;
        
        
    }


    public Vector sumar(Vector unVector){


        if (this.coordenadas.size()==unVector.coordenadas.size()){


            Vector otroVector = new Vector();

            int i=0;
            for (int elemento: this.coordenadas
                 ) {
                otroVector.coordenadas.add((elemento)+(unVector.coordenadas.get(i)));
                i++;
            }

            return otroVector;

        }else{
            System.out.println("Los vectores no tienen la misma longitud");
            return unVector;

        }



    }



    //toString


    @Override
    public String toString() {
        return this.coordenadas.toString();
    }
}
