package VinteDoisDeJulho;

public class Main {
	public static void main(String[] args) {
		FuncoesString funcoesString = new FuncoesString();
		
		funcoesString.iniciarStringManeiraUm("Luciano Cavalcante");
		funcoesString.iniciarStringManeiraUm("Marcos Leão");
		funcoesString.retornarTamanhoString("Fortaleza no G4");
		funcoesString.retornarCaracterNaposicao("Ceará", 0);
		funcoesString.retornarStringApartirDoIndice("Senac Ceará", 5);
		funcoesString.retornarStringApartirDoIndice("SENAC CEARÁ", 5, 0);
		funcoesString.retornarPrimerioIndice("Eduardo", "d");
		funcoesString.retornarUltimoIndice("Eduardo", "d");
		funcoesString.isContem("Leonardo", "Loe");
		
	}

}
