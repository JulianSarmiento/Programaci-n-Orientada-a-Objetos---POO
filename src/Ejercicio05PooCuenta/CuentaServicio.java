/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05PooCuenta;

import Ejercicio05PooCuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CuentaServicio {

  Scanner keyboard = new Scanner(System.in);

  public Cuenta crearCuenta() {
    //instancia
    Cuenta cuenta1 = new Cuenta();

    //ingreso por teclado
    System.out.println("Digite el numero de cuenta: ");
    cuenta1.setNumeroCuenta(keyboard.nextInt());

    System.out.println("Digite el numero de DNI: ");
    cuenta1.setDniCliente(keyboard.nextLong());

    System.out.println("Digite el valor de apertura: ");
    cuenta1.setSaldoActual(keyboard.nextInt());

    return cuenta1;
  }

  public void ingresar(Cuenta cuenta1) {
    System.out.println("Digite el valor a ingresar:");
    double ingreso = keyboard.nextDouble();

    cuenta1.setSaldoActual((cuenta1.getSaldoActual() + (int) ingreso));

  }

  public void retirar(Cuenta cuenta1) {
    System.out.println("Digite la cantidad a retirar: ");
    double retiro = keyboard.nextDouble();
    if (cuenta1.getSaldoActual() < retiro) {
      System.out.println("El retiro solicitado excede el limite del saldo actual.");
      System.out.println("El saldo retirado es: " + cuenta1.getSaldoActual());
      cuenta1.setSaldoActual(0);
    } else {
      System.out.println("Retiro realizado");
      System.out.println("El saldo retirado es: " + cuenta1.getSaldoActual());
      cuenta1.setSaldoActual((cuenta1.getSaldoActual() - (int) retiro));
    }

  }

  public void extraccionRapida(Cuenta cuenta1) {
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    System.out.println("Digite el saldo a retirar:");
    double extraer = keyboard.nextDouble();

    if (cuenta1.getSaldoActual() * 0.2 < extraer) {
      System.out.println("No se puede retirar");
    } else {
      cuenta1.setSaldoActual(cuenta1.getSaldoActual() - (int) extraer);
    }
  }

  public void consultarSaldo(Cuenta cuenta1) {
    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    System.out.println("Su saldo es: " + cuenta1.getSaldoActual());
  }

  public void consultarDatos(Cuenta cuenta1) {
    System.out.println(cuenta1.toString());
  }
}
