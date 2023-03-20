import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        int numeroUs;
        int dinero;
        int veces;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite la cantidad de dinero que desea apostar");
        dinero=capturar.nextInt();
        System.out.println("digite la cantidad de veces que desea apostar");
        veces=capturar.nextInt();
        System.out.println("digite 1 si quiere cara y 2 si quiere cello");
        numeroUs=capturar.nextInt();
        int numeroAl = (int)(Math.random()*2+1);
        System.out.println(numeroAl);
        for (int i = 0; i < veces; i++) {   
        if (numeroAl==numeroUs) {
            dinero=dinero+dinero;
            System.out.println("usted gana");
        } else {
            dinero=dinero-dinero;
            System.out.println("usted perdio");
        }
        }
        System.out.println("el dinero que acumuló es"+dinero);
        
    }
}

        