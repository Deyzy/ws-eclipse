	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa
	 */
import java.util.Scanner;

public class Exercicio001 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;

		System.out.println("A soma dos numeros digitados foi " + z);

		sc.close();

	}

}
