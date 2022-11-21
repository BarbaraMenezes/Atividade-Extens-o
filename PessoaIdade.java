package Questao_1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*  1.Crie uma classe para representar uma pessoa,com os atributos privados de nome, data de nascimento e altura. 
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular a idade da pessoa.*/

public class PessoaIdade {

	private String nome;
	private String dataNasc;
	private int diaAtual;
	private int mesAtual;
	private int anoAtual;
	private double altura;

	public String getDataNasc() {
		return dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	PessoaIdade(String nome, String dataNasc, double altura) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;

	}

	public void imprimir() {
		System.out.println("=====================================");
		Scanner ler = new Scanner(System.in);
		System.out.println("Nome:" + this.getNome());
		System.out.printf("Altura:%6.2f\n", this.getAltura());
		System.out.println("Data de Nascimento:" + dataNasc);
		System.out.print("Informe o dia Atual:");
		diaAtual = ler.nextInt();
		System.out.print("Informe o mês Atual:");
		mesAtual = ler.nextInt();
		System.out.print("Informe o ano Atual:");
		anoAtual = ler.nextInt();
		calculandoIdade();

	}

	private void calculandoIdade() {
		String diaA, mesA, anoA;

		diaA = dataNasc.substring(0, 2);
		mesA = dataNasc.substring(3, 5);
		anoA = dataNasc.substring(6);

		int diaB, mesB, anoB, idade;

		diaB = Integer.parseInt(diaA);
		mesB = Integer.parseInt(mesA);
		anoB = Integer.parseInt(anoA);

		if ((diaB <= diaAtual) && (mesAtual <= mesB)) {
			idade = (anoAtual - anoB);
		} else {
			idade = (anoAtual - anoB) - 1;

		}
		System.out.println("Idade: " + idade + " anos");
	}
}