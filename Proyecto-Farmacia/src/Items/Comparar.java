/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import Pojo.Producto;
import Pojo.Usuario;

/**
 *
 * @author h p
 */
public class Comparar {
    public Producto CompararAll(Producto p,String s){
        int [] datos = new int[4];
        s = s.toLowerCase();
        String n = p.getName().toLowerCase();
        String m = p.getMarca().toLowerCase();        
        datos[0] = s.length();
        datos[1] = p.getName().length();
        datos[2] = p.getMarca().length();
        boolean flag = false;
        for(int i = 0; i < (datos[1]-datos[0]);i++){
            if(n.regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        for(int i = 0; i < (datos[2]-datos[0]);i++){
            if(m.regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        if(!flag){
            p = null;
        }
        return p;
    }
    public Usuario CompararAll(Usuario us,String s){
        int [] datos = new int[4];
        datos[0] = s.length();
        datos[1] = us.getName().length();
        boolean flag = false;
        for(int i = 0; i < (datos[1]-datos[0]);i++){
            if(us.getName().regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        if(!flag){
            us = null;
        }
        return us;
    }
}
