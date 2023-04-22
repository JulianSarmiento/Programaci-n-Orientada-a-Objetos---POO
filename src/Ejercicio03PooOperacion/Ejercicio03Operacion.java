/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03PooOperacion;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio03Operacion {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    
    OperacionServicio servicioOperacion = new OperacionServicio();

    Operacion operaciones = servicioOperacion.crearOperacion();

    int opcion = 0;

    do {
      System.out.println("---------------------");
      System.out.println("MENU");
      System.out.println("1 - SUMA");
      System.out.println("2 - RESTA");
      System.out.println("3 - MULTIPLICACION");
      System.out.println("4 - DIVISION");
      System.out.println("5 - SALIR");
      System.out.println("---------------------");

      opcion = keyboard.nextInt();

      switch (opcion) {
        case 1:
          servicioOperacion.sumar(operaciones);
          break;
        case 2:
          servicioOperacion.restar(operaciones);
          break;
        case 3:
          servicioOperacion.multiplicar(operaciones);
          break;
        case 4:
          servicioOperacion.dividir(operaciones);
          break;
        case 5:
          System.out.println("Saliendo . . . .");
          break;
        default:
          System.out.println("Error al elegir una opcion. Intente nuevamente.");
          break;
      }
    } while (opcion != 5);

  }

}
