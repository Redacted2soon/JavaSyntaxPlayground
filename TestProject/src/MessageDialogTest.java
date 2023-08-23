import javax.swing.JOptionPane;

public class MessageDialogTest {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("enter your name " );
		
		JOptionPane.showMessageDialog(null,"Hello "+name );
		
		
		int age =  Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		
		JOptionPane.showMessageDialog(null,"you are "+age+ " years old");
		
		Double height =  Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in inches)"));
		
		JOptionPane.showMessageDialog(null,"you are "+height+ " in tall");
		
	}
}
