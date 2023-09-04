package funcaomat;

import java.util.Scanner;

public class FuncaoMat {

	public static void main(String args[]){
		//Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double raio, area;
		System.out.print("Digite o raio do círculo: ");
		raio = input.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("Área: "+ area);
		}
}
