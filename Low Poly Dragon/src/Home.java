import java.awt.*;
import javax.swing.*;

public class Home {
	public static void main(String[] args) {
		MyCanvas dragon = new MyCanvas();

		JFrame frame = new JFrame();
		frame.setSize(775,775);
		frame.setVisible(true);

		frame.add(dragon);
	}
}