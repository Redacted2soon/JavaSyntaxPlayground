import java.util.Random;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		//age shows is 1-99
		int age = random.nextInt(100);
		
		if(age>=65) {
			System.out.print("You are a senior citizen");
		}
		
		else if(age == 18) {
			System.out.print("Congrats on entering adulthood");
		}
			
		else if(age>= 18) {
			System.out.print("You are an adult");
		}
		
		else if(age>= 13)
			System.out.print("You are a teenager");
		
		else {
			System.out.print("You are still a child");
		}
		
		System.out.println(" because you are "+age+ " years old");
		
	}

}
