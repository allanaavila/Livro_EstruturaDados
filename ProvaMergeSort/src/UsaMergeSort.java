import java.util.Arrays;

public class UsaMergeSort {

	public static void main(String[] args) {
		String[] a = new String[10];
		Ordenacao.inserir(a);
		System.out.println("Antes: ");
		System.out.println(Arrays.toString(a));
		Ordenacao.mergeSort(0, a.length, a);
		System.out.println("Ordenado: ");
		System.out.println(Arrays.toString(a));
	}
}