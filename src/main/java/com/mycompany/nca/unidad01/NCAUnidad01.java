/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.nca.unidad01;

/**
 *
 * @author Niko
 */
public class NCAUnidad01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        perro1.nombre = "firulais";
        perro1.raza = "mestizo";
        perro1.edad = 15;
        perro2.nombre = "pepe";
        perro2.raza = "nosexd ";
        perro2.edad = 5;
        perro3.nombre = "michi";
        perro3.raza = "blanco";
        perro3.edad = 10;

        var persona1 = new Persona();
        var persona2 = new Persona();
        var persona3 = new Persona();

        persona1.cedula = 921437840;
        persona1.edad = 20;
        persona1.nombre = "Pepe";

        System.out.println("mi perro se llama:" + perro1.nombre + "tiene"
                + perro1.edad + "años y es un" + perro1.raza);

        System.out.println("mi perro se llama:" + perro2.nombre + "tiene"
                + perro2.edad + "años y es un" + perro2.raza);

        System.out.println("mi perro se llama:" + perro3.nombre + "tiene"
                + perro3.edad + "años y es un" + perro3.raza);

    }
}
