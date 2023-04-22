/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03PooOperacion;

import Ejercicio03PooOperacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class OperacionServicio {

  Scanner keyboard = new Scanner(System.in);

  public Operacion crearOperacion() {
    //intancia
    Operacion operacion1 = new Operacion();
    
    //Ingresos por teclado
    System.out.println("Digite El primer numero: ");
    operacion1.setNumero1(keyboard.nextInt());

    System.out.println("Digite el numero 2: ");
    operacion1.setNumero2(keyboard.nextInt());

    return operacion1;
  }

  //Subprogramas
  public void sumar(Operacion operacion1) {
    int resultadoSuma = operacion1.getNumero1() + operacion1.getNumero2();
    System.out.println("El resultado de la suma es: " + resultadoSuma);
  }

  public void restar(Operacion operacion1) {
    int resultadoResta = operacion1.getNumero1() - operacion1.getNumero2();
    System.out.println("El resultado de la suma es: " + resultadoResta);
  }

  public void multiplicar(Operacion operacion1) {

    if (operacion1.getNumero1() > 0 || operacion1.getNumero2() > 0) {

      int resultadoMultiplicar = operacion1.getNumero1() * operacion1.getNumero2();
      System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicar);

    } else {
      System.out.println("Error: Uno de los numeros ingresados es 0");
    }
  }

  public void dividir(Operacion operacion1) {

    if (operacion1.getNumero1() > 0 || operacion1.getNumero2() > 0) {

      int resultadoDividir = operacion1.getNumero1() / operacion1.getNumero2();
      System.out.println("El resultado de la división es: " + resultadoDividir);

    } else {
      System.out.println("Error: Uno de los numeros ingresados es 0");
    }
  }
}
