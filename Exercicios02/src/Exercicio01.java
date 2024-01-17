/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("Não negativo");
		}
		
		sc.close();
	}

}
