package com.clase;

public class Main {

    public static void main(String[] args) {

        Curso[][] sucursalesCursos = new Curso[3][6];

        sucursalesCursos[0][0] = new Curso("Matematicas", 18);
        sucursalesCursos[0][1] = new Curso("Fisica", 25);
        sucursalesCursos[0][2] = new Curso("Quimica", 20);

        sucursalesCursos[1][0] = new Curso("Matematicas", 32);
        sucursalesCursos[1][1] = new Curso("Fisica", 15);
        sucursalesCursos[1][2] = new Curso("Quimica", 28);
        sucursalesCursos[1][3] = new Curso("Biologia", 32);
        sucursalesCursos[1][4] = new Curso("Historia", 32);
        sucursalesCursos[1][5] = new Curso("Geografia", 32);

        sucursalesCursos[2][2] = new Curso("Literatura", 18);
        sucursalesCursos[2][3] = new Curso("Artes", 25);
        sucursalesCursos[2][4] = new Curso("Botanica", 20);
        sucursalesCursos[2][5] = new Curso("Programacion", 34);

        char letraSucursal = 'A';

        for (int i = 0; i < sucursalesCursos.length; i++) {
            System.out.println("Sucursal " + letraSucursal + ":");

            for (int j = 0; j < sucursalesCursos[i].length; j++) {
                if (sucursalesCursos[i][j] != null) {
                    System.out.println(sucursalesCursos[i][j]);
                }
            }
            letraSucursal++;
            System.out.println();
        }
    }
}