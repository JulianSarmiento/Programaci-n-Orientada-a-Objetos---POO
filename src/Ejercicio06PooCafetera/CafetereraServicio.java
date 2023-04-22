/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06PooCafetera;

import Ejercicio06PooCafetera.Cafetera;
import java.util.Scanner;

/**
 *
 *  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.  Método
 * * servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
 * simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se
 * llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.  Método vaciarCafetera():
 * pone la cantidad de café actual en cero.  Método agregarCafe(int): se le pide al usuario una
 * cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author Julian
 */
public class CafetereraServicio {

  Scanner keyboard = new Scanner(System.in);

  public Cafetera crearCafetera() {

    //Instancia 
    Cafetera cafetera = new Cafetera();

    //Ingresos por teclado
    System.out.println("---------------------------------------------");
    System.out.println("- Bienvenido, ésta es su cafetera nespresso -");
    System.out.println("---------------------------------------------");
    System.out.println("Digite la capacidad máxima de la cafetera: ");
    cafetera.setCapacidadMaxima(keyboard.nextInt());
    System.out.println("---------------------------------------------");
    /*System.out.println("Digite la capacidad actual de la cafetera:");
    cafetera.setCantidadActual(keyboard.nextInt());
    System.out.println("---------------------------------------------------------");*/

    return cafetera;
  }

  public Cafetera llenarCafetera(Cafetera cafetera) {
    System.out.println("Llenando...");
    System.out.println("...");
    System.out.println("...");
    cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    System.out.println("La capacidad actual es: " + cafetera.getCantidadActual());

    return cafetera;
  }

  public void servirTaza(Cafetera cafetera) {
    System.out.println("Ingrese el tamaño de la taza a servir");
    int taza = keyboard.nextInt();
    System.out.println("Sirviendo...");
    if (cafetera.getCantidadActual() < taza) {
      System.out.println("No se llenó la taza, total servido, " + cafetera.getCantidadActual());
    } else {
      int remanente = cafetera.getCantidadActual() - taza;
      System.out.println("Se llenó la taza. Quedó un remanente en cafetera de: " + remanente);

      cafetera.setCantidadActual(remanente);
    }
  }

  public void vaciarCafetera(Cafetera cafetera) {

    if (cafetera.getCantidadActual() == 0) {
      System.out.println("La cafetera está vacia.");
    } else {
      System.out.println("Vaciando...");
      System.out.println("...");
      System.out.println("...");
      cafetera.setCantidadActual(0);
      System.out.println("La cafetera se ha desocupado.");

    }
  }

  public void agregarCafe(Cafetera cafetera) {
    System.out.println("Qúe cantidad de café desea ingresar?");
    cafetera.setCantidadActual(keyboard.nextInt());

    if (cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
      System.out.println("No tengo capacidad para todo ese café");
    } else {
      System.out.println("Añadiendo...");
      System.out.println("...");
      System.out.println("Café agregado.");
    }

  }
}
