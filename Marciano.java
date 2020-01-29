package guerraarray;
public class Marciano {
    private static int numMarcianos=0;
    private int identidad;
    protected int[] disparos;
    private final int CARTUCHOS=5;
    /*Para asignar un valor a una variable static, podemos asignarle el valor 
    en la misma declaración o podemos usar la siguiente sentencia
    static {
        numMarcianos=0;
    }*/
    public Marciano(){
        numMarcianos++;
        identidad=numMarcianos;
        disparos=new int[CARTUCHOS];
    }
     public Marciano(int n){
        numMarcianos++;
        identidad=numMarcianos;
        disparos=new int[n];
    }
    /*public Marciano(int id) {
        numMarcianos++;
        identidad=id;
    }*/
    public static int getNumMarcianos(){
        return numMarcianos;
    }
    public int getIdentidad(){
        return identidad;
    }
    public void disparar(){
        for (int i=0;i<disparos.length;i++){
            disparos[i]+=(int)(Math.random()*2*(disparos.length-i)+1);
        }
    }
    public int obtenerDisparos(){
        int total=0;
        for (int i=0;i<disparos.length;i++){
            total+=disparos[i];
        }
        return total;
    }
    
}