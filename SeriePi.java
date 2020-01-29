/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriepi;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SeriePi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        double error;
        final double constante=4;//siempre es dividir 4 entre un divisor
        boolean negativo=false;
        int divisor=1;//no se puede dividir por 0
        double acumulador=0,division;
        division=constante/divisor; // hacemos la division una vez antes del bucle para que entre en el mismo
        System.out.println("el error que quieres que tenga ");
        error=teclado.nextDouble();
        while(division>error){
          
           if (negativo==false){
              
               acumulador+=division;
               negativo=true;
           }
           else{
               acumulador-=division;
               negativo=false;
           }
             
             divisor+=2;
             division=constante/divisor;
           
            
        }
        System.out.println();
        System.out.println(acumulador);
    }
    }
    

