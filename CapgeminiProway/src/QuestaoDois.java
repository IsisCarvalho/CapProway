import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite uma lista de números de zero a 9 separados por vírgula: ");
		String numeros = teclado.nextLine();
		numeros = numeros.replace(" ", "");
		numeros = numeros.replace(",", "");
		char[] listaChar = numeros.toCharArray();
		int[] lista = new int[listaChar.length];
		for (int contador = 0; contador < lista.length; contador++) {
			lista[contador] = (int)listaChar[contador];
		}
		
		
		System.out.println("digite o número x da diferença a ser procurada: ");
		int x = teclado.nextInt();
		int diferenca = 0;

		for (int contador = 0; contador < lista.length; contador++) {
			for (int j = 0; j < lista.length; j++)
				if (lista[contador] - lista[j] == x) {
					diferenca++;
				}
		}
		System.out.println(diferenca);
	}
}
