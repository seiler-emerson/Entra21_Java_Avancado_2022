package br.com.entra21.java.avancado.principal.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Aula03 {

	static Scanner input = new Scanner(System.in);

	@Lembrete(value="Chamando de forma estatica esse meu SUBMENU")
	public static void aprender() {

		byte option;

		do {

			System.out.println("Selecione uma opcao: ");
			System.out.println("-1 - Encerrar programa");
			System.out.println(" 0 - Voltar");
			System.out.println(" 1 - Datas");
			System.out.println(" 2 - Anotacoes");
			option = input.nextByte();

			switch (option) {
			case -1:
				System.exit(3);
				// exit retorna um valor para quem chamou o programa.
				break;
			case 0:
				System.out.println("Retornando ao menu principal.");
				break;
			case 1:
				aprenderDatas();
				break;
			case 2:
				aprenderAnotacao();
				break;
			default:
				System.out.println("Escolha uma opcao valida!");
				break;
			}

		} while (option != 0);

	}

	private static void aprenderDatas() {
		Instant inicio = Instant.now();
		
		
		System.out.println("Escolha um numero aleatorio menos esse que voce acabou de pensar");
		long numero = input.nextLong();
		

		Instant fim = Instant.now();
		
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Para datas levamos "+tempo.toSeconds()+" segundos");
		System.out.println("Para datas levamos "+tempo.toMinutes()+" minutos");
		System.out.println("Voce demorou "+tempo.toSeconds()+" segundos para escolher o numero "+numero);
		
		exemplo();
		aprenderDatasHumanizadas();
	}

	private static void aprenderDatasHumanizadas() {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate nascimento = LocalDate.of(1995, 4, 8);
		System.out.println(nascimento);
		
		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
		System.out.println("Essa quinta é referente a data "+essaQuinta);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");//dd/MM/YYYY //dd MMM YY //dd yy //dd/MM
		System.out.println(formatter.format(hoje));
		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));
		
		Period vida = Period.between(nascimento, hoje);
		
		System.out.println("Ate o momento vivi "+vida.getYears()+" anos "+vida.getMonths()+" meses e "+vida.getDays()+" dias.");
		
		LocalTime lanche = LocalTime.of(20, 10);
		LocalTime finalAula03 = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);
		
		System.out.println("Fomos ao intervalo "+lanche+" horas, vamos avaliar a aula "+avaliacao+" horas e a aula termina "+finalAula03+" horas");
		
	}
	
	
	private static void aprenderAnotacao() {
		System.out.println("Assunto Anotacao");
		//Exemplo anotacao
		aindaNaoFiz();
		
		detalharAtributo();
		
		exercitar();
	}	
	
	// Anotações marcadoras
	@inProgress
	private static void aindaNaoFiz() {
		//Exemplo anotacao
	}
	
	// Anotações de valor único
	@Lembrete(value= "O value esta lá na interface e o conteudo fica aqui")
	private static void detalharAtributo() {
		
	}
	
	// Anotações de valor único
	@Lembrete(value= "Isso serve de exemplo para aprender anotacoes com valor")
	private static void exemplo() {
		
	}
	
	// Anotações completas
	@Responsavel(item = "Praticar o que aprendeu", quemAssume = "Alunos")
	public static void exercitar() {
		
	}
}
