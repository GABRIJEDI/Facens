import java.util.Scanner;

public class CalculoPar{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numero, soma;

        System.out.println("Insira o numero desejado:\n");
        numero = scn.nextInt();

        for(int cont = 1;cont <= numero;cont += 2){
          
        soma = cont+cont;
        System.out.println(+soma);
    
        }
        scn.close();
    }
}