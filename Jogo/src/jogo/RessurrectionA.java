package jogo;
import java.util.Scanner;
import java.util.*;

public class RessurrectionA {
	
	static Scanner sc = new Scanner (System.in);
	 
	static void play4() {
		int i = 1;
	ArraysList<Integer> resp = new ArrayList<Integer>();
	
	resp.add(20);
	resp.add(12);
	resp.add(6);
	resp.add(4);
	resp.add(2);
		
	do {
	i = i+1;
	//desafio4.imgboneco();
	System.out.println(" Tenho 1.000 quilos de neve e o sol está me fazendo derreter de forma constante."+
	"\n Em cinquenta minutos mais tarde o calor irá aumentar e o seu tempo diminuir,estarei derretendo mais rápido. veja o quanto tempo tenho e resolva a questão e me ajude a sair desse deserto :"+
			"\n a)"+resp.get(0)+"\n b)"+resp.get(1)+"\n c)"+resp.get(2)+"\n d)"+resp.get(3)+"\n e)"+resp.get(4));
			String escolha = sc.next();
			switch (escolha) {
			
			case "a":
			case "A":
				if (resp.get(0)==4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				}
				else {
					
					System.out.println(" Tente novamente!");
				}
				break;
			case "b":
			case "B":
				if (resp.get(1)==4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				}
				else {
					
					System.out.println(" Tente novamente!");
				}
				break;
			case "c":	
			case "C":
				if (resp.get(2)==4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
					}
				else {
					
					System.out.println(" Tente novamente!");
				}
				break;
			
			case "D" :
			case "d" :
				if (resp.get(3)==4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				}
				else {
					
					System.out.println(" Tente novamente!");
				}break;
			case "e":
			case "E":
				if (resp.get(4)==4) {
					System.out.println(" Parabéns Voce Acertou! ");
					i = 3;
				}
				else {
					
					System.out.println(" Tente novamente!");
				}
			
								
			default : 
				
				System.out.println(" Opcao Invalida!");
				i = 3;
			}
			Collections.shuffle(resp);
	}while (i<3);
	
	
	}
	static void play5() {
		int i = 1;
		ArraysList<Integer> resp = new ArrayList<Integer>();
		 resp.add(20);
		 resp.add(14);
		 resp.add(22);
		 resp.add(38);
		 resp.add(7);
		 
	desafio5.flor();
	do {
	System.out.println("Ok mortal ansioso pela vida, aqui vai meu desafio: você está em ambiente inóspito que inicialmente  tem 125 bactérias"+
	"\n Sabendo-se que essa população de bactérias dobra a cada 2 horas, o tempo necessário, em horas, para que o número de bactérias cheguem a 256.000, é igual a: "+
	"\n a)"+resp.get(0)+"\n b)"+resp.get(1)+"\n c)"+resp.get(2)+"\n d)"+resp.get(3)+"\n e)"+resp.get(4));
	String escolha = sc.next();
	switch (escolha) {
	
	case "a":
	case "A":
		if (resp.get(0)==22) {
			System.out.println(" Parabéns Voce Acertou! ");
			i = 3;
		}
		else {
			
			System.out.println(" Tente novamente!");
		}
		break;
	case "b":
	case "B":
		if (resp.get(1)==22) {
			System.out.println(" Parabéns Voce Acertou! ");
			i = 3;
		}
		else {
			
			System.out.println(" Tente novamente!");
		}
		break;
	case "c":	
	case "C":
		if (resp.get(2)==22) {
			System.out.println(" Parabéns Voce Acertou! ");
			i = 3;
			}
		else {
			
			System.out.println(" Tente novamente!");
		}
		break;
	
	case "D" :
	case "d" :
		if (resp.get(3)==22) {
			System.out.println(" Parabéns Voce Acertou! ");
			i = 3;
		}
		else {
			
			System.out.println(" Tente novamente!");
		}break;
	case "e":
	case "E":
		if (resp.get(4)==22) {
			System.out.println(" Parabéns Voce Acertou! ");
			i = 3;
		}
		else {
			
			System.out.println(" Tente novamente!");
		}
	
						
	default : 
		
		System.out.println(" Opcao Invalida!");
		i = 3;
	}
	Collections.shuffle(resp);
	
	}while(i<3);

	public static void main(String[] args) {
	play4();
	Ressurrection.gameOver();
	}

}
