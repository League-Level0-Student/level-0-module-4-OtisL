package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score? (include decimals)");
		double score2 = Double.parseDouble(score);
		if (score2<50) {
			JOptionPane.showMessageDialog(null, "Try harder next time // F");
		}else if (score2>49&&score2<60) {
			JOptionPane.showMessageDialog(null, "Try for a C, but you did better than an F. // D");
		}else if 
	}
}
