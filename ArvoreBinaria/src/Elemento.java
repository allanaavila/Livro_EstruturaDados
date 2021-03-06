
public class Elemento {

	private String nome;
	private Elemento esquerda;
	private Elemento direita;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Elemento getEsquerda() {
		return this.esquerda;
	}

	public void setEsquerda(Elemento esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento getDireita() {
		return this.direita;
	}

	public void setDireita(Elemento direita) {
		this.direita = direita;
	}

	public Elemento() {
		this(null, null, null);
	}

	public Elemento(String nome) {
		this(nome, null, null);
	}

	public Elemento(String nome, Elemento esquerda, Elemento direita) {
		setNome(nome);
		setEsquerda(esquerda);
		setDireita(direita);
	}

	@Override
	public int hashCode() {
		return getNome() == null ? 0 : getNome().hashCode();
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(objeto == null || !(objeto instanceof Elemento)) {
			return false;
		}
		return ((Elemento)objeto).hashCode() == hashCode();
	}
	
	@Override
	public String toString() {
		return getNome() == null ? " " : getNome();
	}
	

}
