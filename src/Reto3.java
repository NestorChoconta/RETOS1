import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        int numeroUs;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite 1 si quiere cara y 2 si quiere cello");
        numeroUs=capturar.nextInt();
        int numeroAl = (int)(Math.random()*2+1);
        System.out.println(numeroAl);   
        if (numeroAl==numeroUs) {
            System.out.println("usted ganó");
        } else {
            System.out.println("usted perdio");
        }
    }
}
