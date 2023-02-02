package com.nk.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

    private int idUser;
    private String lastNames;
    private String names;
    private String password;
    private String user;
    private int eliminado;

    public UsuarioDTO() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", lastNames=" + lastNames + ", names=" + names + ", password=" + password + ", user=" + user + ", eliminado=" + eliminado + '}';
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
