/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import Pojo.Producto;
import Pojo.Usuario;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;

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
        String name = us.getName().toLowerCase();
        datos[0] = s.length();
        datos[1] = us.getName().length();
        boolean flag = false;
        for(int i = 0; i < (datos[1]-datos[0]);i++){
            if(name.regionMatches(i, s, 0, datos[0])){
                flag = true;
            }
        }
        if(!flag){
            us = null;
        }
        return us;
    }
    public String Fecha(String s){
        String f = null;
	StringTokenizer tokens=new StringTokenizer(s, "/");
        int ndatos=tokens.countTokens();
        int[] datos=new int[ndatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i] = parseInt(str);
            if(i == 2){
                f = Date(datos[i-1],datos[i]);
            }
            i++;
        }
        return f;
    }
    public String Date(int x,int y){
        String mes = null;
        if(x == 1){
            mes = "Enero "+y;
        }else if(x == 2){
            mes = "Febrero "+y;
        }else if(x == 3){
            mes = "Marzo "+y;
        }else if(x == 4){
            mes = "Abril "+y;
        }else if(x == 5){
            mes = "Mayo "+y;            
        }else if(x == 6){
            mes = "Junio "+y;
        }else if(x == 7){
            mes = "Julio "+y;
        }else if(x == 8){
            mes = "Agosto "+y;
        }else if(x == 9){
            mes = "Septiembre "+y;
        }else if(x == 10){
            mes = "Octubre "+y;
        }else if(x == 11){
            mes = "Noviembre "+y;
        }else if(x == 12){
            mes = "Diciembre "+y;
        }
        return mes;
    }
}
