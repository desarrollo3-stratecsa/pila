package core;

import java.util.LinkedList;

/**
 *
 * @author 
 * @param <T>
 */
public class Pila<T extends Base> {

    private LinkedList<T> tope;

    public Pila() {
        tope = new LinkedList<>();
    }

    public void apilar(T e) {
        tope.addFirst(e);
    }

    public T desapilar() {
        return tope.removeFirst();
    }

    public boolean estaVacio() {
        return tope.isEmpty();
    }

    @Override
    public String toString() {
        String cad = "[";

        for (T e : tope) {
            cad += " " + e.toString();
        }

        return cad + "]";
    }

}
