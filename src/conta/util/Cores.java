package conta.util;

import java.util.Scanner;

public class Cores {
		
		//Reset Color
		public static final String TEXT_RESET = "\u001B[0m";

		//Text Color
		public static final String TEXT_BLACK = "\u001B[30m";
		public static final String TEXT_RED = "\u001B[31m";
		public static final String TEXT_GREEN = "\u001B[32m";
		public static final String TEXT_YELLOW = "\u001B[33m";
		public static final String TEXT_BLUE = "\u001B[34m";
		public static final String TEXT_PURPLE = "\u001B[35m";
		public static final String TEXT_CYAN = "\u001B[36m";
		public static final String TEXT_WHITE = "\u001B[37m";

		//Text Color Bold
		public static final String TEXT_BLACK_BOLD = "\033[1;30m";
		public static final String TEXT_RED_BOLD = "\033[1;31m";
		public static final String TEXT_GREEN_BOLD = "\033[1;32m";
		public static final String TEXT_YELLOW_BOLD = "\033[1;33m"; 
		public static final String TEXT_BLUE_BOLD = "\033[1;34m";
		public static final String TEXT_PURPLE_BOLD = "\033[1;35m";
		public static final String TEXT_CYAN_BOLD = "\033[1;36m";
		public static final String TEXT_WHITE_BOLD = "\033[1;37m";

		//Reset Text Underline
		public static final String TEXT_BLACK_UNDERLINED = "\033[4;30m"; 
		public static final String TEXT_RED_UNDERLINED = "\033[4;31m"; 
		public static final String TEXT_GREEN_UNDERLINED = "\033[4;32m"; 
		public static final String TEXT_YELLOW_UNDERLINED = "\033[4;33m"; 
		public static final String TEXT_BLUE_UNDERLINED = "\033[4;34m"; 
		public static final String TEXT_PURPLE_UNDERLINED = "\033[4;35m"; 
		public static final String TEXT_CYAN_UNDERLINED = "\033[4;36m"; 
		public static final String TEXT_WHITE_UNDERLINED = "\033[4;37m"; 
				
		// Text Color High Intensity
		public static final String TEXT_BLACK_BRIGHT = "\033[0;90m";  
		public static final String TEXT_RED_BRIGHT = "\033[0;91m";    
		public static final String TEXT_GREEN_BRIGHT = "\033[0;92m";  
		public static final String TEXT_YELLOW_BRIGHT = "\033[0;93m"; 
		public static final String TEXT_BLUE_BRIGHT = "\033[0;94m";  
		public static final String TEXT_PURPLE_BRIGHT = "\033[0;95m"; 
		public static final String TEXT_CYAN_BRIGHT = "\033[0;96m";   
		public static final String TEXT_WHITE_BRIGHT = "\033[0;97m";  

		// Text Color Bold High Intensity
		public static final String TEXT_BLACK_BOLD_BRIGHT = "\033[1;90m"; 
		public static final String TEXT_RED_BOLD_BRIGHT = "\033[1;91m";   
		public static final String TEXT_GREEN_BOLD_BRIGHT = "\033[1;92m"; 
		public static final String TEXT_YELLOW_BOLD_BRIGHT = "\033[1;93m";
		public static final String TEXT_BLUE_BOLD_BRIGHT = "\033[1;94m";  
		public static final String TEXT_PURPLE_BOLD_BRIGHT = "\033[1;95m";
		public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m";  
		public static final String TEXT_WHITE_BOLD_BRIGHT = "\033[1;97m"; 

		// Background Color
		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
				
		// Background Color High Intensity
		public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
		public static final String ANSI_RED_BACKGROUND_BRIGHT = "\033[0;101m";
		public static final String ANSI_GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
		public static final String ANSI_YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
		public static final String ANSI_BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
		public static final String ANSI_PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; 
		public static final String ANSI_CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  
		public static final String ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m";

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int selecao;

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
			System.out.println("                                             " + Cores.TEXT_RESET);
			
			selecao = lerScanner.nextInt();
			
			if (selecao == 9) {
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nBanco Anora Pomme - Evolução para o seu sucesso!");
				sobre();
			lerScanner.close();
				System.exit(0);
			}
			
			switch (selecao) {
			case 1: 
				System.out.println(Cores.TEXT_YELLOW + "Cadastrar a Conta\n\n");
				
				break;
			
		    case 2:
		    	System.out.println(Cores.TEXT_CYAN +"Listagem com todas as Contas\n\n");
		    	
		    	break;
		    	
		    case 3:	
		    	System.out.println(Cores.TEXT_RED_BOLD + "Procurar Conta por Número\n\n");
		    	
		    	break;
		    	
		    case 4:
		    	System.out.println(Cores.ANSI_PURPLE_BACKGROUND + "Atualizar Dados da Conta\n\n");
		    	
		    	break;
		    	
		    case 5: 
		    	System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Excluir a Conta\n\n");
		    	
		    	break;
		    	
		    case 6:
		    	System.out.println(Cores.TEXT_BLACK_BOLD + "Saque\n\n");
		    	
		    	break;
		    	
		    case 7: 
		    	System.out.println(Cores.TEXT_YELLOW + "Depósito\n\n");
		    	
		    	break;
		    	
		    case 8:	
		    	System.out.println(Cores.TEXT_RED + "Transferência de valores entre contas\n\n");
		    	
		    	break;
			default:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nOpção Inválida - Tente Novamente!\n");
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

}
