package examen2_anaromero;

import java.util.ArrayList;

/**
 *
 * @author Ana Romweo - 11941043
 */

public class CLIENTES {
    private String nombre;
    private ArrayList <COMPLEMENTOS> listaOrdenes = new ArrayList();

    public CLIENTES(String nombre, ArrayList <COMPLEMENTOS> listaOrdenes) {
        this.nombre = nombre;
        this.listaOrdenes = listaOrdenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<COMPLEMENTOS> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<COMPLEMENTOS> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    @Override
    public String toString() {
        return "CLIENTES{" + "nombre=" + nombre + ", listaOrdenes=" + listaOrdenes + '}';
    }
    
    
    
}
