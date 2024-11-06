// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// Check if exactly 1 arguments are provided in the format hh:mm
        if (args.length != 1) {
            System.out.println("Please provide exactly 1 arguments: in the format hh:mm");
            return;
        }

        // Get the value from the command-line arguments
        String time = args[0];

        // Basic format validation: length, position of colon, and digits
        if (time.length() != 5 || time.charAt(2) != ':' || 
            !Character.isDigit(time.charAt(0)) || !Character.isDigit(time.charAt(1)) || 
            !Character.isDigit(time.charAt(3)) || !Character.isDigit(time.charAt(4))) {
            System.out.println("Invalid format. Please use hh:mm format.");
            return;
        }

        // Seperate the numbers - hours and minutes - using substring
        String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);

        //convert the hours and minutes string's into int's 
        int hoursInt = Integer.parseInt(hours);
        int minutesInt = Integer.parseInt(minutes);
        
        // Validate the range of hours and minutes
        if (hoursInt < 0 || hoursInt > 23) {
            System.out.println("Invalid hour - please ensure hours are between 00 and 23");
            return;
        }
        if (minutesInt < 0 || minutesInt > 59) {
            System.out.println("Invalid minutes - please ensure minutes are between 00 and 59");
            return;
        }

        String partOfDay = "AM"; //Creating variable that contains "AM" as default
        
        //In case the hours number is 12 and greater than 12 - the part of the day is "PM"
        //In case the hours greater than 12, reduce 12.
        if (hoursInt >= 12) {
            partOfDay = "PM";
            if (hoursInt > 12){
                hoursInt = hoursInt - 12;
            }
        }

        //Prints the correct time (after Formatting) with "AM" / "PM"
        System.out.printf("%d:%02d %s %n", hoursInt, minutesInt, partOfDay);
	}
}