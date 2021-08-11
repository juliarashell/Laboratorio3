/*Una empresa de venta de carros usados, paga a su personal de ventas un salario de $1000.00
mensuales, más una comisión de $150.00 por cada carro vendido, más el 5% del valor de la venta por
carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un
programa que calcule e imprima el salario mensual de un vendedor dado.*/

package ejercicio4;


public class Ejercicio4 {
    public static void main(String[] args) {
       
        int salario = 1000, comision = 150;
        double valorV = 0.05, valorC = (Math.random()*100_000), carrosV = (Math.random()*10);
        
        double carrosTotalV = valorV * carrosV * comision;
        double valorVentaTotal = carrosV * comision;
        
        double salarioTotal = salario + carrosTotalV + valorVentaTotal;    
    
        System.out.println("El salario mensual total del vendedor es: " + salarioTotal);
    }
}
    
