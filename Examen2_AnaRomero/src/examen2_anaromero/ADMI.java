package examen2_anaromero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class ADMI {
    private ArrayList<CLIENTES> listaCliente = new ArrayList();
    private File archivo = null;

    public ADMI(String path) {
        archivo = new File(path);
    }

    public ArrayList<CLIENTES> getListaPersonas() {
        return listaCliente;
    }

    public void setListaPersonas(ArrayList<CLIENTES> listaPersonas) {
        this.listaCliente = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaCliente;
    }

    //extra mutador
    public void setPersona(CLIENTES p) {
        this.listaCliente.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaCliente = new ArrayList();
            CLIENTES temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (CLIENTES) objeto.readObject()) != null) {
                        listaCliente.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (CLIENTES t : listaCliente) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
