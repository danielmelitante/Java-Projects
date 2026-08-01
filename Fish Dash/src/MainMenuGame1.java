import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class MainMenuGame1 {
	public static void main(String[] a) {
		JFrame frameMainMenu = new JFrame("Welcome!");

		frameMainMenu.setSize(800, 600);
		frameMainMenu.setVisible(true);
		frameMainMenu.setLayout(null);

		URL urlBackgroundGame1 = MainMenuGame1.class.getResource("backgroundGame1.gif");
		ImageIcon backgroundImage = new ImageIcon(urlBackgroundGame1);
		JLabel lblMainMenuBackgroundGame1 = new JLabel(backgroundImage);	
		lblMainMenuBackgroundGame1.setBounds(0, 0, frameMainMenu.getWidth(), frameMainMenu.getHeight());

		URL urlBubble1Game1 = MainMenuGame1.class.getResource("bubbleBackground1Game1.gif");
		ImageIcon bubbleBackground1Game1 = new ImageIcon(urlBubble1Game1);
		JLabel lblBubbleBackground1Game1 = new JLabel(bubbleBackground1Game1);
		lblBubbleBackground1Game1.setBounds(-270, 0, frameMainMenu.getWidth(), frameMainMenu.getHeight());

		URL urlBubble2Game1 = MainMenuGame1.class.getResource("bubbleBackground2Game1.gif");
		ImageIcon bubbleBackground2Game1 = new ImageIcon(urlBubble2Game1);
		JLabel lblBubbleBackground2Game1 = new JLabel(bubbleBackground2Game1);
		lblBubbleBackground2Game1.setBounds(-6, 0, frameMainMenu.getWidth(), frameMainMenu.getHeight());
		
		URL urlBubble3Game1 = MainMenuGame1.class.getResource("bubbleBackground3Game1.gif");
		ImageIcon bubbleBackground3Game1 = new ImageIcon(urlBubble3Game1);
		JLabel lblBubbleBackground3Game1 = new JLabel(bubbleBackground3Game1);
		lblBubbleBackground3Game1.setBounds(255, 0, frameMainMenu.getWidth(), frameMainMenu.getHeight());

		ImageIcon playIconGame1 = new ImageIcon(MainMenuGame1.class.getResource("playIconGame1.png"));
		ImageIcon quitGameIconGame1 = new ImageIcon(MainMenuGame1.class.getResource("quitGameIconGame1.png"));

		JLabel lblFishDash = new JLabel("Fish Dash");
		lblFishDash.setForeground(Color.BLACK);
		lblFishDash.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		lblFishDash.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFishDash.setBounds(205, 125, 500, 100);

		JButton btnPlayGame1 = new JButton("Play");
		btnPlayGame1.setForeground(Color.BLACK);
		btnPlayGame1.setIcon(playIconGame1);
		btnPlayGame1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlayGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnPlayGame1.setContentAreaFilled(false);
		btnPlayGame1.setFocusPainted(false);
		btnPlayGame1.setBorderPainted(false);
		btnPlayGame1.setBounds(290, 275, 200, 60);

		btnPlayGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameMainMenu.setVisible(false);

				JFrame frameGameScreen = new JFrame("Fish Dash");
				frameGameScreen.setSize(800, 600);
				frameGameScreen.setVisible(true);

				GameScreenGame1 gameScreen = new GameScreenGame1(frameMainMenu);

				frameGameScreen.add(gameScreen);
				frameGameScreen.revalidate();
				frameGameScreen.setLocationRelativeTo(null);
				frameGameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlayGame1.setForeground(Color.WHITE);
				btnPlayGame1.setBounds(290, 280, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPlayGame1.setForeground(Color.BLACK);
				btnPlayGame1.setBounds(290, 275, 200, 60);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton btnQuitGameGame1 = new JButton("Quit Game");
		btnQuitGameGame1.setForeground(Color.BLACK);
		btnQuitGameGame1.setIcon(quitGameIconGame1);
		btnQuitGameGame1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQuitGameGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnQuitGameGame1.setContentAreaFilled(false);
		btnQuitGameGame1.setFocusPainted(false);
		btnQuitGameGame1.setBorderPainted(false);
		btnQuitGameGame1.setBounds(290, 350, 200, 60);

		btnQuitGameGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnQuitGameGame1.setForeground(Color.RED);
				btnQuitGameGame1.setBounds(290, 355, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnQuitGameGame1.setForeground(Color.BLACK);
				btnQuitGameGame1.setBounds(290, 350, 200, 60);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});

		frameMainMenu.add(btnPlayGame1);
		frameMainMenu.add(btnQuitGameGame1);
		frameMainMenu.add(lblFishDash);
		frameMainMenu.add(lblBubbleBackground1Game1);
		frameMainMenu.add(lblBubbleBackground2Game1);
		frameMainMenu.add(lblBubbleBackground3Game1);
		frameMainMenu.add(lblMainMenuBackgroundGame1);

		frameMainMenu.repaint();
		frameMainMenu.revalidate();
		frameMainMenu.setLocationRelativeTo(null);
		frameMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
