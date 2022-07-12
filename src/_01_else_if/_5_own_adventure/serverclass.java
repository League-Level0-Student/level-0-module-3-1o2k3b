package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;

public class serverclass {
	public static void main(String[] args) {
		String x = JOptionPane
				.showInputDialog("to start your adventure, your friend asked you to go explore the ancient caverns.");

		if (x.equals("yes")) {
			JOptionPane.showInputDialog(
					"you and your friend go into the cave, and after a half hour of walking, both of you are terribly lost");
		}
		String w = JOptionPane.showInputDialog("Do you bring out your sword or not?");
		if (w.equals("yes")) {
			JOptionPane.showInputDialog(
					"when you bring out your sword, you notice it's ruby kind of looks like a button.");

		}
		if (w.equals("no")) {
			String a = JOptionPane.showInputDialog(
					"you and your friend wonder around till you find a ruby in the wall, do you take it out?");
			if (a.equals("yes")) {
				String c = JOptionPane.showInputDialog(
						"when you take it out, you realize it looks just like the ruby on your sword, but you have no time to marvel at it, because the ruby reveals a giant chamber with a giant spider inside, do you run,(yes) or break through the chamber and fight the spider?(no)");

				if (c.equals("yes")) {
					String j = JOptionPane.showInputDialog(
							"as you run, the spider hears your feet, and gives a chase, do you deeper into the caves,(no) or fight(yes)");

				} else if (c.equals("no")) {
					String v = JOptionPane.showInputDialog("you and your friend both give a fight, but you seem to be losing, until you give up to the spider, and as you are about to get killed, your friend trips over a rock and lands on your sword, do you say push the ruby(yes) or not(No)?");

					if (v.equals("yes")) {
						String b = JOptionPane.showInputDialog(
								"after a blinding flash, your eyes see a dead spider and a shocked friend, then everything goes dark, do you try to open(yes) them or do you try and get to your friend(no)");
					
						if(b.equals("no")) {
							JOptionPane.showInputDialog("you go in your friends direction, you think, but then you walak off a cliff and die.");
						}
						}
					}
				}

			}

		

		if (x.equals("no")) {
			JOptionPane.showInputDialog("your friend still explores, and finds 1 trillion dollars worth of daimonds");
		}

	}
}

