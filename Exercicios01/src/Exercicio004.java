/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id ;
		double valorHora, horas, salario;
		
		id = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horas * valorHora;
		
		System.out.println("NUMERO: " + id);
		System.out.println("Salario R$ " + salario);
		
		
		sc.close();
		
	}

}
