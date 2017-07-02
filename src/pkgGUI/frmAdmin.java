package pkgGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmAdmin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpregistro = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitDoce = new javax.swing.JMenuItem();
        mitEstu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mitSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout dpregistroLayout = new javax.swing.GroupLayout(dpregistro);
        dpregistro.setLayout(dpregistroLayout);
        dpregistroLayout.setHorizontalGroup(
            dpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        dpregistroLayout.setVerticalGroup(
            dpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(dpregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        jMenu1.setText("Inicio");

        mitDoce.setText("Registro de Docentes");
        mitDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDoceActionPerformed(evt);
            }
        });
        jMenu1.add(mitDoce);

        mitEstu.setText("Registro de Estudiantes");
        mitEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEstuActionPerformed(evt);
            }
        });
        jMenu1.add(mitEstu);

        jMenuItem1.setText("Registro de Curso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mitSair.setText("Salir");
        mitSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSairActionPerformed(evt);
            }
        });
        jMenu1.add(mitSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDoceActionPerformed
        // TODO add your handling code here:
        Registro_Docente regi = new Registro_Docente();
        dpregistro.add(regi);
        regi.show();
    }//GEN-LAST:event_mitDoceActionPerformed

    private void mitEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEstuActionPerformed
        // TODO add your handling code here:
        Registro_Estudiantes regi = new Registro_Estudiantes();
        dpregistro.add(regi);
        regi.show();
    }//GEN-LAST:event_mitEstuActionPerformed

    private void mitSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSairActionPerformed
        // TODO add your handling code here:
        frmLogin objLogin = new frmLogin();
        objLogin.setVisible(true);
        hide();
    }//GEN-LAST:event_mitSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmRegistroCurso regi = new frmRegistroCurso();
        dpregistro.add(regi);
        regi.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // </editor-fold>  
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
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpregistro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mitDoce;
    private javax.swing.JMenuItem mitEstu;
    private javax.swing.JMenuItem mitSair;
    // End of variables declaration//GEN-END:variables
}
