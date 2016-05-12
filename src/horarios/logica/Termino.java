/*
 * Termino de una funcion
 */
package horarios.logica;

/**
 *
 * @author Julian Devia y Daniela Sepulveda
 */
public class Termino {
    private int coeficiente;
    private int exponente;
    
    /**
     * Construye un termino 
     * @param coeficiente
     * @param exponente
     */
    public Termino(int coeficiente, int exponente) {
        this.coeficiente=coeficiente;
        this.exponente=exponente;
    }
    
    /**
     * Evalua el termino con el valor h
     * @param h
     */
    public int evaluar(int h){
        return (int) Math.pow(coeficiente*h, exponente);
    }

    /**
     * @return the coeficiente
     */
    public int getCoeficiente() {
        return coeficiente;
    }

    /**
     * @param coeficiente the coeficiente to set
     */
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * @return the exponente
     */
    public int getExponente() {
        return exponente;
    }

    /**
     * @param exponente the exponente to set
     */
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
}
