package examen2_anaromero;

import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author Ana Romero
 */
public class HILO_PROGRESSBAR {
    private JProgressBar barra;
    private JTable tabla;
    private ORDENES ordenes; 

    public HILO_PROGRESSBAR() {
    }

    
    
    public HILO_PROGRESSBAR(JProgressBar barra, JTable tabla, ORDENES ordenes) {
        this.barra = barra;
        this.tabla = tabla;
        this.ordenes = ordenes;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public ORDENES getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ORDENES ordenes) {
        this.ordenes = ordenes;
    }
    
    
}
