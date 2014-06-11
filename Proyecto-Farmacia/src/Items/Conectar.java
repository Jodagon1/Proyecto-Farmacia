/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Items;

import Pojo.Producto;
import Pojo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author h p
 */
public class Conectar {
    private Connection con = null;
    private List<Usuario> users;
    private List<Producto> prod;
    public List<Usuario> ConexionUs(){
        try{
            Usuario u = new Usuario();
            users = new ArrayList<>();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from Usuario");
            while(rs.next()){
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
                users.add(u);
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){}
        return users;
    }
    public List<Producto> ConexionProd(){
        try{            
            prod = new ArrayList<>();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from Producto");
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setMarca(rs.getString(3));
                p.setVia(rs.getString(4));
                p.setForma(rs.getString(5));
                p.setTipo(rs.getString(6));
                p.setCantidad(rs.getInt(7));
                p.setPrecio(rs.getDouble(8));
                p.setDescripcion(rs.getString(9));
                prod.add(p);
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){}        
        return prod;
    }
    public void InsertarUs(Usuario us){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            s.executeUpdate("Insert into Usuario(Id,Name,Pass) "
                    + "Values (null,"+"'"+us.getName()+"','"+us.getPassword()+"');");
        }catch(SQLException | ClassNotFoundException e){}
    }
    public void InsertarProd(Producto p){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            s.executeUpdate("Insert into Producto(Id,Name,Marca,Via,Forma,Tipo,Cantidad,Precio,Descripcion) "
                    + "Values (null,"+"'"+p.getName()+"','"+p.getMarca()+"','"+p.getVia()+"','"+p.getForma()+"','"
                    + ""+p.getTipo()+"','"+p.getCantidad()+"','"+p.getPrecio()+"','"+p.getDescripcion()+"');");
        }catch(SQLException | ClassNotFoundException e){}
    }
    public void ModificarProd(Producto p){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            s.executeUpdate("update Producto set Name = '"+p.getName()+"',Marca = '"+p.getMarca()+"',Via = '"+p.getVia()+"',"
                    + "Forma = '"+p.getForma()+"',Tipo = '"+p.getTipo()+"',Cantidad = '"+p.getCantidad()+"',Precio = '"+p.getPrecio()+"',Descripcion = '"+p.getDescripcion()+"' "
                    + "where Id = "+"'"+p.getId()+"';");
        }catch(SQLException | ClassNotFoundException e){}
    }
    public void EliminarProd(Producto p){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User","root","Joda");
            Statement s = con.createStatement();
            s.executeUpdate("Delete from Producto where Id = '"+p.getId()+"';");
            s.executeUpdate("Insert into Historico(Id,Name,Marca,Via,Forma,Tipo,Cantidad,Precio,Descripcion) "
                    + "Values ('"+p.getId()+"',"+"'"+p.getName()+"','"+p.getMarca()+"','"+p.getVia()+"','"+p.getForma()+"','"
                    + ""+p.getTipo()+"','"+p.getCantidad()+"','"+p.getPrecio()+"','"+p.getDescripcion()+"');");
        }catch(SQLException | ClassNotFoundException e){}
        JOptionPane.showMessageDialog(null,"Producto Eliminado Satisfactoriamente");
    }
}
