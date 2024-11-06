import java.util.Scanner;

public class AC2{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int opcaoPeso = 0, escolhaMenu = 0, opcaoNota = 0;
        double pesoTotal = 0.0, media = 0.0, notaTotal = 0.0;

        double[] peso = new double[4];
        double[] nota = new double[4];

        System.out.println("CALCULO DE NOTAS\n");
        System.out.println("Calculo de notas das avaliacoes:");
        System.out.println("Avaliacao Continuada 1 (AC1)");
        System.out.println("Avaliacao Continuada 2 (AC2)");
        System.out.println("Avaliacao Geral (AG)");
        System.out.println("Avaliacao Final (AF)\n");

        System.out.println("Escolha a opcao no menu a seguir:\n");

        do{
            System.out.println("\nGostaria de alterar o peso da avaliacao ou calcular a media do aluno?\n");
            System.out.println("(1) Mudar o peso da media das avaliacoes.");
            System.out.println("(2) Calcular a media do aluno.");
            System.out.println("(3) Encerrar programa!");
            escolhaMenu = scn.nextInt();


            if(escolhaMenu == 1){
                do{
                    System.out.println("\nMUDAR O PESO DA MEDIA DAS AVALIACOES");
                    System.out.println("Escolha dentre as opcoes a seguir:\n");
                    System.out.println("(1) Peso da media da AC1");
                    System.out.println("(2) Peso da media da AC2");
                    System.out.println("(3) Peso da media da AG");
                    System.out.println("(4) Peso da media da AF");
                    System.out.println("(5) Para verificar valores (use antes de continuar para as notas)");
                    System.out.println("(6) Ou outro valor para voltar\n");
                    opcaoPeso = scn.nextInt();

                    switch(opcaoPeso){

                        case 1: System.out.println("Defina o peso da nota da AC1:");
                                peso[0] = scn.nextDouble();
                                break;

                        case 2: System.out.println("Defina o peso da nota da AC2:");
                                peso[1] = scn.nextDouble();
                                break;
                    
                        case 3: System.out.println("Defina o peso da nota da AG:");
                                peso[2] = scn.nextDouble();
                                break;

                        case 4: System.out.println("Defina o peso da nota da AF:");
                                peso[3] = scn.nextDouble();
                                break;

                        case 5: System.out.println("Continuando...\n");
                                for(int i = 0; i < peso.length; i++){
                                    pesoTotal += peso[i];
                                }
                                if(pesoTotal != 1){
                                    System.out.println("Os pesos de avaliacao estao com os seguintes valores:");
                                    System.out.println("AC1: "+peso[0]);
                                    System.out.println("AC2: "+peso[1]);
                                    System.out.println("AG: "+peso[2]);
                                    System.out.println("AF: "+peso[3]);
                                    System.out.println("O valor total dos valores esta em: "+pesoTotal);
                                    System.out.println("Os valores precisam estar no valor completo (valor 1)");
                                    System.out.println("Por favor, refaca os valores");
                                    System.out.println("Pressione qualquer valor para voltar");
                                    scn.next();
                                    escolhaMenu = 1;
                                }
                                else if(pesoTotal == 1){
                                    System.out.println("Os pesos de avaliacao estao com os seguintes valores:");
                                    System.out.println("AC1: "+peso[0]);
                                    System.out.println("AC2: "+peso[1]);
                                    System.out.println("AG: "+peso[2]);
                                    System.out.println("AF: "+peso[3]);
                                    System.out.println("O valor total esta completo (Total de 1)");
                                    System.out.println("As notas agora podem ser calculadas.");
                                    System.out.println("Pressione qualquer valor para continuar");
                                    scn.next();
                                    escolhaMenu = 2;
                                }
                                break;      

                        default:System.out.println("Voltando...\n");
                                escolhaMenu = 0;
                                break;
                    }
                }while(opcaoPeso <= 5 && pesoTotal != 1);
            }
            else if(escolhaMenu == 2 && pesoTotal == 1){

                do{
                    System.out.println("\nCALCULAR A MEDIA DO ALUNO");
                    System.out.println("Escolha a nota que deseja alterar; ou calcular a media:\n");
                    System.out.println("(1) Nota AC1");
                    System.out.println("(2) Nota AC2");
                    System.out.println("(3) Nota AG");
                    System.out.println("(4) Nota AF");
                    System.out.println("(5) calcular a media");
                    System.out.println("(6) Ou outro valor para voltar a tela inicial");
                    opcaoNota = scn.nextInt();

                    switch(opcaoNota){

                        case 1: System.out.println("Insira a nota da AC1 do aluno:");
                                nota[0] = scn.nextDouble();
                                break;

                        case 2: System.out.println("Insira a nota da AC2 do aluno:");
                                nota[1] = scn.nextDouble();
                                break;

                        case 3: System.out.println("Insira a nota da AG do aluno:");
                                nota[2] = scn.nextDouble();
                                break;

                        case 4: System.out.println("Insira a nota da AF do aluno:");
                                nota[3] = scn.nextDouble();
                                break;

                        case 5: System.out.println("Insira a media para aprovacao do aluno:");
                                media = scn.nextDouble();

                                for(int i = 0; i < nota.length; i++){
                                    notaTotal = notaTotal + (nota[i] * peso[i]);
                                }

                                if(notaTotal >= media){
                                    System.out.println("A nota total do aluno foi:"+notaTotal);
                                    System.out.println("Parabens ele foi aprovado!!");
                                    System.out.println("(1) Ou outro valor para voltar ao menu");
                                    System.out.println("(3) Para encerrar o programa");
                                    escolhaMenu = scn.nextInt();
                                }
                                else{
                                    System.out.println("A nota total do aluno foi:"+notaTotal);
                                    System.out.println("Infelizmente ele foi reprovado!");
                                    System.out.println("Pressione qualquer tecla para voltar ao menu de notas");
                                    System.out.println("(1) Ou outro valor para voltar ao menu");
                                    System.out.println("(3) Para encerrar o programa");
                                    escolhaMenu = scn.nextInt();
                                }
                                break;

                        default: System.out.println("Voltando...");
                                escolhaMenu = 0;
                                break;


                    }
                }while(opcaoNota <=5);
            }
            else{
                System.out.println("Opcao invalida ou valor das medias incorreto. Por favor, verifique o peso da media antes de proseguir para as notas.");
                System.out.println("Pressione qualquer valor para voltar");
                scn.next();
            }

        }while(escolhaMenu != 3);

        scn.close();
    }
}
