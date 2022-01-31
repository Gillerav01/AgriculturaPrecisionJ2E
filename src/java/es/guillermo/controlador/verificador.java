package es.guillermo.controlador;
public class verificador {
    static boolean validacion(String login, String pwd){
        return (!"".equals(login)) && (!"".equals(pwd));
    }
}
