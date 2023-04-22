/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06PooCafetera;

/**
 *
 * @author Julian
 */
public class Ejercicio06CafeteraNespresso {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    CafetereraServicio cs = new CafetereraServicio();

    Cafetera cafetera = cs.crearCafetera();

    cs.llenarCafetera(cafetera);
    cs.servirTaza(cafetera);
    cs.vaciarCafetera(cafetera);
    cs.agregarCafe(cafetera);
  }
}
