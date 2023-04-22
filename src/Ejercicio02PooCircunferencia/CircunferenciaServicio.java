/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02PooCircunferencia;

import Ejercicio02PooCircunferencia.Circunferencia;
import java.util.Scanner;

/**
 * 
 */
public class CircunferenciaServicio {

  Scanner keyboard = new Scanner(System.in);

  public Circunferencia crearCircunferencia() {
    Circunferencia circle = new Circunferencia();

    System.out.println("Digite el radio de la circunferencia");
    circle.setRadio(keyboard.nextDouble());

    return circle;
  }
  
  public void calcularPerimetro(Circunferencia circle){
      double perimetro = (2 * 3.1416) * circle.getRadio();
      System.out.println("El perimetro es: " + perimetro);
  }
  
  public void calcularArea(Circunferencia circle){
    double area = 3.1416 * Math.pow(circle.getRadio(), 2);
    System.out.println("El área es: "+ area);
  }
  
 
}
