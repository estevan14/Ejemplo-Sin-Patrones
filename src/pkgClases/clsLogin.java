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
public class clsLogin {

    private static clsLogin login;
    private String strusuario;
    private String strpassword;

    public clsLogin() {

    }

    public clsLogin(String strusuario, String strpassword) {
        this.strusuario = strusuario;
        this.strpassword = strpassword;
    }

    public static clsLogin getLogin() {
        return login;
    }

    public static void setLogin(clsLogin login) {
        clsLogin.login = login;
    }

    public String getStrusuario() {
        return strusuario;
    }

    public void setStrusuario(String strusuario) {
        this.strusuario = strusuario;
    }

    public String getStrpassword() {
        return strpassword;
    }

    public void setStrpassword(String strpassword) {
        this.strpassword = strpassword;
    }

}
