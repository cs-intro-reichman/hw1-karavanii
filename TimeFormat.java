// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		//private case of midnight
		if (hours == 0 && minutes == 0) {
                System.out.println("0:00 AM");
    			return; // stops
             }
			 // private case of 12:00pm
			 if (hours == 12 && minutes == 0) {
				System.out.println("12:00 PM");
				return;
			 }
			 // private case of 12's pm
			 if (hours == 12) {
   				 if (minutes < 10) {
      			  System.out.println(hours + ":" + "0" + minutes + "PM");
 		   } else {
        		  System.out.println(hours + ":" + minutes + "PM");
  			  }
    			return;
}
		// PM cases
		if (hours > 12) {
			hours = hours - 12;
			if (minutes < 10) {
				System.out.println(hours + ":" + "0" + minutes + "PM");
			}
			else{
				System.out.println(hours + ":" + minutes + "PM");
			}
		}
		// AM cases
		else if (minutes<10)
		System.out.println(hours + ":" + "0" + minutes + "AM");
		else {
			System.out.println(hours + ":" + minutes + "AM");
		}
	}
}