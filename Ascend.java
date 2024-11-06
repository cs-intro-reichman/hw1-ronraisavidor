// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Check if exactly 1 arguments is provided and it is greater then 0
        if (args.length != 1 || (Integer.parseInt(args[0])<=0)) {
            System.out.println("Please provide exactly 1 arguments: Enter one positive number");
            return;
        }

        // Get the value from the command-line arguments
        int maxNumber = Integer.parseInt(args[0]);

        //Generating three random numbers between 0 to maxNumber
        int a = (int) (Math.random() * (maxNumber+1));
        int b = (int) (Math.random() * (maxNumber+1));
        int c = (int) (Math.random() * (maxNumber+1));

        //Printing the three random numbers
        System.out.printf("the random numbers: %d %d %d %n", a, b, c);

        //Arranging the numbers from smallest to largest
        int min = Math.min(a, Math.min(b, c)); // Finds the minimum of a, b, and c
        int max = Math.max(a, Math.max(b, c)); // Finds the maximum of a, b, and c
        int mid = a + b + c - min - max;// calculating the middle number out of sum of a, b, and c minus the max and min numbers 

        //Printing the three random numbers by ascending order  
        System.out.printf("the random numbers by ascending order: %d %d %d %n", min, mid, max);
	}
}
