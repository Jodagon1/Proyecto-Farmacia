/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Items.JPanelColor;
import javax.swing.ImageIcon;

/**
 *
 * @author h p
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    public Producto() {
        initComponents();
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
        jPanel10 = new javax.swing.JPanel();
        New = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Mod = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Delete = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Search = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        ViewAll = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Producto");
        setResizable(false);

        jPanel1 = new JPanelColor("/Imagen/Fondo.jpg");
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2 = new JPanelColor("/Imagen/Fondo.jpg");
        jPanel2.setLayout(new java.awt.GridLayout(2, 3));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        New.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMouseClicked(evt);
            }
        });
        jPanel10.add(New, java.awt.BorderLayout.CENTER);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo Producto");
        jPanel10.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        Mod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModMouseClicked(evt);
            }
        });
        jPanel11.add(Mod, java.awt.BorderLayout.CENTER);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modificar Producto");
        jPanel11.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel12.add(Delete, java.awt.BorderLayout.CENTER);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar");
        jPanel12.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel13.add(Search, java.awt.BorderLayout.CENTER);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Buscar Producto");
        jPanel13.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout());

        ViewAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAllMouseClicked(evt);
            }
        });
        jPanel14.add(ViewAll, java.awt.BorderLayout.CENTER);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ver Todos Los Productos");
        jPanel14.add(jLabel8, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel15.add(Exit, java.awt.BorderLayout.CENTER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Salir");
        jPanel15.add(jLabel9, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel15);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Bienvenido al Menú Producto");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(451, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseClicked
        // TODO add your handling code here:
        dispose();
        new Insert().Call();
    }//GEN-LAST:event_NewMouseClicked

    private void ModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModMouseClicked
        // TODO add your handling code here:
        dispose();
        new Modificar().Call("Modificar");
    }//GEN-LAST:event_ModMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        dispose();
        new Modificar().Call("Borrar");
    }//GEN-LAST:event_DeleteMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
        dispose();
        new Search().Call();
    }//GEN-LAST:event_SearchMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        dispose();
        new MenuMain().Call();
    }//GEN-LAST:event_ExitMouseClicked

    private void ViewAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllMouseClicked
        // TODO add your handling code here:
        new Tabla().Call();
    }//GEN-LAST:event_ViewAllMouseClicked

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Delete;
    private static javax.swing.JLabel Exit;
    private static javax.swing.JLabel Mod;
    private static javax.swing.JLabel New;
    private static javax.swing.JLabel Search;
    private static javax.swing.JLabel ViewAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    void Call() {
        New.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/New.png")));
        Search.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Busqueda.png")));
        Delete.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Remover.png")));
        ViewAll.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Open.png")));
        Mod.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Edit.png")));
        Exit.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Salir.png")));
        this.setVisible(true);
    }
}
