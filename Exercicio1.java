package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String palavra;

		System.out.println("Digite uma palavra com ou sem n�meros:");
		palavra = leitor.next();

		// O n�mero de caracteres da string.
		System.out.println("N�mero de caracteres da palavra: " + palavra.length());

		// A string com todas suas letras em mai�sculo
		System.out.println("Palavra em mai�sculo: " + palavra.toUpperCase());

		// O n�mero de vogais da string
		int contadorVogal = 0;
		for (int i = 0; i < palavra.length(); i++) {
			char vogal = palavra.charAt(i);
			if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
				contadorVogal++;
			}
		}

		System.out.println("N�mero de vogais na palavra: " + contadorVogal);

		// Se a string digitada come�a com �UNI� (ignorando mai�sculas/min�sculas)
		if (palavra.substring(0, 3).equalsIgnoreCase("uni")) {
			System.out.println("A palavra come�a com UNI.");
		} else {
			System.out.println("A palavra n�o come�a com UNI.");
		}

		// Se a string digitada termina com �RIO� (ignorando mai�sculas/min�sculas).
		if (palavra.substring(palavra.length() - 3, palavra.length()).equalsIgnoreCase("rio")) {
			System.out.println("A palavra termina com RIO.");
		} else {
			System.out.println("A palavra n�o termina com RIO.");
		}

		// O n�mero de d�gitos da string
		int contadorDigito = 0;
		for (int i = 0; i < palavra.length(); i++) {
			char digito = palavra.charAt(i);
			if (Character.isDigit(digito)) {
				contadorDigito++;
			}
		}
		
		System.out.println("N�mero de digitos na palavra: " + contadorDigito);
	}

}
