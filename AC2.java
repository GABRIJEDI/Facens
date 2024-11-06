/* import java.util.Scanner;

public class AC2{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        double notaAC1, notaAC2, notaAG, notaAF, notaMinima;
        double calculoNotaAC1, calculoNotaAC2, calculoNotaAG, calculoNotaAF, calculoFinal;

        System.out.println("Insira a nota da Avaliação Continuada 1(AC1):");
        notaAC1 = scn.nextDouble();
        System.out.println("Insira a nota da Avaliação Continuada 2(AC2):");
        notaAC2 = scn.nextDouble();
        System.out.println("Insira a nota da Avaliação Geral(AG):");
        notaAG = scn.nextDouble();
        System.out.println("Insira a nota da Avaliação Final(AF):");
        notaAF = scn.nextDouble();
        System.out.println("Insira a nota minima para ser aprovado:");
        notaMinima = scn.nextDouble();

        calculoNotaAC1 = notaAC1*0.15;
        calculoNotaAC2 = notaAC2*0.30;
        calculoNotaAG = notaAG*0.10;
        calculoNotaAF = notaAF*0.45;

        calculoFinal = calculoNotaAC1 + calculoNotaAC2 + calculoNotaAG + calculoNotaAF;

        if(calculoFinal >= notaMinima && calculoFinal <= 10){
            System.out.println("Aprovado! sua nota foi: "+calculoFinal);
        }else if(calculoFinal < notaMinima){
            System.out.println("Reprovado! sua nota foi: "+calculoFinal);
        }
        else{
            System.out.println("Valor invalido");
        }
    }
} */

import java.util.Scanner;

public class AC2{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int opcaoPeso = 0, escolhaInicial = 0;
        double pesoAC1 = 0.15, pesoAC2 = 0.30, pesoAG = 0.10, pesoAF = 0.45;

        System.out.println("Calculo de notas");

        System.out.println("Escolha a avaliacao que deseja alterar o peso da nota:");

        do{
            System.out.println("Gostaria de alterar o peso da avaliacao ou calcular a media do aluno?");
            System.out.println("(1) Mudar o peso da avaliacao.");
            System.out.println("(2) Calcular a media do aluno.");
            System.out.println("(3) Encerrar programa!");
            escolhaInicial = scn.nextInt();


            if(escolhaInicial == 1){
                System.out.println("(1) Nota AC1");
                System.out.println("(2) Nota AC2");
                System.out.println("(3) Nota AG");
                System.out.println("(4) Nota AF");
                System.out.println("(5) Para continuar");
                System.out.println("Outro valor para voltar");
                opcaoPeso = scn.nextInt();

                switch(opcaoPeso){

                    case 1: System.out.println("Defina o peso da nota da AC1:");
                            pesoAC1 = scn.nextDouble();
                            break;

                    case 2: System.out.println("Defina o peso da nota da AC2:");
                            pesoAC2 = scn.nextDouble();
                            break;
                
                    case 3: System.out.println("Defina o peso da nota da AG:");
                            pesoAG = scn.nextDouble();
                            break;

                    case 4: System.out.println("Defina o peso da nota da AF:");
                            pesoAF = scn.nextDouble();
                            break;

                    case 5: System.out.println("Continuando...");
                            escolhaInicial = 2;
                            break;      

                    default:System.out.println("Voltando...");
                            escolhaInicial = 0;
                            break;
                }
            }
            else if(escolhaInicial == 2){
                System.out.println("Escolha a nota que deseja alterar; ou a media:");
                System.out.println("(1) Nota AC1");
                System.out.println("(2) Nota AC2");
                System.out.println("(3) Nota AG");
                System.out.println("(4) Nota AF");
                System.out.println("(5) calcular a media");
                System.out.println("Outro valor para voltar a tela");

            }

        }while(escolhaInicial == 3);


    }
}