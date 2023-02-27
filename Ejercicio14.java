/* Desarrollar un programa que permita calcular la suma de los cuadrados de los primeros N números. */

import java.util.Scanner; 

public class Ejercicio14 {
    public static void maiun(String[]args){
        int entrada = 0; 
        int temporal = 0; 
        int resultado = 0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("ingresa un número: "); 
        entrada = sc.nextInt (); 
        for (int i = 0; i<= entrada; i++){
            temporal = i; 
            resultado = resultado + (temporal * i);
        }   
        System.out.println("El resultado de la operaciÃ³n es: " + resultado);
    }
}