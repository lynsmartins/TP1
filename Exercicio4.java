package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite um texto:");
		texto = leitor.nextLine();
		
		// número de caracteres total
		System.out.println("O número de caracteres é: " + texto.length());
		
		// número de palavras
		String textoSeparado[] = texto.split(" ");
		System.out.println("O número de palavras é:" + textoSeparado.length);
	}

}
