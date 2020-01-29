package guerraarray;
public class GuerraArray {
    public static void main(String[] args) {
        NaveNodriza nave1, nave2;
        nave1=new NaveNodriza(10);
        nave2=new NaveNodriza(15);
        nave1.disparar();
        nave1.disparar();
        nave2.disparar();
        System.out.println("Información de la nave1: ");
        nave1.mostrarInformacion();
        System.out.println("Información de la nave 2: ");
        nave2.mostrarInformacion();
    }
    
}

