package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite um texto:");
		texto = leitor.nextLine();
		
		// n�mero de caracteres total
		System.out.println("O n�mero de caracteres �: " + texto.length());
		
		// n�mero de palavras
		String textoSeparado[] = texto.split(" ");
		System.out.println("O n�mero de palavras �:" + textoSeparado.length);
	}

}
