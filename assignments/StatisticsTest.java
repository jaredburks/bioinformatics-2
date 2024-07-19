import java.util.Scanner;

public class StatisticsTest {
	
	public static void main(String [] args) {
		System.out.print("Enter doubles: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String holder[] = s.split(" ", 0);
		int n = holder.length;
		double x[] = new double [n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(holder[i]);
		}
		
		Statistics a = new Statistics();
		
		a.getSum(x);
		a.getMean(x);
		a.getSqVarSum(x);
		
		System.out.print(String.format(s, a.getMin(x)));
		System.out.print(String.format(s, a.getMin(x)));
		System.out.print(String.format(s, a.getMin(x)));
		System.out.print(String.format(s, a.getMin(x)));
		System.out.print(String.format(s, a.getMin(x)));
	}
}