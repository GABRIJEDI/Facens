import java.util.Scanner;

public class SomaWhile{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numero=0, soma=0;    

        System.out.println("Digite o primeiro numero:");
        numero = scn.nextInt();
        System.out.println("digite o proximo numero:");
        soma = scn.nextInt();

        while(numero>=0){
            System.out.println("A soma de:" + numero + " + "+soma+" e igual a:"+soma);
            soma = numero + soma;
            System.out.println("Coloque o proximo numero:");
            numero = scn.nextInt();
        }

        scn.close();
    }
}