/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09PooMatematica;

import Ejercicio09PooMatematica.Matematica;

/**
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor b) Método
 * calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número.
 * Previamente se deben redondear ambos valores.
 *
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de
 * calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaServicio {

  Matematica operacion = new Matematica();

  public double devolverMayor(Matematica numero) {

    numero.setNumero1(Math.random() * 10);
    System.out.println(numero.getNumero1());
    System.out.println("--------------------------");
    numero.setNumero2(Math.random() * 10);
    System.out.println(numero.getNumero2());
    System.out.println("--------------------------");

    if (numero.getNumero1() > numero.getNumero2()) {

      System.out.print("El numero mayor es: ");
      return numero.getNumero1();

    } else if (numero.getNumero1() < numero.getNumero2()) {
      System.out.print("El numero mayor es: ");
      return numero.getNumero2();
    } else {
      System.out.println("Los dos numero son iguales.");
      return 0;
    }

  }

  public void calcularPotencia(Matematica numero) {

    numero.setNumero1(Math.round(numero.getNumero1()));

    System.out.println(numero.getNumero1());

    numero.setNumero2(Math.round(numero.getNumero2()));

    System.out.println(numero.getNumero2());

    if (numero.getNumero1() >= numero.getNumero2()) {
      System.out.println("El resultado de la potencia es: " + Math.pow(numero.getNumero1(), numero.getNumero2()));
    } else {
      System.out.println("El resultado de la potencia es: " + Math.pow(numero.getNumero2(), numero.getNumero1()));
    }

  }

  public void calcularRaiz(Matematica numero) {
    numero.setNumero1(Math.abs(numero.getNumero1()));

    numero.setNumero2(Math.abs(numero.getNumero2()));

    if (numero.getNumero1() >= numero.getNumero2()) {
      System.out.println("La raiz cuadradada es: " + Math.sqrt(numero.getNumero2()));
    } else {
      System.out.println("La raiz cuadradada es: " + Math.sqrt(numero.getNumero1()));
    }
  }
}
