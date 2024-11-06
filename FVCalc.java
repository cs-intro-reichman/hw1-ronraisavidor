// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		/// Check if exactly 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 arguments: The current value, the annual interest rate and the number of years:");
            return;
        }

        // Get the values from the command-line arguments
        int currentValue = Integer.parseInt(args[0]);
        double annualInterestRate = Double.parseDouble(args[1])/ 100; // Convert percentage to decimal;
        int numberOfYears = Integer.parseInt(args[2]);

        // Calculating the future value - 𝑓𝑢𝑡𝑢𝑟𝑒𝑉𝑎𝑙𝑢𝑒 = 𝑐𝑢𝑟𝑟𝑒𝑛𝑡𝑉𝑎𝑙𝑢𝑒 ⋅ (1 + 𝑟𝑎𝑡𝑒)**n
        double futureValue = currentValue * Math.pow((1+annualInterestRate), numberOfYears);

        //Prints the future value according to the given arguments. 
        System.out.printf("After %d years, a $%d saved at %.1f%% will yield $%d.%n", 
                          numberOfYears, currentValue, annualInterestRate*100, (int)futureValue);
	}
}