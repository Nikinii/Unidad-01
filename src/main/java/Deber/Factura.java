/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber;

/**
 *
 * @author Niko
 */
public class Factura {
    
    String numFac;
    Cliente whoCliente;
    Producto productoComprado;
    
    public String getinfoFactura(){
        var retorno = "El numero de la factura es:"+this.numFac+"el nombre del cliente es:";
       return retorno; 
    }
}
