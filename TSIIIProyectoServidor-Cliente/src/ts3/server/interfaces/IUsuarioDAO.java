
package ts3.server.interfaces;

import java.util.ArrayList;
import ts3.server.entidades.Credenciales;
import ts3.server.entidades.Mensaje;


public interface IUsuarioDAO {
    boolean agregarNuevoUsuario(Credenciales nuevoUsuario);
    ArrayList<String> enviarMensaje(Mensaje Mensaje);
    boolean existeUsuario(String usuario);
    Mensaje leerPrimerMensajeBuzon(Credenciales credencialesUsuario);
}
