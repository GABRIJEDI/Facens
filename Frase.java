import java.util.Scanner;

public class Frase{

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

        String frase;
        char carac;
        int qtd, vogal=0;

        System.out.println("Digite a frase:");
        frase = scn.next().toLowerCase();
        qtd = frase.length();
        carac = frase.charAt(cont);
        System.out.println(qtd);

        if(carac >= 'a' && carac <= 'z'){
        for(int cont=0;cont < qtd;cont++){
            for(int cont2=0;cont2 < qtd;cont2++){
            if(carac == 'a'||carac == 'e'||carac == 'i'||carac == 'o'||carac == 'u'){
                vogal+=1;
                System.out.println(vogal);
        }
            }
        }
        }
        else{
            System.out.println("Valor invalido");
     }
    scn.close();
    }
    
}
