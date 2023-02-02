
package com.nk.processview;

import com.nk.controller.CMenu;
import com.nk.ob.UsuarioOB;
import com.nk.utility.Message;
import com.nk.view.VLogin;

public class PVLogin {

    public static void loguear(VLogin view) {
        String user = view.txtUser.getText().trim();
        String password = String.valueOf(view.txtPassword.getPassword());
        UsuarioOB usuarioOB = new UsuarioOB();
        boolean isLogged = usuarioOB.loguear(user, password);
        if (isLogged) {
            CMenu.session = true;
            CMenu.view.miLogout.setEnabled(true);
            CMenu.view.jmEmpleado.setEnabled(true);
            CMenu.view.jmCliente.setEnabled(true);
            view.dispose();
        } else {
            Message.mostrar("Usuario o Contraseña Incorrecta");
            clean(view);
        }
    }
    
    public static void clean(VLogin view) {
        view.txtUser.setText("");
        view.txtPassword.setText("");
        view.txtUser.requestFocus();
    }
    
}
