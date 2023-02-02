package com.nk.controller;

import com.nk.interfaces.IController;
import com.nk.utility.Desktop;
import com.nk.view.VLogin;
import com.nk.view.VMenu;
import com.nk.view.VRegistrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class CMenu extends IController implements ActionListener, WindowListener {

    public static VMenu view;
    public static boolean session = false;

    public CMenu(VMenu f) {
        view = f;
        super.build();
    }

    @Override
    public void buildView() {
        view.setTitle("Menu de Registros NK");
        view.setVisible(true);
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.miLogout.setEnabled(false);
        view.jmCliente.setEnabled(false);
        view.jmEmpleado.setEnabled(false);
    }

    @Override
    public void instanceAll() {
    }

    @Override
    public void addAllListener() {
        view.miLogout.addActionListener(this);
        view.miGenerarCita.addActionListener(this);
        view.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.miGenerarCita) {
            VRegistrarCliente vrc = new VRegistrarCliente();
            CRegistrarCliente crc = new CRegistrarCliente(vrc);
            Desktop.addToDesktop(view.desktopMenu, vrc);
        }
        if (e.getSource() == view.miLogout) {
            session = false;
            presentarLogin();
        }
    }

    
    public void presentarLogin() {
        VLogin vl = new VLogin();
        CLogin cl = new CLogin(vl);
        Desktop.addToDesktop(view.desktopMenu, vl);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        presentarLogin();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
