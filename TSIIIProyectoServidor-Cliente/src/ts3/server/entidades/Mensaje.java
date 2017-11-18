package ts3.server.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ts3.util.Constantes;


public class Mensaje {

    private Date fecha;
    private String mensaje;
    private String usuarioOrigen;
    private ArrayList<String> lUsuariosDestino;

    public Mensaje(Date fecha, String mensaje, String usuarioOrigen, ArrayList<String> usuariosDestino) {
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.usuarioOrigen = usuarioOrigen;
        this.lUsuariosDestino = usuariosDestino;
    }
    
    public Mensaje() {
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public String getUsuarioOrigen() {
        return usuarioOrigen;
    }

    public void setUsuarioOrigen(String usuarioOrigen) {
        this.usuarioOrigen = usuarioOrigen;
    }

    public ArrayList<String> getlUsuariosDestino() {
        return lUsuariosDestino;
    }

    public void setlUsuariosDestino(ArrayList<String> lUsuariosDestino) {
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
<<<<<<< HEAD
        
        DateFormat dateFormat = new SimpleDateFormat(Constantes.FORMATO_FECHA);        
        return "Fecha de Mensaje : " + dateFormat.format(fecha) +"\n"
                 + "De : " +usuarioOrigen+ "\n"
                 + "A :" + String.join("; ", lUsuariosDestino )+ "\n"
                 + "Mensaje : " + mensaje;
=======
        return "Fecha de Mensaje : " + fecha +"\n"
                + "De : " +usuarioOrigen+ "\n"
                + "A :" + lUsuariosDestino+ "\n"
                + "Mensaje : " + mensaje;
>>>>>>> 71c8a16e0300bcf8b571bf1a1a6bda86d353196d
    }
    
}
