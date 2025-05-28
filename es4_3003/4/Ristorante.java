public class Ristorante {
	private String nome;
	private String indirizzo;

	// Constructor
	public Ristorante(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	// Getter for nome
	public String getNome() {
		return nome;
	}

	// Setter for nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter for indirizzo
	public String getIndirizzo() {
		return indirizzo;
	}

	// Setter for indirizzo
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
}
