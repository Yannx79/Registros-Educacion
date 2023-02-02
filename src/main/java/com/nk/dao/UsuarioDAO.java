
package com.nk.dao;

import com.nk.dto.UsuarioDTO;
import com.nk.idao.IUsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO<UsuarioDTO, Integer>{

    @Override
    public boolean create(UsuarioDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioDTO read(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UsuarioDTO> readAll() {
        List<UsuarioDTO> list = new LinkedList<>();
        Connection connection = CONEXION.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_READ_ALL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setIdUser(rs.getInt(1));
                usuarioDTO.setNames(rs.getString(2));
                usuarioDTO.setLastNames(rs.getString(3));
                usuarioDTO.setUser(rs.getString(4));
                usuarioDTO.setPassword(rs.getString(5));
                usuarioDTO.setEliminado(rs.getInt(6));
                list.add(usuarioDTO);
            }
        } catch (Exception e) {
            System.out.println("Error UsuarioDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return list;
    }

    @Override
    public boolean update(UsuarioDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
