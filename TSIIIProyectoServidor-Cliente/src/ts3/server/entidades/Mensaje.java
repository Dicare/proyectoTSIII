package ts3.server.entidades;

import java.util.ArrayList;
import java.util.Date;


public class Mensaje {

    private Date fecha;
    private String mensaje;
    private Usuario usuarioOrigen;
    private ArrayList<Usuario> lUsuariosDestino;

    public Mensaje(Date fecha, String mensaje, Usuario usuarioOrigen, ArrayList<Usuario> usuariosDestino) {
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.usuarioOrigen = usuarioOrigen;
        this.lUsuariosDestino = usuariosDestino;
    }
    
    public Mensaje() {
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public Usuario getUsuarioOrigen() {
        return usuarioOrigen;
    }

    public void setUsuarioOrigen(Usuario usuarioOrigen) {
        this.usuarioOrigen = usuarioOrigen;
    }

    public ArrayList<Usuario> getlUsuariosDestino() {
        return lUsuariosDestino;
    }

    public void setlUsuariosDestino(ArrayList<Usuario> lUsuariosDestino) {
        this.lUsuariosDestino = lUsuariosDestino;
    }
    
        
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    // </editor-fold>
    
    @Override
    public String toString(){
        return "";
    }
    
}
