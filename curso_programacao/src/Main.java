import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.printf("%.2f\n", x);      //%.2f vai indicar que eu quero delimitar duas casas decimais.
		System.out.printf("%.4f\n", x);
		
		System.out.println(y); 
		                     												
		System.out.println("Hello world");
		System.out.println("good morning");
		
		Locale.setDefault(Locale.US); // mudar para o padrão americano 
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f METROS\n", x);
		
		//    MARCADORES 
		
		// %f = ponto flutuante 
		
		// %d = inteiro 
		
		// %s = texto 
		
		// \n ou %n = quebra de linha 
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
				

	}

}
