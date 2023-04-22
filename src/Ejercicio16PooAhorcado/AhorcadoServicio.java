/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16PooAhorcado;

import Ejercicio16PooAhorcado.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AhorcadoServicio {

   Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void juego(Ahorcado juego) {
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      System.out.println("Bienvenid@ al AHORCADO");
      crearJuego(juego);
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      System.out.println("QUE COMIENCE EL JUEGO......");
      longitud(juego);
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
      for (int i = 0; i < juego.getVector1().length; i++) {
         System.out.print(" _");
      }
      System.out.println("");
      buscar(juego);
   }

   public void crearJuego(Ahorcado juego) {
      String[] vectorAlmacen = {"objeto", "arrays", "identificadores", "atributo", "modificador"};
      juego.setVector2(vectorAlmacen);
      juego.setVector1(vectorAlmacen[(int) (Math.random() * 5)].toLowerCase().split(""));
      juego.setCantidadVidas(juego.getVector1().length);
      juego.setLetrasEncontradas(0);
   }

   public void longitud(Ahorcado juego) {
      System.out.println("Usted deberá adivinar una palabra que contiene " + (juego.getVector1().length) + " letras.");
   }

   public void buscar(Ahorcado juego) {

      String[] vectorOriginal = juego.getVector1();
      String[] vectorAhorcado = new String[juego.getVector1().length];

      for (int i = 0; i < juego.getVector1().length; i++) {
         vectorAhorcado[i] = "_";
      }
      int errores = 0;
      do {
         System.out.println("Ingrese una letra: ");
         String letra = leer.next();
         boolean bandera = false;

         for (int i = 0; i < juego.getVector1().length; i++) {
            if (letra.equalsIgnoreCase(vectorOriginal[i])) {
               vectorAhorcado[i] = letra;
               bandera = true;
               juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
            }
         }
         juego.setCantidadVidas(juego.getCantidadVidas() - 1);

         if (bandera) {
            System.out.println("La letra se ha encontrado! :)");
         } else {
            System.out.println("La letra no se ha encontrado! :(");
            errores++;
         }

         System.out.println("---------------------------------");
         for (int i = 0; i < juego.getVector1().length; i++) {
            System.out.print(" " + vectorAhorcado[i]);
         }
         System.out.println("");
         System.out.println("---------------------------------");
         encontradas(juego);
         intentos(juego);
         System.out.println("Usted ha cometido " + errores + " errores.");

      } while (juego.getCantidadVidas() != 0 && juego.getLetrasEncontradas() != juego.getVector1().length);
      if (Arrays.equals(vectorOriginal, vectorAhorcado)) {
         System.out.println("FELICIDADES HA GANADO!");
      } else {
         System.out.println("Has fallado --:(+< ");
      }
   }

   public void encontradas(Ahorcado juego) {
      System.out.println("Usted ha encontrado " + juego.getLetrasEncontradas() + " cantidad de letras.");
   }

   public void intentos(Ahorcado juego) {
      System.out.println("A usted le quedan " + juego.getCantidadVidas() + " intentos.");
   }
}
