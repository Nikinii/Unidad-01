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

    public static void main(String[] args) {

        var progra = new asignatura();
        progra.codigo = 4752;
        progra.costoHora = 6;
        progra.horas = 200;
        progra.nombre = "Programacion orientada a objetos ";
        progra.nombreDocente = "Mauricio Ortiz Ochoa";
        progra.vigente = true;
        System.out.println(progra.mostrarInformacion());
        System.out.println(progra.calcularCosto());

        var progra2 = new asignatura();
        progra2.codigo = 4152;
        progra2.costoHora = 5;
        progra2.horas = 100;
        progra2.nombre = "Educacion fisica ";
        progra2.nombredeldocente = "Pedro Mauricio";
        progra2.vigente = true;
        System.out.println(progra2.mostrarInformacion());
        System.out.println(progra2.calcularCosto());

        var progra3 = new asignatura();
        progra3.codigo = 2514;
        progra3.costoHora = 7;
        progra3.horas = 160;
        progra3.nombre = "Calculo diferencial ";
        progra3.nombredeldocente = "Ochoa Avila Juan";
        progra3.vigente = true;
        System.out.println(progra3.mostrarInformacion());
        System.out.println(progra3.calcularCosto());

        System.out.println("\n \n \n \n");  */
                 var auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.placa = "ABC25";
        auto1.propietario = "Peres Juanito";
        auto1.año = 2012;
        auto1.precio = 20000;
        auto1.color = "Rojo";
        System.out.println(auto1.mostrarinfo());
        System.out.println("El carro es de " + auto1.getPAismarca() + " ademas circula por " + auto1.getProvincia() + " \n El numero de continente del auto es de " + auto1.getNumeroContinente());
        System.out.println("\nEl automovil conto con un iva de " + auto1.calcularIva() + "\nAdemas el precio comercial actual del carro es de " + auto1.calcularDepreciacion(2022) + "\nAdemas el costo de la matricula es de " + auto1.costodematricula(2022) + " y su estado para poder asegurar su carro es " + auto1.sepuedeasegurar(2022));

        /*var auto2 = new Auto();
    auto2.marca="jetour";
    auto2.placa="ABC25";
    auto2.propietario="Peres Juanito";
    System.out.println(auto2.mostrarinfo());
    System.out.println("El carro es de "+auto2.getPAismarca());
    
    var auto3 = new Auto();
    auto3.marca="Mercedes Bens";
    auto3.placa="ABC25";
    auto3.propietario="Peres Juanito";
    System.out.println(auto3.mostrarinfo());
    System.out.println("El carro es de "+auto3.getPAismarca());*/
    }
}
