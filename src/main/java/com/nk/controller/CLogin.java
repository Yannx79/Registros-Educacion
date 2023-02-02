
package com.nk.controller;

import com.nk.interfaces.IController;
import com.nk.processview.PVLogin;
import com.nk.view.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CLogin extends IController implements ActionListener {
    
    private VLogin view;
    
    public CLogin(VLogin f) {
        view = f;
        super.build();
    }

    @Override
    public void instanceAll() {
    }

    @Override
    public void addAllListener() {
        view.btnLogin.addActionListener(this);
    }

    @Override
    public void buildView() {
        view.setTitle("Login");
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnLogin) {
            PVLogin.loguear(view);
        }
    }

}
