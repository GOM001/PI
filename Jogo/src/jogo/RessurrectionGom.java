package jogo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class RessurrectionGom {
/*#############################################################################################################################################################
 * 
 * 
 * 
 * 								MÉTODOS DE BASE COM GRANDE UTILIZAÇÃO
 * 
 * 
 * 
 *#############################################################################################################################################################
 */
		//VARIÁVEIS EM ESCOPO GLOBAL
		static String [] login =  new String [5];
		static int [] fase = new int [5];
	
	
		//DEFINIÇÃO ESTÁTICA DO MÉTODO SCANNER
		static Scanner sc = new Scanner (System.in);
		
		
		// MÉTODO PARA DEFINIR QUANTIDADE DE LINHAS PULADAS
		static void centro(int n) {
			for (int i = 0; i < n; i++) {
				System.out.print("\n");
			}
		}
		
		
		//MÉTODO PARA DIGITAR ENTER PARA CONTINAR
		static void continuar() {
			System.out.println(" Digite Enter para continuar\n");
			sc.nextLine();
		}
		
		//MÉTODO PARA DRIBLAR FALHA NO CONTINUAR
				static void drible() {
					sc.nextLine();
				}
		
/* #############################################################################################################################################################
 * 
 * 
 * 
 * 									INICIO DO JOGO E MENU
 * 
 * 
 * 
 * #############################################################################################################################################################
 */

			//MÉTODO PARA CHAMAR INICIO E MENU (ZERO)
			static int zero() {
				//login[0] = "GOM";
				//login[1] = "GOMII";
				//fase[0] = 1;
				int parada = 0;
				do {
					inicio();
					do {
					parada = menu();
					if (parada == 2) {
						return 2;
					}else {
					if(parada != 4) {
					sc.nextLine();
					System.out.println("Tecle Enter Para Voltar ao Menu Inicial" +
									   "\n");
					sc.nextLine();
						}
					}
					}while(parada != 4);
				}while(parada == 4);
				return 0;
			}				
				

		//MÉTODO PARA INICIO DO JOGO
		static void inicio() {
				centro(1);
				System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"
						+"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶¶¶¶¶¶¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_________________________¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░† Resurrection †░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+ 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░¶_____¶░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▀▒▒▒▒▒▒▒▒▀▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▀▒▒▒▒▒▒▒▒▒▒▒▒▀▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒█▀▄▒▒▒▒▄▀▀▀▀▀▄▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒█  ▀▄▄▀    ▀  ▀▄▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒█  ▄▀▀▄       ▄▀▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒█▄▀▒▒▒▒▀▄▄▄▄▄▀▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" + 
						"");
			centro(4);
			continuar();				
		}

		
		// MENU INICIAL DO JOGO
		static int menu () {
			int parada = 0; //VARIÁVEL DA FUNÇÃO PARADA PARA O JOGO
			int salve = controlador(login, fase);
			if (salve == 0){
			String opcao = opcoes1();
				switch (opcao) {
					case "1":
						instrucao();			
						break;
					case "2":
						centro(15);
						System.out.println("Você escolheu a opção Jogar");
						centro(17);
						parada = 2;
						break;
					case "3":
						creditos();
						break;
					case "4":
						centro(15);
						System.out.println("								Você escolheu a opção Sair");
						centro(1);
						System.out.println("								Tecle Enter para confirmar");
						centro(16);
						drible();
						parada = 4;
						break;
					default:
						centro(15);
						System.out.println("Opção inválida!");
						centro(19);
						break;
				}
			}else{
				String opcao = opcoes2();
				switch (opcao) {
				case "1":
					continuarJogo();			
					break;
				case "2":
					instrucao();			
					break;
				case "3":
					centro(15);
					System.out.println("Você escolheu a opção Jogar");
					centro(17);
					parada = 2;
					break;
				case "4":
					creditos();
					break;
				case "5":
					centro(15);
					System.out.println("								Você escolheu a opção Sair");
					centro(1);
					System.out.println("								Tecle Enter para confirmar");
					centro(16);
					drible();
					parada = 4;
					break;
				default:
					centro(15);
					System.out.println("Opção inválida!");
					centro(19);
					break;
			}
			}
			return parada;
		}
		
		// MÉTODO PARA VERIFICAR SE HÁ ALGUM JOGO SALVO
		static int controlador(String [] login, int [] fase) {
			int salvo = 0;
			for (int i = 0; i < login.length; i++) {
				if (login[i] != null) {
					salvo = 1;
				}
			}
			return salvo;
		}
			
/*#############################################################################################################################################################
 * 
 * 
 * 
 * 								MÉTODOS COM O CONTEÚDO DO MENU
 * 
 * 
 * 
 * #############################################################################################################################################################
 */
		//OPÇÕES 1 - MENU SEM SALVE
		static String opcoes1() {
			String opcao;
			centro(14);
				System.out.println(
			" 								       Menu	      \n" +
			"								1 - Instruções    \n" +
			"								2 - Jogar         \n" +
			"								3 - Créditos      \n" +
			"								4 - Sair          \n" +
			"								Escolha uma opção:\n"
									);
			centro(14);
			opcao = sc.next();
			return opcao;
		}
		
		
		//OPÇÕES 2 - MENU COM SALVE
		static String opcoes2() {
			String opcao;
			centro(14);
				System.out.println(
			" 								       Menu	      \n" +
			"								1 - Continuar     \n" +
			"								2 - Instruções    \n" +
			"								3 - Jogar         \n" +
			"								4 - Créditos      \n" +
			"								5 - Sair          \n" +
			"								Escolha uma opção:\n"
									);
			centro(13);
			opcao = sc.next();
			return opcao;
		}
		
		// CRÉDITOS
		static void creditos() {
			centro(15);
			System.out.println("\nVocê escolheu a opção Créditos\n\n"+
					 "Criado por Aurélio bispo, Felipe Anderson, Pedro Henrique e Pedro Gomes.\n"+
					 "Baseado no anime Yu Yu Hakusho de Yoshihiro Togashi e no jogo Undertale de Toby Fox\n\n");
			centro(19);
		}
		
		//INSTRUÇÕES DO JOGO
		static void instrucao() {
			centro(15);
			System.out.println(
			"                                 \n Você escolheu a opção Instruções\n\n" +
			"    Ressurection e um RPG que se passa em um mundo espiritual;\n " +
			"    Onde suas escolhas podem mudar o seu caminho para sempre. Pense bem antes delas!\n\n");
							
			centro(17);
		}
		
/*#############################################################################################################################################################
 * 
 * 
 * 
 * 
 *  								METODOS PARA O JOGO
 *  
 * 
 * 
 * #############################################################################################################################################################
 */
		
		//METODO ENCONTRAR POSIÇÃO LIVRE EM LOGIN
		static int posicaoLivre() {
			for (int i = 0; i < login.length; i++) {
				if (login[i] == null){
					return i;
				}
			}
			return -1;
		}
		
		// METODO JOGAR
		static void jogar() {
			System.out.println("Jogar");
			int posicaoLogin = posicaoLivre();
			String loginAtual = login[posicaoLogin];
			int faseAtual = fase[posicaoLogin];
			switch (faseAtual) {
			case 0:
				desafio1();
				desafio4();
				break;

			default:
				break;
			}
		}
		
		//METODO CONTINUAR JOGO
		static void continuarJogo() {
			centro(15);
			System.out.println("Continuar Jogo");
			System.out.println("\n						Selecione o Jogador");
			for (int i = 0; i < login.length; i++) {
				if (login[i] != null) {
				System.out.println("							"+ (i+1) +" - "+ login[i]);
				}
				else {
					System.out.println("");
				}
			}
			
			centro(15);
		}
		
		
		static void introducao() {
			
			System.out.println(" ******************************* INTRODUCAO*************************************");

			sc.nextLine();
			
			
		}
		
		
/*#############################################################################################################################################################
 * 
 * 
 * 
 * 
 *  								CENAS DO JOGO
 *  
 * 
 * 
 * #############################################################################################################################################################
 */	
		
///////////////////////////////////////// PRIMEIRO DESAFIO DO JOGO /////////////////////////////////

	static void desafio1() {

		String r = "";
		String resp = "";
		String lul = "número do pulo + 2";
		int n1 = 0;
		ArrayList<String> resposta = new ArrayList<String>();
		resposta.add("número do pulo + 3");
		resposta.add("número do pulo * 3");
		resposta.add("número do pulo * 2");
		resposta.add("número do pulo + 2"); // como não sei qual é a resposta correta levei que seria essa

		do {
			System.out.println("Qual alternativa está correta? ");

			Collections.shuffle(resposta);
			System.out.println("A)" + resposta.get(0));
			System.out.println("B)" + resposta.get(1));
			System.out.println("C)" + resposta.get(2));
			System.out.println("D)" + resposta.get(3));

			r = sc.next();

			// (A) - número do pulo + 3
			// (B) - número do pulo * 3
			// (C) - número do pulo * 2
			// (D) - número do pulo + 2

			switch (r) {
			case "a":
			case "A":

				resp = resposta.get(0);
				break;
			case "b":
			case "B":

				resp = resposta.get(1);
				break;
			case "c":
			case "C":

				resp = resposta.get(2);
				break;
			case "d":
			case "D":

				resp = resposta.get(3);
				break;

			default:
				System.out.println("Alternativa inválida");
			}

			if (lul.equals(resp)) {
				System.out.println("Resposta correta!");
				n1 = n1 + 2;

			} else {
				System.out.println("Resposta incorreta!");
			}
		} while (n1 <= 1);

	}
	
///////////////////////////////////////// SEGUNDO DESAFIO DO JOGO /////////////////////////////////

	static void desafio4() {
		int i = 1;

		ArrayList<Integer> resp = new ArrayList<Integer>();

		resp.add(20);
		resp.add(12);
		resp.add(6);
		resp.add(4);
		resp.add(2);

		do {
			i = i + 1;
			imgdesafio4();
			System.out.println(" Tenho 1.000 quilos de neve e o sol está me fazendo derreter de forma constante."
					+ "\n Em cinquenta minutos mais tarde o calor irá aumentar e o seu tempo diminuir,estarei derretendo mais rápido. veja o quanto tempo tenho e resolva a questão e me ajude a sair desse deserto :"
					+ "\n a)" + resp.get(0) + "\n b)" + resp.get(1) + "\n c)" + resp.get(2) + "\n d)" + resp.get(3)
					+ "\n e)" + resp.get(4));
			String escolha = sc.next();
			switch (escolha) {

			case "a":
			case "A":
				if (resp.get(0) == 4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				} else {

					System.out.println(" Tente novamente!");
				}
				break;
			case "b":
			case "B":
				if (resp.get(1) == 4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				} else {

					System.out.println(" Tente novamente!");
				}
				break;
			case "c":
			case "C":
				if (resp.get(2) == 4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				} else {

					System.out.println(" Tente novamente!");
				}
				break;

			case "D":
			case "d":
				if (resp.get(3) == 4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				} else {

					System.out.println(" Tente novamente!");
				}
				break;
			case "e":
			case "E":
				if (resp.get(4) == 4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				} else {

					System.out.println(" Tente novamente!");
				}

			default:

				System.out.println(" Opcao Invalida!");
				i = 3;
			}
			Collections.shuffle(resp);
		} while (i < 3);

	}

		static void imgdesafio1() {
			
			System.out.println("\n"
					+ "\n"
					+ "\n"
					+ "                  _____________________________________________________________________________________    \n "+
					"                |                                                                                     |                               \n"+
					 "                 |     Pobre mortal, que aqui veio parar seu primeiro desafio deve completar.          |                             \n" + 
					"                 |   Pela ponte de madeira você deve passar, mas deve tomar cuidado onde irá pisar.    |                                \n" + 
					"                 |   __________________________________________________________________________________|                                                       \n"+
					 "                 /                                                                                                                                      \n"+
					"                /                                   \n" + 
					"                                                                                                           \n" + 
					"                                                                                                                               \n"+
					" ░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░          01     02      03      04     05      06      07     08      09                                                                      \n" + 
					" ░░░░█░░░░░░░░░░░░░█░░░░                                                                                                                           \n"+
					" ░░░█░░░░░░░░░░▄▄▄░░█░░░                                                                                            \n" + 
					" ░░░█░░▄▄▄░░▄░░███░░█░░░                                                                                                                             \n"+
					" ░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░                                                                                                  \n" + 
					" ░░░█░░▀█▀█▀█▀█▀█▀░░█░░░        ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                                         \n"+
					" ░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░        ██████ ██████          ██████ ██████  ██████  ██████ ██████  ██████                                                           \n" + 
					" ░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░        ██████ ██████  ██████  ██████ ██████          ██████ ██████                                                                                       \n"+
					" ▄▀░▄▄▀▄▄▀▀▀▄▀▀▀▄▄▀▄▄░▀▄        ██████ ██████  ██████  ██████ ██████          ██████ ██████  ██████                                                           \n" + 
					" █░░░░▀▄░█▄░░░▄█░▄▀░░░░█        ██████ ██████          ██████ ██████  ██████  ██████ ██████  ██████                                                                       \n"+
					" ░▀▄▄░█░░█▄▄▄▄▄█░░█░▄▄▀░        ██████ ██████          ██████ ██████  ██████  ██████ ██████                                                        \n" + 
					" ░░░▀██▄▄███████▄▄██▀░░░        ██████ ██████  ██████  ██████ ██████          ██████ ██████                                                                 \n"+
					" ░░░████████▀████████░░░        ██████ ██████  ██████  ██████ ██████          ██████ ██████  ██████                                                           \n" + 
					" ░░▄▄█▀▀▀▀█░░░█▀▀▀▀█▄▄░         ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                  \n"+
					" ░░▀▄▄▄▄▄▀▀░░░▀▀▄▄▄▄▄▀░░        ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                 \n" + 
					"\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "");
			
			sc.nextLine();
		
		System.out.println("\n"
				+"\n"
				+"\n"
				+ "                  _____________________________________________________________________________________    \n "+
				"                |                                                                                     |                               \n"+ 
				"                 |   As firmes madeiras estão sempre em par porém entre elas você terá que pular,      |                                \n" + 
				"                 |  preste atenção em como separadas estão e selecion e então a correta opção.         |                             \n" + 
				"                 |   __________________________________________________________________________________|                                                       \n"+
				 "                 /                                                                                                                                      \n"+
				"                /                                   \n" + 
				"                                                                                                           \n" + 
				"                                                                                                                               \n"+
				" ░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░          01     02      03      04     05      06      07     08      09                                                                      \n" + 
				" ░░░░█░░░░░░░░░░░░░█░░░░                                                                                                                           \n"+
				" ░░░█░░░░░░░░░░▄▄▄░░█░░░                                                                                            \n" + 
				" ░░░█░░▄▄▄░░▄░░███░░█░░░                                                                                                                             \n"+
				" ░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░                                                                                                  \n" + 
				" ░░░█░░▀█▀█▀█▀█▀█▀░░█░░░        ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                                         \n"+
				" ░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░        ██████ ██████          ██████ ██████  ██████  ██████ ██████  ██████                                                           \n" + 
				" ░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░        ██████ ██████  ██████  ██████ ██████          ██████ ██████                                                                                       \n"+
				" ▄▀░▄▄▀▄▄▀▀▀▄▀▀▀▄▄▀▄▄░▀▄        ██████ ██████  ██████  ██████ ██████          ██████ ██████  ██████                                                           \n" + 
				" █░░░░▀▄░█▄░░░▄█░▄▀░░░░█        ██████ ██████          ██████ ██████  ██████  ██████ ██████  ██████                                                                       \n"+
				" ░▀▄▄░█░░█▄▄▄▄▄█░░█░▄▄▀░        ██████ ██████          ██████ ██████  ██████  ██████ ██████                                                        \n" + 
				" ░░░▀██▄▄███████▄▄██▀░░░        ██████ ██████  ██████  ██████ ██████          ██████ ██████                                                                 \n"+
				" ░░░████████▀████████░░░        ██████ ██████  ██████  ██████ ██████          ██████ ██████  ██████                                                           \n" + 
				" ░░▄▄█▀▀▀▀█░░░█▀▀▀▀█▄▄░         ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                  \n"+
				" ░░▀▄▄▄▄▄▀▀░░░▀▀▄▄▄▄▄▀░░        ██████ ██████  ██████  ██████ ██████  ██████  ██████ ██████  ██████                                                                 \n" + 
				"\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "");
		
		sc.nextLine();
		}
		static void imgdesafio2() {
			System.out.println("\n"
					+"                           ______________________________________________________________________                                             \n"+
					"                          |                                                                      |\n"+
					 "                          | - Olá criatura desprezível, está preparado para  uma morte terrível? |                                             \n" + 
					"                          |    Sou a KumoKumo  mas pode me chamar de presságio do seu horror     |                                        \n"+
					 "                          /   ___________________________________________________________________|                                                                                                                   \n"+
					"                         /                          \\_*_____/                                                                                   \r\n" + 
					"                                                    /\\*_|__/\\                                                                                   \n"+
					"░▄████░▀▄░░░░░░░▄▀░█████▄░                         / /\\_|*/\\ \\                                                                                \r\n" +
					"████▀█▀▄█████████▄▀█▀████░                       _/_/_/\\|/\\_*_\\_                                                                              \n"+
					"▀▀░▀▄█████▀▀▀▀▀░▀███▄▀░▀▀░                        \\ \\ \\/|\\* / /                                                                               \r\n" + 
					"░░░░████▀▄░░██░░▄░███░░░░░                         * \\/_|*\\/ /                                                                                 \n"+
					"░░░▄███▀▄▀▀░▀▀░▀▀▄▀██▄░░░░                          \\/__|__\\/         \\*__*_|_*___/                                                             \r\n" + 
					"░▄▄████░███▄░░▄███░███▄▄░░                          /       \\         /\\____|____/\\                                                             \r\n" + 
					"░░█████░░▀▀░░░░▀▀░░████░░░                                           / /\\___|__*/\\ \\                                                           \r\n" + 
					"░░░▀▀███▄░▀▄▀▀▄▀░▄██▀▀░░░░           \\____|____/                    / * /\\_*|__/\\ \\ \\                                                            \r\n" + 
					"░░░░░░░░░▀▄▄░░▄▄█░░░░░░░░░           *\\___|_*_/\\                   / / / /\\_|_/\\ * \\ \\                                                             \r\n" + 
					"░░░░░░░░▄▀▀▄▀▀▄▀▀▄░░░░░░░░          / /\\*_|_ /\\ \\               __/_*_/_/*/\\|/*_\\_\\_*_\\_                                                                  \r\n" + 
					"░▄▄▄▄▄▀▀▀██░▄▄░██▀▀▀▄▄▄▄▄░         / / /\\_|_/\\ \\ \\                \\ * \\ \\ \\/|\\/ / / / /                                                             \r\n" + 
					"▀▄▄▀░░░▄▀█▀█▀▀█▀█▀▄░░░▀▄▄▀      __/_/_*_/\\|/\\_\\_\\*\\__              \\ \\ \\ \\/_|_\\/ * / /                                                              \r\n" + 
					"░░▄▄▄▄▀▄█▀░▄░░▄░▀█▄▀▄▄▄▄░░        \\ \\ \\ \\/|\\/ / / /                 * \\ \\/__|__\\/ / /                                                             \r\n" + 
					"░▀▄▄▀░▄▀█░░▄▄▄▄░░█▀▄░▀▄▄▀░         * \\ \\/_|_\\/ * /                   \\ */___|_*_\\/ /                                                           \r\n" + 
					"░░░░░█▀▄░▀▄▀░░▀▄▀░▄▀█░░░░░          \\ \\/__|*_\\/ /                     \\/_*__|____\\*                                                            \r\n" + 
					"░░░░░█▄▀░░█▄░░▄█░░▀▄█░░░░░           \\/_*_|___\\/                      /     |     \\                                                            \r\n" + 
					"░░░░░░░░░▄█▀░░▀█▄░░░░░░░░░           /    |    \\                                                                                                  \r\n" + 
					"\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "");
			sc.nextLine();
		}
		static void imgdesafio3() {
			System.out.println("\n "
					+ "         ▄▀▄     ▄▀▄\r\n" + 
					"         ▄█░░▀▀▀▀▀░░█▄\r\n" + 
					"     ▄▄  █░░░░░░░░░░░█  ▄▄\r\n" + 
					"    █  █ █░░▀░░┬░░▀░░█ █  █\r\n" + 
					"  ▄▄███████████████████████▄▄\r\n" + 
					" █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\r\n" + 
					"█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\r\n" + 
					"█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\r\n" + 
					"█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\r\n" + 
					"████████████████████████████████\r\n" + 
					"\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "");
			sc.nextLine();
		}
		static void imgdesafio4() {
			System.out.println("   \n              "
					+"              _________________________________________________________________________________________________                                                                                                           \n"+
					"                           |                                                                                                 |  \n"+
					"                           |   Ola alma perdida, voce veio meio socorrer? estou perdido no deserto e preciso voltar ao meu   |       \n"+
					"                           | habitart de neve. Se consegui me ajudar ira continuar sua jornada a sua recompensa,             |             \n"+
					"                           | caso contrario eu irei desaparecerei e vc ficara nesse deserto por toda a eternidade.           |        \n"+
					"                           | a Charada e encontre a resposta de em quanto tempo irei derreter e o guardiao das almas         |             \n"+
					"                           | ira permitir a nossa passagem para meu habitart.                                                |          \n"+
					"                           |  _______________________________________________________________________________________________|          \n"+
					"                           /                                                                                                             \n"+
					"                ▄▄▄▄▄▄▄▄▄                         Volume             /                                                                                   \n"+
					"                █████████                      2.400  |-------------/                                                                                              \n"+
					"               ███████████▄▄                          |            / |                                                                                \n" + 
					"               █░░░░░░░░░░░█                          |           /  |                                                                   \r\n" + 
					"               █░░░░█░░░█░░█                          |          /   |                                                               \r\n" + 
					"               █░░░░░░█░░░░█                    2.000 |---------/    |                                                               \r\n" + 
					"               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                         |       / |    |                                                                  \r\n" + 
					"              ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                        |      /  |    |                                                                 \r\n" + 
					"             ▄█░░░░▓▓▓░▓▓▓░░░█▄                       |     /   |    |                                                                 \r\n" + 
					"           ▄▀ █░░░░▓▓░▀░▓▓░░░█▀▄                      |    /    |    |                                                                \r\n" + 
					"      ▀▀▀▄▀   █░░░░░░░░░░░░░░█  ▀▄▀▀▀                 |   /     |    |                                                               \r\n" + 
					"       ▄▀ █   █░░░░░░░▀░░░░░░█  █ ▀▄                  |  /      |    |                                                             \r\n" + 
					"          ▀   █░░░░░░░░░░░░░░█  ▀                     | /       |    |                                                         \r\n" + 
					"              █░░░░░░░▀░░░░░░█                  1.000 |/        |    |                                 \r\n" + 
					"              ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                    ____|_________|____|_______________                                                                          \r\n" + 
					"                                                     0|        50    75         Tempo                                                                                 \n"+
					"\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "");
			sc.nextLine();
		}
		
		static int desafioboneco() {
			int fase =  0;
			String escolha;
			int cont = 1;
			
			System.out.println(" Informe sua resposta : ");
			escolha = sc.next();
			do {
				System.out.println(" Em quantos litros por minuto, o derretimento do boneco? ");
				
				switch (escolha) {
				
				case "a":
				case "A":
				case "b":
				case "B":
				case "c":	
				case "C":
				case "e":
				case "E":
					System.out.println(" Voce Errou... ");
					gameOver();
					break;
				case "D" :
				case "d" :
					cont = 3;
					fase = 4;
					break;
					
				default : 
					
					System.out.println(" Opcao Invalida!");
				}
					
			}while(cont<=2);
			
			return fase;
			
			
		}
		
		static void imgdesafio5() {
			System.out.println("\n"
				+   "█████████████▀▀▀▀▀███████▀▀▀▀▀█████████████\r\n" + 
					"█████████▀░░▀▀█▄▄▄▄▄▄██▄▄▄▄▄▄█▀░░▀█████████\r\n" + 
					"████████▄░░▄▄████▀▀▀▀▀▀▀▀▀████▄▄░░▄████████\r\n" + 
					"████▀▀▀▀█████▀░░░░░░░░░░░░░░░▀█████▀▀▀▀████\r\n" + 
					"██▀░░░░░░██▀░░░░░░██░░░██░░░░░░▀██░░░░░░▀██\r\n" + 
					"█░░░▀▀▀▀███░░░░░░░██░░░██░░░░░░░███▀▀▀▀░░░█\r\n" + 
					"█▄▄░░░░░░██░░░░▄░░▀▀░░░▀▀░░▄░░░░██░░░░░░▄▄█\r\n" + 
					"████▄░░░░▀██░░░░███████████░░░░██▀░░░░▄████\r\n" + 
					"██████████▀██▄░░░▀███████▀░░░▄██▀██████████\r\n" + 
					"███████▀░░░████▄▄░░░░░░░░░▄▄████░░░▀███████\r\n" + 
					"██████░░░▄▀░░▀▀▀███████████▀▀▀░░▀▄░░░██████\r\n" + 
					"██████░░░▀░░░░░░░░▄▄▄█▄▄▄░░░░░░░░▀░░░██████\r\n" + 
					"████████▄▄▄▄▄▄███████████████▄▄▄▄▄▄████████\r\n" + 
					"██████████████████▀░░▀█████████████████████\r\n" + 
					"█████████████████▀░░░▄█████████████████████\r\n" + 
					"█████████████████░░░███████████████████████\r\n" + 
					"██████████████████░░░▀█████████████████████\r\n" + 
					"███████████████████▄░░░████████████████████\r\n" + 
					"█████████████████████░░░███████████████████\r\n" + 
					
					"\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "");
			sc.nextLine();
		}

		
static void gameOver() {
	System.out.println(""
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ ""
			+ "\r\n" + 
			"                                                       ▄█▀▀▀▀▀  ▄██▀██▄ ██▄ ▄██ ██▀▀▀\r\n" + 
			"                                                       ██   ▄▄▄ ██▄▄▄██ ██▀█▀██ ██▀▀\r\n" + 
			"                                                        ▀█▄▄▄██ ██   ██ ██   ██ ██▄▄▄\r\n" + 
			"\r\n" + 
			"                                                       ▄█▀▀▀▀█▄ ██   ██ ██▀▀▀ ██▀▀█▄\r\n" + 
			"                                                       ██    ██ ██   ██ ██▄▄  ██▄▄██\r\n" + 
			"                                                       ██    ██ ▀██▄██▀ ██    ██▀█▄\r\n" + 
			"                                                       ▀█▄▄▄▄█▀   ▀█▀   ██▄▄▄ ██ ▀█▄\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "\n"
			+ "");
}
	

	public static void main(String[] args) {
	int inicio = zero();
	if (inicio == 2){
		jogar();
	}
	else if (inicio == 3) {
		continuarJogo();
	}
	/*introducao();
	imgdesafio1();
	imgdesafio2();
	imgdesafio3();
	imgdesafio4();
	imgdesafio5();
	gameOver();
	*/
	}
	

}
