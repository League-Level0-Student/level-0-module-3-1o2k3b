
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
		

		while (true) {

			String color = JOptionPane.showInputDialog(
					"what color would you like to use for square drawing?(-purple and brown, if you do it will show up as a random color)");

			if (color.equals("red")) {
				rob.setPenColor(Color.red);
			} else if (color.equals("blue")) {
				rob.setPenColor(Color.blue);
			} else if (color.equals("green")) {
				rob.setPenColor(Color.green);
			} else if (color.equals("pink")) {
				rob.setPenColor(Color.pink);
			} else if (color.equals("black")) {
				rob.setPenColor(Color.black);
			} else if (color.equals("yellow")) {
				rob.setPenColor(Color.yellow);
			} else if (color.equals("orange")) {
				rob.setPenColor(Color.orange);
			} else if (color.equals("white")) {
				rob.setPenColor(Color.white);
			} else if (color.equals("lemmeout")) {
				System.exit(0);

			} else {
				rob.setRandomPenColor();
			}
			rob.penDown();
			rob.setSpeed(13);
			rob.setPenWidth(10);
			for (int i = 0; i < 4; i++) {
				rob.move(100);
				rob.turn(90);
			}

		}

		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
