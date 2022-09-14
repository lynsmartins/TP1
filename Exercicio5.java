package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	// leia um valor inteiro, converta-o para caractere e escreva esse caractere
		System.out.println("Digite um inteiro: ");
		int valor = leitor.nextInt();
		char valorChar = (char)valor;
		System.out.println(valorChar);

	// leia um caractere, converta-o para inteiro e escreva esse número;
		System.out.println("Digite um caracter:");
		char letra = leitor.next().charAt(0);
		int letraInt = (int) letra;
		System.out.println(letraInt);
		
	// Leia um nome com sobrenome em letras minúsculas, converta-o para maiúsculas e escreva esse novo nome;
		System.out.println("Digite o nome completo:");
		String nome = leitor.nextLine();
		
	}

}
