package ts3.tipos;

import ts3.server.entidades.Usuario;

public class ListaLEG<E extends Usuario>
{

    private NodoLEG<E> primero;
    private int talla;                 // numero de nodos de la lista

    public ListaLEG()
    {
        primero = null;
        talla = 0;
    }

    public NodoLEG<E> getPrimero()
    {
        return primero;
    }

    public int getTalla()
    {
        return talla;
    }

    public boolean estaVacia()
    {
        return primero == null;
    }

    public boolean existeUsuario(String userName)
    {
        boolean existe = false;
        NodoLEG<E> aux = primero;
        
        while (aux != null)
        {
            if (aux.getDato().getLoginUsuario().getUserName()
                    .compareTo(userName) == 0)
            {
                existe = true;
            }
            aux = aux.getSiguiente();
        }
        return existe;
    }

    //reglas de negocio
    // operaciones basicas 
    // inserción ordenada,
    // eliminar al inicio y al final
    private void insertarAlInicio(E x)
    {
        NodoLEG<E> nuevo = new NodoLEG<>(x);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        talla++;
    }

    private void insertarAlFinal(E x)
    {
        NodoLEG<E> nuevo = new NodoLEG<>(x);

        if (primero == null)
        {     //caso lista vacia
            primero = nuevo;
        } else
        {
            NodoLEG<E> aux = primero;
            while (aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        talla++;
    }

    //Inserta ordenadamente por nombre de usuario
    public void insertarOrdenado(E x)
    {
        NodoLEG<E> nuevo = new NodoLEG<>(x);

        if (primero == null) //caso lista vacia
        {
            primero = nuevo;
        } else
        {
            NodoLEG<E> aux = primero;
            boolean insertado = false;

            if (x.getLoginUsuario().getUserName()
                    .compareTo(primero.getDato().getLoginUsuario().getUserName()) < 0)
            {
                nuevo.setSiguiente(aux);
                primero = nuevo;
                insertado = true;
            }

            while (insertado != true)
            {
                if (aux.getSiguiente() != null)
                {
                    int compareToThis = x.getLoginUsuario().getUserName()
                                            .compareTo(aux.getDato().toString());
                    
                    int comparetoNext = x.getLoginUsuario().getUserName()
                                            .compareTo(aux.getSiguiente().getDato().getLoginUsuario().getUserName());
                    
                    if (compareToThis > 0 && comparetoNext < 0)
                    {
                        nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                        insertado = true;
                    } else
                    {
                        aux = aux.getSiguiente();
                    }
                } else
                {
                    aux.setSiguiente(nuevo);
                    insertado = true;
                }
            }           
        }
        talla++;
    }

    public void eliminarInicio()
    {
        if (primero == null)
        {
            System.out.println("Lista vacia");
        } else
        {
            primero = primero.getSiguiente();
            talla--;
        }
    }

    public void eliminarFinal()
    {
        if (primero == null)
        {
            System.out.println("Lista Vacia");
        } else
        {
            NodoLEG<E> aux = primero, ant = null;
            while (aux.getSiguiente() != null)
            {
                ant = aux;
                aux = aux.getSiguiente();
            }
            if (ant != null)
            {
                ant.setSiguiente(null);
            } else
            {
                primero = null;
            }
            talla--;
        }
    }

    public String verLista()
    {
        String cad = "";

        NodoLEG<E> aux = primero;
        while (aux != null)
        {
            cad += aux.getDato().toString() + "\n";
            aux = aux.getSiguiente();
        }
        return cad;
    }
}
