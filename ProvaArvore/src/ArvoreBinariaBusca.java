
public class ArvoreBinariaBusca {

	public static void main(String[] args) {

		Metodos arvore = new Metodos();

		No no = new No(null, null, 5);

		arvore.setRaiz(no);
		arvore.inserir(3);
		arvore.inserir(2);
		arvore.inserir(4);
		arvore.inserir(40);
		arvore.inserir(1);
		arvore.inserir(17);

		//int maiorNumero = arvore.maiorValor();

		//System.out.println("Maior numero: " + maiorNumero);
		
		arvore.buscaBinaria(null, 3);

	}
}