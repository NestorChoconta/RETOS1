import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        int productos;
        int total;
        int precio;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite la cantidad de productos");
        productos=capturar.nextInt();
        for (int i = 0; i <productos ; i++) {
            System.out.println("digite el precio del producto");
            precio=capturar.nextInt();
            }
            total=productos;
            System.out.println("el total es"+total);
            
    }
}
