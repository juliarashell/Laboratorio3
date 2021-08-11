/*Programa que calcule e imprima el sueldo semanal de un empleado a partir de sus
horas semanales trabajadas y de su sueldo por hora.*/

package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float horasT, sueldoxH, sueldoS;
      
        
        System.out.println("Ingrese las horas semanales trabajadas: ");
        horasT = entrada.nextFloat();
        System.out.println("Ingrese el sueldo pagado por hora: ");
        sueldoxH = entrada.nextFloat();
        
        sueldoS = horasT*sueldoxH;
        System.out.println("El sueldo semanal es: Q "+sueldoS);
        
    }
    
}
