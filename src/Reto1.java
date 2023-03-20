import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int farenheit=350;
        double centigrados;
        Scanner capturar=new Scanner(System.in);
        centigrados=(farenheit-32)/1.8;
        System.out.println("la temperatura que debe utilizar la abuela es"+centigrados);
    }
}
