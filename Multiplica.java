package multiplica;

import java.util.Scanner;

public class Multiplica {

	public static void main(String[] args) {
		
		//Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		int numero, dobro;
		System.out.print("Informe um numero: ");
		numero = input.nextInt();
		dobro = numero * 2;
		System.out.println("O dobro do número é: " + dobro);

	}

}
