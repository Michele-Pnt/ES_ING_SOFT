public class Persona {
	private String nome;
	private int eta;

	// Constructor
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	// Getter for nome
	public String getNome() {
		return nome;
	}

	// Setter for nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter for eta
	public int getEta() {
		return eta;
	}

	// Setter for eta
	public void setEta(int eta) {
		this.eta = eta;
	}
}
