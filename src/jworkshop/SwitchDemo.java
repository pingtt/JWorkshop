package jworkshop;

public class SwitchDemo {
	
	public void integerSwitch(int month){
		
		String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        
        System.out.println(monthString);
	}
	
	public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
	
	public void enumSwitch(Day today){
		
		String dayString = null;
		switch (today) {
			case MON:  dayString = "Monday";
			break;
			case TUE: dayString = "Tuesday";
			break;
			case WED: dayString = "Wednesday";
			break;
			case THU: dayString = "Thursday";
			break;
			case FRI: dayString = "Friday";
			break;
			case SAT: dayString = "Saturday";
			break;
			case SUN: dayString = "Sunday";
			break;
		}
		
		System.out.println(dayString);
	}
	
    public static void main(String[] args) {

    		SwitchDemo sw = new SwitchDemo();
    		sw.integerSwitch(4);
    		
    		sw.enumSwitch(Day.TUE);

        
    }
}
