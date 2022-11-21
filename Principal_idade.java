package Questao_1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Lista de Exercícios 1 –Revisão de POO em JavaPara cada exercício 
 * crie um novo projeto ou separe as classes por pacotes (packages).
 *  Teste todos os programas na classe principal (classe que contém o
 *   método main).
 *   
 *   1.Crie uma classe para representar uma pessoa, 
 *   com os atributos privados de nome, data de nascimento e altura. 
 *   Crie os métodos públicos necessários para sets e gets e também
 *    um método para imprimir todos dados de uma pessoa. 
 *    Crie um método para calcular a idade da pessoa.
 */
public class Principal_idade {

	public static void main(String[] args) {

		PessoaIdade um = new PessoaIdade("Bárbara","16/09/2002",1.65);
		um.imprimir();

	}

}
