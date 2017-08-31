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
}
