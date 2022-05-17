package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class OlenClassOfHappinessLevels {
public static void main(String[] args) {
String x = JOptionPane.showInputDialog(null, "are you happy?");

  	
if(x.equals("no")) {
JOptionPane.showInputDialog("do you want to be happy?!");
 if(x.equals("no")) {
	JOptionPane.showInputDialog("you are sad :( not happy:) or regular(-_-");	
	}
 if(x.equals("yes")) {
	 JOptionPane.showInputDialog("you are regular(-_-) not sad:( or happy:)");	
	 }

	
	if(x.equals("yes")) {
JOptionPane.showInputDialog("you are happy :) not sad :( or regular -_-");	
}
}
} 
}