/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nk.view;

/**
 *
 * @author yanni
 */
public class VMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public VMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmSesion = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        jmCliente = new javax.swing.JMenu();
        miGenerarCita = new javax.swing.JMenuItem();
        jmEmpleado = new javax.swing.JMenu();
        miRegistrarCliente = new javax.swing.JMenuItem();
        miRegistrarMascota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopMenuLayout = new javax.swing.GroupLayout(desktopMenu);
        desktopMenu.setLayout(desktopMenuLayout);
        desktopMenuLayout.setHorizontalGroup(
            desktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopMenuLayout.setVerticalGroup(
            desktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jmSesion.setText("Sesion");

        miLogout.setText("Logout");
        jmSesion.add(miLogout);

        jMenuBar1.add(jmSesion);

        jmCliente.setText("Operaciones del Cliente");

        miGenerarCita.setText("Generar Cita");
        jmCliente.add(miGenerarCita);

        jMenuBar1.add(jmCliente);

        jmEmpleado.setText("Operaciones del Empleado");

        miRegistrarCliente.setText("Registrar Cliente");
        jmEmpleado.add(miRegistrarCliente);

        miRegistrarMascota.setText("Registrar Mascota");
        jmEmpleado.add(miRegistrarMascota);

        jMenuBar1.add(jmEmpleado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktopMenu;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jmCliente;
    public javax.swing.JMenu jmEmpleado;
    public javax.swing.JMenu jmSesion;
    public javax.swing.JMenuItem miGenerarCita;
    public javax.swing.JMenuItem miLogout;
    public javax.swing.JMenuItem miRegistrarCliente;
    public javax.swing.JMenuItem miRegistrarMascota;
    // End of variables declaration//GEN-END:variables
}