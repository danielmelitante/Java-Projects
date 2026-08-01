import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class FishGame1 extends JPanel {

	int counter = 1;
	String direction = "right";
	String lastHorizontalDirection = "right";
	
	JLabel lblSprite;
	
	ImageIcon icnRight;
	ImageIcon icnLeft;
	
	Image mainFishRight;
	Image mainFishLeft;
	
	int scaleWidth;
	int scaleHeight;
	
	public FishGame1(String type) {
		this.setOpaque(false);
		this.setLayout(null);
		
		lblSprite = new JLabel();
		lblSprite.setBounds(0,0,50,50);
		
		URL urlRight = MainMenuGame1.class.getResource("mainFishRightGame1.gif");
		ImageIcon icnRight = new ImageIcon(urlRight);
		
		URL urlLeft = MainMenuGame1.class.getResource("mainFishLeftGame1.gif");
		ImageIcon icnLeft = new ImageIcon(urlLeft);
		
		Timer t = new Timer(1000/4, e -> {
			switch(direction) {
				case "right":
					lastHorizontalDirection = "right";
					if(counter == 1)
						lblSprite.setIcon(icnRight);
					if(counter == 2)
						lblSprite.setIcon(icnRight);
					break;
				case "left":
					lastHorizontalDirection = "left";
					if(counter == 1)
						lblSprite.setIcon(icnLeft);
					if(counter == 2)
						lblSprite.setIcon(icnLeft);
					break;
				case "up":
					if(lastHorizontalDirection.equals("right")) {
						if (counter == 1) 
							lblSprite.setIcon(icnRight);
						if (counter == 2) 
							lblSprite.setIcon(icnRight);
					} else {
						if (counter == 1) 
							lblSprite.setIcon(icnLeft);
						if (counter == 2) 
							lblSprite.setIcon(icnLeft);
					}
					break;
				case "down":
					if(lastHorizontalDirection.equals("right")) {
						if (counter == 1) 
							lblSprite.setIcon(icnRight);
						if (counter == 2) 
							lblSprite.setIcon(icnRight);
					} else {
						if (counter == 1) 
							lblSprite.setIcon(icnLeft);
						if (counter == 2) 
							lblSprite.setIcon(icnLeft);
					}
					break;
			}

			repaint();
			
		});
		
		t.start();
		
		this.add(lblSprite);
	}
}
