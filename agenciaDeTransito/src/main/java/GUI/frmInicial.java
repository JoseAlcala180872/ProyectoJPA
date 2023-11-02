/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author José Carlos Alcalá Ruíz 180872
 */
public class frmInicial extends javax.swing.JFrame {

    /**
     * Creates new form frmInicial
     */
    public frmInicial() {
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

        lblTitulo = new javax.swing.JLabel();
        btnRegistrarPersona = new javax.swing.JButton();
        btnTramites = new javax.swing.JButton();
        btnRegistroAutomoviles = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Sistema de tramites veihucular del estado de Sonora");

        btnRegistrarPersona.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistrarPersona.setText("Registrar persona");
        btnRegistrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonaActionPerformed(evt);
            }
        });

        btnTramites.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTramites.setText("Tramites");
        btnTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramitesActionPerformed(evt);
            }
        });

        btnRegistroAutomoviles.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistroAutomoviles.setText("Automoviles");
        btnRegistroAutomoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAutomovilesActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnRegistrarPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTramites)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroAutomoviles)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPersona)
                    .addComponent(btnTramites)
                    .addComponent(btnRegistroAutomoviles)
                    .addComponent(btnSalir))
                .addGap(99, 99, 99))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        frmTramites tramites = new frmTramites();
        tramites.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnRegistrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonaActionPerformed
        frmPersonas personas = new frmPersonas();
        personas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarPersonaActionPerformed

    private void btnRegistroAutomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAutomovilesActionPerformed
        frmAutomoviles autos = new frmAutomoviles();
        autos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroAutomovilesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPersona;
    private javax.swing.JButton btnRegistroAutomoviles;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
