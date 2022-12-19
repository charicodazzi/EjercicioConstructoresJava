package Herencia;
import smartDevice.smartPhone;
import smartDevice.smartWatch;

public class Main {
    public static void main(String[] args) {
        
        
        smartWatch appleWatch= new smartWatch("Apple", "Iwatch",16, 12, 300.00); 

        System.out.println(appleWatch.modelo);
        System.out.println(appleWatch.marca);
        System.out.println(appleWatch.memoria);
        System.out.println(appleWatch.hsbateria);
        System.out.println(appleWatch.precio);

        smartPhone iphone = new smartPhone("Apple" , "Iphone14", 256, 1200.00);

        System.out.println(iphone.modelo);
        System.out.println(iphone.marca);
        System.out.println(iphone.memoria);
        System.out.println(iphone.precio);
     

    }
}
