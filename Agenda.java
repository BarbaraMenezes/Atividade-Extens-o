package Questao_2;

public class Agenda {

	public static void main(String[] args) {
		
		Pessoa_Agenda nova = new Pessoa_Agenda();
		nova.armazenaPessoa(10,"Maria",1.60);
		nova.armazenaPessoa(15,"Luiza",1.65);
	//	nova.imprimeAgenda();
		
		//nova.removePessoa("Luiza");
		nova.imprimeAgenda();
		/*Pessoa_Agenda dois = new Pessoa_Agenda(15,"Luiza",1.65);
		dois.armazenaPessoa(1);
		dois.imprimeAgenda(1);*/
	}

	

}
