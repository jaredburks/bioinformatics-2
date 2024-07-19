import java.util.Scanner;

public class Decimal2BinaryRecursive {
	
	public static void main (String[] args) {
		
		System.out.print("Enter an unsigned decimal: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n < 0) {
			System.out.print("Invalid! Enter an unsigned decimal: ");
			n = sc.nextInt();
		}
		
		sc.close();
				
		System.out.print("Binary equivalent of " + n + " = " + getBinary(n));
	}
	
	static String bank = new String();
	static String reverse = new String();
	static boolean firstIteration = true;

	public static String getBinary(int b) {		
		if(firstIteration && b == 0) {
			bank += Integer.toString(b);
			return bank;
		}
		if (b > 0) {
			
			bank += Integer.toString(b%2);
			b = b/2;
			firstIteration = false;
			
			getBinary(b);
		}
		
//		for (int i = bank.length() - 1; i >= 0; i--) {
//			reverse += bank.charAt(i);
//		}
		return bank;
	}
}