package Heranca;

public class Homem extends Mamifero{
	
	private String cpf;
	private String RG;
	
	Homem(String cpf, String RG){
		this.cpf = cpf;
		this.RG = RG;
	}
	
	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return RG;
	}
	public void setRg(String RG) {
		this.RG = RG;
	}
	
	public void imprimirDados(Homem aux) {
		System.out.println("Nome: "+ aux.getNome());
		System.out.println("Forma de Locomo��o: "+ aux.getLocomocao());
		System.out.println("� Racional: "+ aux.isRacional());
		System.out.println("Possui p�los: "+ aux.getPelo());
		System.out.println("RG: "+aux.getRg());
		System.out.println("CPF:"+aux.getCpf());
	}
}
