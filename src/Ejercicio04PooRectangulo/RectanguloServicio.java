/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04PooRectangulo;

import Ejercicio04PooRectangulo.Rectangulo;
import java.util.Scanner;

/**
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el
 * usuario. También incluirá un método para calcular la superficie del rectángulo y un método para
 * calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo
 * mediante asteriscos usando la base y la altura.
 *
 * @author Julian
 */
public class RectanguloServicio {

  Scanner keyboard = new Scanner(System.in);

  public Rectangulo crearRectangulo() {
    //Instancia
    Rectangulo rectangulo1 = new Rectangulo();

    //Ingresos por teclado
    System.out.println("Digite la base del rectangulo:");
    rectangulo1.setBase(keyboard.nextDouble());

    System.out.println("Digite la altura del rectangulo:");
    rectangulo1.setAltura(keyboard.nextDouble());

    return rectangulo1;
  }

  public void superficie(Rectangulo rectangulo1) {
    // Superficie = base * altura
    double superficie = rectangulo1.getBase() * rectangulo1.getAltura();

    System.out.println("La superficie es: " + superficie);

  }

  public void perimetro(Rectangulo rectangulo1) {
    //perimetro = (base + altura) * 2 

    double perimetro = (rectangulo1.getBase() + rectangulo1.getAltura()) * 2;

    System.out.println("El perimetro es: " + perimetro);

  }
  
  public void dibujo(Rectangulo rectangulo1){
  
    for (int i = 0; i < rectangulo1.getAltura()  ; i++) {
      for (int j = 0; j < rectangulo1.getBase(); j++) {
        
        if (i == 0 || i == rectangulo1.getAltura()-1 || j == 0 || j == rectangulo1.getBase()-1) {
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
