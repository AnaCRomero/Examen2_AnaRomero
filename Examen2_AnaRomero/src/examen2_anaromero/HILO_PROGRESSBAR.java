package examen2_anaromero;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Romero
 */
public class HILO_PROGRESSBAR extends Thread {

    private JProgressBar BARRA;
    private JTable TABLA;
    private ORDENES ORDEN;

    public HILO_PROGRESSBAR() {
    }

    public HILO_PROGRESSBAR(JProgressBar barra, JTable tabla, ORDENES ordenes) {
        this.BARRA = barra;
        this.TABLA = tabla;
        this.ORDEN = ordenes;
    }

    @Override
    public void run() {
        int contador = 0;
        //srry por no poder hacer hilos, no tengo excusa la verdad :,3 no me prepare bien para examen ahi disculpa
    }
}
