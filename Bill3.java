// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		/// Check if exactly 4 arguments are provided - 3 names and the sum of the bill
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 arguments: the three diners names and the sum of of the bill:");
            return;
        }

        // Get the values from the command-line arguments
        String person1 = args[0];
        String person2 = args[1];   
        String person3 = args[2];
        int billSum = Integer.parseInt(args[3]);

        //Calculating each person share from the final bill, and print the final result
        double share = Math.ceil((double)billSum / 3);
        System.out.printf("Dear %s, %s, and %s: pay %.2f Shekels each.%n", 
                          person3, person2, person1, share);
	}
}
