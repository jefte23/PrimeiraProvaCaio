import java.util.ArrayList;

public class Solucao {
	// Metodo para questão A

	public int getQtdTotal(String recurso, ArrayList<Governante> governantes) {
		int resultado = 0;
		// Testar o tipo do recurso
		switch (recurso) {
		case "ouro":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getOuro();
			}
			break;
		case "madeira":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getMadeira();
			}

			break;
		case "agua":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getAgua();
			}

			break;
		default:
			return resultado;
		}
		return resultado;
	}

	// Metodo para resposta da questão B
	public String getQtdFicafarVivo(String nomeGovernante, ArrayList<Governante> governantes) {
		String resultado = "";

		// Buscar o governante na lista com vase no nome
		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)) {
				resultado = "Pedido do governante: " + nomeGovernante + "\n" + "Ouro: "
						+ governantes.get(i).getPedidoOuro() + "\n" + "Madeira: "
						+ governantes.get(i).getPedidoMadeira() + "\n" + "Agua: " + governantes.get(i).getPedidoAgua();
			}

		}
		return resultado;
	}

	public int calcularQtdViagens(String nomeGovernante, ArrayList<Governante> governantes) {
		int resultado = 0;

		// buscar governante na lista com base no nome
		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)) {
				resultado = (governantes.get(i).getPedidoMadeira() / 50) + (governantes.get(i).getPedidoOuro() / 100)
						+ (governantes.get(i).getPedidoAgua() / 10000);
			}
		}
		return resultado;
	}

}
