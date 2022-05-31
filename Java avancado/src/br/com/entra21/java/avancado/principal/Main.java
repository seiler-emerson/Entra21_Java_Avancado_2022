package br.com.entra21.java.avancado.principal;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

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
		menu += "\nEscolha uma das opcoes";

		return menu;
	}
	
	private static void aprenderWrapper() {
		
		//Conversao de tipos primitivos
		
		//Caracter
		char letra = Character.valueOf('e');
		
		//Booleans
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade3 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");
		
		//Inteiros
		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("1000000");
		
		//Decimal
		float decimalUm = Float.parseFloat("1000.10");
		double decimalDois = Double.parseDouble("2000.20 ");
		
	}
	
	private static void aprenderEnum() {
		
		
		
		
	}
}
