/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pojo;

/**
 *
 * @author h p
 */
public class Producto {
    private int Id;
    private String Name;
    private int Cantidad;
    private double Precio;
    private String Marca;
    private String Descripcion;
    private String Via;
    private String Forma;
    private String Tipo;
    public Producto() {}
    
    public Producto(int Id, String Name, int Cantidad, double Precio, String Marca, String Descripcion,String Via,String Forma, String Tipo) {
        this.Id = Id;
        this.Name = Name;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Marca = Marca;
        this.Descripcion = Descripcion;
        this.Via = Via;
        this.Forma = Forma;
        this.Tipo = Tipo;
    }
    
    public String getVia(){
        return Via;
    }
    
    public void setVia(String Via){
        this.Via = Via;
    }
    
    public String getForma(){
        return Forma;
    }
    
    public void setForma(String Forma){
        this.Forma = Forma;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }    
    
}
