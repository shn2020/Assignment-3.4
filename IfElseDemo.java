import javax.swing.JOptionPane;

public class IfElseDemo {
	public static void main(String[] args) {
		String strNumPeople,strNumPlayers;
		int numPeople, numPlayers,groupSize,teamSize;
		groupSize = 0;
		teamSize = 0;
		
		// prompt user to input number of people with JOptionPane
		strNumPeople = JOptionPane.showInputDialog(null,"Enter the number of people: ");
		
		
		// convert values from String to int
		numPeople = Integer.parseInt(strNumPeople);
		
		if (numPeople > 10) {
			groupSize = numPeople / 2;
		}
		else if (numPeople >= 3) {
			groupSize = numPeople / 3;
		}
		else JOptionPane.showMessageDialog(null," The number of people has to be at least 3");
		
		if (groupSize != 0 ) JOptionPane.showMessageDialog(null," Number of People = " + numPeople + 
							   		"\n Group size = " + groupSize);

		strNumPlayers = JOptionPane.showInputDialog(null,"Enter the number of players: ");
		numPlayers = Integer.parseInt(strNumPlayers);
		
		if (numPlayers >= 11 && numPlayers <= 55) {
			teamSize = numPlayers / 11;
			JOptionPane.showMessageDialog(null," Number of Players = " + numPlayers + 
							   "\n Team size = " + teamSize);
		}
		else JOptionPane.showMessageDialog(null," Number of Players = " + numPlayers + 
							"\n Team size = " + 1);
		
		
	}
}