package guerraarray;


import guerraarray.Marciano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public final class Alien extends Marciano {
    public Alien(){
        super(100);
    }
    @Override
    public void disparar(){
        int a;
        System.out.println("Ha disparado un alien:");
          for (int i=0;i<disparos.length;i++){
              a=(int)(Math.random()*6 +1);
            disparos[i]+=a;
            System.out.println("El "+(i+1)+" disparo tiene "+a+ " disparos");
            
            
        }
        
    }
    
    
    
}
