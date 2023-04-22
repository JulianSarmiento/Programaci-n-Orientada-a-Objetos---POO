/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12PooPersona;

import Ejercicio12PooPersona.DatePersona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class DatePersonaServicio {

  Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

  public DatePersona CrearPersona() {

    DatePersona persona = new DatePersona();
    int dia, mes, anio;

    System.out.println("Digite su nombre:");
    persona.setNombre(keyboard.next());
    System.out.println("DIgite su dia de nacimiento: ");
    dia = keyboard.nextInt();
    System.out.println("Digite su mes de nacimiento:");
    mes = keyboard.nextInt();
    System.out.println("Digite su año de nacimiento:");
    anio = keyboard.nextInt();

    Date fecha = new Date(anio - 1900, mes - 1, dia);
    persona.setFechaNacimiento(fecha);

    return persona;

  }

  public int calcularEdad(DatePersona persona) {
    Date fechaActual = new Date();
    int edad = 0;

    if (persona.getFechaNacimiento().getMonth() == fechaActual.getMonth()) {
      if (persona.getFechaNacimiento().getDay() == fechaActual.getDay()) {
        edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
      }
    } else {
      edad = (fechaActual.getYear() - persona.getFechaNacimiento().getYear() - 1);
    }
    System.out.println("Usted tiene: " + edad + " años de edad. ");

    return edad;

  }

  public boolean menorQue(int edad) {
    boolean menor = false;
    int edadReceptor = 0;

    System.out.println("Ingrese su edad nuevo usuario: ");
    edadReceptor = keyboard.nextInt();

    if (edadReceptor < edad) {
      menor = true;
    }
    return menor;

  }
  
  public void mostrarPersona(DatePersona persona){
    System.out.println(persona.toString());
  }
}
