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
public class VentasC {
    private String Name;
    private int Cantidad;

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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public VentasC(String Name, int Cantidad, String Fecha) {
        this.Name = Name;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
    }

    public VentasC() {
    }
    private String Fecha;
}
