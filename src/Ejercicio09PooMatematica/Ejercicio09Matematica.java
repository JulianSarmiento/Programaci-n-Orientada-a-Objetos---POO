/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09PooMatematica;

/**
 *
 * @author Julian
 */
public class Ejercicio09Matematica {

  public static void main(String[] args) {
    MatematicaServicio ms = new MatematicaServicio();

    Matematica operacion = new Matematica();

    System.out.println(ms.devolverMayor(operacion));
    
    ms.calcularPotencia(operacion);
    
    ms.calcularRaiz(operacion);
  }

}
