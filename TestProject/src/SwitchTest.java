import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  keyboard = new Scanner(System.in);
		int flag = 0;
		
		String day = "NULL";
				
		while(flag == 0) {
			
		System.out.println("Please enter the day of the week (lowercase): ");
		
		day = keyboard.nextLine();
		
		if(day.equals("monday")|| day.equals("tuesday")|| day.equals("wednesday")|| day.equals("thursday")|| day.equals("friday")|| day.equals("saturday")|| day.equals("sunday")) {
			flag = 1;
		}
		else {
			System.out.println("Invalid Input, Please try again.");
		}
		}	
	
		switch(day) {
		case "monday": System.out.println("You picked the best day, which is "+day+ "!" );
			break;
		
		case "sunday": System.out.println("Tomorrow is work beacuse today is "+day);
			break;
		
		default: System.out.println("Imagine picking "+day);
		}
	}

}
