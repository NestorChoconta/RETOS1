import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int dosis;
        int pesoBebe;
        int mesesBebe;
        Scanner Capturar=new Scanner(System.in);
        System.out.println("digite el peso del bebe");
        pesoBebe=Capturar.nextInt();
        System.out.println("digite los meses del bebe");
        mesesBebe=Capturar.nextInt();
        dosis=(pesoBebe+10 / mesesBebe*10)*8;
        System.out.println("la dosis del bebe debe ser"+dosis);
    }
}
