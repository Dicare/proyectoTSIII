package ts3.tipos;

import ts3.server.interfaces.ICola;

public class ArrayCola <T> implements ICola<T>{
    private final int size;
    private T []arC;
    private int frenteC, finalC;

    public ArrayCola(int size) {
        arC=(T[]) new Object[size];
        this.frenteC=-1;
        this.finalC=-1;
        this.size = size;
    }
    
    //implementaciones de los métodos
    //de la interface
    @Override
    public boolean colaVacia(){
        return (frenteC==-1 && finalC==-1);
    } 
    
    @Override
    public boolean colaLlena(){
        return ((frenteC==0 && finalC==size-1)  || (frenteC==finalC+1));
    }
    
    @Override
    public void encolar(T x){        
        if(colaLlena()==true){
            System.out.println("La cola esta llena ..........");
        }else{
            if(colaVacia()==true){
               frenteC=0;
                finalC=0; 
            }else if(finalC==size-1){
                finalC=0;
            }else{
                finalC++;
            }
            arC[finalC]=x;
        }
    }
    
    @Override
    public T desencolar(){
        T elemento=arC[frenteC];
        
        if(frenteC==finalC){
            frenteC=-1;
            finalC=-1;
        }else if(frenteC==size-1){
            frenteC=0;
        }else{
            frenteC++;
        }   
        
        return elemento;
    }
    
    @Override
    public T frente(){
        return arC[frenteC];
    }    
    
    // método que retorna en forma de cadena el contenido de la 
    // cola sin perder los datos
    public String verColaDeDatos(){
        String cad="";
        
        ArrayCola<T> cAux = new ArrayCola<>(size);
        
        while(colaVacia()==false){
            T x = desencolar();
            cad+=x.toString()+"\n";
            cAux.encolar(x);
        }
        
        while(cAux.colaVacia()==false){
            encolar(cAux.desencolar());
        }       
        return cad;
    }
    
    
    // Ejercicio - Método Barajar
    public ArrayCola<T> barajar(ArrayCola<T> c2){        
        ArrayCola<T> colita = new ArrayCola<>(size);        
        while(colaVacia()==false && c2.colaVacia()==false){
            T x=desencolar();
            T y=c2.desencolar();
            
            colita.encolar(x);
            colita.encolar(y);            
        }
        while(colaVacia()==false){
            colita.encolar(desencolar());
        }
        while(c2.colaVacia()==false){
            colita.encolar(c2.desencolar());
        }       
        return colita;        
    }
    
}
