package ts3.server.daos;

import ts3.server.entidades.Credenciales;
import ts3.server.entidades.Mensaje;
import ts3.server.entidades.Usuario;
import ts3.server.interfaces.IUsuarioDAO;
import ts3.tipos.ListaLEG;


public class UsuarioDAO implements IUsuarioDAO{

    ListaLEG<Usuario> lUsuarios;

    public UsuarioDAO() {
        lUsuarios = new ListaLEG<>();
    }

    @Override
    public void agregarNuevoUsuario(Credenciales nuevoUsuario) {
        
    }

    @Override
    public void enviarMensaje(Mensaje Mensaje) {
        
    }

    @Override
    public boolean existeUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public Mensaje leerPrimerMensajeBuzon(Credenciales credencialesUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
