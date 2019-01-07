package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Story {
	public static void main(String[] args) {
		int a = JOptionPane.showOptionDialog(null, "You are in a dark forest. You see a cave and nothing else. What do you do?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Continue walking", "Go to cave"}, null);
		if (a==1) {
			int b = JOptionPane.showOptionDialog(null, "You walk a bit further until you come to a divide. Where do you go?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Left", "Right"}, null);
			if (b==0) {
				int c = JOptionPane.showOptionDialog(null, "You walk for a long way and you start to get tired. Do you want to stop and rest?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Yes", "No"}, null);
				if (c==1) {
					JOptionPane.showMessageDialog(null, "You keep walking even though you are tired. Finally, you reach the end and there is a small town there! You have been saved!", "Yay", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "You take a rest. But a creature in the cave devours you!", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null, "You continue to walk on the right part. Then you trip on the edge of a pit! You fall to your death.", "Oops!", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "You approach a cliff and don't notice it until it's too late! You fall to your death", "Oops!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
