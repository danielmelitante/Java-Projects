import javax.swing.JFrame;

public class Home {
	public static void main(String[] a) {
		JFrame frame = new JFrame("Animation");
		
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Animation animation = new Animation();
		
		frame.add(animation);
	}
}