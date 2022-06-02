package br.com.entra21.java.avancado.principal;

import java.util.Scanner;

import br.com.entra21.java.avancado.principal.aula01.enums.PersonagemJogo;
import br.com.entra21.java.avancado.principal.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.principal.aula02.collections.list.AprenderCollections;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}
	
	
	public static void main(String[] args) {
		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderWrapper();
				break;
			case 2:
				aprenderEnum();
				break;
			case 3:
				AprenderCollections.aprender();
				break;
			default:
				System.out.println("Escolha uma opcao valida.");
				break;
			}

		} while (option != 0);

	}

	public static String exibirMenu() {
		String menu = "Vamos aprender sobre conceitos avancados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1 - WRAPPER";
		menu += "\n2 - ENUM";
		menu += "\n3 - COLLECTIONS";
		menu += "\nEscolha uma das opcoes";

		return menu;
	}
	
	private static void aprenderWrapper() {
		
		//Conversao de tipos primitivos
		
		Wrappers.aprenderWrapper();
		
	}
	
	private static void aprenderEnum() {
		
		System.out.println("Testando Enum: "+DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje?"sim":"nao");
		
		for (int dia =0;dia< DiasSemana.values().length;dia++) {
			System.out.println((dia+1)+" - "+DiasSemana.values()[dia]);
		}
		
		System.out.println("Gosto deste tipo de personagem "+PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe "+PersonagemJogo.ANAO+" tem HP = "+PersonagemJogo.ANAO.getHP());
		System.out.println("Veja a caracteristica masi comum dele: "+PersonagemJogo.ANAO.getDESCRICAO());
		
		System.out.println("O mago esta no indice do enum "+PersonagemJogo.MAGO.ordinal());
        System.out.println("\n Veja a descrição completa do " + PersonagemJogo.MAGO + " sua vida é "
                + PersonagemJogo.MAGO.getHP() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());
        
        System.out.println(PersonagemJogo.BARBARO.getDetails());
        
        System.out.println("");
        for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			
        	System.out.println("Contador = "+personagem+" posicao do Enum = "+PersonagemJogo.values()[personagem].ordinal());
        	System.out.println("O personagem "+PersonagemJogo.values()[personagem].name());
        	System.out.println(PersonagemJogo.values()[personagem].getHP());
        	System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
        	System.out.println("-----------------------------------------");
		}
        
        for(PersonagemJogo variavel:PersonagemJogo.values() ) {
        	System.out.println(variavel.ordinal() + " - " +variavel.getDetails());
        }
        System.out.println("");
        System.out.println("O Druida esta na posicao "+PersonagemJogo.DRUIDA.ordinal());
	}
}





























