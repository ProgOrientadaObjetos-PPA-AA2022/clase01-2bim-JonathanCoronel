/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALAI
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String tip, String matri, double val) {
        tipo = tip;
        matricula = matri;
        valor = val;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public void establecerMatricula(String matri) {
        matricula = matri;
    }

    public void establecerValor(double val) {
        valor = val;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerValor() {
        return valor;
    }

    public String obtenerMatricula() {
        return matricula;
    }

}
