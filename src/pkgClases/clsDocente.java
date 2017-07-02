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
public class clsDocente {

    private String strNombre;
    private String strApellidos;
    private String strDirecion;
    private String strLenguaje;
    private String strUsuario;
    private String strPassword;

    public clsDocente() {
    }

    public clsDocente (String strNombre, String strApellidos, String strDirecion, String strLenguaje, String strUsuario, String strPassword) {
        this.strNombre = strNombre;
        this.strApellidos = strApellidos;
        this.strDirecion = strDirecion;
        this.strLenguaje = strLenguaje;
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public String getStrDirecion() {
        return strDirecion;
    }

    public void setStrDirecion(String strDirecion) {
        this.strDirecion = strDirecion;
    }

    public String getStrLenguaje() {
        return strLenguaje;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

}
