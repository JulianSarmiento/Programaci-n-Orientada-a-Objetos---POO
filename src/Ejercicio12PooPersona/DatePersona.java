/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12PooPersona;

import java.util.Date;

/**
 *
 * @author Julian
 */
public class DatePersona {
  
  //Atributos
  private String nombre;
  private Date fechaNacimiento;
  
  //Constructores

  public DatePersona() {
  }

  public DatePersona(String nombre, Date fechaNacimiento) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
  }
  
  //Setter and getter

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  @Override
  public String toString() {
    return "DatePersona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
  }
  
  
}
