package com.nk.controller;

import com.nk.interfaces.IController;
import com.nk.processview.PVRegistrarClientes;
import com.nk.view.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRegistrarCliente extends IController implements ActionListener {
    
    private VRegistrarCliente view;
    
    public CRegistrarCliente(VRegistrarCliente f) {
        view = f;
        super.build();
    }
    
    @Override
    public void instanceAll() {
    }
    
    @Override
    public void addAllListener() {
        view.btnActualizar.addActionListener(this);
        view.btnAgregar.addActionListener(this);
        view.btnConsultar.addActionListener(this);
        view.btnEliminar.addActionListener(this);
    }
    
    @Override
    public void buildView() {
        view.setTitle("Registrar Clientes");
        view.setVisible(true);
        view.btnActualizar.setEnabled(false);
        PVRegistrarClientes.readAllForUser(view);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnActualizar) {
            PVRegistrarClientes.update(view);
        }
        if (e.getSource() == view.btnAgregar) {
            PVRegistrarClientes.create(view);
        }
        if (e.getSource() == view.btnConsultar) {
            PVRegistrarClientes.consult(view);
        }
        if (e.getSource() == view.btnEliminar) {
            PVRegistrarClientes.delete(view);
        }
    }
    
}
