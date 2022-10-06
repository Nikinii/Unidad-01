/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Niko
 */
public class principal {
    public static void main(String [] arga) {
    var progra = new asignatura();
    progra.codigo=1;
    progra.costohoras=3;
    progra.horas=160;
    progra.nombre="Programacion orientada a objetos ";
    progra.nombredeldocente="Mauricio Ortiz Ochoa";
    progra.vigente=true;
    
    var progra2 = new asignatura();
    progra2.codigo=1;
    progra2.costohoras=3;
    progra2.horas=160;
    progra2.nombre="Programacion orientada a objetos ";
    progra2.nombredeldocente="Mauricio Ortiz Ochoa";
    progra2.vigente=true;
    
    var progra3 = new asignatura();
    progra3.codigo=1;
    progra3.costohoras=3;
    progra3.horas=160;
    progra3.nombre="Programacion orientada a objetos ";
    progra3.nombredeldocente="Mauricio Ortiz Ochoa";
    progra3.vigente=true;
    
    System.out.println(progra.mostrarinformacion);
    }
    
}
