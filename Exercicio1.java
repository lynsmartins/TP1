package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String palavra;

		System.out.println("Digite uma palavra com ou sem números:");
		palavra = leitor.next();

		// O número de caracteres da string.
		System.out.println("Número de caracteres da palavra: " + palavra.length());

		// A string com todas suas letras em maiúsculo
		System.out.println("Palavra em maiúsculo: " + palavra.toUpperCase());

		// O número de vogais da string
		int contadorVogal = 0;
		for (int i = 0; i < palavra.length(); i++) {
			char vogal = palavra.charAt(i);
			if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
				contadorVogal++;
			}
		}

		System.out.println("Número de vogais na palavra: " + contadorVogal);

		// Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas)
		if (palavra.substring(0, 3).equalsIgnoreCase("uni")) {
			System.out.println("A palavra começa com UNI.");
		} else {
			System.out.println("A palavra não começa com UNI.");
		}

		// Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
		if (palavra.substring(palavra.length() - 3, palavra.length()).equalsIgnoreCase("rio")) {
			System.out.println("A palavra termina com RIO.");
		} else {
			System.out.println("A palavra não termina com RIO.");
		}

		// O número de dígitos da string
		int contadorDigito = 0;
		for (int i = 0; i < palavra.length(); i++) {
			char digito = palavra.charAt(i);
			if (Character.isDigit(digito)) {
				contadorDigito++;
			}
		}
		
		System.out.println("Número de digitos na palavra: " + contadorDigito);
	}

}
