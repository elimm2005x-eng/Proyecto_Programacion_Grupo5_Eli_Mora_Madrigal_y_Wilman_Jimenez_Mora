/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion_grupo5;

/**
 *
 * @author elimm
 */
public class Gimnasio {
    
        public String entrenador;     
        public int[] citas;           // 6 horas: 2pm a 7pm 

        public Gimnasio(String entrenador) {
        this.entrenador = entrenador;
        this.citas = new int[6];  // todos los que estan en 0 son libres
    }

    // Reservar una hora
    public boolean reservarGym(int horaIndex, int idEmpleado) {
        if (citas[horaIndex] == 0) {
            citas[horaIndex] = idEmpleado;
            return true;
        }
        return false; // esta ocupado
    }

    // Liberar una hora
    public boolean liberarGym(int horaIndex, int idEmpleado) {
        if (citas[horaIndex] == idEmpleado) {
            citas[horaIndex] = 0;
            return true;
        }
        return false;
    }

    // Obtener ID reservado en una hora
    public int idHora(int horaIndex) {
        return citas[horaIndex];
    }
    
}
