/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05PooCuenta;

/**
 *
 * @author Julian
 */
public class Cuenta {

  //Atributos
  private int numeroCuenta;
  private long dniCliente;
  private int saldoActual;

  //Constructores
  public Cuenta() {
  }

  public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {
    this.numeroCuenta = numeroCuenta;
    this.dniCliente = dniCliente;
    this.saldoActual = saldoActual;
  }

  //Setters and getters
  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public long getDniCliente() {
    return dniCliente;
  }

  public void setDniCliente(long dniCliente) {
    this.dniCliente = dniCliente;
  }

  public int getSaldoActual() {
    return saldoActual;
  }

  public void setSaldoActual(int saldoActual) {
    this.saldoActual = saldoActual;
  }

  @Override
  public String toString() {
    return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
  }

}
