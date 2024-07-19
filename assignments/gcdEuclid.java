import java.util.Scanner;

public class gcdEuclid {
	
		//Pseudocode
//		  Method main:
//			  Initialize scanner sc();
//			  Output "Enter two integers: ";
//			  Get user input for the 1st and 2nd integers a and b;
//			  Initialize integers x, y;
//			  Close scanner sc();
//			  Initialize integer c and call method gcd(x, y);
//			  
//		     Output: "gcd of %d and %d = %d", a, b, c;
//		  		
//		  Method gcd(a, b):
//		 		 Initialize integers x, y as the maximum and minimum values of a and b respectively;
//		 		 
//		 		 if y is 0 return x;
//		 		 
//		 		 Initialize: int answer = x % y;
//		 		 
//		 		 if answer is 0 return y;
//	 		 
//		 		 return int b and answer;		
		 
	
	
	public static void main ( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int x = sc.nextInt(); // First integer input
		int y = sc.nextInt(); // Second integer input
		sc.close();
		
		gcd(x, y);
		
	}
	
	public static void gcd(int x, int y) {
		x = Math.abs(x); //Takes absolute value of the first integer
		y = Math.abs(y); //Takes absolute value of the second integer
		
		int max = Math.max(x, y); //initializes max as the higher value between the 1st and 2nd integer.
		int min = Math.min(x, y); //initializes min the lower value between the 1st and 2nd integer.
		int answer = 0; 
		
		if (min == 0) {
			answer = max;
		}
		
		answer = max % min;
		
		if (answer == 0) {
			answer = min;
		}
		
		System.out.printf("gdc of %s and %d = %d", max, min, answer);
	}
}

