/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion_grupo5;

/**
 *
 * @author elimm
 */
public class Cine {
    String pelicula;
    int filas;
    int columnas;


    int[][] asientos;

  
    public Cine(String pelicula, int filas, int columnas) {
        this.pelicula = pelicula;
        this.filas = filas;
        this.columnas = columnas;

        // Crear matriz con tamaño indicado
        asientos = new int[filas][columnas];

        // Inicializar en 0 (asiento libre)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = 0;
            }
        }
    }

    // Cambiar nombre de la película
    public void setPelicula(String nueva) {
        this.pelicula = nueva;
    }

    // Cambiar tamaño de sala, esto hace que se reinicie la sala y no guarde los campos
    public void setTamaño(int nuevasFilas, int nuevasColumnas) {

        this.filas = nuevasFilas;
        this.columnas = nuevasColumnas;

        asientos = new int[nuevasFilas][nuevasColumnas];

        // Inicializamos en 0
        for (int i = 0; i < nuevasFilas; i++) {
            for (int j = 0; j < nuevasColumnas; j++) {
                asientos[i][j] = 0;
            }
        }
    }

    // Reservar asiento
    // Devuelve true si la reserva fue exitosa
    public boolean reservar(int fila, int columna, int idEmpleado) {

        if (asientos[fila][columna] == 0) { // está libre
            asientos[fila][columna] = idEmpleado;
            return true;
        }

        return false; // ya está ocupado
    }

    // Liberar asiento
    public boolean liberar(int fila, int columna) {

        if (asientos[fila][columna] != 0) { // está ocupado
            asientos[fila][columna] = 0;
            return true;
        }

        return false;
    }

    // Obtener ID del empleado que ocupa un asiento
    public int getID(int fila, int columna) {
        return asientos[fila][columna];
    }

    // Obtener matriz completa como texto para mostrar en JTextArea
    public String mostrarAsientos() {
        String texto = "";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Si está libre mostramos "[  ]"
                if (asientos[i][j] == 0) {
                    texto = texto + "[  ] ";
                } else {
                    texto = texto + "[" + asientos[i][j] + "] ";
                }
            }
            texto = texto + "\n";
        }

        return texto;
    }
    
}
