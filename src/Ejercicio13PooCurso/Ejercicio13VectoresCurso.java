/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13PooCurso;

/**
 *
 * @author Julian
 */
public class Ejercicio13VectoresCurso {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    CursoServicio cs = new CursoServicio();
 
        Curso curso = cs.crearCurso();
        cs.calcularGananciaSemanal(curso);
         
  }
  
}
