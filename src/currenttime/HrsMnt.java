package currenttime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HrsMnt {

	public static CharSequence time() {
		// Get the current time
		LocalTime currentTime = LocalTime.now();

		// Format the time as "HH:mm"
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		String formattedTime = currentTime.format(formatter);
		formattedTime = formattedTime.replace(":", "");
		// Print the formatted time
		// System.out.println("Current time: " + formattedTime);
		return formattedTime;
	}

}