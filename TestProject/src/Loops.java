import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = ""; 
		int numberOfGuess = 0, age = 20, guessAge = 0,i=0,flag = 0;
		
		//takes user input for name
		while(name.isBlank()) {
			System.out.println("Enter your name please: ");
			name = scanner.nextLine();
		}
		
		//prints name 
		System.out.println("Hello "+name+". How many tries would you like to guess my age (1-10)?");
		
		numberOfGuess = scanner.nextInt();
		
//loops until number is in the constraints
		while(numberOfGuess > 10 && numberOfGuess > 0){
			System.out.println("not a valid input");
			numberOfGuess = scanner.nextInt();
		}
		
		//calls format class
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		//initializes date
		Date date = new Date();

			
			while( i < numberOfGuess || flag == 1)
			{
				System.out.println("Guess "+(i+1)+" out of "+numberOfGuess+" : ");
				guessAge = scanner.nextInt();
				if(guessAge == age)
				{
					System.out.println("Congrats on guessing my age!");
					flag++;
					break;
				}
			i++;
			}
			
			if (flag == 0)
				System.out.println("you guessed wrong");
				
		System.out.println("and the day is: "+formatter.format(date));
		scanner.close();
	}

}
