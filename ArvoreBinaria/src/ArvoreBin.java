
public class ArvoreBin {

	public enum ModoRL {
		esqueda, direita, esquerda
	}

	private Elemento arvore;

	public Elemento getArvore() {
		return this.arvore;
	}

	public void setArvore(Elemento arvore) {
		this.arvore = arvore;
	}

	// raiz da arvore

	public ArvoreBin(String raiz) {
		setArvore(new Elemento(raiz));
	}

    public void AdicionarElemento(String elementoPai, String nomeElemento, ModoRL modo){
        if (modo == ModoRL.direita) {
            AdicionarElementoDireita(elementoPai, nomeElemento);
        } else if (modo == ModoRL.esquerda) {
            AdicionarElementoEsquerda(elementoPai, nomeElemento);
        }
    }

	private Elemento findNode(Elemento elemento, String nome) {
		if (elemento == null || nome == null || nome.isEmpty()) {
			return null;
		}
		if (elemento.getNome().equals(nome)) {
			return elemento;
		}

		Elemento elementoEsquerda = findNode(elemento.getEsquerda(), nome);
		if (elementoEsquerda != null) {
			return elementoEsquerda;
		}
		return findNode(elemento.getDireita(), nome);
	}

	public void AdicionarElementoEsquerda(String elementoPai, String nomeElemento) {
		Elemento novoElemento = findNode(getArvore(), elementoPai);
		if (novoElemento == null) {
			return;
		}
		novoElemento.setEsquerda(new Elemento(nomeElemento));
	}

	public void AdicionarElementoDireita(String elementoPai, String nomeElemento) {
		Elemento novoElemento = findNode(getArvore(), elementoPai);
		if (novoElemento == null) {
			return;
		}
		novoElemento.setDireita(new Elemento(nomeElemento));
	}

	private void nullnodes(Elemento elemento) {
		if (elemento == null) {
			return;
		}
		nullnodes(elemento.getDireita());
		nullnodes(elemento.getEsquerda());
		elemento.setEsquerda(null);
		elemento.setDireita(null);
		elemento = null;
	}

	public void clear(String raiz) {
		nullnodes(getArvore());
		setArvore(new Elemento(raiz));
	}

	private String readPreOrdem(Elemento elemento) {
		if (elemento == null) {
			return " ";
		}
		String rt = elemento.toString();
		if (elemento.getEsquerda() != null) {
			rt += (rt.isEmpty() ? " " : ",") + readPreOrdem(elemento.getEsquerda());
		}
		if (elemento.getDireita() != null) {
			rt += (rt.isEmpty() ? " " : ",") + readPreOrdem(elemento.getDireita());
		}
		return rt;
	}

	public String PreOrdem() {
		if (getArvore() == null) {
			return " ";
		}
		return readPreOrdem(getArvore());
	}

	private String readInOrdem(Elemento elemento) {
		if (elemento == null) {
			return " ";
		}
		String rt = " ";
		if (elemento.getEsquerda() != null) {
			rt += (rt.isEmpty() ? " " : ",") + readInOrdem(elemento.getEsquerda());
		}
		if (elemento.getDireita() != null) {
			rt += (rt.isEmpty() ? " " : ",") + readInOrdem(elemento.getDireita());
		}
		return rt;
	}

	public String InOrdem() {
		if (getArvore() == null) {
			return " ";
		}
		return readInOrdem(getArvore());
	}

	private String readPosOrdem(Elemento elemento) {
		if (elemento == null) {
			return "";
		}
		String rt = "";

		if (elemento.getEsquerda() != null) {
			rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(elemento.getEsquerda());
		}
		if (elemento.getDireita() != null) {
			rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(elemento.getDireita());
		}
		rt += (rt.isEmpty() ? "" : ",") + elemento.toString();
		return rt;
	}

	public String PosOrdem() {
		if (getArvore() == null) {
			return " ";
		}
		return readPosOrdem(getArvore());
	}
}
