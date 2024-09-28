import java.util.Scanner;

public class tabuada{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int i, num, resultado, conta = 0;

        System.out.println("Digite o numero:");
        num = scn.nextInt();

        for(i=0; i<=9; i++){
            conta = conta + 1;
            resultado = num * conta;

            System.out.println(""+num+"*"+""+conta+"="+resultado);
        }

    }
}