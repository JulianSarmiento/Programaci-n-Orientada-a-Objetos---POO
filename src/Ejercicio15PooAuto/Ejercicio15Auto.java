/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio15PooAuto;

/**
 *
 * @author Julian
 */
public class Ejercicio15Auto {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     AutoServicio nC = new AutoServicio();
        
        Auto carro1 = nC.crearAuto();
        
        nC.modificar(carro1);
        nC.recorrido(carro1);
   }
   
}
