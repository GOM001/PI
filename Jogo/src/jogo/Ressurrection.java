package jogo;
import java.util.Scanner;
public class Ressurrection {
		static Scanner sc = new Scanner (System.in);
		static void inicio() {
			String escolha1;
			int iniciar = 0;
			do {
				System.out.println(" Ressurection e um RPG que se passa em um mundo espiritual. Onde suas escolhas podem mudar o seu caminho para sempre. Pense bem antes delas! ");
				System.out.println("           \n "
						+ "                       ¶¶¶¶¶¶¶\n" +
						"                        ¶_____¶\n" + 
						"                        ¶_____¶ \n" + 
						"                        ¶_____¶\n" + 
						"              ¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶\n" + 
						"              ¶_________________________¶                \n" + 
						"              ¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶    Baseado no anime Yu Yu Hakusho\n" + 
						"                        ¶_____¶              de Yoshihiro Togashi e no jogo \n" + 
						"                        ¶_____¶                    Undertale de Toby Fox\n" + 
						"                        ¶_____¶   \n" + 
						"                        ¶_____¶                              \n" + 
						"                        ¶_____¶                                                  \n" + 
						"                        ¶_____¶             Criado por Aurélio bispo                   \n" + 
						"                        ¶_____¶                        Felipe Anderson\n" + 
						"                        ¶_____¶                        Pedro Henrique\n" + 
						"                       ████████                        Pedro Gomes\n" + 
						"                     ▄▀░░░░░░░░▀▄                                          \n" + 
						"                   ▄▀░░░░░░░░░░░░▀▄\n" + 
						"                 ▄▀░░░░░░░░░░░░░░░░▀▄                                             \n" + 
						"                 █░█▀▄░░░░▄▀▀▀▀▀▄░░░█\n" + 
						"                 █░█  ▀▄▄▀    ▀  ▀▄░█\n" + 
						"                 █░█  ▄▀▀▄       ▄▀░█               † Resurrection †\n" + 
						"                 █░█▄▀░░░░▀▄▄▄▄▄▀░░░█\n" + 
						"                 █░░░░░░░░░░░░░░░░░░█\n" + 
						"                 █░░░░░░░░░░░░░░░░░░█\n" + 
						"                 █░░░░░░░░░░░░░░░░░░█\n" + 
						" ________________█░░░░░░░░░░░░░░░░░░█____________________________________\n" + 
						"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" + 
						"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" + 
						"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" + 
						"");
			
			System.out.println(" Digite 'Sim' para continuar : ");
			escolha1 = sc.next();
			switch (escolha1) {
			case "Sim" :
			case "sim" :	
				iniciar = 1;
				break;
			default :
								System.out.println(" Escolha invalida, digite Sim para iniciar o Jogo! ");
			}
			
			
			} while(iniciar != 1);
				
		}
		
		static void menu () {
			int opcao;
			do {
				System.out.println("1 - Instruções");
				System.out.println("2 - Jogar");
				System.out.println("3 - Créditos");
				System.out.println("4 - Sair");
				System.out.print("Escolha uma opção: ");
				opcao = sc.nextInt();
				switch (opcao) {
					case 1:
						System.out.println("Você escolheu a opção Instruções");
						introducao();
						break;
					case 2:
						System.out.println("Você escolheu a opção Jogar");
						break;
					case 3:
						System.out.println("\nVocê escolheu a opção Créditos\n\n"
								+ "Criado por Aurélio bispo, Felipe Anderson, Pedro Henrique e Pedro Gomes.\n"
								+ "Baseado no anime Yu Yu Hakusho de Yoshihiro Togashi e no jogo Undertale de Toby Fox\n\n");
						break;
					case 4:
						System.out.println("Você escolheu a opção Sair");
						inicio();
						break;
					default:
						System.out.println("Opção inválida!");
				}
			} while (opcao != 4);
			
		}
		static void introducao() {
			
			System.out.println(" ******************************* INTRODUCAO*************************************");

			sc.nextLine();
			
			
		}
		
		static void imgdesafio1() {
			
			System.out.println("\n"
					+ "                  _____________________________________________________________________________________    \n "+
					"                |                                                                                     |                               \n"+
					 "                 |     Pobre mortal, que aqui veio parar seu primeiro desafio deve completar.          |                             \n" + 
					"                 |   Pela ponte de madeira você deve passar, mas deve tomar cuidado onde irá pisar.    |                                \n" + 
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
					"");
			
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
					"");
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
					"");
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
					"");
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
					
					"");
			sc.nextLine();
		}

		
static void gameOver() {
	System.out.println(""
			+ "\r\n" + 
			" ▄█▀▀▀▀▀ ▄██▀██▄ ██▄ ▄██ ██▀▀▀\r\n" + 
			"██   ▄▄▄ ██▄▄▄██ ██▀█▀██ ██▀▀\r\n" + 
			" ▀█▄▄▄██ ██   ██ ██   ██ ██▄▄▄\r\n" + 
			"\r\n" + 
			"▄█▀▀▀▀█▄ ██   ██ ██▀▀▀ ██▀▀█▄\r\n" + 
			"██    ██ ██   ██ ██▄▄  ██▄▄██\r\n" + 
			"██    ██ ▀██▄██▀ ██    ██▀█▄\r\n" + 
			"▀█▄▄▄▄█▀   ▀█▀   ██▄▄▄ ██ ▀█▄\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"");
}
	

	public static void main(String[] args) {
		inicio();
		menu();
		introducao();
	imgdesafio1();
	imgdesafio2();
	imgdesafio3();
	imgdesafio4();
	imgdesafio5();
	gameOver();
	}
	

}