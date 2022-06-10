/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar or teclado
        // un objeto de tipo Estudiante Distancia si el usuario Ingresa 1 como
        // opcion
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como
        // opcion

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese 1 para Ingresar un Estudiante Distacia, "
                + "Ingrese 2 para para Ingresar Estudainte Presencial");
        int opc = entrada.nextInt();
        if (opc != 1 && opc != 2) {
            System.out.println("Valor fuera de Rango");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese los Nombres del Estudiante");
            String nom = entrada.nextLine();
            System.out.println("Ingrese los Apellidos del Estudiante");
            String ape = entrada.nextLine();
            System.out.println("Ingrese la Identificaion del Estudiante");
            String iden = entrada.nextLine();
            System.out.println("Ingrese la edad del Estudiante");
            int edad = entrada.nextInt();
            if (opc == 1) {
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

            } else {
                if (opc == 2) {
                    System.out.println("Ingrese el numero de creditos");
                    int numCred = entrada.nextInt();
                    System.out.println("Ingrese le costo del credito");
                    double cosCred = entrada.nextDouble();
                    EstudiantePresencial estu1 = new EstudiantePresencial();
                    estu1.establecerNombresEstudiante(nom);
                    estu1.establecerApellidoEstudiante(ape);
                    estu1.establecerIdentificacionEstudiante(iden);
                    estu1.establecerEdadEstudiante(edad);
                    estu1.establecerNumeroCreditos(numCred);
                    estu1.establecerCostoCredito(cosCred);
                    estu1.calcularMatriculaPresencial();
                    System.out.printf("%s\n", estu1);
                }
            }
        }
    }

}
