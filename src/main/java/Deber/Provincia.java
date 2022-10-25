/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber;

/**
 *
 * @author Niko
 */
public class Provincia {
    
    String nomProvincia;
    String lema;
    String capital;
    int subdiviciones;
    
    public String getinfoProvincia(){
        var retorno = "La provincia se llama:"+this.nomProvincia+"su lema es:"+this.lema
                +"su capital es:"+this.capital+"y sus subdiviciones son:"+this.subdiviciones;
       return retorno; 
    }
}
