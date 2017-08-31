
public class Governante {

	private String nome;
	private int ouro;
	private int madeira;
	private int agua;

	// Metodo Construtor
	public Governante(String nome, int ouro, int madeira, int agua) {
		super();
		this.nome = nome;
		this.ouro = ouro;
		this.madeira = madeira;
		this.agua = agua;
	}

	// Metodos Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOuro() {
		return ouro;
	}

	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	public int getMadeira() {
		return madeira;
	}

	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}

	public int getAgua() {
		return agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

}