/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15PooAuto;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class AutoServicio {
   Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

    public Auto crearAuto() {
        Auto ficha = new Auto();
        System.out.println("Nombre del conductor");
        ficha.setNombre(keyboard.next());
        System.out.println("Ingrese fecha de vencimiento de la licencia DD/MM/AAAA: ");
        int dia = keyboard.nextInt();
        int mes = keyboard.nextInt();
        int anio = keyboard.nextInt();
        Date fecha = new Date(dia, mes - 1, anio - 1900);
        ficha.setFechaV(fecha);
        System.out.println("Ingrese el modelo del auto");
        ficha.setModelo(keyboard.next());
        System.out.println("Ingrese el color del auto");
        ficha.setColor(keyboard.next());

        return ficha;
    }

    public void modificar(Auto mod) {
        String ope = null;
        System.out.println("¿Desea cambiar de propietario? S/N");
        ope = keyboard.next();
        
        if ("s".equalsIgnoreCase(ope)) {

            System.out.println("Nombre del nuevo dueño");
            mod.setNombre(keyboard.next());
            System.out.println("Ingrese fecha de vencimiento de la licencia de " + mod.getNombre() + " DD/MM/AAAA");
            int dia = keyboard.nextInt();
            int mes = keyboard.nextInt();
            int anio = keyboard.nextInt();
            //Calendar fecha = Calendar.getInstance(Locale.ITALY);
            Date fecha = new Date(dia, mes - 1, anio - 1900);
            mod.setFechaV(fecha);

        }
    }

    public void recorrido(Auto km) {
        System.out.println("Ingrese la cantidad de kilometros recorridos");
        int nK = keyboard.nextInt();
        km.setKilometraje(km.getKilometraje() + nK);
        System.out.println("El auto tiene un total de kilometros de: " + km.getKilometraje());
        int limiteMant = 10000;
        if (km.getKilometraje() >= limiteMant) {
            System.out.println("El auto necesita hacerle servicio!");
        } else {
            System.out.println("Le queda " + (limiteMant - km.getKilometraje()) + " para hacer servicio!");
        }

    }
}
