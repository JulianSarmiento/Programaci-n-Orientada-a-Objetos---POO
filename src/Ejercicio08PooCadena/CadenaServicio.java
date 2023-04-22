/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08PooCadena;

import Ejercicio08PooCadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CadenaServicio {

  Scanner keyboard = new Scanner(System.in);

  public void mostrarVocales(Cadena frase) {

    int vocales = 0;

    for (int i = 0; i < frase.getLongitud(); i++) {
      char letras = frase.getFrase().charAt(i);
      if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
        vocales++;
      }
    }
    System.out.println("La cantidad de vocales es: " + vocales);
    System.out.println("--------------------------------------------------");
  }

  public void invertirFrase(Cadena frase) {
    System.out.println("Frase invertida: ");
    for (int i = frase.getLongitud(); i > 0; i--) {
      System.out.print(frase.getFrase().substring(i - 1, i));
    }
    System.out.println("");

    System.out.println("--------------------------------------------------");
  }

  public void vecesRepetido(Cadena frase) {

    char letra;
    int cantidadLetra = 0;

    System.out.println("Ingrese la letra a buscar:");
    letra = keyboard.next().charAt(0);
    int posicion = frase.getFrase().indexOf(letra);

    while (posicion != -1) {
      cantidadLetra++;
      posicion = frase.getFrase().indexOf(letra, posicion + 1);
    }
    System.out.println("Se encontró " + cantidadLetra + " de veces el caracter " + letra);

    System.out.println("--------------------------------------------------");
  }

  public void compararLongitud(Cadena frase) {
    System.out.println("Ingrese una nueva frase:");
    String frase2 = keyboard.next();

    if (frase2.length() > frase.getLongitud()) {
      System.out.println("La nueva frase " + frase2 + " es más larga.");
    } else if (frase2.length() < frase.getLongitud()) {
      System.out.println("La frase " + frase.getFrase() + " es más larga.");
    } else {
      System.out.println("La longitud de las frases son iguales.");
    }
    System.out.println("--------------------------------------------------");
  }
  
  public void unirFrases(Cadena frase){
    System.out.println("Ingrese una nueva frase: ");
    String frase2 = keyboard.next();
    System.out.println(frase.getFrase().concat(frase2));
    System.out.println("--------------------------------------------------");
    
  }
  
  public void reemplazar(Cadena frase){
    System.out.println("Digite el carácter a cambiar:");
    char letra = keyboard.next().charAt(0);
    String frase2 = frase.getFrase();
    int posicion = frase.getFrase().indexOf("a");
    while(posicion != -1){
    frase2 = frase2.replace(frase2.charAt(posicion), letra);
    posicion = frase.getFrase().indexOf("a", posicion +1);
        }
    System.out.println("La frase sería: " + frase2);
      }
  
  public void contiene(Cadena frase){
    System.out.println("Ingrese la letra que quiere buscar:");
    char letra = keyboard.next().charAt(0);
    
    if (frase.getFrase().contains(Character.toString(letra))) {
      System.out.println("La frase si contiene la letra ");
    }else{
      System.out.println("La letra no se encuentra en la frase.");
    }
    
  }
  
}
