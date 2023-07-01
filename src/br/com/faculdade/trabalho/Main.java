package br.com.faculdade.trabalho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variaveis globais
        int opcao = 0;
        int opcaoDeMoeda;
        double valor;
        Moeda moeda;

        //Objeto cofrinho é criado herdando características da classe Cofrinho
        Cofrinho cofrinho = new Cofrinho();

        // Laço Do-while executa Menu principal enquanto valor digitado for diferente de 0
        do {
            try {
                // MENU com as opções do sistema Cofrinho
                System.out.println("""
                        COFRINHO:
                        1 - Adicionar moedas
                        2 - Remover moedas
                        3 - Listar
                        4 - Calcular valor no cofrinho
                        0 - Encerrar
                        """);

                // Scanner será chamado e será solcitado uma opção do Menu
                System.out.println("Digite a opção desejada:");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        try {
                            System.out.println("Menu - ADICIONAR MOEDAS");
                        /* Será criado objetos dependendo do tipo de moeda escolhiada: Real, Dólar ou Euro
                           que recebe o valor no construtor da sua classe mãe e
                           adiciona valores ao ArrayList de Moedas
                        */

                            // Opções de moedas disponíveis
                            System.out.println("""
                                    Escolha uma moeda:
                                    1 - Real
                                    2 - Dolar
                                    3 - Euro
                                    """);

                            opcaoDeMoeda = scanner.nextInt();

                            System.out.println("Digite um valor: ");
                            valor = scanner.nextDouble();

                            if (opcaoDeMoeda == 1) {
                                moeda = new Real(valor);
                                cofrinho.adicionar(moeda);
                            } else if (opcaoDeMoeda == 2) {
                                moeda = new Dolar(valor);
                                cofrinho.adicionar(moeda);
                            } else if (opcaoDeMoeda == 3) {
                                moeda = new Euro(valor);
                                cofrinho.adicionar(moeda);
                            } else {
                                throw new OpcaoInvalidaException("Opção inválida, tente novamente!");
                            }
                            break;
                        } catch (OpcaoInvalidaException e) {
                            System.err.println(e);
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Menu - REMOVER MOEDAS");

                            /*
                            Mostra lista com valores armazenados ao usuário,
                            e pergunta qual valor ele deseja remover.
                             */
                            
                            cofrinho.listagemMoedas();
                            System.out.println("""
                                    Escolha uma moeda:
                                    1 - Real
                                    2 - Dolar
                                    3 - Euro
                                    """);

                            System.out.println("Qual moeda você deseja remover?");
                            opcaoDeMoeda = scanner.nextInt();

                            System.out.println("Qual valor você deseja remover?");
                            valor = scanner.nextDouble();

                            if (opcaoDeMoeda == 1) {
                                moeda = new Real(valor);
                                cofrinho.remover(moeda);

                            } else if (opcaoDeMoeda == 2) {
                                moeda = new Dolar(valor);
                                cofrinho.remover(moeda);

                            } else if (opcaoDeMoeda == 3) {
                                moeda = new Euro(valor);
                                cofrinho.remover(moeda);

                            } else {
                                throw new OpcaoInvalidaException("Opção inválida, tente novamente!");
                            }
                            break;
                        } catch (OpcaoInvalidaException e) {
                            System.err.println(e);
                        }
                        break;

                    case 3:
                        System.out.println("Menu - LISTA DE MOEDAS");

                        // Faz a impressão de todas as moedas da lista
                        cofrinho.listagemMoedas();
                        break;

                    case 4:
                        System.out.println("Menu - CONVERTER MOEDAS PARA R$ REAL");

                        // Imprime valor convertido de todas as moedas para Real
                        System.out.printf("O valor convertido " +
                                "em Real é R$ %.2f \n", cofrinho.totalConvertido());

                        break;

                    case 0:
                        // Encerra programa quando o usuário digitar a opção 0 - "Sair"
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        // Caso o usuário digite um número diferente das opções passadas como parâmetro
                        throw new OpcaoInvalidaException("Opção inválida, tente novamente!");
                }
                System.out.println(); // Linha em branco para separar as execuções do menu
            } catch (OpcaoInvalidaException e) {
                System.err.println(e);
            }
            continue;

        }while (opcao != 0) ;

        scanner.close(); // Fecha Scanner
    }
}
