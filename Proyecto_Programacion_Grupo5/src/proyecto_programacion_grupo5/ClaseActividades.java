/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion_grupo5;

/**
 *
 * @author elimm
 */
//Esta clase representa las 2 clases de yoga y baile
public class ClaseActividades {

    public String nombre;       // Baile o Yoga
    public String profesor;
    public int[] cupos;         // 30 cupos, 0 = vacío, otro número = ID empleado

    public ClaseActividades(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupos = new int[30];
    }
    //reserva cupos
    public boolean reservar(int id) {
        for (int i = 0; i < 30; i++) {
            if (cupos[i] == 0) {
                cupos[i] = id;
                return true;
            }
        }
        return false;
    }
    //libera cupos
    public boolean liberar(int id) {
        for (int i = 0; i < 30; i++) {
            if (cupos[i] == id) {
                cupos[i] = 0;
                return true;
            }
        }
        return false;
    }

    public int getCupo(int index) {
        return cupos[index];
    }
}