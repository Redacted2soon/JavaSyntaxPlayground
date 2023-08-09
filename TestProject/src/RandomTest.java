import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int x = rand.nextInt();
		double y = rand.nextDouble();
		boolean z = rand.nextBoolean();
		
		
		System.out.println("random Int: "+x);
		System.out.println("random Double: "+y);
		System.out.println("random Bool: "+z);

	}

}
