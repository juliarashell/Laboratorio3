/* Rodrigo tiene x dólares. Andrea tiene la mitad de lo que posee Rodrigo. Miguel tiene la mitad
de lo que poseen Andrea y Rodrigo juntos. Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los tres.*/

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float Rodrigo, Andrea, Miguel,total;
        
        System.out.println("Ingrese la cantidad de dinero que tiene Rodrigo");
        Rodrigo = entrada.nextFloat();
        
        Andrea = Rodrigo/2;
        Miguel= (Andrea+Rodrigo)/2;
        total = Andrea + Rodrigo + Miguel; 
        
        System.out.println("Andrea: "+Andrea);
        System.out.println("Miguel: "+Miguel);
        
        
System.out.println("La cantidad de dinero entre los tres es de: $"+total);
    }
    
}
