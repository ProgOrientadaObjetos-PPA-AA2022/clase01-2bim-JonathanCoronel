/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000.00);

        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000.00);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000.00);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000.00);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};

        Vehiculo vehi1 = new Vehiculo("Auto", "lbb0011", 10000);
        Vehiculo vehi2 = new Vehiculo("Camioneta", "lcb0011", 20000);
        Vehiculo vehi3 = new Vehiculo("Auto", "lbd0012", 6000);
        Vehiculo vehi4 = new Vehiculo("Camioneta", "lcc0011", 10000);
        Vehiculo vehi5 = new Vehiculo("Camioneta", "ldc0011", 25000);

        Vehiculo[] listaVehiculos = {vehi1, vehi2, vehi3, vehi4, vehi5};
        //double c=listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        // Crear un objeto de tipo Empresa:
        Empresa empre = new Empresa();
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        empre.establecerNombre("Empresa de Hojas");
        empre.establecerEdificios(listaEdificios);
        empre.calcularCostoBienesInmuebles();
        empre.establecerVehiculos(listaVehiculos);
        empre.calcularCostoVehiculos();
        empre.establecerCostoTotalBienes();
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("Costos: %.2f\n",empre.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n", empre);

    }

}
