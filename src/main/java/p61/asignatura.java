/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Niko
 */
public class asignatura {
        int codigo;
    String nombre;
    int horas;
    String nombredeldocente;
    int costohoras;
    boolean vigente;
    
    String mostrarinformacion(){
    var informacion = "El nombre de la asignatura es " +nombre;
    return informacion;    
    }
    
    double calcularprecio(){
        var pepe = horas*costohoras;
    return pepe;
    }
}
