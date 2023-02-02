package com.nk.dao;

import com.nk.idao.IClienteDAO;
import com.nk.dto.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ClienteDAO implements IClienteDAO<ClienteDTO, String> {

    @Override
    public boolean create(ClienteDTO t) {
        boolean isCreated = false;
        try {
            Connection connection = CONEXION.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_CREATE);
            ps.setString(1, t.getDni());
            ps.setString(2, t.getNombres());
            ps.setString(3, t.getApellidos());
            ps.setString(4, t.getTelefono());
            ps.setInt(5, t.getEliminado());
            if (ps.execute()) {
                isCreated = !isCreated;
            }
        } catch (Exception e) {
            System.out.println("Error ClienteDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return isCreated;
    }

    @Override
    public ClienteDTO read(String key) {
        ClienteDTO clienteDTO = new ClienteDTO();
        Connection connection = CONEXION.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_READ);
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clienteDTO.setDni(rs.getString(1));
                clienteDTO.setNombres(rs.getString(2));
                clienteDTO.setApellidos(rs.getString(3));
                clienteDTO.setTelefono(rs.getString(4));
                clienteDTO.setEliminado(rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println("Error ClienteDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> readAll() {
        List<ClienteDTO> list = new LinkedList<>();
        Connection connection = CONEXION.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_READ_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setDni(rs.getString(1));
                clienteDTO.setNombres(rs.getString(2));
                clienteDTO.setApellidos(rs.getString(3));
                clienteDTO.setTelefono(rs.getString(4));
                clienteDTO.setEliminado(rs.getInt(5));
                list.add(clienteDTO);
            }
        } catch (Exception e) {
            System.out.println("Error ClienteDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return list;
    }

    @Override
    public boolean update(ClienteDTO t) {
        boolean isUpdate = false;
        Connection connection = CONEXION.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_UPDATE);
            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setString(3, t.getTelefono());
            ps.setInt(4, t.getEliminado());
            ps.setString(5, t.getDni());
            if (ps.execute()) {
                isUpdate = !isUpdate;
            }
        } catch (Exception e) {
            System.out.println("Error ClienteDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return isUpdate;
    }

    @Override
    public boolean delete(String key) {
        boolean isDeleted = false;
        Connection connection = CONEXION.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_DELETE);
            ps.setString(1, key);
            if (ps.execute()) {
                isDeleted = !isDeleted;
            }
        } catch (Exception e) {
            System.out.println("Error ClienteDAO: " + e);
        } finally {
            CONEXION.closeConexion();
        }
        return isDeleted;
    }

}
