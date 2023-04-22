/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14PooVectoresMovil;

/**
 *
 * @author Julian
 */
public class Movil {
  //Atributos
  
  private String marca;
  private int precio;
  private String modelo;
  private int memoriaRam;
  private int almacenamiento;
  private int codigo [] = new int [7];
  
  //Constructores

  public Movil() {
  }

  public Movil(String marca, int precio, String modelo, int memoriaRam, int almacenamiento) {
    this.marca = marca;
    this.precio = precio;
    this.modelo = modelo;
    this.memoriaRam = memoriaRam;
    this.almacenamiento = almacenamiento;
  }
  
  //Setters and getters

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getMemoriaRam() {
    return memoriaRam;
  }

  public void setMemoriaRam(int memoriaRam) {
    this.memoriaRam = memoriaRam;
  }

  public int getAlmacenamiento() {
    return almacenamiento;
  }

  public void setAlmacenamiento(int almacenamiento) {
    this.almacenamiento = almacenamiento;
  }

  public int[] getCodigo() {
    return codigo;
  }

  public void setCodigo(int[] codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString() {
    return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
  }
  
  
}
