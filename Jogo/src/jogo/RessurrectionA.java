package jogo;
import java.util.Scanner;
import java.util.*;

public class RessurrectionA {
	
	static Scanner sc = new Scanner (System.in);
	/*#############################################################################################################################################################
	 * 
	 * 
	 * 
	 * 
	 *  								Desafio 2
	 *  
	 * 
	 * 
	 * #############################################################################################################################################################
	 */		 
	static void play2() {
		int i = 1;
		boolean gm = true;
		ArrayList<Integer> resp = new ArrayList<Integer>();
	
	resp.add(20);
	resp.add(12);
	resp.add(6);
	resp.add(4);
	resp.add(2);
		
	do {
	
		Ressurrection.imgdesafio4();
	System.out.println(" Tenho 1.000 quilos de neve e o sol estÃ¡ me fazendo derreter de forma constante."+
	"\n Em cinquenta minutos mais tarde o calor irÃ¡ aumentar e o seu tempo diminuir,estarei derretendo mais rÃ¡pido. veja o quanto tempo tenho e resolva a questÃ£o e me ajude a sair desse deserto :"+
			"\n a)"+resp.get(0)+"\n b)"+resp.get(1)+"\n c)"+resp.get(2)+"\n d)"+resp.get(3)+"\n e)"+resp.get(4));
			String escolha = sc.next();
			switch (escolha) {
			
			case "a":
			case "A":
				if (resp.get(0)==4) {
					System.out.println(" ParabÃ©ns Voce Acertou! ");
					i = 3;
					gm = false;
				}
				else {
					 gm=true;
					 i=i+1;
					System.out.println(" Tente novamente! Voce tem mais uma chance !");
				}
				break;
			case "b":
			case "B":
				if (resp.get(1)==4) {
					System.out.println(" ParabÃ©ns Voce Acertou! ");
					i = 3;
					gm = false;
				}
				else {
					gm=true;
					i=i+1;
					System.out.println(" Tente novamente! Voce tem mais uma chance !");
				}
				break;
			case "c":	
			case "C":
				if (resp.get(2)==4) {
					System.out.println(" ParabÃ©ns Voce Acertou! ");
					i = 3;
					gm = false;
					}
				else {
					gm=true;
					i=i+1;
					System.out.println(" Tente novamente! Voce tem mais uma chance !");
				}
				break;
			
			case "D" :
			case "d" :
				if (resp.get(3)==4) {
					System.out.println(" ParabÃ©ns Voce Acertou! ");
					i = 3;
					gm = false;
				}
				else {
					gm=true;
					i=i+1;
					System.out.println(" Tente novamente! Voce tem mais uma chance !");
				}break;
			case "e":
			case "E":
				if (resp.get(4)==4) {
					System.out.println(" ParabÃ©ns Voce Acertou! ");
					i = 3;
					gm = false;
				}
				else {
					gm=true;
					i=i+1;;
					System.out.println(" Tente novamente! Voce tem mais uma chance !");
				}
			
								
			default : 
				
				System.out.println(" Opcao Invalida!");
				i=i+1;
				gm = true;
			}
			Collections.shuffle(resp);
	}while (i<=2
			);
		if(gm==true) {
		
		Ressurrection.gameOver();
		}
		else {
			
		play5();
	}
	
	
	}
	
	
	/*#############################################################################################################################################################
	 * 
	 * 
	 * 
	 * 
	 *  								Desafio 5
	 *  
	 * 
	 * 
	 * #############################################################################################################################################################
	 */	
	static void play5() {
		int i = 1;
	boolean gm = true;
		ArrayList<Integer> resp = new ArrayList<Integer>(); // Opcoes de respostas em um arraylist
		 resp.add(20);
		 resp.add(14);
		 resp.add(22);
		 resp.add(38);
		 resp.add(7);
		 
	
	do {
	Ressurrection.imgdesafio5();
	System.out.println("Ok mortal ansioso pela vida, aqui vai meu desafio: vocÃª estÃ¡ em ambiente inÃ³spito que inicialmente  tem 125 bactÃ©rias"+
	"\n Sabendo-se que essa populaÃ§Ã£o de bactÃ©rias dobra a cada 2 horas, o tempo necessÃ¡rio, em horas, para que o nÃºmero de bactÃ©rias cheguem a 256.000, Ã© igual a: "+
	"\n a)"+resp.get(0)+"\n b)"+resp.get(1)+"\n c)"+resp.get(2)+"\n d)"+resp.get(3)+"\n e)"+resp.get(4));
	String escolha = sc.next(); // entrada do usuario, opcao escolhida
	
	switch (escolha) { 
	
	case "a":
	case "A":
		if (resp.get(0)==22) {
			System.out.println(" ParabÃ©ns Voce Acertou! ");
			i = 3;
			gm = false;
		}
		else {
			gm=true;
			i=i+1;;
			System.out.println(" Tente novamente!");
		}
		break;
	case "b":
	case "B":
		if (resp.get(1)==22) {
			System.out.println(" ParabÃ©ns Voce Acertou! ");
			i = 3;
			gm = false;
		}
		else {
			gm=true;
			i=i+1;;
			System.out.println(" Tente novamente!");
		}
		break;
	case "c":	
	case "C":
		if (resp.get(2)==22) {
			System.out.println(" ParabÃ©ns Voce Acertou! ");
			i = 3;
			gm = false;
			}
		else {
			gm=true;
			i=i+1;;
			System.out.println(" Tente novamente!");
		}
		break;
	
	case "D" :
	case "d" :
		if (resp.get(3)==22) {
			System.out.println(" ParabÃ©ns Voce Acertou! ");
			i = 3;
			gm = false;
		}
		else {
			gm=true;
			i=i+1;;
			System.out.println(" Tente novamente!");
		}break;
	case "e":
	case "E":
		if (resp.get(4)==22) {
			System.out.println(" ParabÃ©ns Voce Acertou! ");
			i = 3;
			gm = false;
		}
		else {
			gm=true;
			i=i+1;;
			System.out.println(" Tente novamente!");
		}
	
						
	default : 
		gm=true;
		i=i+1;;
		System.out.println(" Opcao Invalida!");
		
	}
	Collections.shuffle(resp);
	
	}while(
			i<=2);
	
		if(gm==true) {
			
			Ressurrection.gameOver();
	}
		else {
			
		}
	
	}

	public static void main(String[] args) {
	play2();	
	
	}

}
