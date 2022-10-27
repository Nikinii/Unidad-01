/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaEnCLases;

/**
 *
 * @author Niko
 */
public class Jugador {
    
    String nombre;
    int fechaNacimiento;
    String posicion;
    Seleccion seleccion;
    
    public String mostrarInfo(){
        return this.nombre+"juega en la seleccion ";
    }
    
}
