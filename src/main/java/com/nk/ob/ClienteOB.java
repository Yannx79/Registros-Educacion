package com.nk.ob;

import com.nk.dao.ClienteDAO;
import com.nk.dto.ClienteDTO;
import com.nk.interfaces.IObjectOB;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClienteOB implements IObjectOB<String> {

    private ClienteDTO clienteDTO;
    private ClienteDAO clienteDAO;

    public ClienteOB() {
        clienteDAO = new ClienteDAO();
        clienteDTO = new ClienteDTO();
    }

    public void create(String dni, String nombres, String apellidos,
            String telefono) {
        clienteDTO.setDni(dni);
        clienteDTO.setNombres(nombres);
        clienteDTO.setApellidos(apellidos);
        clienteDTO.setTelefono(telefono);
        clienteDTO.setEliminado(0);
        clienteDAO.create(clienteDTO);
    }

    @Override
    public Object[] fullRead(String dni) {
        clienteDTO = clienteDAO.read(dni);
        Object[] data = {
            clienteDTO.getDni(),
            clienteDTO.getApellidos(),
            clienteDTO.getEliminado(),
            clienteDTO.getNombres(),
            clienteDTO.getTelefono()
        };
        return data;
    }

    @Override
    public Object[] summaryRead(String dni) {
        clienteDTO = clienteDAO.read(dni);
        Object[] data = {
            clienteDTO.getDni(),
            clienteDTO.getApellidos(),
            clienteDTO.getNombres(),
            clienteDTO.getTelefono()
        };
        return data;
    }

    @Override
    public Object[] fullRead() {
        Object[] data = {
            clienteDTO.getDni(),
            clienteDTO.getApellidos(),
            clienteDTO.getEliminado(),
            clienteDTO.getNombres(),
            clienteDTO.getTelefono()
        };
        return data;
    }

    @Override
    public Object[] summaryRead() {
        Object[] data = {
            clienteDTO.getDni(),
            clienteDTO.getApellidos(),
            clienteDTO.getEliminado(),
            clienteDTO.getNombres(),
            clienteDTO.getTelefono()
        };
        return data;
    }

    public void delete(String dni) {
        clienteDAO.delete(dni);
    }

    public void update(String dni, String nombres, String apellidos,
            String telefono) {
        clienteDTO.setDni(dni);
        clienteDTO.setNombres(nombres);
        clienteDTO.setApellidos(apellidos);
        clienteDTO.setTelefono(telefono);
        clienteDTO.setEliminado(0);
        clienteDAO.update(clienteDTO);
    }

    public static List<ClienteOB> parseDtoToOb() {
        ClienteDAO cdao = new ClienteDAO();
        List<ClienteOB> obList = new LinkedList<>();
        List<ClienteDTO> dtoList = cdao.readAll();

        for (ClienteDTO cdto : dtoList) {
            ClienteOB clienteOB = new ClienteOB();
            clienteOB.setClienteDTO(cdto);
            obList.add(clienteOB);
        }

        return obList;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public ClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    public void setClienteDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

}
