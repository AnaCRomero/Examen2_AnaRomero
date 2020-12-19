package examen2_anaromero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Romero - 11941043
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CB_COMPLEMENTOS = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_COMPLEMENTOS = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numOrdeen = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDENES");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Complementos:");

        CB_COMPLEMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biscuit", "Fresco", "Pieza de pollo", "Pure de papa", "Papas fritas", "Pie" }));

        jButton1.setText(">");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JL_COMPLEMENTOS.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(JL_COMPLEMENTOS);

        jButton2.setText("Guardar Orden");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Complemento listo:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Orden", "Complemento", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Tiempo estimado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("# Orden:");

        numOrdeen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        jButton3.setText("Abrir Orden");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Crear factura");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Factura:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(numOrdeen)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jButton2)
                                .addGap(26, 26, 26)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CB_COMPLEMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel5))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(numOrdeen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel3)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_COMPLEMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(113, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (CB_COMPLEMENTOS.getSelectedIndex() == 0) {
            DefaultListModel modeloA = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(1, "Biscuit", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloA.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloA);
        }

        if (CB_COMPLEMENTOS.getSelectedIndex() == 1) {
            DefaultListModel modeloB = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(1, "Fresco", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloB.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloB);
        }

        if (CB_COMPLEMENTOS.getSelectedIndex() == 2) {
            DefaultListModel modeloC = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(4, "Pieza de pollo", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloC.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloC);
        }

        if (CB_COMPLEMENTOS.getSelectedIndex() == 3) {
            DefaultListModel modeloD = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(2, "Pure de papa", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloD.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloD);
        }

        if (CB_COMPLEMENTOS.getSelectedIndex() == 4) {
            DefaultListModel modeloE = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(3, "Papas fritas", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloE.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloE);
        }

        if (CB_COMPLEMENTOS.getSelectedIndex() == 5) {
            DefaultListModel modeloF = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ORDENES complementos = new ORDENES(5, "Pie", Integer.parseInt(numOrdeen.getText()));
            //Biscuit, Fresco, Pieza de pollo, Pure de papa, Papas fritas, Pie         
            modeloF.addElement(complementos);
            JL_COMPLEMENTOS.setModel(modeloF);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DefaultListModel Lista = (DefaultListModel) JL_COMPLEMENTOS.getModel();
        try {

            ArrayList<ORDENES> complemento = new ArrayList();

            for (int i = 0; i < Lista.size(); i++) {
                ORDENES p = (ORDENES) Lista.get(i);
                complemento.add(p);
            }//recorre la jl_list
            ADMI a = new ADMI("./Clientes.yhlqmdlg");
            a.cargarArchivo();
            if (a.getListaPersonas().isEmpty()) {
                String nombre = NOMBRE.getText();
                CLIENTES c = new CLIENTES(nombre, complemento);
                a.getListaPersonas().add(c);
                a.escribirArchivo();
            } else {
                boolean verificacion = false;
                ADMI a1 = new ADMI("./Clientes.yhlqmdlg");
                a1.cargarArchivo();
                String nombre = NOMBRE.getText();
                for (int i = 0; i < a1.getListaPersonas().size(); i++) {
                    if (nombre.equals(a1.getListaPersonas().get(i).getNombre())) {
                        for (int j = 0; j < complemento.size(); j++) {
                            ORDENES o = complemento.get(j);
                            a1.getListaPersonas().get(i).getListaOrdenes().add(o);
                        }
                        verificacion = true;
                    }
                }
                a1.escribirArchivo();
                if (!verificacion) {
                    ADMI a2 = new ADMI("/.Clientes.yhlqmdlg");
                    nombre = NOMBRE.getText();
                    CLIENTES c = new CLIENTES(nombre, complemento);
                    a2.cargarArchivo();
                    a2.getListaPersonas().add(c);
                    a2.escribirArchivo();
                }
            }
            JOptionPane.showMessageDialog(this, "La orden se ha guardado exitosamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salio mal, intente nuevamente");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ADMI a3 = new ADMI("./Clientes.yhlqmdlg");
        a3.cargarArchivo();
        for (int i = 0; i < a3.getListaPersonas().size(); i++) {
            CLIENTES c1 = a3.getListaPersonas().get(i);
            for (int j = 0; j < c1.getListaOrdenes().size(); j++) {
                ORDENES o1 = c1.getListaOrdenes().get(j);
                Object[] newrow = {o1.getNumOrden(), o1.getElemento(), o1.getTiempo()};
                modelo.addRow(newrow);
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        File archivo = null;
        FileWriter FW = null;
        BufferedWriter BW = null;
        String nombre = NOMBRE.getText();
        try {
            archivo = new File("./" + nombre + ".txt");

            FW = new FileWriter(archivo);
            BW = new BufferedWriter(FW);
            //FACTURA

            //para la info de la lista
            DefaultListModel Lista = (DefaultListModel) JL_COMPLEMENTOS.getModel();
            ArrayList<ORDENES> complemento = new ArrayList();
            for (int i = 0; i < Lista.size(); i++) {
                ORDENES p = (ORDENES) Lista.get(i);
                complemento.add(p);
            }//recorre la jl_list

            //para fecha
            Date fecha = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
            String dia = sd.format(fecha);
            String Orden = numOrdeen.getText();

            String linea = "Fecha de la compra: " + dia+ "\n"
                    + "Cliente: " + nombre + "\n"
                    + "Numero de orden: " + Orden + "\n"
                    + "Pedido: " + complemento;
            
            jTextArea1.setText(linea);
            BW.write(linea);
            BW.newLine();
            BW.flush();
            JOptionPane.showMessageDialog(this, "Factura guardada exitosamente!");
            jTextArea1.setText("");
            numOrdeen.setText("");
            NOMBRE.setText("");
            JL_COMPLEMENTOS.removeAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_COMPLEMENTOS;
    private javax.swing.JList<String> JL_COMPLEMENTOS;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField numOrdeen;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
