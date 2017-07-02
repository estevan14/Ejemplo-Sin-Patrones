package pkgClases;

/**
 *
 * @author Usuario
 */
//clase para leer el archivo curso
public class clsLeerCurso {

    private clsDocente objDocente;
    private clsEstudiantes objEstudiante;
    private clsHorarios objHorarios;

    public clsLeerCurso(clsHorarios objHorarios, clsDocente objDocente, clsEstudiantes objEstudiante) {
        this.objHorarios = objHorarios;
        this.objDocente = objDocente;
        this.objEstudiante = objEstudiante;
    }

    public clsDocente getObjDocente() {
        return objDocente;
    }

    public clsEstudiantes getObjEstudiante() {
        return objEstudiante;
    }

    public clsHorarios getObjHorarios() {
        return objHorarios;
    }

}
