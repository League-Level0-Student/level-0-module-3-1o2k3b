
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		

		String x = "httpswww.youtube.com/watch?v=QkZ3EPQHQsg";
		String lol = JOptionPane.showInputDialog("how many dogs do you have");
		int mami = Integer.parseInt(lol);
		if(mami>2) {
			JOptionPane.showInputDialog("you're a crazy dog person");
		}
		if(mami<3 && mami>0) {
			
			
			//playVideo(x);
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		//https://www.youtube.com/watch?v=QkZ3EPQHQsg
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

