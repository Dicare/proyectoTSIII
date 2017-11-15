package ts3.server.daos;

import javax.swing.JOptionPane;
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
        boolean existe=false;
        
        if(!lUsuarios.estaVacia()){
            
            if(lUsuarios.datoExistente(usuario)==!existe){
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                existe=true;
            }   
        }
        return existe;
    }
    
    public void loginUser(Usuario loginuser){
       
        if(lUsuarios.datoExistente(loginuser)==true){
           loginuser.getLoginUsuario();
           
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no existe");
        }
        
    
    }

    @Override
    public Mensaje leerPrimerMensajeBuzon(Credenciales credencialesUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
