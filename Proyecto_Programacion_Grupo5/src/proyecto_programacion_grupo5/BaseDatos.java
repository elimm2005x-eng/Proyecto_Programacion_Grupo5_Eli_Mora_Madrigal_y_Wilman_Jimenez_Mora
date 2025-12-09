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

    // EMPLEADOS PRE-CARGADOS
    public static Empleados[] empleados = new Empleados[50];
    public static int totalEmpleados = 0;

    // SALAS DE CINE
    public static Cine[] salasCine = new Cine[5]; // puedes tener hasta 5 salas pero se puede aumentar para más pelis
    public static int totalSalas = 0;
    
    // CLASES (BAILE Y YOGA)
    // Posición 0 = 7pm
    // Posición 1 = 8pm
    public static ClaseActividades[] salabaile = new ClaseActividades[2];
    public static ClaseActividades[] salayoga = new ClaseActividades[2];
    //GIMNASIO
    public static Gimnasio gimnasio;


    // CARGAR TODA LA INFO INICIAL
    public static void cargarDatos() {

        cargarEmpleados();
        cargarSalasCine();
        cargarClases();
        cargarGimnasio();

        // cargarCafeteria();
    }

    // CARGA DE EMPLEADOS
    public static void cargarEmpleados() {

        empleados[0] = new Empleados(101, "Dilshot");
        empleados[1] = new Empleados(102, "Wilman");
        empleados[2] = new Empleados(103, "Elí");
        empleados[3] = new Empleados(104, "Ian");
        empleados[4] = new Empleados(105, "Carlos");
        empleados[5] = new Empleados(106, "Sandra");

        totalEmpleados = 6;
    }

    // CARGA DE SALAS DE CINE
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
    
    
    // CARGA DE SALAS DE LAS CLASES DE YOGA Y BAILE
    public static void cargarClases() {
    // Baile 7pm y 8pm
    salabaile[0] = new ClaseActividades("Baile", "María");
    salabaile[1] = new ClaseActividades("Baile", "María");

    // Yoga 7pm y 8pm
    salayoga[0] = new ClaseActividades("Yoga", "Carlos");
    salayoga[1] = new ClaseActividades("Yoga", "Carlos");
    // 0 = 7pm
    // 1 = 8pm
}
    
    public static void cargarGimnasio() {
    gimnasio = new Gimnasio("Entrenador Luis"); 
}
    //Este metodo va a buscar el nombre del empleado por medio de la ID para el gimnasio
    public static String buscarNombre(int id) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].id == id) {
                return empleados[i].nombre;
            }
        }
        return "Desconocido";
    }



    
}
