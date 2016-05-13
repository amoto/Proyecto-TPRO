/*
 * Posicion de una matriz
 */
package horarios.logica;

/**
 *
 * @author Julian Devia y Daniela Sepulveda
 */
public class Posicion {
    
    private int poryecto;
    
    private int horas;
    
    /**
     * Crea una posicion
     * @param x
     * @param y
     */
    public Posicion(int x, int y){
        this.poryecto=x;
        this.horas=y;
    }

    /**
     * @return the poryecto
     */
    public int getPoryecto() {
        return poryecto;
    }

    /**
     * @param poryecto the poryecto to set
     */
    public void setPoryecto(int poryecto) {
        this.poryecto = poryecto;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

}
