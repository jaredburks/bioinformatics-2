import java.util.Scanner;

public class WorldPopulationProjector {
	
	static double Po = 7600000000d; //Year-begin population of 2021
	static double secondsPerYear = 31536000; 	//3600secs/hr, 24hrs/day, 356days/year
	static double birthsPerYear = (4.5 * secondsPerYear); //4.5 births per sec. for a year.
	static double deathsPerYear = (2 * secondsPerYear);   //2 deaths per sec. for a year.
	
	public static void main ( String[] args) {
		System.out.println("Enter a year for which you project the world population: ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //User input of projected year, format: YYYY
		sc.close();
		getWorldPopulation(t);
	}
	
	//Method gets projected population of year t
	public static void getWorldPopulation(int t) {
		//The year-end world population of 2021.
		double p2021 = Po + (birthsPerYear - deathsPerYear);
		//r from pt=p0*e^(rt) using p2021 and Po.
		double r = (birthsPerYear - deathsPerYear)/Po;//Math.log(p2021/Po);
		//Pt is the projected total world population.		
		double Pt = Po*Math.exp(r*(t-2021));
		
		System.out.printf("Year-begin world population of 2021 = %,.0f", Po);
		System.out.printf("\n  Year-end world population of 2021 = %,.0f", p2021);
		System.out.printf("\nPopulation growth rate = %,.6f", r);
		System.out.printf("\nBy Year " + t + ", projected world population = %,.0f", Pt);
	}
}