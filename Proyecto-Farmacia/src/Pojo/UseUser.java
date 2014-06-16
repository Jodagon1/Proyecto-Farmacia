/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pojo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class UseUser {
    RandomAccessFile raf;
    public void SetUser(Usuario u)throws IOException{
        String s = "C:/Usuario/";
        File f = new File(s);
        f.mkdirs();
        s += "/User.jon";
        File f1 = new File(s);        
        f1.createNewFile();        
        raf = new RandomAccessFile(f1,"rw"); 
        raf.setLength(0);
        StringBuffer sb = new StringBuffer(u.getName());
        sb.setLength(30);        
        raf.seek(0);
        raf.writeBytes(sb.toString());
    }
    public String GetUser()throws IOException{
        File f = new File("C:/Usuario/User.jon");     
        raf = new RandomAccessFile(f,"rw"); 
        raf.seek(0);
        byte [] b = new byte[30];
        raf.read(b);
        String s = new String(b);
        return s;
    }
}
