import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite uma frase para criptografar: ");
		String frase = teclado.nextLine();
		String frasesemespaco = frase.replace(" ", "");

		int linha = 1;
		// raiz
		double raiz = Math.sqrt(frasesemespaco.length());
		// arredonda para baixo
		int raizmin = (int) raiz;
		// arredonda para cima
		int raizmax = (int) Math.ceil(raiz);

		for (linha = raizmin; linha <= raizmax; linha++) {
			if (linha * raizmax >= frasesemespaco.length()) {
				break;
			}

		}

		char[][] matriz = new char[linha][raizmax];

		char[] listachar = frasesemespaco.toCharArray();

		int contador = 0;

		for (linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length && contador < listachar.length; coluna++) {
				matriz[linha][coluna] = listachar[contador];
				contador++;
//				System.out.print(matriz[linha][coluna]); 
			}
		}
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			for (linha = 0; linha < matriz.length; linha++) {
				System.out.print(matriz[linha][coluna]);

			}
		}

	}

}
