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
public class Factura {
    private int Id;
    private String Name;
    private double Total;

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
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

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private String Marca;

    public Factura(int Id, String Name, String Marca, String usuario, String Fecha, int Cantidad, double precio,double total) {
        this.Id = Id;
        this.Name = Name;
        this.Marca = Marca;
        this.usuario = usuario;
        this.Fecha = Fecha;
        this.Cantidad = Cantidad;
        this.precio = precio;
        this.Total = total;
    }

    public Factura() {
    }
    private String usuario;
    private String Fecha;
    private int Cantidad;
    private double precio;    
}
