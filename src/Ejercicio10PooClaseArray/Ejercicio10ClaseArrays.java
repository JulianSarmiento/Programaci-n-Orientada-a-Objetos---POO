/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10PooClaseArray;

import java.util.Arrays;

/**
 *
 * @author Julian
 */
public class Ejercicio10ClaseArrays {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    double[] arregloA = new double[50];
    double[] arregloB = new double[20];

    for (int i = 0; i < arregloA.length; i++) {
      arregloA[i] = Math.random() * 10;
    }

    Arrays.toString(arregloA);
    Arrays.sort(arregloA);

    for (int i = 0; i < 10; i++) {
      arregloB[i] = arregloA[i];
    }
    Arrays.fill(arregloB, 10, 20, 0.5);
    
    for (int i = 0; i < arregloA.length; i++) {
      System.out.println(i + arregloA[i]);
    }
    
    for (int i = 0; i < arregloB.length; i++) {
      System.out.println(i + arregloB[i]);
    }
  }

}
