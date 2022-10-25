/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber;

/**
 *
 * @author Niko
 */
public class Pais {
    
    String nombrePais;
    int numeroContinente;
    int poblacion;
    
    public String getinfoPais(){
        var retorno ="el nombre del pais es:"+this.nombrePais+"y esta en el continente numero:"
                +this.numeroContinente+", tiene una poblacion de:"+this.poblacion;
       return retorno; 
       
    }
}
