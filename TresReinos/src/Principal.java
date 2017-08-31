import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Governante montante = new Governante("Montante", 50000, 40000, 200000);
		Governante lenha = new Governante("Lenha", 500, 25000, 10000);
		Governante clareza = new Governante("Clareza", 200, 7000, 120000);

		// Lista de Governantes
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);

		// Instanciar a classe solução
		Solucao s = new Solucao();
		System.out.println("Ouro: " + s.getQtdTotal("ouro", governantes));
		System.out.println("Madeira: " + s.getQtdTotal("madeira", governantes));
		System.out.println("Agua: " + s.getQtdTotal("agua", governantes));

		System.out.println("Prata: " + s.getQtdTotal("prata", governantes));
	}

}
