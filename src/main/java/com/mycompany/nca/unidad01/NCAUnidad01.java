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
        var Perro1 = new Perro();
        var Perro2 = new Perro();
        var Perro3 = new Perro();
        Perro1.nombre = "firulais";
        Perro1.raza = "mestizo";
        Perro1.edad = 15;
        Perro1.peso = 5;
        
        Perro2.nombre = "pepe";
        Perro2.raza = "nosexd ";
        Perro2.edad = 5;
        Perro2.peso = 5;
        
        Perro3.nombre = "michi";
        Perro3.raza = "blanco";
        Perro3.edad = 10;
        Perro3.peso = 5;

        var Persona1 = new Persona();
        var Persona2 = new Persona();
        var Persona3 = new Persona();
        Persona1.cedula = 921437840;
        Persona1.edad = 20;
        Persona1.nombre = "Pepe";
        Persona1.peso = 54;
                
        Persona2.cedula = 921437840;
        Persona2.edad = 40;
        Persona2.nombre = "juan";
        Persona2.peso = 632;
        
        Persona3.cedula = 921437840;
        Persona3.edad = 10;
        Persona3.nombre = "joshe";
        Persona3.peso = 19;
        
        var Carro1 = new Carro();
        var Carro2 = new Carro();
        var Carro3 = new Carro();
        Carro1.color = "rojo";
        Carro1.marca = "mazda";
        Carro1.peso = 10;
        Carro1.modelo = "pro x max 300";
        
        Carro2.color = "morado";
        Carro2.marca = "suzuky";
        Carro2.peso = 107;
        Carro2.modelo = "s22";
        
        Carro3.color = "negro";
        Carro3.marca = "toyota";
        Carro3.peso = 20;
        Carro3.modelo = "moster 2.0";
        
        var Computadora1 = new Computadora();
        var Computadora2 = new Computadora();
        var Computadora3 = new Computadora();
        Computadora1.capacidad = 12;
        Computadora1.color = "negro";
        Computadora1.marca = "msi";
        Computadora1.modelo = "Berserker";
        
        Computadora2.capacidad = 14;
        Computadora2.color = "blancoo";
        Computadora2.marca = "mac";
        Computadora2.modelo = "u mama";
        
        Computadora3.capacidad = 17;
        Computadora3.color = "gris";
        Computadora3.marca = "asus";
        Computadora3.modelo = "sus";
                
              
        
        
        System.out.println("mi perro se llama: " + Perro1.nombre + " tiene "
                + Perro1.edad + " años y es un " + Perro1.raza + " y ademas pesa "+ Perro1.peso);

        System.out.println("mi perro se llama: " + Perro2.nombre + " tiene "
                + Perro2.edad + " años y es un " + Perro2.raza + " y ademas pesa "+ Perro2.peso);

        System.out.println("mi perro se llama: " + Perro3.nombre + " tiene "
                + Perro3.edad + " años y es un " + Perro3.raza + " y ademas pesa "+ Perro3.peso);

        
        System.out.println("tengo una computadora " + Computadora1.marca + " del modelo " 
                + Computadora1.modelo + " y de color "
                + Computadora1.color + " que tiene una capacidad de " + Computadora1.capacidad);
        
        System.out.println("tengo una computadora " + Computadora2.marca + " del modelo " 
                + Computadora2.modelo + " y de color "
                + Computadora2.color + " que tiene una capacidad de " + Computadora2.capacidad);
        
        System.out.println("tengo una computadora " + Computadora3.marca + " del modelo " 
                + Computadora3.modelo + " y de color "
                + Computadora3.color + " que tiene una capacidad de " + Computadora3.capacidad);
        
        
        System.out.println("me compre un carro de la marca " + Carro1.marca + " del modelo " 
                + Carro1.modelo + " es de color " + Carro1.color + " y pesa " +Carro1.peso );
        
        System.out.println("me compre un carro de la marca " + Carro2.marca + " del modelo " 
                + Carro2.modelo + " es de color " + Carro2.color + " y pesa " +Carro2.peso );
        
        System.out.println("me compre un carro de la marca " + Carro3.marca + " del modelo " 
                + Carro3.modelo + " es de color " + Carro3.color + " y pesa " +Carro3.peso );
        
        
      System.out.println("Mi amigo se llama " + Persona1.nombre + " tiene " + Persona1.edad + 
              " años y un peso de " + Persona1.peso + " y su numero de cedula es: " +Persona1.cedula);
      
      System.out.println("Mi amigo se llama " + Persona2.nombre + " tiene " + Persona2.edad + 
              " años y un peso de " + Persona2.peso + " y su numero de cedula es: " +Persona2.cedula);
      
      System.out.println("Mi amigo se llama " + Persona3.nombre + " tiene " + Persona3.edad + 
              " años y un peso de " + Persona3.peso + " y su numero de cedula es: " +Persona3.cedula);
    }
}
