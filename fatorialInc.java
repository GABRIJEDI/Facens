import java.util.Scanner;

public class CalculoPar{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numero, soma, fatorial;

        System.out.println("Insira o numero desejado:");
        numero = scn.nextInt();

        for(int cont = 1;cont <= numero;cont ++){
          
        soma = numero*cont;
        fatorial = soma;
        soma = fatorial*cont;
        System.out.println("\n"+soma);
        }
        scn.close();
    }
}