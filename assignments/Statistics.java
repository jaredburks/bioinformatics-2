import java.util.Arrays;

public class Statistics {
	
	private double sum;
	private double mean;
	private double sqvarsum;
	double sd;
	double min;
	double max;
	
	public Statistics() {
		
		this.sum = 0;
		this.mean = 0;
		this.sqvarsum = 0;
		this.sd = 0;
		this.min = 0;
		this.max = 0;
		
	}
	
	public double getSum(double [] x) {
		for (int i = 0; i < x.length; i++) {
			this.sum += x[i];
		}
		return this.sum;
	}
	
	public double getMean(double [] x) {
		for (int i = 0; i < x.length; i++) {
			this.mean += x[i];
		}
		return (this.mean)/x.length;
	}
	
	public double getSqVarSum(double [] x) {
		for (int i = 0; i < x.length; i++) {
			this.sqvarsum += Math.pow((x[i] - this.mean), 2);
		}
		return this.sqvarsum;
	}
	
	public double getSd(double [] x) {
		this.sd = Math.sqrt(sqvarsum/(x.length - 1));
		return this.sd;
	}
	
	public double getMax(double [] x) {
		Arrays.sort(x);
		double length = (double)(x.length);
		this.max = x[(int)(length - 1)];
		return this.max;
	}
	
	public double getMin(double [] x) {
		Arrays.sort(x);
		this.min = x[0];
		return this.min;
	}
}