package ts3.server.entidades;


import ts3.tipos.ArrayCola;
import ts3.util.Constantes;


public class Usuario{
    
    private int id;
    private Credenciales loginUsuario;
    private int mensajesRecibidos;
    private ArrayCola<Mensaje> buzon;
    
    public Usuario(Credenciales loginCredenciales) {
        this.loginUsuario = loginCredenciales;
        mensajesRecibidos = 0;
        buzon = new ArrayCola<>(Constantes.TAMAÑOCOLA);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Credenciales getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(Credenciales loginUsuario) {
        this.loginUsuario = loginUsuario;
    }        

    public int getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public ArrayCola<Mensaje> getBuzon() {
        return buzon;
    }
    // </editor-fold> 
    
    public void agregarNuevoMensaje(Mensaje mensaje){
        buzon.encolar(mensaje);
        mensajesRecibidos++;
    }
    
    public Mensaje leerPrimerMensaje(){
        return buzon.desencolar();
    }

    
}
