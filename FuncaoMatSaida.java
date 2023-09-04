package funcaomathsaida;

import java.util.Scanner;

public class FuncaoMatSaida {

	public static void main(String args[]){
		//Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double base, altura, area;
		System.out.print("Digite a base: ");
		base = input.nextDouble();
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		area = (base * altura)/2;
		System.out.format("Área: %.2f", area);
		}
}
