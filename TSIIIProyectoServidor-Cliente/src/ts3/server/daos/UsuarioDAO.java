package ts3.server.daos;

import javax.swing.JOptionPane;
import ts3.server.entidades.Credenciales;
import ts3.server.entidades.Mensaje;
import ts3.server.entidades.Usuario;
import ts3.server.interfaces.IUsuarioDAO;
import ts3.tipos.ListaLEG;
import ts3.tipos.NodoLEG;

public class UsuarioDAO implements IUsuarioDAO
{
    private static UsuarioDAO instance;
    
    ListaLEG<Usuario> lUsuarios;

    private UsuarioDAO()
    {
        lUsuarios = new ListaLEG<>();
    }

     public static UsuarioDAO getInstance(){
        if(instance == null){
            instance = new UsuarioDAO();
        }
        return instance;
    }
    
    @Override
    public void agregarNuevoUsuario(Credenciales loginUsuario)
    {

        Usuario nuevoUsuario = new Usuario(loginUsuario);
        if (!existeUsuario(nuevoUsuario))
        {
            lUsuarios.insertarOrdenado(nuevoUsuario);
        } else
        {
            JOptionPane.showMessageDialog(null, "Nombre de Usuario ya existe");
        }

    }

    @Override
    public void enviarMensaje(Mensaje Mensaje)
    {
        for (Usuario usuarioDestino : Mensaje.getlUsuariosDestino())
        {
            NodoLEG<Usuario> aux = lUsuarios.getPrimero();
            while (aux != null)
            {
                if (aux.getDato().getLoginUsuario().getUserName()
                        .equalsIgnoreCase(usuarioDestino.getLoginUsuario().getUserName()))
                {
                    aux.getDato().agregarNuevoMensaje(Mensaje);                    
                }
                aux = aux.getSiguiente();
            }
        }

    }

    @Override
    public boolean existeUsuario(Usuario usuario)
    {
        boolean existe = false;

        if (!lUsuarios.estaVacia())
        {

            if (lUsuarios.datoExistente(usuario) == !existe)
            {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                existe = true;
            }
        }
        return existe;
    }

    public boolean loginUser(Credenciales loginUser)
    {
        boolean loginCorrecto = false;
        NodoLEG<Usuario> aux = lUsuarios.getPrimero();
        while (aux != null && loginCorrecto != true )
        {
            if (aux.getDato().getLoginUsuario().getUserName()
                    .compareTo(loginUser.getUserName()) == 0)
            {
                if (aux.getDato().getLoginUsuario().getPassword()
                        .compareTo(loginUser.getPassword()) == 0)
                {
                    loginCorrecto = true;
                }
            }
            aux = aux.getSiguiente();
        }
        
        return loginCorrecto;
    }

    @Override
    public Mensaje leerPrimerMensajeBuzon(Credenciales credencialesUsuario)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
