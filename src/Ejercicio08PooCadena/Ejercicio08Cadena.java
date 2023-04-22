/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08PooCadena;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio08Cadena {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    Cadena frase = new Cadena();
    CadenaServicio cs = new CadenaServicio();
    
    System.out.println("Ingrese una frase: ");
    frase.setFrase(keyboard.next().toLowerCase());
    frase.setLongitud(frase.getFrase().length());
    
    cs.mostrarVocales(frase);
    cs.invertirFrase(frase);
    cs.vecesRepetido(frase);
    cs.compararLongitud(frase);
    cs.unirFrases(frase);
    cs.reemplazar(frase);
    cs.contiene(frase);
  }
  
}
