/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Items.Conectar;
import Items.JPanelColor;
import Pojo.Producto;
import java.awt.event.KeyEvent;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert() {
        initComponents();
        ImageIcon im = new ImageIcon(this.getClass().getResource("/Imagen/Farmacia.jpg"));
        setIconImage(im.getImage());        
    }
    String [] v = {"Analgésicos","Antibiótico","Vacuna","Antisépticos",
                "Antiinflamatorios","Antiinflamatorio No Esteroideo","Antiinflamatorio Esteroideo",
                "Antihistamínicos","Anestésico","Antidepresivo","Diuréticos","Laxantes","Broncodilatador",
                "Antipirético","Antifúngico"};
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
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField(7);
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField(7);
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField(7);
        jLabel6 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField(7);
        jPanel12 = new javax.swing.JPanel();
        Forma = new javax.swing.JComboBox();
        Vias = new javax.swing.JComboBox();
        Tipo = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Insertar = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1 = new JPanelColor("/Imagen/Fondo.jpg");
        jPanel1.setLayout(new java.awt.BorderLayout());
        if(deshacer == null){
            jButton2.setEnabled(false);
        }

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jPanel7.setOpaque(false);
        java.awt.GridBagLayout jPanel7Layout = new java.awt.GridBagLayout();
        jPanel7Layout.columnWidths = new int[] {0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0};
        jPanel7Layout.rowHeights = new int[] {0};
        jPanel7.setLayout(jPanel7Layout);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel7.add(jLabel1, gridBagConstraints);

        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setText("000000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel7.add(Codigo, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel7.add(jLabel3, gridBagConstraints);

        Producto.setText("jTextField1");
        Producto.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel7.add(Producto, gridBagConstraints);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel7.add(jLabel4, gridBagConstraints);

        Cantidad.setText("jTextField2");
        Cantidad.setText("0");
        Cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CantidadFocusLost(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        jPanel7.add(Cantidad, gridBagConstraints);

        jPanel2.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");

        Precio.setText("jTextField3");
        Precio.setText("0");
        Precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PrecioFocusLost(evt);
            }
        });
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marca:");

        Marca.setText("jTextField4");
        Marca.setText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 144, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(23, 23, 23)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel6)
                    .addGap(23, 23, 23)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 145, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))))
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        jPanel8.add(jPanel3);

        jPanel12.setOpaque(false);
        java.awt.GridBagLayout jPanel12Layout1 = new java.awt.GridBagLayout();
        jPanel12Layout1.columnWidths = new int[] {0, 50, 0, 50, 0, 50, 0};
        jPanel12Layout1.rowHeights = new int[] {0};
        jPanel12.setLayout(jPanel12Layout1);

        Forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Forma.removeAllItems();
        Forma.addItem("Forma");
        Forma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormaMouseClicked(evt);
            }
        });
        Forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel12.add(Forma, gridBagConstraints);

        Vias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Vias.removeAllItems();
        String [] v = {"Oral","Intramuscular","Intravenosa","Subcutánea","Inhalatoria","Transdermica","Nasal","Oftalmica",
            "Ótica","Tópica","Rectal","Vaginal"};
        Vias.addItem("Vias de administracion");
        for(String s: v){
            Vias.addItem(s);
        }
        Vias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel12.add(Vias, gridBagConstraints);

        Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Tipo.removeAllItems();
        Tipo.addItem("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel12.add(Tipo, gridBagConstraints);

        jPanel8.add(jPanel12);

        jPanel2.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setOpaque(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripcion:");
        jPanel10.add(jLabel8);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jScrollPane1.putClientProperty("JComponent.sizeVariant", "mini");

        Descripcion.setColumns(20);
        Descripcion.setRows(10);
        jScrollPane1.setViewportView(Descripcion);

        jPanel11.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setOpaque(false);

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        jPanel4.add(Insertar);

        Clean.setText("Limpiar");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        jPanel4.add(Clean);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setOpaque(false);
        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setOpaque(false);
        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        jButton1.setText("Atras");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("Deshacer");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(577, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) 
            evt.consume();
    }//GEN-LAST:event_CantidadKeyTyped

    private void CantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CantidadFocusLost
        // TODO add your handling code here:
        try{
            if(!(Cantidad.getText().equals(""))){
                int x = parseInt(Cantidad.getText());
            }
        }catch(NumberFormatException e){
            this.getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se pueden insertar numeros","Solo Numeros",JOptionPane.ERROR_MESSAGE, null);                        
            Cantidad.requestFocus();
            Cantidad.selectAll();
        }
    }//GEN-LAST:event_CantidadFocusLost
    int cont;
    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(cont == 0){
            if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.')){
                evt.consume();
            }else if(caracter == '.'){
                String s = Precio.getText();
                if(s.length() == 0){
                    Precio.setText(0+s);
                }
                cont++;
            }
        }else{
            if((caracter<'0' || caracter>'9')) 
                evt.consume();
        }
        if((int)caracter == 8){
            if(Precio.getText().equals("")){
                cont = 0;
            }
        }
    }//GEN-LAST:event_PrecioKeyTyped
    Producto deshacer;
    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        // TODO add your handling code here:        
        Clear();
    }//GEN-LAST:event_CleanActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:
        if(!(Producto.getText().equals("")&& Cantidad.getText().equals("") && Precio.getText().equals("")
                && Marca.getText().equals("") && Descripcion.getText().equals("") && Vias.getSelectedItem().equals("Vias de administracion")
                && Forma.getSelectedItem().equals("Forma") && Tipo.getSelectedItem().equals("Tipo"))){
                Producto p = new Producto();
                p.setName(Producto.getText());
                p.setId(parseInt(Codigo.getText()));
                p.setCantidad(parseInt(Cantidad.getText()));
                p.setPrecio(parseDouble(Precio.getText()));
                p.setDescripcion(Descripcion.getText());
                p.setMarca(Marca.getText());
                p.setVia((String)Vias.getSelectedItem());
                p.setForma((String)Forma.getSelectedItem());
                p.setTipo((String)Tipo.getSelectedItem());
                Clear();
                new Conectar().InsertarProd(p);
                JOptionPane.showMessageDialog(null,"Su producto fue agregado exitosamente");
                
        }else{
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Informacion Incompleta",JOptionPane.INFORMATION_MESSAGE,null);            
        }
    }//GEN-LAST:event_InsertarActionPerformed

    private void PrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecioFocusLost
        // TODO add your handling code here:
        try{
            if(!(Precio.getText().equals(""))){
                double x = parseDouble(Precio.getText());
            }
        }catch(NumberFormatException e){
            this.getToolkit().beep();       
            JOptionPane.showMessageDialog(null, "Solo se pueden insertar numeros decimales","Solo Numeros Decimales",JOptionPane.ERROR_MESSAGE, null);             
            Precio.requestFocus();
            Precio.selectAll();
        }
    }//GEN-LAST:event_PrecioFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Interfaces.Producto().Call();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Codigo.setText(""+deshacer.getId());
        Producto.setText(deshacer.getName());
        Cantidad.setText(""+deshacer.getCantidad());
        Precio.setText(""+deshacer.getPrecio());
        Descripcion.setText(""+deshacer.getDescripcion());
        Marca.setText(deshacer.getMarca());
        Vias.setSelectedItem(deshacer.getVia());
        Forma.setSelectedItem(deshacer.getForma());
        Tipo.setSelectedItem(deshacer.getTipo());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ViasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViasActionPerformed
        // TODO add your handling code here:        
        if(Vias.getSelectedItem().equals("Oral")){
            f = false;
            String [] v = {"Cápsulas","Comprimidos","Grageas","Preparados líquidos","Jarabes","Elixires","Suspensiones"};
            Forma.removeAllItems();
            Forma.addItem("Forma");
            for(String s: v){
                Forma.addItem(s);
            }
        }else if(Vias.getSelectedItem().equals("Intramuscular")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Inyección");
        }else if(Vias.getSelectedItem().equals("Intravenosa")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Inyección");
        }else if(Vias.getSelectedItem().equals("Vias de administracion")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Tópica")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Cremas");
            Forma.addItem("Spray");
            Forma.addItem("Unguento");
            Forma.addItem("Jabón");
            Forma.addItem("Shampoo");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Ótica")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Gotas");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Subcutánea")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Inyección");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Inhalatoria")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Spray");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Nasal")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Crema");
            Forma.addItem("Unguento");
            Forma.addItem("Spray");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");
        }else if(Vias.getSelectedItem().equals("Oftalmica")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Crema");
            Forma.addItem("Gotas");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");            
        }else if(Vias.getSelectedItem().equals("Transdermica")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Inyección");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");         
        }else if(Vias.getSelectedItem().equals("Rectal")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Supositorio");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");         
        }else if(Vias.getSelectedItem().equals("Vaginal")){
            Forma.removeAllItems();
            Forma.addItem("Forma");
            Forma.addItem("Crema");
            Forma.addItem("Ovulos");
            Tipo.removeAllItems();
            Tipo.addItem("Tipo");         
        }
    }//GEN-LAST:event_ViasActionPerformed
    boolean f = false;
    private void FormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaActionPerformed
        // TODO add your handling code here:        
        if(f && (Vias.getSelectedItem()!="Vias de administracion") && (Forma.getItemCount())!=0){
            if(Forma.getSelectedItem().equals("Forma")){
                Tipo.removeAllItems();
                Tipo.addItem("Tipo");
            }else{   
                Tipo.removeAllItems();
                Tipo.addItem("Tipo"); 
                for(String s: v){     
                    Tipo.addItem(s);
                } 
            }
        }        
    }//GEN-LAST:event_FormaActionPerformed

    private void FormaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaMouseClicked
        // TODO add your handling code here:
        f = true;
    }//GEN-LAST:event_FormaMouseClicked

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton Clean;
    private static javax.swing.JLabel Codigo;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JComboBox Forma;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Producto;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JComboBox Vias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void Clear() {
        deshacer = new Producto();
        deshacer.setName(Producto.getText());
        deshacer.setId(parseInt(Codigo.getText()));
        deshacer.setCantidad(parseInt(Cantidad.getText()));
        deshacer.setPrecio(parseDouble(Precio.getText()));
        deshacer.setDescripcion(Descripcion.getText());
        deshacer.setMarca(Marca.getText());
        deshacer.setVia((String)Vias.getSelectedItem());
        deshacer.setForma((String)Forma.getSelectedItem());
        deshacer.setTipo((String)Tipo.getSelectedItem());        
        jButton2.setEnabled(true);
        Cantidad.setText("");
        Producto.setText("");
        Precio.setText("");
        Descripcion.setText("");
        Marca.setText("");
        Codigo.setText("");
        Vias.addItem("Vias de administracion");
        Forma.removeAllItems();
        Forma.addItem("Forma");
        Tipo.removeAllItems();
        Tipo.addItem("Tipo");
    }
    static List<Producto> prod;

    void Call() {
        int cont = 0;
        prod = new Conectar().ConexionProd();
        for(Producto p: prod){
            if(p == null){
                Codigo.setText("000000");
            }else if(prod.size()-1 == cont){
                String s;
                s = new Search().SetLength(""+(p.getId()+1));
                Codigo.setText(s);
            }
            cont ++;        
        }
        this.setVisible(true);
    }
}
