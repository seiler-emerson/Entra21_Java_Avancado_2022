package br.com.entra21.java.avancado.principal.aula01.wrappers;

public class Wrappers {
	
	public static void aprenderWrapper() {
		
		System.out.println("Conversao de tipos primitivos");
		
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
}
