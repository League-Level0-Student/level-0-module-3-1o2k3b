import javax.swing.JOptionPane;

public class serverclass {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("to start your adventure, your friend asked you to go explore the ancient caverns.");

	if(x.equals ("yes")) {
JOptionPane.showInputDialog("you and your friend go into the cave, and after a half hour of walking, both of you are terribly lost");
String w = JOptionPane.showInputDialog("Do you bring out your sword or not?");
if(w.equals("yes")) {
JOptionPane.showInputDialog("when you bring out your sword, you notice it's ruby kind of looks like a button.");	
}
else if(w.equals("no")) {
String a = JOptionPane.showInputDialog("you and your friend wonder around till you find a ruby in the wall, do you take it out?");
if(a.equals("yes")) {
String c = JOptionPane.showInputDialog("when you take it out, you realize it looks just like the ruby on your sword, but you have no time to marvel at it, because the ruby reveals a giant chamber with a giant spider inside, do you run, or break through the chamber and fight the spider?");
	
}
}



	}
else if(x.equals("no")) {
	JOptionPane.showInputDialog("your friend still explores, and finds 1 trillion dollars worth of daimonds");
}
	
	

}
}