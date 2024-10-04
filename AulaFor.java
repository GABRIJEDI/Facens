import java.util.Scanner;

public class AulaFor{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int inicio = 0, fim = 0;

        System.out.println("Digite o inicio:");
        inicio = scn.nextInt();

        System.out.println("Digite o fim:");
        fim = scn.nextInt();


        for(int cont = inicio; cont <= fim && cont %7 != 0; cont++){
            System.out.println("O valor divisivel por 7 e:" + cont);
        }

        scn.close();
    }
}