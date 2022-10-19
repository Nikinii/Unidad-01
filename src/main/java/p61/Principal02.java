/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Principal02 {

    public static void main(String[] args) {

        var a = 0;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        while (a<100) {
            System.out.println("a = " + a);
            a++;
        }
        //leer datos del teclado
        
        var lectura = new Scanner(System.in);
        System.out.println("Ingresar números menores a 10");
        var numero=lectura.nextInt();
        while (numero>10) {
        System.out.println(" porfavor ingrese un numero valido ");
        lectura = new Scanner(System.in);
        numero=lectura.nextInt();
        }
        
    }

}