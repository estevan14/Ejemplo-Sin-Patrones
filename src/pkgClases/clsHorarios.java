/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClases;

/**
 *
 * @author Usuario
 */
public class clsHorarios {

    private String StrFechaInicio;
    private String StrFechaFin;
    private String strDias;
    private String strHoraInicio;
    private String strHoraFin;

    public clsHorarios() {
    }

    public clsHorarios(String StrFechaInicio, String StrFechaFin, String strDias, String strHoraInicio, String strHoraFin) {
        this.StrFechaInicio = StrFechaInicio;
        this.StrFechaFin = StrFechaFin;
        this.strDias = strDias;
        this.strHoraInicio = strHoraInicio;
        this.strHoraFin = strHoraFin;
    }

    public String getStrFechaInicio() {
        return StrFechaInicio;
    }

    public void setStrFechaInicio(String StrFechaInicio) {
        this.StrFechaInicio = StrFechaInicio;
    }

    public String getStrFechaFin() {
        return StrFechaFin;
    }

    public void setStrFechaFin(String StrFechaFin) {
        this.StrFechaFin = StrFechaFin;
    }

    public String getStrDias() {
        return strDias;
    }

    public void setStrDias(String strDias) {
        this.strDias = strDias;
    }

    public String getStrHoraInicio() {
        return strHoraInicio;
    }

    public void setStrHoraInicio(String strHoraInicio) {
        this.strHoraInicio = strHoraInicio;
    }

    public String getStrHoraFin() {
        return strHoraFin;
    }

    public void setStrHoraFin(String strHoraFin) {
        this.strHoraFin = strHoraFin;
    }

}
