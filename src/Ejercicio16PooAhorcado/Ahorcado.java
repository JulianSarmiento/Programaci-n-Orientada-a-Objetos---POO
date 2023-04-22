/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16PooAhorcado;

/**
 *
 * @author Julian
 */
public class Ahorcado {
   
    private String palabraABuscar;
    private int cantidadVidas;
    private int letrasEncontradas;
    private String [] vector1, vector2;

    public Ahorcado() {
    }

    public Ahorcado(String palabraABuscar, int cantidadVidas, int letrasEncontradas, String[] vector1, String[] vector2) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadVidas = cantidadVidas;
        this.letrasEncontradas = letrasEncontradas;
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public String[] getVector2() {
        return vector2;
    }

    public void setVector2(String[] vector2) {
        this.vector2 = vector2;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }    

    public String[] getVector1() {
        return vector1;
    }

    public void setVector1(String[] vector1) {
        this.vector1 = vector1;
    }  

    public String getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadVidas() {
        return cantidadVidas;
    }

    public void setCantidadVidas(int cantidadVidas) {
        this.cantidadVidas = cantidadVidas;
    }    

    @Override
    public String toString() {
        return "Ahorcado[" + "Palabra A Buscar = " + palabraABuscar + "]--[Cantidad De Vidas = " + cantidadVidas + "]";
    }
    
}

