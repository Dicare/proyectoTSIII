package ts3.server.entidades;


import ts3.tipos.ArrayCola;
import ts3.util.Constantes;


public class Usuario{
    
    private int id;
    private Credenciales loginUsuario;
    private int mensajesRecibidos;
    private ArrayCola<Mensaje> buzon;
    private ArrayCola<Mensaje> msjBorrado;
    
    
    public Usuario(Credenciales loginCredenciales) {
        this.loginUsuario = loginCredenciales;
        mensajesRecibidos = 0;
        buzon = new ArrayCola<>(Constantes.TAMAÑOCOLA);
        msjBorrado= new ArrayCola<>(Constantes.TAMAÑOCOLA);
    }

    public ArrayCola<Mensaje> getMsjBorrado() {
        return msjBorrado;
    }

    public void setMsjBorrado(ArrayCola<Mensaje> msjBorrado) {
        this.msjBorrado = msjBorrado;
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
    
    public void agregaraBorrados(Mensaje mensaje){
        msjBorrado.encolar(mensaje);
        
    }
    
    public Mensaje leerPrimerMensaje(){
        
        Mensaje mensajeDesencolado = null;
        
        if(!buzon.colaVacia())
        {
            mensajeDesencolado =  buzon.desencolar();
            msjBorrado.encolar(mensajeDesencolado);
            mensajesRecibidos--;       
        }
        return mensajeDesencolado;
    }

    
}
