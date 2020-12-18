package examen2_anaromero;

/**
 *
 * @author Ana Romero - 11941043
 */

public class COMPLEMENTOS {
    private int tiempo;
    private String elemento;

    public COMPLEMENTOS(int tiempo, String elemento) {
        this.tiempo = tiempo;
        this.elemento = elemento;
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
