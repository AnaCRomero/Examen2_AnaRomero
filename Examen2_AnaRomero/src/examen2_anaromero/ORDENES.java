package examen2_anaromero;

import java.util.ArrayList;

/**
 *
 * @author Ana Romero - 11941043
 */
public class ORDENES {
    ArrayList <COMPLEMENTOS> orden = new ArrayList();

    public ORDENES(ArrayList <COMPLEMENTOS> orden) {
        this.orden = orden;
    }

    public ArrayList<COMPLEMENTOS> getOrden() {
        return orden;
    }

    public void setOrden(ArrayList<COMPLEMENTOS> orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "ORDENES{" + "orden=" + orden + '}';
    }   
}
