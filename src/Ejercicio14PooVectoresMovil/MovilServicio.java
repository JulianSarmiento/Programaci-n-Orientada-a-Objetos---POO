/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14PooVectoresMovil;

import Ejercicio14PooVectoresMovil.Movil;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class MovilServicio {
  Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
  
  public Movil cargarCelular(){
    Movil celular = new Movil();
    
    System.out.println("Ingrese la marca del celular: ");
    celular.setMarca(keyboard.next());
    System.out.println("Digite el precio del celular:");
    celular.setPrecio(keyboard.nextInt());
    System.out.println("Ingrese el modelo del celular:");
    celular.setModelo(keyboard.next());
    System.out.println("Digite la capacidad de memoria RAM:");
    celular.setMemoriaRam(keyboard.nextInt());
    System.out.println("Digite la capacidad de almacenamiento:");
    celular.setAlmacenamiento(keyboard.nextInt());
    //System.out.println("Digite el código de 7 digitos:");
   //celular.setCodigo(ingresarCodigo(celular));
    this.ingresarCodigo(celular);
    System.out.println(celular.toString());
    
    return celular;
  }
 
  
  public int [] ingresarCodigo(Movil celular){
    //Instanciar vector
    int[] codigo = new int[7];
 //int [] codigo = new int[celular.getCodigo().length];
  
  String codigos = keyboard.next();
  

  
    for (int i = 0; i < codigo.length; i++) {
      System.out.println("Digite el código para el celular " + i + " : ");
       codigo[i] = keyboard.nextInt();
     // codigo[i] = Integer.parseInt(codigos.substring(i, i + 1));
     celular.setCodigo(codigo);
    }
    
   
    return celular.getCodigo();
  }
}
