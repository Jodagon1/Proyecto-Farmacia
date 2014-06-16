/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Items.Formas;
import Items.Conectar;
import Items.JPanelColor;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class Estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Best = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MoreSell = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NoSell = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1 = new JPanelColor("/Imagen/Fondo.jpg");
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Menu Estadisticas");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 20, 0, 20, 0, 20, 0, 20, 0};
        jPanel3Layout.rowHeights = new int[] {0, 31, 0};
        jPanel3.setLayout(jPanel3Layout);

        Best.setText("jLabel2");
        Best.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Best.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BestMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(Best, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El mejor Empleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel3, gridBagConstraints);

        MoreSell.setText("jLabel2");
        MoreSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MoreSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreSellMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(MoreSell, gridBagConstraints);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto más Vendido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel4, gridBagConstraints);

        NoSell.setText("jLabel2");
        NoSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoSellMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(NoSell, gridBagConstraints);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producto menos vendido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel5, gridBagConstraints);

        Salir.setText("jLabel2");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel3.add(Salir, gridBagConstraints);

        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setText("Atras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        jPanel3.add(Atras, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(589, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BestMouseClicked
        // TODO add your handling code here:
        List<String> s = new Conectar().GetVendedor();
        int t = s.size();        
        boolean b = true;
        List<String> names = new ArrayList<>();
        for(String s1: s){
            if(names.isEmpty()){
                names.add(s1);
                b = false;
            }else{
                for(int i = 0; i < names.size();i++){     
                    if(s1.equals(names.get(i))){
                        b = false;
                    }
                }
            }if(b){
                names.add(s1);
            }
            b = true;
        }      
        Map<String, Integer> nombreMap = new TreeMap<String, Integer>();
        int cont = 1;
        int total = 0;
        for(String s1 : names){
            for(String s2 : s){
                if(s1.equals(s2)){
                    nombreMap.put(s2, cont);
                    cont++;
                    total += cont;
                }
            }
            cont = 1;
        }
        new Formas().SetValues(nombreMap,total);
    }//GEN-LAST:event_BestMouseClicked

    private void MoreSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreSellMouseClicked
        // TODO add your handling code here:        
        List<String> s = new Conectar().GetFecha();
        String f = null;
        int x,y;
        Map<Integer,Integer> in = new TreeMap<Integer,Integer>();
        for(String sq:s){
            StringTokenizer tokens=new StringTokenizer(sq, "/");
            int ndatos=tokens.countTokens();
            int[] datos=new int[ndatos];
            int i=0;
            while(tokens.hasMoreTokens()){
                String str=tokens.nextToken();
                datos[i] = parseInt(str);
                if(i == 2){
                    x = datos[i-1];
                    y = datos[i];
                    in.put(x, y);
                }
                i++;
            }
        }
        Iterator i = in.keySet().iterator();
        List<String> f1 = new ArrayList<>();
        while(i.hasNext()){
            int k = (int)i.next();
            String f2 = "00/"+k+"/"+in.get(k);
            f1.add(f2);
        }
        new Fecha().Call(f1,"Mas");
    }//GEN-LAST:event_MoreSellMouseClicked

    private void NoSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoSellMouseClicked
        // TODO add your handling code here:
        List<String> s = new Conectar().GetFecha();
        String f = null;
        int x,y;
        Map<Integer,Integer> in = new TreeMap<Integer,Integer>();
        for(String sq:s){
            StringTokenizer tokens=new StringTokenizer(sq, "/");
            int ndatos=tokens.countTokens();
            int[] datos=new int[ndatos];
            int i=0;
            while(tokens.hasMoreTokens()){
                String str=tokens.nextToken();
                datos[i] = parseInt(str);
                if(i == 2){
                    x = datos[i-1];
                    y = datos[i];
                    in.put(x, y);
                }
                i++;
            }
        }
        Iterator i = in.keySet().iterator();
        List<String> f1 = new ArrayList<>();
        while(i.hasNext()){
            int k = (int)i.next();
            String f2 = "00/"+k+"/"+in.get(k);
            f1.add(f2);
        }
        new Fecha().Call(f1,"Menos");
    }//GEN-LAST:event_NoSellMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        new MenuMain().Call();
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
                Best.setText("");
                Best.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Blues.png")));
                MoreSell.setText("");
                MoreSell.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/MoreSell.png")));
                NoSell.setText("");
                NoSell.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/MinSell.png")));
                Salir.setText("");
                Salir.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Salir.png")));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atras;
    private static javax.swing.JLabel Best;
    private static javax.swing.JLabel MoreSell;
    private static javax.swing.JLabel NoSell;
    private static javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    void Call() {
        Best.setText("");
        Best.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Blues.png")));
        MoreSell.setText("");
        MoreSell.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/MoreSell.png")));
        NoSell.setText("");
        NoSell.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/MinSell.png")));
        Salir.setText("");
        Salir.setIcon(new ImageIcon(this.getClass().getResource("/Imagen/Salir.png")));
        this.setVisible(true);
    }
}
