
public class ArvoreBin {

	private Elemento arvore;

	public Elemento getArvore() {
		return this.arvore;
	}

	public void setArvore(Elemento arvore) {
		this.arvore = arvore;
	}

	// exclusao em arvore binaria

	public Elemento removeValorMinimoDaArvore(Elemento elemento) {
		if (elemento == null) {
			System.out.println("ERRO");
		} else if (elemento.getEsquerda() != null) {
			elemento.setEsquerda(removeValorMinimoDaArvore(elemento.getEsquerda()));
			return elemento;
		} else {
			return elemento.getDireita();
		}
		return null;
	}

	// insercao na arvore binaria
	public void inserir(Elemento elemento, int valor) {
		if (elemento != null) {
			if (valor < elemento.valor) {
				if (elemento.getEsquerda() != null) {
					inserir(elemento.getEsquerda(), valor);
				} else {
					System.out.println("Inserindo " + valor + " a esquerda de  " + elemento.valor);
					elemento.setEsquerda(new Elemento());
				}
			} else if (valor > elemento.valor) {
				if (elemento.getDireita() != null) {
					inserir(elemento.getDireita(), valor);
				} else {
					System.out.println("Inserindo " + valor + " a direita de " + elemento.valor);
					elemento.setDireita(new Elemento());
				}
			}
		}
	}
	
	//prefixo em arvore binaria
	
	public void prefixado(Elemento elemento) {
		if(elemento != null) {
			System.out.println(elemento.valor + " ");
			prefixado(elemento.getEsquerda());
			prefixado(elemento.getDireita());
		}
	}
	
	//posfixado em arvore binaria
	
	public void posfixado(Elemento elemento) {
		if(elemento != null) {
			posfixado(elemento.getEsquerda());
			posfixado(elemento.getDireita());
			System.out.println(elemento.valor + " ");
		}
	}
	
	//ordem em arvores binaria
	public void emOrdem(Elemento elemento) {
		if(elemento != null) {
			emOrdem(elemento.getEsquerda());
			System.out.println(elemento.valor + " ");
			emOrdem(elemento.getDireita());
		}
	}

}
