package br.com.entra21.java.avancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AprenderCollections {
	
	static Scanner input = new Scanner(System.in);
	
	public static void aprender() {
		byte option;
		
		do {
			
		System.out.println("Escolha uma opção: ");
		System.out.println("Voltar ao menu principal");
		System.out.println("1 - Aprender ArrayList");
		System.out.println("2 - Aprender LinkedList");
		option = input.nextByte();
		
		switch(option) {
		case 0:
			System.out.println("Voltando ao menu principal...");
			break;
		case 1:
			aprenderArrayList();
			break;
		case 2:
			aprenderLinkedList();
			break;
		default:
			System.out.println("Escolha uma opcao valida!");
			break;
		}
			
		} while(option!=0);
		System.out.println("Volte sempre quando quiser aprender collections - list");
	}
	
	
	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Emerson");
		nomes.add("Fulano");
		nomes.add("Ciclano");
		nomes.add(0, "Primeiro");
//		nomes.add(2,"Inserido");
		nomes.add("Rubem");
		System.out.println("Quantos nomes? "+nomes.size());
		
		System.out.println("==============================");
		
		for (String item: nomes) {
			System.out.println("O nome no momento e "+item);
		}
		
		System.out.println("==============================");
		
		for (int nome=0; nome < nomes.size(); nome++) {
			System.out.println("No indice "+nome+" tem o valor "+nomes.get(nome));
		}
		
		System.out.println("==============================");
		
		System.out.println("O primeiro nome e "+nomes.get(0));
		System.out.println("O quarto e "+nomes.get(3));
		
		nomes.set(2, "Filipe Atualizado");
		System.out.println("O terceiro nome e "+nomes.get(2));
		nomes.set(0, nomes.get(0).toUpperCase());
		nomes.set(0, nomes.get(3).toUpperCase());
		System.out.println("O primeiro nome e "+nomes.get(0));
		
		System.out.println("Onde sera que esta o Rubem? "+nomes.indexOf("Rubem"));
		
		System.out.println("==============================");
		
		System.out.println("Vou deletar quem esta no indice 2: "+nomes.get(2));
		nomes.remove(2);
		System.out.println("A posicao 2 tem agora "+nomes.get(2));
		
		System.out.println("Vou deletar o Rubem agora");
		nomes.remove(nomes.indexOf("Rubem"));
		
		System.out.println("==============================");
		
		// Criar uma lista de interesses
		// Inclua 5 interesses
		// Liste todos os interesses
		// Dessa lista escolha 2 para mostrar que sao seus favoritos
		// Exclua um item por posicao
		// Exclua outro por valor
		// Um syso para cada acao dessa
		
		// Criar uma lista de interesses
		ArrayList<String> interesses = new ArrayList<>();
		
		// Inclua 5 interesses
		interesses.add("Capgemini");
		System.out.println(interesses.get(0)+" foi inserido na lista de interesse");
		
		interesses.add("Ambev Tech");
		System.out.println(interesses.get(1)+" foi inserido na lista de interesse");
		
		interesses.add(2, "Warren");
		System.out.println(interesses.get(2)+" foi inserido na lista de interesse");
		
		interesses.add(3, "Philips");
		System.out.println(interesses.get(3)+" foi inserido na lista de interesse");
		
		interesses.add(4, "Ailos");
		System.out.println(interesses.get(interesses.indexOf("Ailos"))+" foi inserido na lista de interesse");
		
		// Liste todos os interesses
		for (byte posicao=0;posicao < interesses.size(); posicao++) {
			System.out.println("O "+(posicao+1)+" interesse e "+interesses.get(posicao));
		}
		
		// Dessa lista escolha 2 para mostrar que sao seus favoritos
		System.out.println("O primeiro favorito e "+interesses.get(0));
		System.out.println("O segundo favorito e "+interesses.get(1));
		
		// Exclua um item por posicao
		System.out.println("Perdi o interesse na "+interesses.get(interesses.indexOf("Philips")));
		interesses.remove(3);
		
		// Exclua outro por valor
		System.out.println("Perdi o interesse na "+interesses.get(interesses.indexOf("Ailos")));
		interesses.remove(interesses.indexOf("Ailos"));
		
		// Liste todos os interesses
		for (byte posicaoAtualizada=0;posicaoAtualizada < interesses.size(); posicaoAtualizada++) {
			System.out.println("O "+(posicaoAtualizada+1)+" interesse e "+interesses.get(posicaoAtualizada));
		}
		
	}
	
	
	private static void aprenderLinkedList() {
		
		LinkedList<String> nomes = new LinkedList<>();
		 

		System.out.println("---------------Inserindo itens no LINKED ------------------");
		nomes.add("Rubem");
		nomes.add("Fulano");
		nomes.addFirst("Teste");
		nomes.addLast("Ultimo");
		nomes.add(2, "Inserido");

		System.out.println("Quantos nomes? " + nomes.size());

		System.out.println("---------------Acessando itens no LINKED ------------------");
		System.out.println("Quem é o primeiro? " + nomes.getFirst());
		System.out.println("Quem é o segundo? " + nomes.get(1));
		System.out.println("Quem é o ultimo? " + nomes.getLast());

		System.out.println("---------------Percorrendo itens no LINKED com iteração em array------------------");
		System.out.println("Ordem de inserção");
		for (String nome : nomes) {
			System.out.println("nome = " + nome);
		}

		System.out.println("---------------Percorrendo itens no LINKED com index em array------------------");
		System.out.println("De forma inversa");
		for (int nome = nomes.size() - 1; nome >= 0; nome--) {

			System.out.println("(" + nome + ") cargo = " + nomes.get(nome));

		}

		System.out.println("---------------Removendo itens no LINKED ------------------");
		System.out.println("Removendo quem estava no indice 0 ou seja " + nomes.getFirst());
		nomes.removeFirst();// removi o item no indice 0

		System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice "
				+ nomes.indexOf("Fulano"));
		nomes.remove("Fulano");// remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("---------------Percorrendo itens no LINKED com forEach------------------");
		nomes.forEach(nome -> {
			System.out.println("nome " + nome);
		});
	}
}