
public class Condicional_ternario {

	public static void main(String[] args) {
		
		double preco = 34.5;
		//se o preco for menor que 20 o desconto vai ser (preco * 0.1), se for maior o desconto vai ser (preco * 0.05)
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

	}

}
