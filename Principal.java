package Heranca;

public class Principal {

	public static void main(String[] args) {
		
		Homem bruno = new Homem("849.581.480-35","20.504.235-1");
		
		//Mamifero
		bruno.setLocomocao("Bípede");
		bruno.setPelo(true);
		
		//animal
		bruno.setNome("Bruno Alves Reis Nascimento");
		bruno.setRacional(true);
		
		bruno.imprimirDados(bruno);
		
		System.out.println("=================================");
		
		/*=============================*/
		
		Cachorro rex = new Cachorro();
		rex.setLocomocao("Quadrupede");
		rex.setPelo(true);
		rex.setNome("Rex da Silva");
		rex.setRacional(false);
		
		rex.imprimirDados(rex);
		
		System.out.println("=================================");
		
		/*=============================*/
		
		BeijaFlor meuPassaro = new BeijaFlor(null);
		meuPassaro.setNome("Baby");
		meuPassaro.setNada(false);
		meuPassaro.setAnda(false);
		meuPassaro.setRacional(false);
		meuPassaro.setCorDaPena("Branca");
		
		meuPassaro.imprimirDados(meuPassaro);
	}

}
