package pkgGUI;

import javax.swing.JOptionPane;
import pkgClases.clsArchivos;
import pkgClases.clsDocente;
import pkgClases.clsEstudiantes;
import pkgClases.clsHorarios;
import pkgClases.clsLeerCurso;

/**
 *
 * @author Usuario
 */
public class frmRegistroCurso extends javax.swing.JInternalFrame {

    clsArchivos objArchivo = new clsArchivos();
    //paea llamar al metodo mostrar el usuario y se guarden los datos de dicho usuario
    String nombres;
    String apellidos;
    String lenguaje;
    String usuario;
    String nombre;
    String apellido;
    String usuarioe;
    String direccion;

    public frmRegistroCurso() {
        initComponents();
        cargar();
        cargare();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbmFecha = new javax.swing.JComboBox<>();
        cbmHora = new javax.swing.JComboBox<>();
        txtfechafin = new javax.swing.JTextField();
        txtHorafin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbmdias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Registro del curso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 170, 30));

        jLabel3.setText("Hora de Inicio del Curso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 20));

        jLabel4.setText("Fecha de Inicio del Curso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 130, 30));

        jLabel5.setText("Fecha de Fin del Curso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setText("Hora Fin del Curso");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        cbmFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "08/07/2017" }));
        cbmFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmFechaActionPerformed(evt);
            }
        });
        getContentPane().add(cbmFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 180, 30));

        cbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "08:00", "14:00" }));
        cbmHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cbmHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 30));

        txtfechafin.setEditable(false);
        getContentPane().add(txtfechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, 30));

        txtHorafin.setEditable(false);
        txtHorafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorafinActionPerformed(evt);
            }
        });
        getContentPane().add(txtHorafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "lenguaje", "Usuario"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 370, 90));

        jLabel7.setText("Dias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 30, 30));

        cbmdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Lunes-Miercoles-Viernes", "Martes-Jueves-Sabado" }));
        getContentPane().add(cbmdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 30));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Direccion", "Usuario"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 370, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void cargar() {
        String matriz[][] = new String[objArchivo.LeerArchivo().size()][4];
        for (int i = 0; i < objArchivo.LeerArchivo().size(); i++) {
            matriz[i][0] = objArchivo.LeerArchivo().get(i).getStrNombre();
            matriz[i][1] = objArchivo.LeerArchivo().get(i).getStrApellidos();
            matriz[i][2] = objArchivo.LeerArchivo().get(i).getStrLenguaje();
            matriz[i][3] = objArchivo.LeerArchivo().get(i).getStrUsuario();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Apellido", "lenguaje", "Usuario"
                }
        ));
    }

    public void cargare() {
        String matriz[][] = new String[objArchivo.LeerArchivoe().size()][4];
        for (int i = 0; i < objArchivo.LeerArchivoe().size(); i++) {
            matriz[i][0] = objArchivo.LeerArchivoe().get(i).getStrNombre();
            matriz[i][1] = objArchivo.LeerArchivoe().get(i).getStrApellidos();
            matriz[i][2] = objArchivo.LeerArchivoe().get(i).getStrDirecion();
            matriz[i][3] = objArchivo.LeerArchivoe().get(i).getStrUsuario();
        }
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Apellido", "Direccion", "Usuario"
                }
        ));
    }

    public void guardar() {
        String Matriz[][] = new String[1][13];
        Matriz[0][0] = cbmFecha.getSelectedItem().toString();
        Matriz[0][1] = txtfechafin.getText();
        Matriz[0][2] = cbmdias.getSelectedItem().toString();
        Matriz[0][3] = cbmHora.getSelectedItem().toString();
        Matriz[0][4] = txtHorafin.getText();
        Matriz[0][5] = nombres;
        Matriz[0][6] = apellidos;
        Matriz[0][7] = lenguaje;
        Matriz[0][8] = usuario;
        Matriz[0][9] = nombre;
        Matriz[0][10] = apellido;
        Matriz[0][11] = direccion;
        Matriz[0][12] = usuarioe;
        if (Matriz[0][0] != ("----------") && Matriz[0][2] != "----------" && Matriz[0][3] != "----------" && nombres != null && nombre != null) {
            if (Matriz[0][0] != ("----------") || Matriz[0][2] != "----------" || Matriz[0][3] != "----------" && nombres != null && nombre != null) {
                clsDocente objDocente = new clsDocente(Matriz[0][5], Matriz[0][6], null, Matriz[0][7], Matriz[0][8], null);
                clsEstudiantes objEstudiante = new clsEstudiantes(Matriz[0][9], Matriz[0][10], Matriz[0][11], null, Matriz[0][12], null);
                clsHorarios objHorarios = new clsHorarios(Matriz[0][0], Matriz[0][1], Matriz[0][2], Matriz[0][3], Matriz[0][4]);
                clsLeerCurso objcurso = new clsLeerCurso(objHorarios, objDocente, objEstudiante);
                objArchivo.SaveCurso(objcurso);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor Selecione todo lo necesario incluyendo los de la tabla");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor Selecione todo lo necesario incluyendo los de la tabla");
        }
    }

    public void limpiar() {
        cbmFecha.setSelectedIndex(0);
        txtfechafin.setText("");
        cbmHora.setSelectedIndex(0);
        txtHorafin.setText("");
        cbmdias.setSelectedIndex(0);
        cbmdias.setSelectedIndex(0);
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Eventos"> 

    private void cbmFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmFechaActionPerformed
        // TODO add your handling code here:
        if (cbmFecha.getSelectedItem().toString().equals("08/07/2017")) {
            txtfechafin.setText("08/11/2017");
        }
    }//GEN-LAST:event_cbmFechaActionPerformed

    private void txtHorafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorafinActionPerformed

    private void cbmHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmHoraActionPerformed
        // TODO add your handling code here:
        if (cbmHora.getSelectedItem().toString().equals("08:00")) {
            txtHorafin.setText("12:00");
        } else {
            txtHorafin.setText("18:00");
        }
    }//GEN-LAST:event_cbmHoraActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int filaseleccionada;
        filaseleccionada = jTable1.getSelectedRow();
        nombres = (String) jTable1.getValueAt(filaseleccionada, 0);
        apellidos = (String) jTable1.getValueAt(filaseleccionada, 1);
        lenguaje = (String) jTable1.getValueAt(filaseleccionada, 2);
        usuario = (String) jTable1.getValueAt(filaseleccionada, 3);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int filaseleccionada;
        filaseleccionada = jTable2.getSelectedRow();
        nombre = (String) jTable2.getValueAt(filaseleccionada, 0);
        apellido = (String) jTable2.getValueAt(filaseleccionada, 1);
        direccion = (String) jTable2.getValueAt(filaseleccionada, 2);
        usuarioe = (String) jTable2.getValueAt(filaseleccionada, 3);
    }//GEN-LAST:event_jTable2MouseClicked

    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmFecha;
    private javax.swing.JComboBox<String> cbmHora;
    private javax.swing.JComboBox<String> cbmdias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtHorafin;
    private javax.swing.JTextField txtfechafin;
    // End of variables declaration//GEN-END:variables
}
