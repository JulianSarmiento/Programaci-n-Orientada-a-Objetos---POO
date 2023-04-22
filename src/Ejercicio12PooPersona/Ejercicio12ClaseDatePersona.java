/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12PooPersona;

/**
 *
 * @author Julian
 */
public class Ejercicio12ClaseDatePersona {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    DatePersonaServicio dps = new DatePersonaServicio();
    
    DatePersona persona = dps.CrearPersona();
    int edad = dps.calcularEdad(persona);
    System.out.println("Es usted menor? " + dps.menorQue(edad));
    dps.mostrarPersona(persona);
  }
  
}
