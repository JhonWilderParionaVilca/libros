/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.Scanner;

/**
 *
 * @author bh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble<Libro> libros = new ListaDoble<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija una opcion");
        System.out.println("1. Registrar Libro \n 2. Vneder un Libro");
        int option = scanner.nextInt();
        boolean continuar = true;
        
        while (continuar) {  
            System.out.println("Elija una opcion");
            System.out.println("1. Registrar Libro \n 2. Vneder un Libro");
            option = scanner.nextInt();
            switch (option) {
            case 1:
                registroLibro(libros);
                break;
            case 2:
                venderLibro();
                break;
            default:
                throw new AssertionError();
            }
            System.out.println("desea continuar: Y/N");
            String respuesta = scanner.next();
            if (respuesta.equals("N")) {
                continuar = false;
            }
        }
       
        
       
    }
    
    public static void registroLibro(ListaDoble<Libro> libros){
         
       //libro a insertar
       Libro libroI = new Libro();
       String codigo;
       String autor;
       String titulo;
       String categoria;
       int cantidad;
       int precioCompra;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese código del libro: ");
       codigo = scanner.next();
       libroI.setCodigo(codigo);
       //funcion buscar el libro
       Libro libroB = libros.getElementoBuscado(libroI);
      
       if (libroB == null) {
            //insertar todo
            System.out.println("Ingrese autor del libro: ");
            autor = scanner.next();
            System.out.println("Ingrese titulo del libro: ");
            titulo = scanner.next();
            System.out.println("Ingrese categoria del libro: ");
            categoria = scanner.next();
            System.out.println("Ingrese cantidad del libro: ");
            cantidad = scanner.nextInt();
            System.out.println("Ingrese precio de compra del libro: ");
            precioCompra = scanner.nextInt();
            
            libroI.setAutor(autor);
            libroI.setTitulo(titulo);
            libroI.setCategoria(categoria);
            libroI.setCantidad(cantidad);
            libroI.setPrecioCompra(precioCompra);
            
            libros.insertarPrimero(libroI);
       }else{
           System.out.println("El libro se encuentra registrado");
           System.out.println("Ingrese cantidad del libro: ");
           cantidad = scanner.nextInt();
           libroB.setCantidad(cantidad);
           System.out.println(libroB.imprimir());
           System.out.println("cantidad modificado");
       }
        System.out.println(libros);
    }
    
    public static void venderLibro(){
        
    }
    
}
