package ts3.tipos;

import ts3.server.entidades.Usuario;

public class ListaLEG<E extends Usuario> {
    private NodoLEG<E> primero;
    private int talla;                 // numero de nodos de la lista

    public ListaLEG() {
        primero=null;
        talla=0;
    }

    public NodoLEG<E> getPrimero() {
        return primero;
    }

    public int getTalla() {
        return talla;
    }
    
    //reglas de negocio
    // operaciones basicas 
    // inserción al inicio, al final,
    // eliminar al inicio y al final
    public void insertarAlInicio(E x){
        NodoLEG<E> nuevo =new NodoLEG<>(x);
        nuevo.setSiguiente(primero);
        primero=nuevo;
        talla++;        
    }
    public void insertarAlFinal(E x){
        NodoLEG<E> nuevo =new NodoLEG<>(x);
        
        if(primero==null){     //caso lista vacia
            primero=nuevo;
        }else{
            NodoLEG<E> aux=primero;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        talla++;       
    }
    
    //Inserta ordenadamente por nombre de usuario
    public void insertarOrdenado(E x){
        
    }
    
    public void eliminarInicio(){        
        if(primero==null){
            System.out.println("Lista vacia");
        }else{
            primero=primero.getSiguiente();
            talla--;
        }        
    }    
    public void eliminarFinal(){
        if(primero==null){
            System.out.println("Lista Vacia");
        }else{
            NodoLEG<E> aux=primero, ant=null;
            while(aux.getSiguiente()!=null){
                ant=aux;
                aux=aux.getSiguiente();
            }
            if(ant!=null){
                ant.setSiguiente(null);
            }else{
                primero=null;
            }            
            talla--;
        }
    }
    
    public String verLista(){
        String cad="";
        
        NodoLEG<E> aux=primero;
        while(aux!=null){
            cad+=aux.getDato().toString()+"\n";
            aux=aux.getSiguiente();
        }       
        return cad;
    }   
}
