/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Items.Comparar;
import Items.Conectar;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
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
        jLabel1 = new javax.swing.JLabel();
        Campo = new javax.swing.JTextField(8);
        Acep = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Acept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Buscar todos:");
        jPanel1.add(jLabel1);
        jPanel1.add(Campo);

        Acep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcepActionPerformed(evt);
            }
        });
        jPanel1.add(Acep);

        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        jPanel1.add(Clean);

        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        Acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptActionPerformed(evt);
            }
        });
        jPanel2.add(Acept);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(478, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptActionPerformed
        // TODO add your handling code here:
        int x1 = 0;  
        String str = null;
        List<Pojo.Producto> p = new Conectar().ConexionProd();
        String id;
        for(Pojo.Producto prod : p){
            String s = "Id: "+(id = new Search().SetLength(""+prod.getId()))+", Nombre: "+prod.getName()+","
                                + " Marca: "+prod.getMarca();
            if(s.equals(jList1.getSelectedValue())){
                boolean b = false;
                do{
                    try{
                        b = false;
                        str = JOptionPane.showInputDialog(this,"Inserte la cantidad a vender");
                        if(str != null){
                            x1 = parseInt(str);
                        }
                        if(x1 > prod.getCantidad()){
                            JOptionPane.showMessageDialog(this,"No hay suficientes producto en el inventario\n"
                                    + "Insertado: "+x1+" En Stock: "+prod.getCantidad());
                            b = true;
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(this,"Solo debe de insertar numeros");
                        b = true;
                    }
                }while(b);
                if(str == null){
                    break;
                }
                prod.setCantidad(x1);
                int x = jList1.getSelectedIndex();
                dlm.removeElementAt(x);
                jList1.setModel(dlm);
                v.setTable(prod,0);
                Total += prod.getCantidad()*prod.getPrecio();
            }
        }
    }//GEN-LAST:event_AceptActionPerformed
    double Total = 0;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        
        v.setTable(null,Total);
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void AcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcepActionPerformed
        // TODO add your handling code here:
        dlm.removeAllElements();
        jList1.setModel(dlm);
        String s = Campo.getText();
        String id;
        int x = s.length();int cont = 0;
        List <Pojo.Producto> p = new Conectar().ConexionProd();
        for(Pojo.Producto p1: p){
            Pojo.Producto pd = new Pojo.Producto();
            pd = new Comparar().CompararAll(p1, s);
            if(pd == null){
                cont++;
            }else{
                String s2 = "Id: "+(id = new Search().SetLength(""+pd.getId()))+", Nombre: "+pd.getName()+","
                    + " Marca: "+pd.getMarca();   
                dlm.addElement(s2);
                jList1.setModel(dlm);
            }
        }
    }//GEN-LAST:event_AcepActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        // TODO add your handling code here:
        dlm.removeAllElements();
        jList1.setModel(dlm);
        Campo.setText("");
    }//GEN-LAST:event_CleanActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new Agregar().setVisible(true);                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acep;
    private javax.swing.JButton Acept;
    private javax.swing.JTextField Campo;
    private javax.swing.JButton Clean;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    Ventas v;   
    DefaultListModel dlm = new DefaultListModel();
    void Call(Ventas aThis) {
        v = aThis;
        String id;
        Acept.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Ok.png")));
        Acep.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/search.png")));
        Clean.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Clean.png")));
        Exit.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Exit.png")));
        List<Pojo.Producto> prd = new Conectar().ConexionProd();        
        for(Pojo.Producto p : prd){
            String s = "Id: "+(id = new Search().SetLength(""+p.getId()))+", Nombre: "+p.getName()+","
                    + " Marca: "+p.getMarca();                    
            dlm.addElement(s);
            jList1.setModel(dlm);        
        }
        this.setVisible(true);
    }
}
