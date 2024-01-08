import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// entrada de dados
		
		//ler uma palavra a partir do teclado 
		String z;
		z = sc.next();
		System.out.println("Você digitou a palavra: " + z);
			
			 
		//Para ler um numero inteiro 
		int y;				 
		y = sc.nextInt();
		System.out.println("Você digitou o numero: " + y);
		
		
		//Para ler um numero com casas decimais 
		double x;				 
		x = sc.nextDouble();
		System.out.println("Você digitou o numero: " + x);
		
		//Para ler um caracter 
		char w;				 
		w = sc.next() .charAt(0);
		System.out.println("Você digitou o caracter: " + w);
			
			
		sc.close(); //sempre fechar a entrada de dados


	}

}
