package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
	
		// Teste da Classe Conta
				Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
				c1.visualizar();
				c1.sacar(12000.0f);
				c1.visualizar();
				c1.depositar(5000.0f);
				c1.visualizar();

				Scanner leia = new Scanner(System.in);
	
	int opcao;
	
	while (true) {
		
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
		                  + "************************************************");
		System.out.println("                                                 ");
		System.out.println("                BANCO DO BRAZIL COM Z            ");     
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("           1- CRIAR UMA CONTA                    ");
		System.out.println("           2- LISTAR TODAS AS CONTAS             ");
		System.out.println("           3- BUSCAR CONTA POR NÚMERO            ");
		System.out.println("           4- ATUALIZAR DADOS DA CONTA           ");
		System.out.println("           5- APAGAR CONTA                       ");
		System.out.println("           6- SACAR                              ");
		System.out.println("           7- DEPOSITAR                          ");
		System.out.println("           8- TRANSFERIR VALORES ENTRE CONTAS    ");
		System.out.println("           9- SAIR                               ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Entre com a opção desejada:                   ");
		System.out.println("                                                 "+ Cores.TEXT_RESET);
		
		opcao = leia.nextInt();
		if(opcao ==9) {
			System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco do Brazil com Z - O seu futuro começa aqui!");
			sobre();
			leia.close();
			System.exit(0);
			}
		
		switch(opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE +"Criar Conta \n\n");
			
			break;
		case 2 :
			System.out.println(Cores.TEXT_WHITE +"Listar todas as contas \n\n");
			
			break;
		case 3 :
			System.out.println(Cores.TEXT_WHITE +"Consultar dados da conta - por número \n\n ");
			
			break;
		case 4 :
			System.out.println(Cores.TEXT_WHITE +"Atualizar dados da conta \n\n");
			
			break;
		case 5 :
			System.out.println(Cores.TEXT_WHITE +"Apagar a conta \n\n");
			
			break;
		case 6 :
			System.out.println(Cores.TEXT_WHITE +"Saque \n\n");
			
			break;
		case 7 :
			System.out.println(Cores.TEXT_WHITE +"Depósito \n\n ");
			
			break;
		case 8 :
			System.out.println(Cores.TEXT_WHITE +"Transferência entre contas \n\n");
			
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD +"\n Opção Inválida! \n");
			break;
		}
	}
}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Juliana R. S. Assi ");
		System.out.println("E-mail: juliana-3@hotmail.com");
		System.out.println("https://github.com/julianaassi");
		System.out.println("***********************************************************");
		}
}


