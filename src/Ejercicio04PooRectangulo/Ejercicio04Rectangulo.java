/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04PooRectangulo;

/**
 *
 * @author Julian
 */
public class Ejercicio04Rectangulo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    RectanguloServicio servRectangulo = new RectanguloServicio();
    
    Rectangulo r1 = servRectangulo.crearRectangulo();
    
    //servRectangulo.perimetro(r1);
    //servRectangulo.superficie(r1);
    
    servRectangulo.dibujo(r1);
    
  }
  
}
