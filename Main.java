import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int primeiroValor, segundoValor, total;

        System.out.println("Insira o primeiro valor: ");
        primeiroValor = scn.nextInt();
        System.out.println("Insira o segundo valor: ");
        segundoValor = scn.nextInt();

        total=primeiroValor+segundoValor;

        System.out.println("O resutado e: "+ total);
    }
}