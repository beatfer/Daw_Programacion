/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerraarray;

/**
 *
 * @author Alumno
 */
public final class ET extends Marciano{
    public ET(){
        super();
    }
    @Override
    public void disparar(){
        int i=1;
        int numeroDisparos[]=new int[disparos.length];
        int d;
        
        System.out.println(" ET con id "+ getIdentidad()+":");
       while(i<6){
          for(int j=0;j<disparos.length;j++){
               numeroDisparos[j]=disparos[j];
               
           }
           System.out.println("Cartucho "+i+":");
           //System.out.println("Ha disparado un ET en su "+i+" cartucho");
           super.disparar();
           for(int j=0;j<disparos.length;j++){
               d=disparos[j]-numeroDisparos[j];
              
               System.out.println((j+1)+" intento ha disparado "+ d+" veces");
               
           }
           i++;
           
       } 
       System.out.println("*******************");
    }
    
    
    
}
