		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	int codP1, numP1, codP2, numP2;
	double valorP1, valorP2, soma;
	
	codP1 = sc.nextInt();
	numP1 = sc.nextInt();
	valorP1 = sc.nextDouble();
	
	codP2 = sc.nextInt();
	numP2 = sc.nextInt();
	valorP2 = sc.nextDouble();
	
	soma = numP1 * valorP1 + numP2 * valorP2;
	
	System.out.printf("Valor a pagar= %.2f\n", soma);
	
	
	sc.close();
		

	}

}
