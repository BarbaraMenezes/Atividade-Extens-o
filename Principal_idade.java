package Questao_1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Lista de Exerc�cios 1 �Revis�o de POO em JavaPara cada exerc�cio 
 * crie um novo projeto ou separe as classes por pacotes (packages).
 *  Teste todos os programas na classe principal (classe que cont�m o
 *   m�todo main).
 *   
 *   1.Crie uma classe para representar uma pessoa, 
 *   com os atributos privados de nome, data de nascimento e altura. 
 *   Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m
 *    um m�todo para imprimir todos dados de uma pessoa. 
 *    Crie um m�todo para calcular a idade da pessoa.
 */
public class Principal_idade {

	public static void main(String[] args) {

		PessoaIdade um = new PessoaIdade("B�rbara","16/09/2002",1.65);
		um.imprimir();

	}

}
