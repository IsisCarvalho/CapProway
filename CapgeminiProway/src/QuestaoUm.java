import java.util.Arrays;
import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite uma lista de n�meros de zero a 9 separados por v�rgula: ");
		String numeros = teclado.nextLine();
		numeros = numeros.replace(" ", "");
		numeros = numeros.replace(",", "");
		
		char[] listaChar = numeros.toCharArray();

		Arrays.sort(listaChar);

		System.out.print(listaChar[listaChar.length / 2]);

	}

}
