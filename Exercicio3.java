package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String nome;

		System.out.println("Digite o nome completo:");
		nome = leitor.nextLine();

		String nomeSeparado[] = nome.split(" ");

		for (int i = 0; i < nomeSeparado.length; i++) {
			if (nomeSeparado[i].equalsIgnoreCase("e") || nomeSeparado[i].equalsIgnoreCase("da") || nomeSeparado[i].equalsIgnoreCase("de")
					|| nomeSeparado[i].equalsIgnoreCase("di")|| nomeSeparado[i].equalsIgnoreCase("do")
					|| nomeSeparado[i].equalsIgnoreCase("du") || nomeSeparado[i].equalsIgnoreCase("das") ||nomeSeparado[i].equalsIgnoreCase("dos")) {
				nomeSeparado[i] = null;
			} else {
				String iniciais = Character.toString(nomeSeparado[i].charAt(0));
				System.out.print(iniciais.toUpperCase());
			}
		}

	}

}
