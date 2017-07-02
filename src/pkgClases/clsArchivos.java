/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class clsArchivos {

    //guardar todos los registros docentes, estudiantes y registros de los cursos
    public void SaveDocente(clsDocente objdocente) {
        try {
            File f = new File("Docentes.txt");
            FileWriter fw;
            BufferedWriter bw;
            //si docente es diferente de null entra a registrar a docente
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(objdocente.getStrNombre() + "  " + objdocente.getStrApellidos() + "  " + objdocente.getStrDirecion()
                        + "  " + objdocente.getStrLenguaje() + "  " + objdocente.getStrUsuario() + "  " + objdocente.getStrPassword());
                JOptionPane.showMessageDialog(null, "Docente Registrado Corretamente");
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(objdocente.getStrNombre() + "  " + objdocente.getStrApellidos() + "  " + objdocente.getStrDirecion()
                        + "  " + objdocente.getStrLenguaje() + "  " + objdocente.getStrUsuario() + "  " + objdocente.getStrPassword());
                JOptionPane.showMessageDialog(null, "Docente Registrado Corretamente");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error con el archivo");
        }
    }

    public void SaveEstudiantes(clsEstudiantes objEstudiantes) {
        try {
            File f = new File("Estudiantes.txt");
            FileWriter fw;
            BufferedWriter bw;
            //si docente es diferente de null entra a registrar a docente
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(objEstudiantes.getStrNombre() + "  " + objEstudiantes.getStrApellidos() + "  " + objEstudiantes.getStrDirecion() + "  "
                        + objEstudiantes.getStrEdad() + "  " + objEstudiantes.getStrUsuario() + "  " + objEstudiantes.getStrPassword());
                JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(objEstudiantes.getStrNombre() + "  " + objEstudiantes.getStrApellidos() + "  " + objEstudiantes.getStrDirecion() + "  "
                        + objEstudiantes.getStrEdad() + "  " + objEstudiantes.getStrUsuario() + "  " + objEstudiantes.getStrPassword());
                JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error con el archivo");
        }
    }

    public void SaveCurso(clsLeerCurso obCurso) {
        try {
            File f = new File("RHorarios.txt");
            FileWriter fw;
            BufferedWriter bw;
            //si docente es diferente de null entra a registrar a docente
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(obCurso.getObjHorarios().getStrFechaInicio() + "  " + obCurso.getObjHorarios().getStrFechaFin() + "  " + obCurso.getObjHorarios().getStrDias()
                        + "  " + obCurso.getObjHorarios().getStrHoraInicio() + "  " + obCurso.getObjHorarios().getStrHoraFin() + "  "
                        + obCurso.getObjDocente().getStrNombre() + "  " + obCurso.getObjDocente().getStrApellidos() + "  " + obCurso.getObjDocente().getStrLenguaje()
                        + "  " + obCurso.getObjDocente().getStrUsuario() + "  " + obCurso.getObjEstudiante().getStrNombre() + "  "
                        + obCurso.getObjEstudiante().getStrApellidos() + "  " + obCurso.getObjEstudiante().getStrDirecion() + "  " + obCurso.getObjDocente().getStrUsuario());
                JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(obCurso.getObjHorarios().getStrFechaInicio() + "  " + obCurso.getObjHorarios().getStrFechaFin() + "  " + obCurso.getObjHorarios().getStrDias()
                        + "  " + obCurso.getObjHorarios().getStrHoraInicio() + "  " + obCurso.getObjHorarios().getStrHoraFin() + "  "
                        + obCurso.getObjDocente().getStrNombre() + "  " + obCurso.getObjDocente().getStrApellidos() + "  " + obCurso.getObjDocente().getStrLenguaje()
                        + "  " + obCurso.getObjDocente().getStrUsuario() + "  " + obCurso.getObjEstudiante().getStrNombre() + "  "
                        + obCurso.getObjEstudiante().getStrApellidos() + "  " + obCurso.getObjEstudiante().getStrDirecion() + "  " + obCurso.getObjDocente().getStrUsuario());
                JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error con el archivo");
        }
    }

    //leer un archivo Docente
    public ArrayList<clsDocente> LeerArchivo() {
        ArrayList<clsDocente> lstDocentes = new ArrayList();
        try {
            File file = new File("Docentes.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String tokens[] = strLinea.split("  ");
                lstDocentes.add(intInc, new clsDocente(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                intInc = intInc + 1;
            }
        } catch (Exception ex) {
            String msm = ex.getMessage();
            System.out.println(msm);
        }
        return lstDocentes;
    }

    //leer un archivo Estudiante
    public ArrayList<clsEstudiantes> LeerArchivoe() {
        ArrayList<clsEstudiantes> lstEstudiantes = new ArrayList();
        try {
            File file = new File("Estudiantes.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String tokens[] = strLinea.split("  ");
                lstEstudiantes.add(intInc, new clsEstudiantes(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                intInc = intInc + 1;
            }
        } catch (Exception ex) {
            String msm = ex.getMessage();
            System.out.println(msm);
        }
        return lstEstudiantes;
    }

    public ArrayList<clsLeerCurso> LeerArchivoc() {
        ArrayList<clsLeerCurso> lstCursos = new ArrayList();
        try {
            File file = new File("RHorarios.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String tokens[] = strLinea.split("  ");
                clsHorarios objHorarios = new clsHorarios(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
                clsDocente objDocente = new clsDocente(tokens[5], tokens[6], null, tokens[7], tokens[8], null);
                clsEstudiantes objEstudiante = new clsEstudiantes(tokens[9], tokens[10], tokens[11], null, tokens[12], null);
                lstCursos.add(intInc, new clsLeerCurso(objHorarios, objDocente, objEstudiante));
                intInc = intInc + 1;
            }
        } catch (Exception ex) {
            String msm = ex.getMessage();
            System.out.println(msm);
        }
        return lstCursos;
    }
}
