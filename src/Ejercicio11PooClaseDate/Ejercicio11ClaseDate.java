/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11PooClaseDate;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio11ClaseDate {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int dia, mes, anio;

    System.out.println("Digite un día cualquiera:");
    dia = keyboard.nextInt();
    System.out.println("Digite un mes cualquiera:");
    mes = keyboard.nextInt();
    System.out.println("Digite un año cualquiera:");
    anio = keyboard.nextInt();

    Date fecha = new Date(anio - 1900, mes - 1, dia);
    Date fechaActual = new Date();

    System.out.println("La fecha ingresada es: " + fecha.toString());

    System.out.println("La diferencia de años es: " + (fechaActual.getYear() - fecha.getYear()));

    System.out.println("La fecha actual es: " + fechaActual.toString());

  }

}
