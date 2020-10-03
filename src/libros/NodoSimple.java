
package libros;

public class NodoSimple<Tipo> {
    private Tipo dato; /* Genérica*/
    private NodoSimple siguiente; /*Autoreferenciada*/

    public NodoSimple(Tipo dato) {
        this.dato = dato;
        siguiente = null;/*Apunta*/
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
