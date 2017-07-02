package pkgGUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import pkgClases.clsArchivos;
import pkgClases.clsDocente;

/**
 *
 * @author Usuario
 */
public class Registro_Docente extends javax.swing.JInternalFrame {

    //crear el objeto fachada
    clsArchivos objArchivo = new clsArchivos();

    public Registro_Docente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        cbmlenguaje = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(735, 504));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Registrar un nuevo Docente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 27, 239, 32));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 77, 135, 30));

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 125, 127, 28));

        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 171, 127, 32));

        jLabel5.setText("Lenguaje");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 214, 119, 31));

        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 255, 105, 29));

        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 302, 105, 29));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 255, 297, 29));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 171, 297, 32));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 125, 297, 28));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 77, 297, 30));

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 86, 37));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 300, 30));

        cbmlenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Java", "C++", "Python", "Visual Basic" }));
        getContentPane().add(cbmlenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos"> 
    public void guardar() {
        String nombre = txtNombre.getText().toUpperCase();
        String apellido = txtApellido.getText().toUpperCase();
        String direccion = txtDireccion.getText().toUpperCase();
        String lenguaje = cbmlenguaje.getSelectedItem().toString();
        String usuario = txtUsuario.getText().toLowerCase();
        String password = txtPassword.getText();
        boolean cond = true;
        if (nombre != null && apellido != null && direccion != null && lenguaje != "----------" && usuario != null && password != null) {
            for (int i = 0; i < objArchivo.LeerArchivo().size(); i++) {
                if (usuario.equals(objArchivo.LeerArchivo().get(i).getStrUsuario())) {
                    JOptionPane.showMessageDialog(rootPane, "Usuario ya existe intente nuevamente");
                    cond = false;
                }
            }
            if (cond == true) {
                clsDocente objDocente = new clsDocente(nombre, apellido, direccion, lenguaje, usuario, password);
                objArchivo.SaveDocente(objDocente);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos");
        }
    }

    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        cbmlenguaje.setSelectedIndex(0);
        txtUsuario.setText("");
        txtPassword.setText("");
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Eventos">  
    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtApellido.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbmlenguaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
