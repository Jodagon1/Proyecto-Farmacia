/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author h p
 */
public class Pastel {
    /****************************************************************************
    *El lunes les enseñaria a configurar su netbeans para importar las librerias*
    *jfreechart y jCommon                                                       *
    *****************************************************************************/
    public static void main(String[] args) 
    {
        //Crear un dataset
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Leon",30);
        data.setValue("Gabriel",15);
        data.setValue("Jonathan",30);
        data.setValue("Ricardo",25);
        //Creamos un Chart
        JFreeChart chart = ChartFactory.createPieChart(
                           "Ejemplo de JFreeChart", //Títrulo del gráfico
                           data,
                           true,//Leyenda
                           true,//ToolTips
                           true);
        //Creamos una especie de frame y mostramos el JFreeChart en él
        //Este constructor nos pide el título del Chart y el chart creado
        ChartFrame frame=new ChartFrame("Primer Chart para javax0711",chart);
        frame.pack();
        frame.setVisible(true);
    }
}
