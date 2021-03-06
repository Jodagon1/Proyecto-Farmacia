/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Items.Conectar;
import Items.JPanelColor;
import Pojo.Factura;
import Pojo.Producto;
import Pojo.UseUser;
import Pojo.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author h p
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();        
        setIconImage(new ImageIcon(this.getClass().getResource("/Imagen/capsule.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Acept = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Facturar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1 = new JPanelColor("/Imagen/Fondo.jpg");
        jPanel1.setLayout(new java.awt.BorderLayout());
        Limpiar.setEnabled(false);
        Eliminar.setEnabled(false);
        Facturar.setEnabled(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        Acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptActionPerformed(evt);
            }
        });
        jPanel4.add(Acept);

        Limpiar.setToolTipText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(Limpiar);

        Eliminar.setToolTipText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        Facturar.setText("Facturar");
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });
        jPanel5.add(Facturar);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "Title 4", "Title 5", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Ventas");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(709, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String [] col = {"Id","Nombre","Marca","Cantidad","Precio","Total"};
    Object [][] dat = {}; 
    DefaultTableModel dtm = new DefaultTableModel(dat,col);
    private void AceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptActionPerformed
        // TODO add your handling code here: 
        Eliminar.setEnabled(true);
        Limpiar.setEnabled(true);
        Facturar.setEnabled(true);
        new Agregar().Call(this);
    }//GEN-LAST:event_AceptActionPerformed

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed
        // TODO add your handling code here:        
        List<Usuario> us = new Conectar().ConexionUs();
        Usuario u = new Usuario();
        String s1 = null;
        try {
             s1 = new UseUser().GetUser();
        } catch (IOException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Usuario u1 : us){
            StringBuffer st = new StringBuffer(u1.getName());
            st.setLength(30);
            u1.setName(st.toString());
            if(u1.getName().equalsIgnoreCase(s1)){
                JOptionPane.showMessageDialog(this,s1);
                u = u1;
            }
        }
        dtm = (DefaultTableModel)jTable1.getModel();
        Calendar c = Calendar.getInstance();
        String Fecha = Integer.toString(c.get(Calendar.DATE));
        Fecha+="/";                   
        Fecha+= Integer.toString(c.get(Calendar.MONTH)+1);
        Fecha+="/";
        Fecha+= Integer.toString(c.get(Calendar.YEAR));
        List<Producto> p2 = new ArrayList<>();
        List<Factura> fc = new ArrayList<>();        
        for(int i = 0; i < dtm.getRowCount(); i++){
           String x = (String)dtm.getValueAt(i,0);           
           for(Producto p1:prd){
               int x2 = p1.getCantidad();
               String y = ""+p1.getId();
               y = new Search().SetLength(y);
               if(y.equals(x)){    
                   Producto prod1 = new Producto();
                   prod1 = p1;
                   Factura f = new Factura();
                   p2.add(p1);
                   p1.setCantidad((int)dtm.getValueAt(i,3));                   
                   f.setId(p1.getId());
                   f.setName(p1.getName());
                   s1 = s1.trim();
                   f.setUsuario(s1);
                   f.setFecha(Fecha);                   
                   f.setMarca(p1.getMarca());
                   f.setCantidad((int)dtm.getValueAt(i, 3));
                   f.setPrecio(p1.getPrecio());
                   f.setTotal((double)dtm.getValueAt(i,5));         
                   fc.add(f);
                   new Conectar().InsertarVenta(p1, Fecha, s1);
                   int x1 = x2-(int)dtm.getValueAt(i,3);
                   prod1.setCantidad(x1);
                   new Conectar().ModificarProd(prod1);
               }
           }
        }
        new Conectar().Conect(fc);        
        Connection c1 = new Conectar().Conect();
        try{
            String s = System.getProperty("user.dir")+"/src/items/Factura.jasper";
            JasperReport reporte = (JasperReport)JRLoader.loadObject(s);
            JasperPrint p = JasperFillManager.fillReport(reporte, null, c1);
            JasperViewer view = new JasperViewer(p,false);
            view.setIconImage(new ImageIcon(this.getClass().getResource("")).getImage());                    
            view.setTitle("Factura");
            view.setVisible(true);
        }catch(Exception e){}        
    }//GEN-LAST:event_FacturarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        List<Producto> prod = new ArrayList<Producto>();
        List<Producto> prod1 = new Conectar().ConexionProd();
        int j = jTable1.getSelectedRow();
        if(j != -1){
            String y = (String)dtm.getValueAt(j, 0);
            if(!(y.equals("Total a pagar"))){
                y = new Search().SetLength(y);
                dtm = (DefaultTableModel)jTable1.getModel();
                dtm.removeRow(j);
                jTable1.setModel(dtm);
                if(dtm.getRowCount()==0){
                    Limpiar.setEnabled(false);
                    Eliminar.setEnabled(false);
                    Facturar.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here: 
        Limpiar.setEnabled(false);
        Eliminar.setEnabled(false);
        Facturar.setEnabled(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
            },
            new String [] {
                "Id", "Nombre", "Marca", "Cantidad","Precio","Total"
            }
        ));
    }//GEN-LAST:event_LimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        List<Usuario> us = new Conectar().ConexionUs();
        Usuario u = new Usuario();
        String s = null;
        try {
             s = new UseUser().GetUser();
        } catch (Exception ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Usuario u1 : us){
            StringBuffer st = new StringBuffer(u1.getName());
            st.setLength(30);
            u1.setName(st.toString());
            if(u1.getName().equalsIgnoreCase(s)){
                u = u1;
            }
        }
        dispose();
        if(u.isAdministrador()){
            new MenuMain().Call();
        }else{
            new MenuEmpleado().Call();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);                
                Limpiar.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Clean.png")));
                Eliminar.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Del.png")));
                Acept.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Ok.png")));  
                jTable1.setModel(new DefaultTableModel(
                        new Object[][]{},new String [] {
                            "Id", "Nombre", "Marca", "Cantidad", "Precio","Total"
                        }
                ){
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                    };
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Acept;
    private static javax.swing.JButton Eliminar;
    private static javax.swing.JButton Facturar;
    private static javax.swing.JButton Limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    List<Producto> prd;
    void Call() {        
        prd = new Conectar().ConexionProd();
        Limpiar.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Clean.png")));
        Eliminar.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Del.png")));
        Acept.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Ok.png")));  
        jTable1.setModel(new DefaultTableModel(
                new Object[][]{},new String [] {
                    "Id", "Nombre", "Marca", "Cantidad", "Precio","Total"
                }
        ){
            boolean[] canEdit = new boolean [] {                
                false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        this.setVisible(true);
    }
    void setTable(Producto p, double d) {        
        String s;  
        if(!(p == null)){
            double t = p.getCantidad()*p.getPrecio();
            Object [] newRow = {(s=new Search().SetLength(""+p.getId())),p.getName(),p.getMarca(),p.getCantidad(),p.getPrecio(),t};            
            dtm.addRow(newRow);
            jTable1.setModel(dtm);
        }
        if(d != 0){
            Object [] newR = {"Total a pagar","","","","",d};
            dtm.addRow(newR);
            jTable1.setModel(dtm);
        }        
    }
}
