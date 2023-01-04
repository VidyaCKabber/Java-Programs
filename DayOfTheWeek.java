write a code that takes the date and month as input and returns the day. You can assume that the given year is a non-leap year and that the 1st of January is a Monday. 

// Hint: Convert the given date to the number of days since the start of the year, using the if-else loop logic as shown below.

// IF month.equals(“ January”) 
//     dayNumber = inputDay
// ELSE IF month.equals(“ February”)
//     dayNumber = 31 + day
// ELSE IF month.equals(“ March”)
//     dayNumber = 31 + 28 + day
// ………..
// Also, if the day is a Saturday or a Sunday, print Hurray!; otherwise, print "Oh! It's a workday :|". 

// You can use the following logic to write your codes:

// IF Day is not Saturday or Sunday THEN
//   Display - Ohhh! It's a workday :|
// ELSE
//   Display - Hurray!
// ENDIF
// So, if the input month is 'January' and the input date is 2, then the output is "Ohhh! It's a workday :|".

// If the input month is 'January' and the input date is 6, the output is "Hurray!".
  
import java.util.Scanner;
class Source {
	
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		// Enter month
		String month = scan.next();
		// Enter date
		int date = scan.nextInt();
		
		int day = 0;
		switch (month) {
			case "January":
			    day = date;
			    break;
			case "February": 
			    day = 31 + date;
			    break;
		    case "March": 
			    day = 31 + 28 + date;
			    break;
			case "April": 
			    day = 31 + 28+ 31 + date;
			    break;
			case "May": 
			    day = 30 + 31 + 28+ 31 + date;
			    break;
		    case "June": 
			    day = 31 + 30 + 31 + 28+ 31 + date;
			    break;
			case "July": 
			    day = 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
			case "August": 
			    day = 31 + 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
		    case "September": 
			    day = 31 + 31 + 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
			case "October": 
			    day = 30 + 31 + 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
			case "November": 
			    day = 31 + 30 + 31 + 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
			case "December": 
			    day = 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 28+ 31 + date;
			    break;
			default:
			    System.out.print("Invalid month");
			    break;
		}
		
		// From the day number of the year, finding the day no. of the week
		int dayNumber = day % 7;
		
		if (dayNumber == 6 || dayNumber == 7) {
			System.out.print("Hurray!");
		} else {
			System.out.print("Ohhh! It's a work day :|");
		}
		scan.close();
	}
}
