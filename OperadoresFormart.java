package operadoresbiformat;

public class OperadoresFormart {

	public static void main(String args[]){
		int num1 = 3, num2 = 5;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println(String.format("(double) num1 / num2 = %.2f", ((double) num1
		/ num2)));
		System.out.println(String.format("num1 / (double) num2 = %.3f", (num1 /
		(double) num2)));
		System.out.println(String.format("(double) num1 / (double) num2 = %.4f",
		((double) num1 / (double) num2)));
		}
}
