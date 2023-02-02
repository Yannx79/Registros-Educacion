package com.nk.dto;

import java.io.Serializable;

// El cliente debe estar registrado
// Para agregar una mascota
public class ClienteDTO implements Serializable {

    private String dni;
    private String apellidos;
    private String nombres;
    private String telefono;
    private int eliminado;

    public ClienteDTO() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombres=" + nombres + ", telefono=" + telefono + ", eliminado=" + eliminado + '}';
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
