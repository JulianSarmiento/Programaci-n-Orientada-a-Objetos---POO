/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15PooAuto;

import java.util.Date;

/**
 *
 * @author Julian
 */
public class Auto {
   private String nombre;
    private Date fechaV;
    private String color;
    private String modelo;
    private int kilometraje = 7500;

    public Auto() {
    }

    public Auto(String nombre, Date fechaV, String color, String modelo, int kilometraje) {
        this.nombre = nombre;
        this.fechaV = fechaV;
        this.color = color;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaV() {
        return fechaV;
    }

    public void setFechaV(Date fechaV) {
        this.fechaV = fechaV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
}
