package exercicios_strings_caracteres;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero;
		String numeroString;

		System.out.println("Digite um número:");
		numero = leitor.nextInt();

		numeroString = String.valueOf(numero);

		for (int i = 0; i < numeroString.length(); i++) {
			char numeroChar = numeroString.charAt(i);
			if(numeroChar == '0') {
				System.out.println("zero");
			}else {
				if(numeroChar == '1') {
					System.out.println("um");
				} else {
					if(numeroChar == '2') {
						System.out.println("dois");
					} else {
						if(numeroChar == '3') {
							System.out.println("três");
						} else {
							if(numeroChar == '4') {
								System.out.println("quatro");
							} else {
								if(numeroChar == '5') {
									System.out.println("cinco");
								} else {
									if(numeroChar == '6') {
										System.out.println("seis");
									} else {
										if(numeroChar == '7') {
											System.out.println("sete");
										} else {
											if(numeroChar == '8') {
												System.out.println("oito");
											} else {
												if(numeroChar == '9') {
													System.out.println("nove");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
