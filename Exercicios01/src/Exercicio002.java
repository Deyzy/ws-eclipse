		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio
		 */

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi =  3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("area=%.4f\n", area);
		
		sc.close();
		
	
	}

}
