import java.util.Scanner;

public class BubbleSortMelhorado {

	public static void main(String[] args) {
		
		int x[] = new int[5];
		int j, i, aux;
		
		Scanner entrada = new Scanner(System.in);
		
		
		//carregando os numeros no vetor
		
		for(i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i + 1) + " numero: ");
			x[i] = entrada.nextInt();
		}
		
		//ordenando de forma crescente 
		//laco com a quantidade de elementos do vetor -1
		
		for(j = 1; j <= 4; j++) {
			//laco que percorre da ultima posicao a posicao j do vetor
			
			for(i = 4; i >= j; i--) {
				if(x[i] > x[i - 1]) {
					aux = x[i];
					x[i] = x[i - 1];
					x[i - 1] = aux;
				}
			}
		}
		
		//mostrando o vetor ordenado
		
		for(i = 0; i <= 4; i++) {
			System.out.println((i + 1) + " numero: " + x[i]);
		}
	}

}
