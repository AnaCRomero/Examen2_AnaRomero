package examen2_anaromero;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ana Romweo - 11941043
 */

public class CLIENTES implements Serializable{
    private String nombre;
    private ArrayList <ORDENES> listaOrdenes = new ArrayList();
    
    
    private static final long SerialVersionUID=555L;

    public CLIENTES() {
    }
    
    public CLIENTES(String nombre, ArrayList <ORDENES> listaOrdenes) {
        this.nombre = nombre;
        this.listaOrdenes = listaOrdenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ORDENES> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<ORDENES> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    @Override
    public String toString() {
        return "CLIENTES{" + "nombre=" + nombre + ", listaOrdenes=" + listaOrdenes + '}';
    }
    
    
    
}
