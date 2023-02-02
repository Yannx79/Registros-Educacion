package com.nk.processview;

import com.nk.interfaces.IHeader;
import com.nk.ob.ClienteOB;
import com.nk.utility.Message;
import com.nk.utility.Present;
import com.nk.view.VRegistrarCliente;

public class PVRegistrarClientes implements IHeader {

    public static void create(VRegistrarCliente view) {
        ClienteOB clienteOB = new ClienteOB();
        String dni = view.txtDNI.getText().trim();
        String apellidos = view.txtApellidos.getText().trim();
        String nombres = view.txtNombres.getText().trim();
        String telefono = view.txtTelefono.getText().trim();
        clienteOB.create(dni, nombres, apellidos, telefono);
        readAllForUser(view);
        Message.mostrar("Se registro el cliente satisfactoriamente");
        clean(view);
    }

    public static void delete(VRegistrarCliente view) {
        String dni = Message.caputar("¿Cual es el DNI a eliminar?");
        int confirmacion = Message.confirmar("¿Esta seguro de eliminar el DNI "
                + dni + " ?");
        if (confirmacion == 0) {
            ClienteOB clienteOB = new ClienteOB();
            clienteOB.delete(dni);
            readAllForUser(view);
            Message.mostrar("Se elimino satisfactoriamente");
        } else {
            Message.mostrar("Cancelado Satisfactoriamente");
        }
    }

    public static void readAllForUser(VRegistrarCliente view) {
        Present.toListInTable(ClienteOB.parseDtoToOb(), view.tblDatos,
                SUMMARY_HEADER_CUSTOMER, false);
    }

    public static void readAllForAdmin(VRegistrarCliente view) {
        Present.toListInTable(ClienteOB.parseDtoToOb(), view.tblDatos,
                FULL_HEADER_CUSTOMER, true);
    }

    public static void update(VRegistrarCliente view) {
        ClienteOB clienteOB = new ClienteOB();
        String dni = view.txtDNI.getText().trim();
        String apellidos = view.txtApellidos.getText().trim();
        String nombres = view.txtNombres.getText().trim();
        String telefono = view.txtTelefono.getText().trim();
        clienteOB.update(dni, nombres, apellidos, telefono);
        view.btnActualizar.setEnabled(false);
        view.txtDNI.setEnabled(true);
        Message.mostrar("Se actualizo satisfactoriamente");
        clean(view);
    }
    
    public static void consult(VRegistrarCliente view) {
        ClienteOB clienteOB = new ClienteOB();
        String dni = Message.caputar("¿Cual es el DNI a consultar?");
        Object[] values = clienteOB.fullRead(dni);
        view.txtDNI.setText(String.valueOf(values[0]));
        view.txtApellidos.setText(String.valueOf(values[1]));
        view.txtNombres.setText(String.valueOf(values[3]));
        view.txtTelefono.setText(String.valueOf(values[4]));
        view.txtDNI.setEnabled(false);
        view.btnActualizar.setEnabled(true);
    }
    
    public static void clean(VRegistrarCliente view) {
        view.txtApellidos.setText("");
        view.txtDNI.setText("");
        view.txtNombres.setText("");
        view.txtTelefono.setText("");
    }
    
}
