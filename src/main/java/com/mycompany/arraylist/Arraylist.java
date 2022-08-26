/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraylist;
import java.util.*;
/**
 *
 * @author USER
 */
public class Arraylist {


    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
  
        //creamos los arrays
        String[] empleados = new String[8];
        double[] sueldos = new double[8];

        //variables donde guardar el nombre y sueldo del empleado que más gana
        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        //se lee el primer empleado
        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

        //se toma el primero leído como mayor
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        //se leen el resto de empleados
        for (i = 1; i < empleados.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            //se compara el sueldo leído con el mayor actual
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }

        //mostrar resultados
        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }
}