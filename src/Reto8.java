import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int numero;
        int maquina = (int)(Math.random()*100+1);
        Scanner capturar=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("digite un numero");
            numero=capturar.nextInt();
            if (numero==maquina) {
                System.out.println("usted acertó");
            } else {
                System.out.println("sigue intentando");
            }
        }
        System.out.println("el numero es"+"\n"+maquina);
    }
}
