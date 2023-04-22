/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07PooPersona;

import Ejercicio07PooPersona.Persona;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class PersonaServicio {
  Scanner keyboard = new Scanner(System.in);
  
  public Persona crearPersona(){
  
//instancia  
  Persona persona = new Persona();
    
    System.out.println("Hola, bienvenido. Por favor digita los siguientes datos: ");
    System.out.println("---------------------------------------------------");
    System.out.println("Nombre:");
    persona.setNombre(keyboard.next());
    System.out.println("---------------------------------------------------");
    System.out.println("Edad:");
    persona.setEdad(keyboard.nextInt());
    System.out.println("---------------------------------------------------");
    System.out.println("Sexo: H= hombre , M= mujer u O= otro");
    persona.setSexo(keyboard.next().toUpperCase().charAt(0));
    while(persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O'){
      System.out.println("Caracter equivocado, ingrese un caracter correcto");
      persona.setSexo(keyboard.next().toUpperCase().charAt(0));
     }
    System.out.println("---------------------------------------------------");
    System.out.println("Peso:");
    persona.setPeso(keyboard.nextDouble());
    System.out.println("---------------------------------------------------");
    System.out.println("Altura:");
    persona.setAltura(keyboard.nextDouble());
    System.out.println("---------------------------------------------------");
  return persona;
      
  }
  
  public void calcularIMC(Persona persona){
  
  
  }
}
