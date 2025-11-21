/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion_grupo5;

/**
 *
 * @author elimm
 */
public class BaseDatos {

    // =========================
    // EMPLEADOS PRE-CARGADOS
    // =========================
    public static Empleados[] empleados = new Empleados[50];
    public static int totalEmpleados = 0;

    // =========================
    // SALAS DE CINE
    // =========================
    public static Cine[] salasCine = new Cine[5]; // puedes tener hasta 5 salas pero se puede aumentar para más pelis
    public static int totalSalas = 0;

    // =========================
    // CARGAR TODA LA INFO INICIAL
    // =========================
    public static void cargarDatos() {

        cargarEmpleados();
        cargarSalasCine();

        // En el futuro:
        // cargarGym();
        // cargarClases();
        // cargarCafeteria();
    }

    // -------------------------
    // CARGA DE EMPLEADOS
    // -------------------------
    public static void cargarEmpleados() {

        empleados[0] = new Empleados(101, "Dilshot");
        empleados[1] = new Empleados(102, "Wilman");
        empleados[2] = new Empleados(103, "Elí");
        empleados[3] = new Empleados(104, "Ian");
        empleados[4] = new Empleados(105, "Carlos");
        empleados[5] = new Empleados(106, "Sandra");

        totalEmpleados = 6;
    }

    // -------------------------
    // CARGA DE SALAS DE CINE
    // -------------------------
    public static void cargarSalasCine() {

        // Ejemplo: 2 salas
        // Sala 1 → 30 espacios (5x6)
        salasCine[0] = new Cine("Avengers", 5, 6);
        salasCine[1] = new Cine("Interestelar", 5, 6);

        // Sala 2 → 25 espacios (5x5)
        salasCine[2] = new Cine("Avatar", 5, 5);
        salasCine[3] = new Cine("El Conjuro", 5, 5);

        totalSalas = 4;
    }

    
}
