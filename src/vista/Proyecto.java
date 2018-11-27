/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.ControladorCbMarcasDerecho;
import controlador.ControladorCbMarcasIzquierdo;
import controlador.ControladorCbMovilDerecho;
import controlador.ControladorVentana;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author sastian
 */
public class Proyecto extends javax.swing.JFrame {

    /**
     * Creates new form Proyecto
     */
    public Proyecto() {
        initComponents();
//        imagenDerecha.setScale(0.5);
//        imagenIzquierda.setScale(0.5);

        //aniadir controlador de botones
        Controlador controlador = new Controlador(this);
        addControlador(controlador);

        //Crear menu bar y añadirle el controlador
        BarraMenu mb = new BarraMenu();
        mb.controlador(controlador);
        this.setJMenuBar(mb);

        //Determinar la posision relativa de la ventana al incio
        this.setLocationRelativeTo(null);

        //Aniadimos el controlador de la ventana
        addWindowListener(new ControladorVentana(this));

        //aniadir controlador de combobox de marca
        ControladorCbMarcasIzquierdo cbControllerI = new ControladorCbMarcasIzquierdo(this);
        ControladorCbMarcasDerecho cbControllerD = new ControladorCbMarcasDerecho(this);
        cbMarcaDerecho.addItemListener(cbControllerD);
        cbMarcaIzquierdo.addItemListener(cbControllerI);

        //aniadimos controlador a combobox modelo
        ControladorCbMovilDerecho cbModeloD = new ControladorCbMovilDerecho(this);
        cbModeloDerecho.addItemListener(cbModeloD);

        //Aniadimos funcion para completar combobox
        AutoCompleteDecorator.decorate(cbMarcaDerecho);
        AutoCompleteDecorator.decorate(cbMarcaIzquierdo);

    }

    /**
     * Metodo para limpiar todos los items del combobox que se le pase
     *
     * @param cb Combobox que queremos limpiar
     */
    public void limpiarItems(JComboBox cb) {
        cb.removeAllItems();
        cb.removeAllItems();
    }

//<---- aniadir items a combobox ---->
    public void addMarcaIzquierdo(String valor) {
        this.cbMarcaIzquierdo.addItem(valor);
    }

    public void addMarcaDerecho(String valor) {
        this.cbMarcaDerecho.addItem(valor);
    }

    public void addModeloIzquierdo(String valor) {
        this.cbModeloIzquierdo.addItem(valor);
    }

    public void addModeloDerecho(String valor) {
        this.cbModeloDerecho.addItem(valor);
    }

//aniadir controlador de los componentes de la ventana
    public void addControlador(ActionListener ctr) {
        jButtonSalir.addActionListener(ctr);
        jButtonSalir.setActionCommand("salir");
    }

//<----- getters ----->
    public JComboBox<String> getCbMarcaDerecho() {
        return cbMarcaDerecho;
    }

    public JComboBox<String> getCbMarcaIzquierdo() {
        return cbMarcaIzquierdo;
    }

    public JComboBox<String> getCbModeloDerecho() {
        return cbModeloDerecho;
    }

    public JComboBox<String> getCbModeloIzquierdo() {
        return cbModeloIzquierdo;
    }

    public void setImagenDerecha(String imagenUrl) {
        this.imagenDerecha.setUrlImagen(imagenUrl);
        this.imagenDerecha.setScale(0.28);
    }

    public void setImagenIzquierda(String imagenUrl) {
        this.imagenIzquierda.setUrlImagen(imagenUrl);
        this.imagenIzquierda.setScale(0.28);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbMarcaIzquierdo = new javax.swing.JComboBox<>();
        cbModeloIzquierdo = new javax.swing.JComboBox<>();
        cbMarcaDerecho = new javax.swing.JComboBox<>();
        cbModeloDerecho = new javax.swing.JComboBox<>();
        imagenDerecha = new imagenview.ImageView();
        imagenIzquierda = new imagenview.ImageView();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDerecho = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableIzquierdo = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbMarcaIzquierdo.setBackground(new java.awt.Color(42, 42, 166));
        cbMarcaIzquierdo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbMarcaIzquierdo.setForeground(new java.awt.Color(255, 255, 255));
        cbMarcaIzquierdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcaIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        cbModeloIzquierdo.setBackground(new java.awt.Color(42, 42, 166));
        cbModeloIzquierdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbModeloIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, -1));

        cbMarcaDerecho.setBackground(new java.awt.Color(42, 42, 166));
        cbMarcaDerecho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbMarcaDerecho.setForeground(new java.awt.Color(255, 255, 255));
        cbMarcaDerecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbMarcaDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, -1));

        cbModeloDerecho.setBackground(new java.awt.Color(42, 42, 166));
        cbModeloDerecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbModeloDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 240, -1));

        imagenDerecha.setUrlImagen("https://bit.ly/2PKE6Ue");
        getContentPane().add(imagenDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, 240));

        imagenIzquierda.setUrlImagen("https://bit.ly/2PKE6Ue");
        getContentPane().add(imagenIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, 240));

        jTableDerecho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDerecho.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableDerecho);
        if (jTableDerecho.getColumnModel().getColumnCount() > 0) {
            jTableDerecho.getColumnModel().getColumn(0).setResizable(false);
            jTableDerecho.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 260, 190));

        jTableIzquierdo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableIzquierdo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableIzquierdo);
        if (jTableIzquierdo.getColumnModel().getColumnCount() > 0) {
            jTableIzquierdo.getColumnModel().getColumn(0).setResizable(false);
            jTableIzquierdo.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 190));

        jButtonSalir.setBackground(new java.awt.Color(127, 26, 70));
        jButtonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/header-bg_v1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//<----- Principal ----->
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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMarcaDerecho;
    private javax.swing.JComboBox<String> cbMarcaIzquierdo;
    private javax.swing.JComboBox<String> cbModeloDerecho;
    private javax.swing.JComboBox<String> cbModeloIzquierdo;
    private javax.swing.JLabel fondo;
    private imagenview.ImageView imagenDerecha;
    private imagenview.ImageView imagenIzquierda;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDerecho;
    private javax.swing.JTable jTableIzquierdo;
    // End of variables declaration//GEN-END:variables

}
