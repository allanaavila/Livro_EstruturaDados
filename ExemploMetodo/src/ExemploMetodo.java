import java.util.Date;

public class ExemploMetodo {
	// Exemplo de métodos, variaveis e atributos
	
	private int meuAtributo = 0;   // pode ser usado por qualquer método

	public static void main(String[] args) {
		Date today = new Date();     //today representa uma variável
		
		System.out.println(today);
		
		imprimir();     // executando o método imprimir
		
		

	}
	
	
	public static void imprimir() {
		//esta variavel podera ser usada somente no metodo imprimir()
		
		int minhaVariavel = 0;
		System.out.println("Metodo Imprimir");
	}

}
