package examen2_anaromero;

import java.io.Serializable;

/**
 *
 * @author Ana Romero - 11941043
 */

public class ORDENES implements Serializable{
    private int tiempo;
    private String elemento;
    public int numOrden;
    
    private static final long SerialVersionUID=556L;


    public ORDENES(int tiempo, String elemento, int numOrden) {
        this.tiempo = tiempo;
        this.elemento = elemento;
        this.numOrden = numOrden;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }
    
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return  elemento ;
    }
    
    
           
}
