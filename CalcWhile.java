import java.util.Scanner;

public class CalcWhile{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double primeiro = 0.0, segundo = 0.0, resultado = 0.0;
        char op = ' ', escolhaSaida = ' ';

        do{
            System.out.println("Insira dois numeros:");
            System.out.println("Primeiro: ");
            primeiro = scn.nextDouble();

            System.out.println("Segundo: ");
            segundo = scn.nextDouble();

            System.out.println("Selecione uma operacao: ");
            System.out.println("+ : soma");
            System.out.println("- : subtracao");
            System.out.println("/ : divisao");
            System.out.println("* : multiplicacao");
            op = scn.next().charAt(0);

            switch (op){
                case '+':
                    resultado = primeiro + segundo;
                    break;
                case '-':
                    resultado = primeiro - segundo;
                    break;
                case '/':
                    resultado = primeiro/segundo;
                    break;
                case '*':
                    resultado = primeiro*segundo;
                    break;
                default:
                    System.out.println("Opereacao invalida");
                    break;           
            }

            System.out.println("O resultado é: "+resultado);

            System.out.println(" ");

            System.out.println("Deseja continuar? s - sim, qualquer para sair");
            escolhaSaida = scn.next().charAt(0);

        } while(escolhaSaida == 's');



        scn.close();
    }
}