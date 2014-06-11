/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import Pojo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class Comparar {
    public Producto CompararAll(Producto p,String s){
        int [] datos = new int[4];
        datos[0] = s.length();
        datos[1] = p.getName().length();
        datos[2] = p.getMarca().length();
        datos[3] = p.getDescripcion().length();
        boolean flag = false;
        for(int i = 0; i < (datos[1]-datos[0]);i++){
            if(p.getName().regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        for(int i = 0; i < (datos[2]-datos[0]);i++){
            if(p.getMarca().regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        for(int i = 0; i < (datos[3]-datos[0]);i++){
            if(p.getDescripcion().regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        if(!flag){
            p = null;
        }
        return p;
    }
//    public static void main(String []args){
//        String a = "Acetaminofen";
//        java.util.Scanner Scan = new java.util.Scanner(System.in);        
//        String a1 = JOptionPane.showInputDialog(null, "Inserte el nombre a buscar: ");
//        int x; int y;
//        boolean b = true;
//        x = a.length();
//        y = a1.length();
//        for(int i = 0; i < (x-y);i++){
//            if(a.regionMatches(i, a1, 0, y)){
//                JOptionPane.showMessageDialog(null,"Se encontro: "+a);
//                b = false;
//            }
//        }
//        if(b){
//            JOptionPane.showMessageDialog(null,"No se encontro nada");
//        }
//    }
}
