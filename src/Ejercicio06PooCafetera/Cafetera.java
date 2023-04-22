/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06PooCafetera;

/**
 *atributos capacidadMaxima
  (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera).
    * 
 * @author Julian
 */
public class Cafetera {
  //atributos
    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructores

  public Cafetera() {
  }

  public Cafetera(int capacidadMaxima, int cantidadActual) {
    this.capacidadMaxima = capacidadMaxima;
    this.cantidadActual = cantidadActual;
  }
    
    //Setters and Getters

  public int getCapacidadMaxima() {
    return capacidadMaxima;
  }

  public void setCapacidadMaxima(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
  }

  public int getCantidadActual() {
    return cantidadActual;
  }

  public void setCantidadActual(int cantidadActual) {
    this.cantidadActual = cantidadActual;
  }
  
  
}
