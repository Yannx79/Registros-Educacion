package com.nk.test;

import com.nk.dao.ClienteDAO;
import com.nk.dto.ClienteDTO;

public class ClientesTest {

    public static void main(String[] args) {
        update();
    }

    private static void update() {
        ClienteDTO c = new ClienteDTO();
        c.setDni("73171689");
        c.setApellidos("Funes Santos");
        c.setEliminado(0);
        c.setNombres("Yasuhiro Yannick");
        c.setTelefono("789789798");

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(c);
    }

    private static void delete(String key) {
        new ClienteDAO().delete(key);
    }

    private static void readAll() {
        new ClienteDAO().readAll().forEach(System.out::println);
    }

    private static void readOne() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO clienteDTO = clienteDAO.read("73171644");
        System.out.println(clienteDTO);
    }

    private static void create() {
        ClienteDTO c = new ClienteDTO();
        c.setDni("46464578");
        c.setApellidos("Valdivia Santos");
        c.setEliminado(0);
        c.setNombres("Renato Martinez");
        c.setTelefono("46464578");

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(c);
    }

}
