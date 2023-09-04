package operadorlogic;

public class OperadorLogico {

	public static void main(String args[]){
		System.out.println(!(7 > 3)); //false
		System.out.println((2 > 5) || (7 > 3)); //true
		System.out.println((5 > 2) && (7 > 3)); //true
}
}