/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar un objeto de tipo Estudiante Distancia
        //por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese los Nombres del Estudiante");
        String nom = entrada.nextLine();
        System.out.println("Ingrese los Apellidos del Estudiante");
        String ape = entrada.nextLine();
        System.out.println("Ingrese la Identificaion del Estudiante");
        String iden = entrada.nextLine();
        System.out.println("Ingrese la edad del Estudiante");
        int edad = entrada.nextInt();
        System.out.println("Ingrese le numero de asignaturas del Estudiante");
        int numAsig = entrada.nextInt();
        System.out.println("Ingrese le costo de las Asignaturas");
        double cosAsig = entrada.nextDouble();
        EstudianteDistancia estu1 = new EstudianteDistancia();
        estu1.establecerNombresEstudiante(nom);
        estu1.establecerApellidoEstudiante(ape);
        estu1.establecerIdentificacionEstudiante(iden);
        estu1.establecerEdadEstudiante(edad);
        estu1.establecerNumeroAsginaturas(numAsig);
        estu1.establecerCostoAsignatura(cosAsig);
        estu1.calcularMatriculaDistancia();

        System.out.printf("%s\n", estu1);

    }
}
