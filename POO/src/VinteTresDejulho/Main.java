package VinteTresDejulho;

public class Main {
	public static void main(String[] args) {
		Engenheiro engenheiro = new Engenheiro("Eduardo", 12000, 1927, 75, 25, 34562, "Junior", "Engenheiro eletricista");
		System.out.println(engenheiro.calcularSalario(1000, 200));
		
		
		Desenvolverdor desenvolvedor = new Desenvolverdor("João Paulo", 8500, 23456, 58, 19, "Junior", "Desenvolvedor de software");
		
	}

}
