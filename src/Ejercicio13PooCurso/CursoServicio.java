/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13PooCurso;

import Ejercicio13PooCurso.Curso;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CursoServicio {

  Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

  public String[] cargarAlumnos(Curso curso) {
    //instancio el vector
    String[] alumnos = new String[curso.getAlumnos().length];

    for (int i = 0; i < alumnos.length; i++) {
      System.out.println("Ingrese el alumno " + (i + 1));
      alumnos[i] = keyboard.next();
    }
    return alumnos;

  }

  public Curso crearCurso() {
    Curso curso = new Curso();

    System.out.println("Como se llama el curso?");
    curso.setNombreCurso(keyboard.next());
    System.out.println("Cuantas horas por día es el curso?");
    curso.setCantidadHorasPorDia(keyboard.nextInt());
    System.out.println("Cuantos dias por semana tiene el curso?");
    curso.setCantidadDiasPorSemana(keyboard.nextInt());
    System.out.println("El curso en que jornada es?");
    curso.setTurno(keyboard.next());
    System.out.println("Cual es el precio por hora?");
    curso.setPrecioPorHora(keyboard.nextDouble());
    System.out.println("Ingrese el nombre de sus alumnos");
    curso.setAlumnos(cargarAlumnos(curso));

    return curso;

  }

  public void calcularGananciaSemanal(Curso curso) {
    double gananciaSemana = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    System.out.println("La ganancia semanal será de: " + gananciaSemana);
  }
}
