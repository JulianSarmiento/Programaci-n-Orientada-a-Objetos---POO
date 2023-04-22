/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05PooCuenta;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio05Cuenta {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // 1) Instancio
    Scanner keyboard = new Scanner(System.in);
    CuentaServicio servCuenta = new CuentaServicio();

    Cuenta usuario = servCuenta.crearCuenta();
    int opcion;
    do {
      System.out.println("Bienvenido al banco: ");
      System.out.println("-------------------------");
      System.out.println("Menu:");
      System.out.println("1- Ingresar saldo:");
      System.out.println("2- Retiro de saldo:  ");
      System.out.println("3- Extraccion rapida: ");
      System.out.println("4- Consultar saldo: ");
      System.out.println("5- Consultar datos: ");
      System.out.println("6- Salir");

      opcion = keyboard.nextInt();

      switch (opcion) {
        case 1:
          servCuenta.ingresar(usuario);
          break;
        case 2:
          servCuenta.retirar(usuario);
          break;

        case 3:
          servCuenta.extraccionRapida(usuario);
          break;

        case 4:
          servCuenta.consultarSaldo(usuario);
          break;
        case 5:
          servCuenta.consultarDatos(usuario);
          break;
        case 6:
          System.out.println("Saliendo del aplicativo...");
          break;
        default:

          System.out.println("Opción incorrecta");
      }
    } while (opcion != 6);

  }

}
