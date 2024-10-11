import java.util.Scanner;

public class Aula8Char{

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

        char inicio, fim;

        System.out.println("Digite o primeiro char:");
        inicio = scn.next().toLowerCase().charAt(0);
        System.out.println("digite o segundo char");
        fim = scn.next().toLowerCase().charAt(0);

        for(char cont=inicio;cont<=fim;cont++){
            if(cont == 'a'||cont == 'e'||cont == 'i'||cont == 'o'||cont == 'u'){
                System.out.println(cont);
            }
        }

    scn.close();
    }
    
}
