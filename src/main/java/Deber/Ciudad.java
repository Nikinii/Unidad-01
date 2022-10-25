/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber;

/**
 *
 * @author Niko
 */
public class Ciudad {
    
    String nombreCiudad;
    String alcalde;
    double Altitud;
    Provincia nomProvincia;
    Pais nomPais;
    
    public String getinfoCiudad(){
        var retorno = "El nombre de la ciudad es:"+this.nombreCiudad+"su alcalde es:"+this.alcalde
                +"tiene una altitud de:"+this.Altitud+"y esta en la provincia:"+this.nomProvincia
                +"se encuentra en el pais:"+this.nomPais;
       return retorno; 
    }
    
}
