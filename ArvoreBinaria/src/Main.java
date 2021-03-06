import binary.ArvoreBin;
import binary.ArvoreBin.ModoRL;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		ArvoreBin arvore = new ArvoreBin("A");

		arvore.AdicionarNo("A", "B", ModoRL.esquerda);
		arvore.AdicionarNo("B", "D", ModoRL.esquerda);
		arvore.AdicionarNo("A", "C", ModoRL.direita);
		arvore.AdicionarNo("C", "E", ModoRL.esquerda);
		arvore.AdicionarNo("E", "G", ModoRL.direita);
		arvore.AdicionarNo("C", "F", ModoRL.direita);
		arvore.AdicionarNo("F", "H", ModoRL.esquerda);
		arvore.AdicionarNo("F", "I", ModoRL.direita);

		System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
		System.out.println("InOrdem (ERD): " + arvore.InOrdem());
		System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
		System.out.println("-----------------------------------------");

		arvore.clear("F");

		arvore.AdicionarNo("F", "B", ModoRL.esquerda);
		arvore.AdicionarNo("B", "A", ModoRL.esquerda);
		arvore.AdicionarNo("B", "D", ModoRL.direita);
		arvore.AdicionarNo("D", "C", ModoRL.esquerda);
		arvore.AdicionarNo("D", "E", ModoRL.direita);
		arvore.AdicionarNo("F", "G", ModoRL.direita);
		arvore.AdicionarNo("G", "I", ModoRL.direita);
		arvore.AdicionarNo("I", "H", ModoRL.esquerda);

		System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
		System.out.println("InOrdem (ERD): " + arvore.InOrdem());
		System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
		System.out.println("-----------------------------------------");

		arvore.clear("A");

		arvore.AdicionarNo("A", "B", ModoRL.esquerda);
		arvore.AdicionarNo("B", "C", ModoRL.esquerda);
		arvore.AdicionarNo("C", "E", ModoRL.esquerda);
		arvore.AdicionarNo("E", "I", ModoRL.direita);
		arvore.AdicionarNo("C", "F", ModoRL.direita);
		arvore.AdicionarNo("F", "J", ModoRL.direita);
		arvore.AdicionarNo("B", "D", ModoRL.direita);
		arvore.AdicionarNo("D", "G", ModoRL.esquerda);
		arvore.AdicionarNo("D", "H", ModoRL.direita);
		arvore.AdicionarNo("H", "K", ModoRL.esquerda);
		arvore.AdicionarNo("H", "L", ModoRL.direita);

		System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
		System.out.println("InOrdem (ERD): " + arvore.InOrdem());
		System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
		System.out.println("-----------------------------------------");
	}

}
