// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// insert current value , rate, years
		int CV = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		// interest calculation
		Double interest = rate/100.0;
		// print summary
		System.out.println("After " + years + " years, $" + CV + " saved at " + rate + "% will yield " + "$" +(int)(CV * Math.pow(1 + interest, years)));
	}
}