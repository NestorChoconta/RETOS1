import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int numUsuario;
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite 1 si es piedra,2 si es tijera o 3 si es papel");
        numUsuario=capturar.nextInt();
        int maquina = (int)(Math.random()*3+1);
        System.out.println("la maquina sacó"+maquina);
        if (maquina==numUsuario) {
            System.out.println("hay un empate");
        }
        else if (maquina==1 && numUsuario==2) {
            System.out.println("la maquina gana");
        }else if (maquina==2 && numUsuario==3) {
            System.out.println("la maquina gana");
        }else if(maquina==3 && numUsuario==1){
            System.out.println("la maquina gana");
        }else{
            System.out.println("usted gana");
        }
    }
}
