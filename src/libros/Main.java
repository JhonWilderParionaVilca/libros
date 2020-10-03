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
                venderLibro(libros);
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
           System.out.println(libroB.imprimir());
           System.out.println("Ingrese la cantidad de libros a agregar: ");
           cantidad = scanner.nextInt();
           int totalCatidad = libroB.getCantidad() + cantidad;
           libroB.setCantidad(totalCatidad);
           System.out.println(libroB.imprimir());
           System.out.println("cantidad modificada");
       }
        System.out.println(libros);
    }
    
    public static void venderLibro(ListaDoble<Libro> libros){
        Scanner scanner = new Scanner(System.in);
        //genera lista simple para cada cliente
        System.out.println("Ingrese Nombre del Cliente: ");
        String nombreCliente = scanner.next();
        
        Cliente cliente = new Cliente(nombreCliente);
        
        //busca el libro mediante codigo
        System.out.println("Ingrese el codigo del libro a buscar: ");
        String codigo = scanner.next();
        
        Libro libroBuscar = new Libro();
        libroBuscar.setCodigo(codigo);
        
        Libro libroEncontrado = libros.getElementoBuscado(libroBuscar);
        
        if (libroEncontrado != null) {
            // si existe se pide la cantidad y se compara con el stock
            System.out.println("Ingrese cantidad comprar: ");
            int cantidadComprar = scanner.nextInt();
//            if (cantidadComprar <= libroEncontrado.getCantidad()) {
//                // si hay stock se vende(agrega a la lista simple)
//                ListaSimple<Libro> librosComprados = cliente.getLibros();
//                librosComprados.insertarPrimero(libroBuscar)
//            }
            
        }
        
        
        
        //pregunta si desea mas libros
        
        //termina la venta imprimir libros con el nombre del cliente monto a pagar
        
        // imprime lista de lisbros y su stock
        
        // imprimir monto ganado de venta
        
    }
    
}
