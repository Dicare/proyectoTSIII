package ts3.server.daos;

import java.util.ArrayList;
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

    public static UsuarioDAO getInstance()
    {
        if (instance == null)
        {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    @Override
    public boolean agregarNuevoUsuario(Credenciales loginUsuario)
    {
        if (!existeUsuario(loginUsuario.getUserName()))
        {
            lUsuarios.insertarOrdenado(new Usuario(loginUsuario));
            return true;

        } else
        {
            return false;
        }
    }

    @Override
    public ArrayList<String> enviarMensaje(Mensaje Mensaje)
    {
        ArrayList<String> usuariosRechazados = new ArrayList<>();

        for (String usuarioDestino : Mensaje.getlUsuariosDestino())
        {
            boolean enviado = false;
            NodoLEG<Usuario> aux = lUsuarios.getPrimero();
            while (aux != null && enviado != true)
            {
                if (aux.getDato().getLoginUsuario().getUserName()
                        .compareTo(usuarioDestino) == 0)
                {
                    aux.getDato().agregarNuevoMensaje(Mensaje);
                    enviado = true;
                }
                aux = aux.getSiguiente();
            }
            if (!enviado)
            {
                usuariosRechazados.add(usuarioDestino);
            }
        }
        return usuariosRechazados;
    }

    @Override
    public boolean existeUsuario(String usuario)
    {
        return lUsuarios.existeUsuario(usuario);
    }

    public boolean loginUser(Credenciales loginUser)
    {
        boolean loginCorrecto = false;
        NodoLEG<Usuario> aux = lUsuarios.getPrimero();
        while (aux != null && loginCorrecto != true)
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
        Mensaje msjBorrado=null;
        
        if(lUsuarios.getPrimero().getDato().getMensajesRecibidos()!=0){
                msjBorrado =  lUsuarios.getPrimero().getDato().getBuzon().desencolar();               
               JOptionPane.showMessageDialog(null, msjBorrado);
               
        }else{
            JOptionPane.showMessageDialog(null,"No hay mensajes en la Bandeja");
        }
        return msjBorrado;
        
    }
    
    
    

}
