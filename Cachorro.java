package Heranca;

public class Cachorro extends Mamifero {

	private boolean estaDeColeira;
	private String porte;
	
	Cachorro(){
		this.estaDeColeira = false;
		this.porte = "Pequeno";
	}
	
	public boolean isEstaDeColeira() {
		return estaDeColeira;
	}
	public void setEstaDeColeira(boolean estaDeColeira) {
		this.estaDeColeira = estaDeColeira;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	

	public void imprimirDados(Cachorro aux) {
		System.out.println("Nome: "+ aux.getNome());
		System.out.println("Forma de Locomo��o: "+ aux.getLocomocao());
		System.out.println("� Racional: "+ aux.isRacional());
		System.out.println("Possui p�los: "+ aux.getPelo());
		System.out.println("O cachorro est� de coleira? "+aux.isEstaDeColeira());
		System.out.println("Porte do cachorro:"+aux.getPorte());
	}
	
}
