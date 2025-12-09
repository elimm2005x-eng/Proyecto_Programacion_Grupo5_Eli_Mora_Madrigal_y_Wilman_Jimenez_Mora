/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion_grupo5;

/**
 *
 * @author elimm
 */
public class Cafeteria {
    private String nombre;
    private String hora;
    private String bebida;
    
    
    CafeteriaFrame pantalla = new CafeteriaFrame();

    public Cafeteria(String nombre, String hora, String bebida ) {
        this.nombre = nombre;
        this.hora = hora;
        this.bebida = bebida;
        
    }

    public Cafeteria() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public CafeteriaFrame getPantalla() {
        return pantalla;
    }

    public void setPantalla(CafeteriaFrame pantalla) {
        this.pantalla = pantalla;
    }
    
    
}
