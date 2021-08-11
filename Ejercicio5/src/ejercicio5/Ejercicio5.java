/* La calificación final de un estudiante de Informática se calcula con base a las calificaciones de
cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen
parcial y examen final. Sabiendo que las calificaciones anteriores entran a la calificación final con
ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante.*/
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         float parti, P1, P2, eFinal, cFinal;
         
        System.out.println("Ingrese el porcentaje obtenido de Participacion / 10%:");
        parti = entrada.nextFloat();
        
        System.out.println("Ingrese el porcentaje obtenido de Primer Parcial / 25%:");
        P1 = entrada.nextFloat();
        
        System.out.println("Ingrese el porcentaje obtenido del Segundo Parcial / 25%:");
        P2 = entrada.nextFloat();
        
        System.out.println("Ingrese el porcentaje obtenido del Examen Final / 40%:");
        eFinal = entrada.nextFloat();
        
        cFinal = parti + P1 + P2 + eFinal;
        
        System.out.println("La Calificacion Final Obtenida es de: "+ cFinal + "%");
        
    }
    
}
