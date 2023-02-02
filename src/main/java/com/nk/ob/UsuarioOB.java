package com.nk.ob;

import com.nk.dao.UsuarioDAO;
import com.nk.dto.UsuarioDTO;
import com.nk.interfaces.IObjectOB;
import com.nk.utility.Encrypt;
import java.util.List;

public class UsuarioOB implements IObjectOB<Integer> {

    private UsuarioDTO usuarioDTO;
    private UsuarioDAO usuarioDAO;

    public UsuarioOB() {
        usuarioDAO = new UsuarioDAO();
        usuarioDTO = new UsuarioDTO();
    }

    public static boolean loguear(String user, String password) {
        boolean isLogged = false;
        UsuarioDAO udao = new UsuarioDAO();
        List<UsuarioDTO> list = udao.readAll();
        password = Encrypt.toMD5(password);
        for (UsuarioDTO u : list) {
            if (u.getUser().equalsIgnoreCase(user) && u.getPassword().equalsIgnoreCase(password)) {
                isLogged = !isLogged;
                break;
            }
        }
        return isLogged;

    }

    @Override
    public Object[] fullRead(Integer key) {
        return null;
    }

    @Override
    public Object[] fullRead() {
        return null;
    }

    @Override
    public Object[] summaryRead(Integer key) {
        return null;
    }

    @Override
    public Object[] summaryRead() {
        return null;
    }

}
