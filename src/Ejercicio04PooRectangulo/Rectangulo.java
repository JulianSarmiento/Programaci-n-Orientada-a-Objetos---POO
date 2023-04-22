/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04PooRectangulo;

/**
 *
 * @author Julian
 */
public class Rectangulo {
  
  //Atributos
  private double base;
  private double altura;
  
  
  //Constructores

  public Rectangulo() {
  }

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  
  //Setters and Getters

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  
  
}
