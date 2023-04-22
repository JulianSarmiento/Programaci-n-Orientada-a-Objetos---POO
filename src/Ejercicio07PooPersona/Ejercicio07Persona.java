/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07PooPersona;

/**
 *
 * @author Julian
 */
public class Ejercicio07Persona {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    PersonaServicio ps = new PersonaServicio();
    
    Persona persona = ps.crearPersona();
    
    System.out.println(persona.toString());
    
  }
  
}
