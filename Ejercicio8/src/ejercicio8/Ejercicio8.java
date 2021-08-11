/* Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo
grado de coeficientes reales. */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Rashell
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        double Coea=0,Coeb=0,Coec=0,x1=0,x2=0,ProR=0;        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el Coeficiente a");
        Coea = teclado.nextDouble();
        
        System.out.println("Ingrese el Coeficiente b");
        Coeb = teclado.nextDouble();
        
        System.out.println("Ingrese el Coeficiente c");
        Coec = teclado.nextDouble();
        
        if(Coea<0){
           Coea=Coea*-1;
           Coeb=Coeb*-1;
           Coec=Coec*-1;
        }
        ProR=(Coeb*Coeb)-(4*Coea*Coec);
        
        x1=(-Coeb+Math.sqrt(ProR))/(2*Coea);
        x2=(-Coeb-Math.sqrt(ProR))/(2*Coea);
        
        System.out.println("Solucion -:"+x1);
        System.out.println("Solucion -:"+x2);
}
    
}