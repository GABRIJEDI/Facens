import java.util.Scanner;

public class Aula8{

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

        int num;

        System.out.println("insira o numero:");
        num = scn.nextInt();

        for(int i=num;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println(i);
        }

    scn.close();
    }
    
}
