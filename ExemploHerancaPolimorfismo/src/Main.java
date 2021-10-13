
public class Main {

	// implementacao dos metodos

	final static int tamanhoVetor = 4;

	public void executatVetor(Animal[] objAnimal) {
		for (int i = 0; i < tamanhoVetor; i++) {
			// usando polimorfismo
			objAnimal[i].emitirSom();
		}
	}
	
	public static void main(String[] args) {
		Main principal = new Main();
		Animal animal[] = new Animal[tamanhoVetor];
		
		animal[0] = new Animal();
		animal[1] = new	Aves();
		animal[2] = new	Caninos();
		animal[3] = new	Felinos();
		
		principal.executatVetor(animal);
	}
}
