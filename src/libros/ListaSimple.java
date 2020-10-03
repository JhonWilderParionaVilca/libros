package libros;

public class ListaSimple<Tipo> {
    NodoSimple primero;
    private int tamanio = 0;

    public ListaSimple() {
        this.primero = null; /*Lista vacia*/
    }

    /* -------------------------------------Esta vacio---------------------------------------------------------------*/
    public boolean esVacio(){
        return primero==null;
    }

    /*------------------------------------- insertar por el primero------------------------------------------------- */
    public ListaSimple insertarPrimero(Tipo dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (!esVacio()){ /* Si la lista no esta vacia */
            nuevo.setSiguiente(primero); /*modificador*/
        }
        primero = nuevo;
        tamanio++;
        return this;
    }
    /*-------------------------------------toString------------------------------------------------------------------ */
    @Override
    public String toString(){
        String salida = "primero->";
        if (primero == null){
            return "La lista esta vacia";
        }
        NodoSimple actual =primero;
        while (actual.getSiguiente() != null){
            salida = salida + "[" + actual.getDato()+ "]->";
            actual = actual.getSiguiente();
        }
        //al ultimo nodo apunta  a null
        salida = salida + "[" + actual.getDato()+ "]-> null";
        return salida;
    }
    
    public int getTamanio() {
        return tamanio;
    }
    
}
