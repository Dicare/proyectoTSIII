package ts3.server.interfaces;

public interface ICola<T> {
    void encolar(T x);
    T desencolar();
    T frente();            // método consultor
    boolean colaVacia();
    boolean colaLlena();
}
