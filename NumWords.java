// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Check if exactly 1 arguments are provided
        if (args.length != 1) {
            System.out.println("Please provide exactly 1 arguments: Enter one number");
            return;
        }

        // Get the value from the command-line arguments
        int givenNumber = Integer.parseInt(args[0]);

        // seperating the number in terms of hundreds, tens, and ones.
        int hundreds = givenNumber / 100;
        int tens = (givenNumber % 100) / 10;
        int ones = givenNumber % 10;

        //Prints the number in terms of hundreds, tens, and ones - X hundreds, Y tens, and Z ones.
        System.out.printf("%d hundreds, %d tens, and %d ones.%n", 
                          hundreds, tens, ones);
	}
}
