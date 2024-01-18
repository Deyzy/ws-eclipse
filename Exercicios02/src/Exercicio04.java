/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio;
		int horaFinal;
		horaInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int duracao;	
		
		if(horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		}else {
			duracao = 24 - horaInicio + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + " Horas");
		
		
		
		sc.close();
	}

}
