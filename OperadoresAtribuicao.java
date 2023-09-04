package operadoresatrib;

public class OperadoresAtribuicao {

	public static void main(String args[]){
		int resp = 10, num = 5;

		resp += num;
		System.out.println("resp += num: " + resp);
		resp -= num;
		System.out.println("resp -= num: " + resp);
		resp *= num;
		System.out.println("resp *= num: " + resp);
		resp /= num;
		System.out.println("resp /= num: " + resp);
		resp %= num;
		System.out.println("resp %= num: " + resp);
		}
}
