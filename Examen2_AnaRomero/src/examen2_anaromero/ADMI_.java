package examen2_anaromero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Romero
 */
public class ADMI_ {
    
    private ArrayList<CLIENTES> listaOrdenes = new ArrayList();
    private File archivo = null;

    public ADMI_(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<CLIENTES> getListaProgramas() {
        return listaOrdenes;
    }

    public void setListaProgramas(ArrayList<CLIENTES> listaPersonas) {
        this.listaOrdenes = listaPersonas;
    }

    @Override
    public String toString() {
        return "" + listaOrdenes;
    }

    //extra mutador
    public void setPROGRAMAS(CLIENTES p) {
        this.listaOrdenes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (CLIENTES t : listaOrdenes) {
                bw.write(t.getNombre()+ "/");
                bw.write(t.getListaOrdenes()+ "/");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaOrdenes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    listaOrdenes.add(new CLIENTES(sc.next(),sc.nextLine()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
