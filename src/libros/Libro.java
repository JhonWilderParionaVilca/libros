/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.Objects;

/**
 *
 * @author bh
 */
public class Libro {

    
    private String codigo;
    private String autor;
    private String titulo;
    private String categoria;
    private int cantidad;
    private int precioCompra;
    private int precioVenta;

    public Libro() {
    }

    public Libro(String codigo, String autor, String titulo, String categoria, int cantidad, int precioCompra) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioCompra
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the precioVenta
     */
    public int getPrecioVenta() {
        return (int) (precioCompra + (precioCompra * 0.35));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return '{' + codigo + '}';
    }

    
    public String imprimir() {
        return "Libro{" + "codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", categoria=" + categoria + ", cantidad=" + cantidad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
    
}
