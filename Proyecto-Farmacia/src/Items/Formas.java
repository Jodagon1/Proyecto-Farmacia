/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import Pojo.Producto;
import Pojo.VentasC;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author h p
 */
public class Formas extends javax.swing.JFrame {

    /**
     * Creates new form Formas
     */
    public Formas() {
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
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Graficas");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(493, 409));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    public void SetValues(Map<String, Integer> Usuario,int cont){
        //Crear un dataset
        DefaultPieDataset data = new DefaultPieDataset();
        Iterator it = Usuario.keySet().iterator();
        int c = 0;
        while(it.hasNext()){
            if(c<5){
                String key = (String)it.next();
                data.setValue(key,Usuario.get(key));
            }
        }
        //Creamos un Chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Mejor Empleado ", //Títrulo del gráfico
                data,
                true,//Leyenda
                true,//ToolTips
                true);
        //Creamos una especie de frame y mostramos el JFreeChart en él
        //Este constructor nos pide el título del Chart y el chart creado
        ChartPanel jp = new ChartPanel(chart);
        this.getContentPane().add(jp);
        this.setVisible(true);
    }
    public void Fecha(String s) {        
        List<VentasC> vc = new Conectar().GetVenta();
        List<VentasC> vc1 = new ArrayList<>();
        Map<String, Integer> nombreMap = new TreeMap<String, Integer>();
        for(VentasC v: vc){
            String x = new Comparar().Fecha(s);
            String y = new Comparar().Fecha(v.getFecha());
            if(x.equals(y)){                
                vc1.add(v);
            }
        }
        int total = 0;
        boolean b = true;
        List<String> f1 = new ArrayList<>();
        for(VentasC s1: vc1){
            if(f1.isEmpty()){
                f1.add(s1.getName());
                b = false;
            }else{
                for(int i = 0; i < f1.size();i++){
                    if(s1.equals(f1.get(i))){
                        b = false;
                    }
                }
            }if(b){
                f1.add(s1.getName());
            }
            b = true;
        }       
        for(String s1 : f1){
            for(VentasC v: vc1){
                if(s1.equals(v.getName())){               
                    total += v.getCantidad();
                }
            }
            nombreMap.put(s1, total);
            total = 0;
        } 
        DefaultPieDataset data = new DefaultPieDataset();
        Iterator it = nombreMap.keySet().iterator();
        int x = 0;
        while(it.hasNext()){
            String key = (String)it.next();
            data.setValue(key,nombreMap.get(key)); 
            x++;
            if(x == 5){
                break;
            }
        }
        //Creamos un Chart
        String p = new Comparar().Fecha(s);
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Producto mas vendido en "+p, //Títrulo del gráfico
                data,
                true,//Leyenda
                true,//ToolTips
                true);
        //Creamos una especie de frame y mostramos el JFreeChart en él
        //Este constructor nos pide el título del Chart y el chart creado
        ChartPanel jp = new ChartPanel(chart);
        this.getContentPane().add(jp);
        this.setVisible(true);
    }

    public void FechaM(String get) { 
        String fecha = new Comparar().Fecha(get);
        List<Producto> p = new Conectar().ConexionProd();
        List<VentasC> vc = new Conectar().GetVenta();
        Map<String,Integer> nosell = new TreeMap<>();
        boolean b = true;
        int cont = 0;
        for(Producto pd: p){
            for(VentasC v: vc){ 
                if(pd.getName().equalsIgnoreCase(v.getName())){
                    nosell.put(v.getName(),0);                    
                }else{
                    cont++;
                }
                if(cont == vc.size()){
                    nosell.put(pd.getName(),0);
                }
            }            
            cont = 0;
        }
        int con = 0;
        Iterator i1 = nosell.keySet().iterator();
        while(i1.hasNext()){
            con = 0;
            String k = (String)i1.next();
            for(VentasC v1 : vc){
                if(v1.getName().equals(k)){
                    con += v1.getCantidad();
                    nosell.put(v1.getName(), con);
                }
            }            
        } 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        Iterator i = nosell.keySet().iterator();
        int l = nosell.size();
        int c = 0;
        while(i.hasNext()){            
            String k = (String)i.next();
            int x = nosell.get(k);
            dataset.addValue(x,k,fecha);
            if(l-c>3){
                dataset.clear();
            }
            c++;
        }
        JFreeChart graficoBarras = ChartFactory.createBarChart3D( 
                "Menos vendido mes "+fecha,        //Título de la gráfica 
                "Mes",           //leyenda Eje horizontal 
                "Cantidad Vendida",      //leyenda Eje vertical 
                dataset,                   //datos 
                PlotOrientation.VERTICAL,  //orientación 
                true,
                true,                      //mostrar tooltips 
                true);
        graficoBarras.setBackgroundPaint(Color.LIGHT_GRAY);
        CategoryPlot plot =(CategoryPlot) graficoBarras.getPlot(); 
        plot.setBackgroundPaint(Color.CYAN); //fondo del grafico 
        plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles 
        plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos
        ChartPanel jp = new ChartPanel(graficoBarras);
        this.getContentPane().add(jp);
        this.setVisible(true);
    }    
}
