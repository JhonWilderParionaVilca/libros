/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author bh
 */
public class Cliente {

    
    
    private String nombre;
    private int montoTotal;
    private ListaSimple<Libro> libros;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.libros = new ListaSimple<>();
        this.montoTotal = 0;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the montoTotal
     */
    public int getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
    /**
     * @return the libros
     */
    public ListaSimple<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ListaSimple<Libro> libros) {
        this.libros = libros;
    }

    
}
