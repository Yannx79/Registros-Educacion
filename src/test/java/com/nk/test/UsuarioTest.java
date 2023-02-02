
package com.nk.test;

import com.nk.dao.UsuarioDAO;

public class UsuarioTest {

    public static void main(String[] args) {
        listar();
    }
    
    public static void listar() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.readAll().forEach(System.out::println);
    }
    
}
