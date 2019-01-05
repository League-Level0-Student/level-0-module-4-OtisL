package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score? (include decimals)");
		double score2 = Double.parseDouble(score);
		if (score2<60) {
			JOptionPane.showMessageDialog(null, "Try harder next time // F");
		}else if (score2>59&&score2<70) {
			JOptionPane.showMessageDialog(null, "Try for a C, but you did better than an F. // D");
		}else if (score2>69&&score2<80) {
			JOptionPane.showMessageDialog(null, "Average, but it's OK. // C");
		}else if (score2>79&&score2<90) {
			JOptionPane.showMessageDialog(null, "Good job! Thats pretty good! // B");
		}else if (score2>89) {
			JOptionPane.showMessageDialog(null, "Great Job! Yopu studied hard and did well! // A");
		}
	}
}
