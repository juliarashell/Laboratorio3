package ejercicio7;

import java.util.Scanner;



public class Ejercicio7 {
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int HrsTot, sems, dias, hrs;
      
      System.out.println("Ingrese el numero total de horas que desea medir");
      HrsTot = entrada.nextInt();
      
      sems = HrsTot / 168;
      dias = HrsTot%168 /24;
      hrs = HrsTot%24;
      
      System.out.println("------------Equivalentes--------------- ");
      System.out.println("Semanas: "+sems);
      System.out.println("Días: "+dias);
      System.out.println("Horas:"+hrs);
    }
    
}
