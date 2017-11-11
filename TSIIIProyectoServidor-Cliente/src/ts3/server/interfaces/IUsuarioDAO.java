
package ts3.server.interfaces;

import ts3.server.entidades.Credenciales;
import ts3.server.entidades.Mensaje;
import ts3.server.entidades.Usuario;


public interface IUsuarioDAO {
    void agregarNuevoUsuario(Credenciales nuevoUsuario);
    void enviarMensaje(Mensaje Mensaje);
    boolean existeUsuario(Usuario usuario);
    Mensaje leerPrimerMensajeBuzon(Credenciales credencialesUsuario);
}
