/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		if(n < 0.0 || n > 100.0) {
			System.out.println("Fora do intervalo ");
		}else if(n <= 25) {
			System.out.println("intervalo [0,25] ");
		}else if(n <= 50) {
			System.out.println("intervalo [25,50] ");
		}else if (n <= 75) {
			System.out.println("intervalo [50,75] ");
		}else {
			System.out.println("intervalo [75,100] ");
		}
		
		sc.close();
	}

}
