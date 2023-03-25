/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroServicio;

import Objeto.Libro;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class LibroServicio {
  Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
  
  public Libro crearLibro(){
    Libro libro1 = new Libro();
    
    System.out.println("Ingrese el numero de ISBN: ");
        libro1.setIsbn(keyboard.nextInt());
        System.out.println("Ingrese el nombre del titulo: ");
        libro1.setTitulo(keyboard.next());
        System.out.println("Ingrese el nombre del autor: ");
        libro1.setAutor(keyboard.next());
        System.out.println("Ingrese el numero de paginas: ");
        libro1.setNumeroPaginas(keyboard.nextInt());
    
    
    return libro1;
  }
  
  public void mostrarLibro(Libro libro1){
    System.out.println(libro1.toString());}
}
