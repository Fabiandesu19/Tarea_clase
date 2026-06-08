package com.clase;
import java.util.Random;

public final class Curso {

    private String nombre;
    private int cantidadMaximaAlumnos;
    private int cantidadInscritos;
    Random random = new Random();
    int maximoAlumnos = random.nextInt(16) + 20;

    public Curso(String nombre,int cantidadInscritos) {
        this.nombre = nombre;
        this.cantidadMaximaAlumnos = maximoAlumnos;

        if (cantidadInscritos <= cantidadMaximaAlumnos) {
            this.cantidadInscritos = cantidadInscritos;
        } else {
            System.out.println("La cantidad de inscritos excede la capacidad máxima del curso " + nombre + ". Se asignará la capacidad máxima.");
            this.cantidadInscritos = cantidadMaximaAlumnos;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaximaAlumnos() {
        return cantidadMaximaAlumnos;
    }

    public int getCantidadInscritos() {
        return cantidadInscritos;
    }

    @Override
    public String toString() {
        return "Curso [Nombre=" + nombre +
               ", Inscritos=" + cantidadInscritos +
               ", Capacidad Maxima=" + cantidadMaximaAlumnos + "]";
    }
}