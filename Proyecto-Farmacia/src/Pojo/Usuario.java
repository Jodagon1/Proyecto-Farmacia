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
public class Usuario {
    private int Id;
    private boolean Administrador;

    public Usuario(int Id, boolean Administrador, boolean Empleado, String Name, String Password) {
        this.Id = Id;
        this.Administrador = Administrador;
        this.Empleado = Empleado;
        this.Name = Name;
        this.Password = Password;
    }

    public boolean isAdministrador() {
        return Administrador;
    }

    public void setAdministrador(boolean Administrador) {
        this.Administrador = Administrador;
    }

    public boolean isEmpleado() {
        return Empleado;
    }

    public void setEmpleado(boolean Empleado) {
        this.Empleado = Empleado;
    }
    private boolean Empleado;

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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Usuario() {
    }
    private String Name;
    private String Password;
}
