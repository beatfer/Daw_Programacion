package guerraarray;
public class NaveNodriza {
    private Marciano[] marcianos;//Declaramos el array
    public NaveNodriza(int numMarcianos){
        marcianos=new Marciano[numMarcianos];
        meterMarcianos();
    }
    public void disparar(){
        for (int i=0;i<marcianos.length;i++){
            marcianos[i].disparar();
        }
    }
    public void mostrarInformacion(){
        for (int i=0;i<marcianos.length;i++){
            if(marcianos[i] instanceof Alien){
                System.out.println("El marciano "+marcianos[i].getIdentidad()+" es un alien y ha disparado "+marcianos[i].obtenerDisparos()+" veces");
                
            }
            else{
                if(marcianos[i] instanceof ET){
                     System.out.println("El marciano "+marcianos[i].getIdentidad()+" es un ET y ha disparado "+marcianos[i].obtenerDisparos()+" veces");
                    
                }
                else{
                    
                     System.out.println("El marciano "+marcianos[i].getIdentidad()+" es un Marciano Simple y ha disparado "+marcianos[i].obtenerDisparos()+" veces");
                }
                
                
            }
           
        }
    }
    public void meterMarcianos(){
        int a;
        for(int i=0;i<marcianos.length;i++){
            a=(int)(Math.random()*20);
            if(a==5){
                marcianos[i]=new Alien();
                
            }
            else{
                if(a>9){
                    
                    marcianos[i]=new Marciano();
                }
                else{
                    if(a!=5){
                        marcianos[i]=new ET();
                        
                    }
                   
                    
                }
                
            }
            
        }
                
    }
}
