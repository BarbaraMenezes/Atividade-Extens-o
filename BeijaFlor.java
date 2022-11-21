package Heranca;

public class BeijaFlor extends Ave {
	private String corDaPena;
	
	BeijaFlor(String corDaPena){
		this.corDaPena = corDaPena;
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}
	
	public void imprimirDados(BeijaFlor aux) {
		System.out.println("Nome: "+ aux.getNome());
		System.out.println("Nada? "+ aux.isNada());
		System.out.println("É Racional: "+ aux.isRacional());
		System.out.println("Anda: "+ aux.isAnda());
		System.out.println("Cor das Penas: "+aux.getCorDaPena());
	}

}
