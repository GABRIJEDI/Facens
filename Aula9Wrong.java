import java.util.Scanner;

public class Aula9{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String frase;
        int consoante=0;
        int vogal=0;

        System.out.println("digite a frase:");
        frase=scn.nextLine();
        frase = frase.toLowerCase();

        for(int cont = 0; cont < frase.length(); cont++){

            for(char contB = 'a'; contB <= 'z'; contB++){

                if(frase.charAt(cont) == 'a'||
                    frase.charAt(cont) == 'e'||
                    frase.charAt(cont) == 'i'||
                    frase.charAt(cont) == 'o'||
                    frase.charAt(cont) == 'u'){
                        vogal++;
                    }
                else if(frase.charAt(cont) == contB){
                    consoante++;
                }
                System.out.println("Total consoantes:"+consoante);
                System.out.println("Total Vogal:"+vogal);

            }

        }

        scn.close();
    }
}