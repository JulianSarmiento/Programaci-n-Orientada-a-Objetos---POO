/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01poo;

import LibroServicio.LibroServicio;
import Objeto.Libro;

/**
 *
 * @author Julian
 */
public class Ejercicio01Poo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    LibroServicio service = new LibroServicio();
    
    Libro libro1 = service.crearLibro();
    
    service.mostrarLibro(libro1);
  }
  
}
