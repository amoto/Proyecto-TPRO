/*
 * Funcion que tiene el polinomio que permite calcular la nota de acuerdo a la cantidad de horas dedicadas al proyecto.
 */
package horarios.logica;

import java.util.ArrayList;

/**
 *
 * @author Julian Devia y Daniela Sepulveda
 */
public class Funcion {
    
    private ArrayList<Termino> polinomio;
    
    public Funcion(int[] coeficientes, int [] exponentes){
        polinomio=new ArrayList<>();
        for (int i = 0; i < coeficientes.length; i++) {
            polinomio.add(new Termino(coeficientes[i], exponentes[i]));
        }
    }
    /**
     * Permite calcular la nota del proyecto empleando h horas
     * @param h
     */
    public int calcularNota(int h){
        int nota=0;
        for (int i = 0; i < polinomio.size(); i++) {
            nota+=polinomio.get(i).evaluar(h);
        }
        return nota;
    }
    
}
