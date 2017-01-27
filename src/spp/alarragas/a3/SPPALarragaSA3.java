/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.alarragas.a3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPALarragaSA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ejercicio o ejemplo 1");
       //Declaración Variables
       double a,b; //a= numero a redondear   b=numero redondeado
      //Objeto para recibir datos
      Scanner kb = new Scanner (System.in);
      
      //Asigno valores
      System.out.println("Introduce el numero que quieres redondear");
     a=kb.nextDouble();
      
      //Operación
      b= Math.round(a);
    
      //Resultado
      System.out.println("Tu numero redondeado es" + b);
              
    }
    
}
