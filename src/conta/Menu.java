package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;
import conta.controller.ContaController;

public class Menu {
			
				public static void main(String[] args) {

					ContaController contas = new ContaController();
					
					Scanner lerScanner = new Scanner(System.in);
					
					int selecao, numero, agencia, tipo, aniversario;
					String titular;
					float saldo, limite;
						
			while (true) {

				System.out.println(Cores.TEXT_RED + Cores.ANSI_GREEN_BACKGROUND
						+"****************************************************************************");
				System.out.println("*############################ MENU ############################*");
				System.out.println("                                                                ");
				System.out.println("                   BANCO ANORA POMME                            ");
				System.out.println("                                                                ");
				System.out.println("****************************************************************");
				System.out.println("                                                                ");
				System.out.println("                1 - Cadastrar Conta                             ");
				System.out.println("                2 - Listagem com todas as Contas                ");
				System.out.println("                3 - Procurar Conta por Número                   ");
				System.out.println("                4 - Atualizar Dados da Conta                    ");
				System.out.println("                5 - Excluir a Conta                             ");
				System.out.println("                6 - Saque                                       ");
				System.out.println("                7 - Depósito                                    ");
				System.out.println("                8 - Transferência de valores entre contas       ");
				System.out.println("                9 - Sair                                        ");
				System.out.println("                                                                ");
				System.out.println("****************************************************************");
				System.out.println("Entre na a opção desejada:                                      ");
				System.out.println("                                                                " + Cores.TEXT_RESET);
				
				try {
					selecao = lerScanner.nextInt();
				}catch (InputMismatchException e) {
					System.out.println("\nDigite os valores inteiros: ");
					lerScanner.nextLine();
					selecao = 0;
					}
				
				if (selecao == 9) {
					System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + "\nBanco Anora Pomme - Evolução para o seu sucesso!");
					sobre();
				lerScanner.close();
					System.exit(0);
				}
				
				switch (selecao) {
				case 1: 
					System.out.println(Cores.TEXT_YELLOW + "Cadastrar a Conta\n\n");
					
					System.out.println("Digite o número da Agência: ");
					agencia = lerScanner.nextInt();
					System.out.println("Digite o nome do Titular: ");
					lerScanner.skip("\\R?");
					titular = lerScanner.nextLine();
					
					do {
						System.out.println("Digite o Tipo de Conta (1-CC ou 2-CP): ");
						tipo = lerScanner.nextInt();
					}while (tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Saldo da conta (R$): ");
					saldo = lerScanner.nextFloat();
					
					switch(tipo) {
						case 1: {
							System.out.println("Digite o Limite de Crédito (R$): ");
							limite = lerScanner.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
						}
						break;
						
						case 2: {
							System.out.println("Digite o dia do Aniversário da Conta: ");
							aniversario = lerScanner.nextInt();
							contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
						}
					}
					
					keyPress();
					break;
				
			    case 2:
			    	System.out.println(Cores.TEXT_CYAN + "Listagem com todas as Contas\n\n");
			    	
			    	System.out.println("\nCriar as Contas\n");
			    	
					ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 376, 1, "Débora Ramos", 156000.0f, 245000.0f);
					cc1.visualizar();
					
					ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 278, 2, "Janaína da Silva", 300000.0f, 489000.0f);
					cc2.visualizar();
					
					ContaCorrente cc3 = new ContaCorrente(contas.gerarNumero(), 488, 3, "Eduarda Nascimento", 239000.0f, 345000.0f);
					cc3.visualizar();
					
					ContaPoupanca cp4 = new ContaPoupanca(contas.gerarNumero(), 198, 4, "Talita Santana", 36000.0f, 18);
					cp4.visualizar();
					
					ContaPoupanca cp5 = new ContaPoupanca(contas.gerarNumero(), 209, 5, "Fernando Alves", 26000.0f, 13);
					cp5.visualizar();
					
					ContaPoupanca cp6 = new ContaPoupanca(contas.gerarNumero(), 387, 6, "Gilmar da Costa", 13000.0f, 15);
					cp6.visualizar();
					
			    	contas.listarTodas();
			    	keyPress();
			    	break;
			    	
			    case 3:	
			    	System.out.println(Cores.TEXT_RED_BOLD + "Procurar dados da conta - por número\n\n");
			    	
			    	System.out.println("Digite o número da Conta: ");
			    	numero = lerScanner.nextInt();
			    	
			    	contas.procurarPorNumero(numero);
			    	
			    	keyPress();
			    	break;
			    	
			    case 4:
			    	System.out.println(Cores.ANSI_PURPLE_BACKGROUND + "Atualizar Dados da Conta\n\n");
			    	
			    	keyPress();
			    	break;
			    	
			    case 5: 
			    	System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Excluir a Conta\n\n");
			    	
			    	keyPress();
			    	break;
			    	
			    case 6:
			    	System.out.println(Cores.TEXT_BLACK_BOLD + "Saque\n\n");
			    	
			    	keyPress();
			    	break;
			    	
			    case 7: 
			    	System.out.println(Cores.TEXT_YELLOW + "Depósito\n\n");
			    	
			    	keyPress();
			    	break;
			    	
			    case 8:	
			    	System.out.println(Cores.TEXT_RED + "Transferência de valores entre contas\n\n");
			    	keyPress();
			    	break;
				default:
					System.out.println(Cores.TEXT_PURPLE_BOLD + "\nOpção Inválida - Tente Novamente!\n");
					
					keyPress();
					break;
				}
			}

		}
			
			
		private static void sobre() {
			System.out.println("\n*********************************************************************");
			System.out.println("Projeto Desenvolvido por: Laura Nery ");
			System.out.println("Generation Brasil - lauran@genstudents.org");
			System.out.println("***********************************************************************");
			
		
		}
		
		public static void keyPress() {
			
			try {
				
				System.out.println(Cores.TEXT_RESET + "\nAperte o botão ENTRAR para dar andamento: ");
				System.in.read();
				
			}catch (IOException e) {
				
				System.out.println("ATENÇÃO!! ATENÇÃO!! ..... você esta apertando o botão errado. ");
				
				}

			}
		}

		
			
			