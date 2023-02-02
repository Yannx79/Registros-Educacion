
package com.nk.utility;

import javax.swing.JOptionPane;

public class Message {

    public static void mostrar(String text) {
        JOptionPane.showMessageDialog(null, text, "INFORMACION",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String caputar(String text) {
        return JOptionPane.showInputDialog(null, text, "CAPTURAR", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static int confirmar(String text) {
        return JOptionPane.showConfirmDialog(null, text, "CONFIRMAR", 
                JOptionPane.YES_NO_OPTION);
    }
    
}
