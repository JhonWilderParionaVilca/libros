package libros;

public class ListaDoble<Tipo> {
    private NodoDoble primero;
    private int tamanio = 0;

    public ListaDoble() {
        this.primero = null;
    }

    /*------------------------------------- insertar por el primero------------------------------------------------- */
    public ListaDoble insertarPrimero(Tipo dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if (primero != null){ /* Si la lista no esta vacia */
            nuevo.setSiguiente(primero); /*modificador*/
            primero.setAnterior(nuevo);
        }
        primero = nuevo;
        tamanio++;
        return this;
    }

  
 
    @Override
    public String toString(){
        String salida = "primero y null <=>";
        if (primero == null){
            return "La lista esta vacia";
        }
        NodoDoble actual =primero;
        while (actual.getSiguiente() != null){
            salida = salida + "[" + actual.getDato()+ "]<=>";
            actual = actual.getSiguiente();
        }
        //al ultimo nodo apunta  a null
        salida = salida + "[" + actual.getDato()+ "]-> null";
        return salida;
    }


    public Tipo getElementoBuscado(Tipo datoB){
        if (primero != null) {
            NodoDoble aux = primero;
            while (!aux.getDato().equals(datoB) && aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            if (!aux.getDato().equals(datoB) ){
                return null;
            }
            return (Tipo) aux.getDato();
        }else{
            return null;
        }
        
    }


    public int getTamanio() {
        return tamanio;
    }
}
