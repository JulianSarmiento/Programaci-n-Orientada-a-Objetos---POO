/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08PooCadena;

/**
 *
 * @author Julian
 */
public class Cadena {
 
  //Atributos
  private String frase;
  private int longitud;
  //Constructores

  public Cadena() {
  }

  public Cadena(String frase, int longitud) {
    this.frase = frase;
    this.longitud = longitud;
  }

  // Set and get
  public String getFrase() {
    return frase;
  }

  public void setFrase(String frase) {
    this.frase = frase;
  }

  public int getLongitud() {
    return longitud;
  }

  public void setLongitud(int longitud) {
    this.longitud = longitud;
  }

}
