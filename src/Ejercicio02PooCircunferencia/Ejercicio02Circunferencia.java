/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02PooCircunferencia;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
 *  A continuación, se deben crear los siguientes métodos: 
 *      a) Método constructor que inicialice el radio pasado como parámetro. 
 *      b) Métodos get y set para el atributo radio de la clase Circunferencia.
 *      c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
 *
 * @author Julian
 */
public class Ejercicio02Circunferencia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    CircunferenciaServicio servicioCircunferencia = new CircunferenciaServicio();
    
    Circunferencia circle1 = servicioCircunferencia.crearCircunferencia();
    
    servicioCircunferencia.calcularArea(circle1);
    servicioCircunferencia.calcularPerimetro(circle1);
    
  }
  
}
