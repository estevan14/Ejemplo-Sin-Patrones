/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgGUI;

import pkgClases.clsArchivos;

/**
 *
 * @author Usuario
 */
public class frmCursos extends javax.swing.JInternalFrame {

    clsArchivos objArchivos = new clsArchivos();

    /**
     * Creates new form frmCursos
     */
    public frmCursos() {
        initComponents();
        cargarcurso(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Lenguaje", "Nombre de Alunmos", "Apellido de Alumnos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void cargarcurso() {
        String mc[][] = new String[objArchivos.LeerArchivoc().size()][8];
        for (int i = 0; i < objArchivos.LeerArchivoc().size(); i++) {
            mc[i][0] = objArchivos.LeerArchivoc().get(i).getObjHorarios().getStrFechaInicio();
            mc[i][1] = objArchivos.LeerArchivoc().get(i).getObjHorarios().getStrFechaFin();
            mc[i][2] = objArchivos.LeerArchivoc().get(i).getObjHorarios().getStrDias();
            mc[i][3] = objArchivos.LeerArchivoc().get(i).getObjHorarios().getStrHoraInicio();
            mc[i][4] = objArchivos.LeerArchivoc().get(i).getObjHorarios().getStrHoraFin();
            mc[i][5] = objArchivos.LeerArchivoc().get(i).getObjDocente().getStrLenguaje();
            mc[i][6] = objArchivos.LeerArchivoc().get(i).getObjEstudiante().getStrNombre();
            mc[i][7] = objArchivos.LeerArchivoc().get(i).getObjEstudiante().getStrApellidos();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                mc,
                new String[]{
                    "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Lenguaje", "Nombre de Alunmos", "Apellido de Alumnos"
                }
        ));
    }
    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
