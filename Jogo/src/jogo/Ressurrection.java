package jogo;
import java.util.Scanner;
public class Ressurrection {
		static Scanner sc = new Scanner (System.in);
		static void inicio() {
			String escolha1;
			int iniciar = 0;
			do {
				System.out.println("           \n "
						+ "                      ¶¶¶¶¶¶¶\n" +
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
			
			System.out.println(" ************************ INTRODUCAO********************************"+"\n"+
					" Em um estado espiritual o Protagonista se vê fora da sua mente em um mundo paralelo e é recebido pelo orientador das almas, que informa que não esperava a sua ida para o mundo do julgamento.\r\n" + 
					"“Qual é o Seu nome infeliz Criatura?”\r\n" + 
					"\r\n" + 
					"E com isso o mesmo lança o desafio:\r\n" + 
					"\r\n" + 
					"“Se quiser Voltar para o seu mundo deve completar os desafios do meu, você terá um dia terrestre para completar, alguém para te ajudar e outro para atrapalhar, preste muita atenção e obtenha a ressurreição.”\r\n" + 
					"\r\n" + 
					"O Protagonista terá 24h para terminar todos os desafios e ter a oportunidade de viver novamente : Que o jogo comece! Start\r\n" + 
					"");

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
					 "                         | - Olá criatura desprezível, está preparado para  uma morte terrível? |                                             \n" + 
					"                          |    Sou a KumoKumo  mas pode me chamar de presságio do seu horror     |                                        \n"+
					 "                         /   ___________________________________________________________________|                                                                                                                   \n"+
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
			System.out.println("+\n"
					+ "				▄█████████▄▄▄\r\n" + 
					"               █           █\r\n" + 
					"               █    █   █  █\r\n" + 
					"               █      █    █\r\n" + 
					"               ▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n" + 
					"              ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n" + 
					"             ▄█             █▄\r\n" + 
					"           ▄▀ █       ▀      █▀▄\r\n" + 
					"      ▀▀▀▄▀   █              █  ▀▄▀▀▀ \r\n" + 
					"       ▄▀ █   █       ▀      █  █ ▀▄\r\n" + 
					"          ▀   █              █  ▀\r\n" + 
					"              █       ▀      █\r\n" + 
					"              ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n" + 
					""
					);
			sc.nextLine();
		}static void imgdesafio5() {
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

		

	

	public static void main(String[] args) {
		inicio();
	imgdesafio1();
	imgdesafio2();
	imgdesafio3();
	imgdesafio4();
	imgdesafio5();
	}
	

}
