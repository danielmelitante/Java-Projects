import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GameScreenGame1 extends JPanel {
	
	FishGame1 fish;
    int fishX = 375, fishY = 275;
    int fishWidth = 50, fishHeight = 50;
    String fishDirection = "still";

    Random rand = new Random();
    int xFoodFish = rand.nextInt(800) - 50;
    int yFoodFish = rand.nextInt(600) - 50;
    int foodFishWidth = 50, foodFishHeight = 50;
    
    int scoreGame1 = 0;
    JLabel lblScoreGame1;
    
    int[] enemyFishSpeeds = new int[10];
    
    int enemyFish1Width = 50; 
    int enemyFish1Height = 32;
    int xEnemyFish1 = -100; 
    int yEnemyFish1 = 10 +  rand.nextInt(500);
    
    int enemyFish2Width = 50;
    int enemyFish2Height = 32;
    int xEnemyFish2 = -100;
    int yEnemyFish2 = 10 +  rand.nextInt(500);    
    int enemyFish3Width = 50; 
    int enemyFish3Height = 32;
    int xEnemyFish3 = 900; 
    int yEnemyFish3 = 10 +  rand.nextInt(500);
    int enemyFish4Width = 50; 
    int enemyFish4Height = 32;
    int xEnemyFish4 = 900; 
    int yEnemyFish4 = 10 +  rand.nextInt(500);
    int enemyFish5Width = 50; 
    int enemyFish5Height = 28;
    int xEnemyFish5 = 900;
    int yEnemyFish5 = 10 +  rand.nextInt(500);
    int enemyFish6Width = 50; 
    int enemyFish6Height = 33;
    int xEnemyFish6 = 900; 
    int yEnemyFish6 = 10 +  rand.nextInt(500);
    int enemyFish7Width = 50;  
    int enemyFish7Height = 29;
    int xEnemyFish7 = -100;
    int yEnemyFish7 = 10 +  rand.nextInt(500);
    int enemyFish8Width = 50;
    int enemyFish8Height = 27;
    int xEnemyFish8 = -100;
    int yEnemyFish8 = 10 +  rand.nextInt(500);
    int enemyFish9Width = 50;
    int enemyFish9Height = 31;
    int xEnemyFish9 = -100;
    int yEnemyFish9 = 10 +  rand.nextInt(500);
    int enemyFish10Width = 50;
    int enemyFish10Height = 40;
    int xEnemyFish10 = 900;
    int yEnemyFish10 = 10 +  rand.nextInt(500);
    
    boolean isColliding = false;
    
    boolean gameOver = false;
    
    boolean isPaused = false;

    Image backgroundImageGame1;
    Image bubble1Game1;
    Image bubble2Game1;
    Image bubble3Game1;
    
    Image foodFish;
    Image enemyFish1;
    Image enemyFish2;
    Image enemyFish3;
    Image enemyFish4;
    Image enemyFish5;
    Image enemyFish6;
    Image enemyFish7;
    Image enemyFish8;
    Image enemyFish9;
    Image enemyFish10;
    
    ImageIcon pauseIconGame1;
    ImageIcon continueIconGame1;
    ImageIcon retryIconGame1;
    ImageIcon mainMenuIconGame1;
    
    JFrame frameGameScreen;
    
    JButton btnPauseGame1;
    JButton btnRetryGame1;
    JButton btnMainMenuGame1;
    
    Timer timer;
    
    public GameScreenGame1(JFrame frameMainMenu) {
    	this.frameGameScreen = frameMainMenu;
        this.setLayout(null);

        fish = new FishGame1("Fish");
        this.add(fish);

        lblScoreGame1 = new JLabel("Score : " + scoreGame1);
        lblScoreGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblScoreGame1.setBounds(20, 5, 150, 50);
        this.add(lblScoreGame1);
        
        for (int i = 0; i < enemyFishSpeeds.length; i++) {
            enemyFishSpeeds[i] = 2 + rand.nextInt(5);
        }

        backgroundImageGame1 = new ImageIcon(getClass().getResource("backgroundGame1.gif")).getImage();
        foodFish = new ImageIcon(getClass().getResource("foodFishGame1.gif")).getImage();
        enemyFish1 = new ImageIcon(getClass().getResource("Fish1Game1.png")).getImage();
        enemyFish2 = new ImageIcon(getClass().getResource("Fish2Game1.png")).getImage();
        enemyFish3 = new ImageIcon(getClass().getResource("Fish3Game1.png")).getImage();
        enemyFish4 = new ImageIcon(getClass().getResource("Fish4Game1.png")).getImage();
        enemyFish5 = new ImageIcon(getClass().getResource("Fish5Game1.png")).getImage();
        enemyFish6 = new ImageIcon(getClass().getResource("Fish6Game1.png")).getImage();
        enemyFish7 = new ImageIcon(getClass().getResource("Fish7Game1.png")).getImage();
        enemyFish8 = new ImageIcon(getClass().getResource("Fish8Game1.png")).getImage();
        enemyFish9 = new ImageIcon(getClass().getResource("Fish9Game1.png")).getImage();
        enemyFish10 = new ImageIcon(getClass().getResource("Fish10Game1.png")).getImage();
        
        retryIconGame1 = new ImageIcon(getClass().getResource("retryIconGame1.png"));
        mainMenuIconGame1 = new ImageIcon(getClass().getResource("mainMenuIconGame1.png"));
        pauseIconGame1 = new ImageIcon(getClass().getResource("pauseIconGame1.png"));
        continueIconGame1 = new ImageIcon(getClass().getResource("continueIconGame1.png"));
        
        btnPauseGame1 = new JButton();
        btnPauseGame1.setIcon(pauseIconGame1);
        btnPauseGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPauseGame1.setContentAreaFilled(false);
        btnPauseGame1.setFocusPainted(false);
        btnPauseGame1.setBorderPainted(false);
        btnPauseGame1.setBounds(725, 10, 50, 50);
        this.add(btnPauseGame1);
        
        btnPauseGame1.addActionListener(e -> {
            if (isPaused) {
                timer.start();
                isPaused = false;
                btnPauseGame1.setIcon(pauseIconGame1);
                btnRetryGame1.setVisible(false);
                btnMainMenuGame1.setVisible(false);
            } else {
                timer.stop();
                isPaused = true;
                btnPauseGame1.setIcon(continueIconGame1);
                btnRetryGame1.setVisible(true);
                btnMainMenuGame1.setVisible(true);
            }
        });
        
        btnRetryGame1 = new JButton("Retry");
        btnRetryGame1.setForeground(Color.BLACK);
        btnRetryGame1.setVisible(false);
        btnRetryGame1.setIcon(retryIconGame1);
        btnRetryGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRetryGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        btnRetryGame1.setContentAreaFilled(false);
        btnRetryGame1.setFocusPainted(false);
        btnRetryGame1.setBorderPainted(false);
        btnRetryGame1.setBounds(290, 220, 200, 60);
        this.add(btnRetryGame1);
        
        btnRetryGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resetGame();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnRetryGame1.setForeground(Color.WHITE);
				btnRetryGame1.setBounds(290, 225, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnRetryGame1.setForeground(Color.BLACK);
				btnRetryGame1.setBounds(290, 220, 200, 60);
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
        
        btnMainMenuGame1 = new JButton("Main menu");
        btnMainMenuGame1.setForeground(Color.BLACK);
        btnMainMenuGame1.setVisible(false);
        btnMainMenuGame1.setIcon(mainMenuIconGame1);
        btnMainMenuGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMainMenuGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        btnMainMenuGame1.setContentAreaFilled(false);
        btnMainMenuGame1.setFocusPainted(false);
        btnMainMenuGame1.setBorderPainted(false);
        btnMainMenuGame1.setBounds(290, 295, 200, 60);
        this.add(btnMainMenuGame1);
        
        btnMainMenuGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameGameScreen.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnMainMenuGame1.setForeground(Color.WHITE);
				btnMainMenuGame1.setBounds(290, 300, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMainMenuGame1.setForeground(Color.BLACK);
				btnMainMenuGame1.setBounds(290, 295, 200, 60);
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

        timer = new Timer(1000 / 60, e -> {

            int moveSpeed = 5;
            switch (fishDirection) {
                case "right":
                    fish.direction = "right";
                    if (fishX < getWidth() - fishWidth) {
                        fishX += moveSpeed;
                    }
                    break;
                case "left":
                    fish.direction = "left";
                    if (fishX > 0) {
                        fishX -= moveSpeed;
                    }
                    break;
                case "up":
                    fish.direction = "up";
                    if (fishY > 0) {
                        fishY -= moveSpeed;
                    }
                    break;
                case "down":
                    fish.direction = "down";
                    if (fishY < getHeight() - fishHeight) {
                        fishY += moveSpeed;
                    }
                    break;
            }

            fish.setBounds(fishX, fishY, fishWidth, fishHeight);

            checkIfCollided();
            animate();   

            setFocusable(true);
            requestFocusInWindow();
            repaint();
        });

        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
		            case KeyEvent.VK_D:
		                fishDirection = "right";
		                break;
                    case KeyEvent.VK_A:
                        fishDirection = "left";
                        break;
                    case KeyEvent.VK_W:
                        fishDirection = "up";
                        break;
                    case KeyEvent.VK_S:
                        fishDirection = "down";
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_D:
                        if (fishDirection.equals("right")) {
                            fishDirection = "still";
                        }
                        break;
                    case KeyEvent.VK_A:
                        if (fishDirection.equals("left")) {
                            fishDirection = "still";
                        }
                        break;
                    case KeyEvent.VK_W:
                        if (fishDirection.equals("up")) {
                            fishDirection = "still";
                        }
                        break;
                    case KeyEvent.VK_S:
                        if (fishDirection.equals("down")) {
                            fishDirection = "still";
                        }
                        break;
                }
            }
        });

        timer.start();
    }

    void animate() {
	 	xEnemyFish1 += enemyFishSpeeds[0];
	    xEnemyFish2 += enemyFishSpeeds[1];
	    xEnemyFish3 -= enemyFishSpeeds[2];
	    xEnemyFish4 -= enemyFishSpeeds[3];
	    xEnemyFish5 -= enemyFishSpeeds[4];
	    xEnemyFish6 -= enemyFishSpeeds[5];
	    xEnemyFish7 += enemyFishSpeeds[6];
	    xEnemyFish8 += enemyFishSpeeds[7];
	    xEnemyFish9 += enemyFishSpeeds[8];
	    xEnemyFish10 -= enemyFishSpeeds[9];

        if (xEnemyFish1 >= 850) {
            xEnemyFish1 = -100;
            yEnemyFish1 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[0] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish2 >= 850) {
            xEnemyFish2 = -100;
            yEnemyFish2 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[1] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish3 <= -100) {
            xEnemyFish3 = 900;
            yEnemyFish3 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[2] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish4 <= -100) {
            xEnemyFish4 = 900;
            yEnemyFish4 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[3] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish5 <= -100) {
            xEnemyFish5 = 900;
            yEnemyFish5 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[4] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish6 <= -100) {
            xEnemyFish6 = 900;
            yEnemyFish6 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[5] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish7 >= 850) {
            xEnemyFish7 = -100;
            yEnemyFish7 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[6] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish8 >= 850) {
            xEnemyFish8 = -100; 
            yEnemyFish8 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[7] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish9 >= 850) {
            xEnemyFish9 = -100; 
            yEnemyFish9 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[8] = 4 + rand.nextInt(7);
        }

        if (xEnemyFish10 <= -100) { 
            xEnemyFish10 = 900; 
            yEnemyFish10 = 10 +  rand.nextInt(500);
            enemyFishSpeeds[9] = 4 + rand.nextInt(7);
        }

        repaint();
    }


    void checkIfCollided() {
        boolean collided = false;
        
        if (fishX < xFoodFish + 50 && fishX + fishWidth > xFoodFish && fishY < yFoodFish + 50 && fishY + fishHeight > yFoodFish) {
        	
        	scoreGame1 += 1;
        	lblScoreGame1.setText("Score : " + String.valueOf(scoreGame1));

            xFoodFish = rand.nextInt(getWidth() - 50);
            yFoodFish = rand.nextInt(getHeight() - 50);
            
            repaint();
        }    

        if (fishX < xEnemyFish1 + enemyFish1Width && fishX + fishWidth > xEnemyFish1 && fishY < yEnemyFish1 + enemyFish1Height && fishY + fishHeight > yEnemyFish1) {
            collided = true;
        } else if (fishX < xEnemyFish2 + enemyFish2Width && fishX + fishWidth > xEnemyFish2 && fishY < yEnemyFish2 + enemyFish2Height && fishY + fishHeight > yEnemyFish2) {
            collided = true;
        } else if (fishX < xEnemyFish3 + enemyFish3Width && fishX + fishWidth > xEnemyFish3 && fishY < yEnemyFish3 + enemyFish3Height && fishY + fishHeight > yEnemyFish3) {
            collided = true;
        } else if (fishX < xEnemyFish4 + enemyFish4Width && fishX + fishWidth > xEnemyFish4 && fishY < yEnemyFish4 + enemyFish4Height && fishY + fishHeight > yEnemyFish4) {
            collided = true;
        } else if (fishX < xEnemyFish5 + enemyFish5Width && fishX + fishWidth > xEnemyFish5 && fishY < yEnemyFish5 + enemyFish5Height && fishY + fishHeight > yEnemyFish5) {
            collided = true;
        } else if (fishX < xEnemyFish6 + enemyFish6Width && fishX + fishWidth > xEnemyFish6 && fishY < yEnemyFish6 + enemyFish6Height && fishY + fishHeight > yEnemyFish6) {
            collided = true;
        } else if (fishX < xEnemyFish7 + enemyFish7Width && fishX + fishWidth > xEnemyFish7 && fishY < yEnemyFish7 + enemyFish7Height && fishY + fishHeight > yEnemyFish7) {
            collided = true;
        } else if (fishX < xEnemyFish8 + enemyFish8Width && fishX + fishWidth > xEnemyFish8 && fishY < yEnemyFish8 + enemyFish8Height && fishY + fishHeight > yEnemyFish8) {
            collided = true;
        } else if (fishX < xEnemyFish9 + enemyFish9Width && fishX + fishWidth > xEnemyFish9 && fishY < yEnemyFish9 + enemyFish9Height && fishY + fishHeight > yEnemyFish9) {
            collided = true;
        } else if (fishX < xEnemyFish10 + enemyFish10Width && fishX + fishWidth > xEnemyFish10 && fishY < yEnemyFish10 + enemyFish10Height && fishY + fishHeight > yEnemyFish10) {
            collided = true;
        }

    	if (collided) {
            gameOver = true;
            
            JLabel lblGameOverGame1 = new JLabel("Game Over");
            lblGameOverGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
            lblGameOverGame1.setForeground(Color.RED);
            lblGameOverGame1.setHorizontalTextPosition(SwingConstants.CENTER);
            lblGameOverGame1.setBounds(175, 125, 500, 100);
            this.add(lblGameOverGame1);
            
            JLabel lblMessage = new JLabel("Great Work! You've got");
            lblMessage.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
            lblMessage.setForeground(Color.WHITE);
            lblMessage.setHorizontalTextPosition(SwingConstants.CENTER);
            lblMessage.setBounds(248, 200, 500, 100);
            this.add(lblMessage);
            
            JLabel lblPoints = new JLabel(scoreGame1 + " points");
            lblPoints.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
            lblPoints.setForeground(Color.WHITE);
            lblPoints.setHorizontalTextPosition(SwingConstants.CENTER);
            lblPoints.setBounds(345, 250, 500, 100);
            this.add(lblPoints);
            
            btnRetryGame1.setVisible(true);
            btnRetryGame1.setForeground(Color.BLACK);
            btnRetryGame1.setBounds(175, 350, 200, 60);

            btnRetryGame1.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					resetGame();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					btnRetryGame1.setForeground(Color.WHITE);
					btnRetryGame1.setBounds(175, 355, 200, 60);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					btnRetryGame1.setForeground(Color.BLACK);
					btnRetryGame1.setBounds(175, 350, 200, 60);
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
            
            btnMainMenuGame1.setVisible(true);
            btnMainMenuGame1.setForeground(Color.BLACK);
            btnMainMenuGame1.setBounds(410, 350, 200, 60);
            
            btnMainMenuGame1.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frameGameScreen.setVisible(true);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					btnMainMenuGame1.setForeground(Color.WHITE);
					btnMainMenuGame1.setBounds(410, 355, 200, 60);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					btnMainMenuGame1.setForeground(Color.BLACK);
					btnMainMenuGame1.setBounds(410, 350, 200, 60);
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
            
            lblScoreGame1.setVisible(false);
            btnPauseGame1.setVisible(false);
            
            this.revalidate();
            this.repaint();
            timer.stop();
        }
		isColliding = collided;
	}

    void resetGame() {
        fishX = 375;
        fishY = 275;
        fishWidth = 50;
        fishHeight = 50;
        
        fishDirection = "still"; 
        
        scoreGame1 = 0;
        lblScoreGame1 = new JLabel("Score : " + scoreGame1);
        lblScoreGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblScoreGame1.setBounds(20, 5, 150, 50);
        
        enemyFish1Width = 50;
        enemyFish1Height = 32;
        enemyFish2Width = 50;
        enemyFish2Height = 32;
        enemyFish3Width = 50;
        enemyFish3Height = 32;
        enemyFish4Width = 50;
        enemyFish4Height = 32;
        enemyFish5Width = 50;
        enemyFish5Height = 28;
        enemyFish6Width = 50;
        enemyFish6Height = 33;
        enemyFish7Width = 50;
        enemyFish7Height = 29;
        enemyFish8Width = 50;
        enemyFish8Height = 27;
        enemyFish9Width = 50;
        enemyFish9Height = 31;
        enemyFish10Width = 50;
        enemyFish10Height = 40;
        
        xEnemyFish1 = -100;
        yEnemyFish1 = 10 +  rand.nextInt(500);
        xEnemyFish2 = -100;
        yEnemyFish2 = 10 +  rand.nextInt(500);
        xEnemyFish3 = 900;
        yEnemyFish3 = 10 +  rand.nextInt(500);
        xEnemyFish4 = 900;
        yEnemyFish4 = 10 +  rand.nextInt(500);
        xEnemyFish5 = 900;
        yEnemyFish5 = 10 +  rand.nextInt(500);
        xEnemyFish6 = 900;
        yEnemyFish6 = 10 +  rand.nextInt(500);
        xEnemyFish7 = -100;
        yEnemyFish7 = 10 +  rand.nextInt(500);
        xEnemyFish8 = -100;
        yEnemyFish8 = 10 +  rand.nextInt(500);
        xEnemyFish9 = -100;
        yEnemyFish9 = 10 +  rand.nextInt(500);
        xEnemyFish10 = 900;
        yEnemyFish10 = 10 +  rand.nextInt(500);
        
        xFoodFish = rand.nextInt(800) - 50;
        yFoodFish = rand.nextInt(600) - 50;
        
        isColliding = false;
        gameOver = false;
        isPaused = false;
        
        btnPauseGame1 = new JButton();
        btnPauseGame1.setIcon(pauseIconGame1);
        btnPauseGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPauseGame1.setContentAreaFilled(false);
        btnPauseGame1.setFocusPainted(false);
        btnPauseGame1.setBorderPainted(false);
        btnPauseGame1.setBounds(725, 10, 50, 50);
        this.add(btnPauseGame1);
        
        btnPauseGame1.addActionListener(e -> {
            if (isPaused) {
                timer.start();
                isPaused = false;
                btnPauseGame1.setIcon(pauseIconGame1);
                btnRetryGame1.setVisible(false);
                btnMainMenuGame1.setVisible(false);
            } else {
                timer.stop();
                isPaused = true;
                btnPauseGame1.setIcon(continueIconGame1);
                btnRetryGame1.setVisible(true);
                btnMainMenuGame1.setVisible(true);
            }
        });
        
        btnRetryGame1 = new JButton("Retry");
        btnRetryGame1.setForeground(Color.BLACK);
        btnRetryGame1.setVisible(false);
        btnRetryGame1.setIcon(retryIconGame1);
        btnRetryGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRetryGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        btnRetryGame1.setContentAreaFilled(false);
        btnRetryGame1.setFocusPainted(false);
        btnRetryGame1.setBorderPainted(false);
        btnRetryGame1.setBounds(290, 220, 200, 60);
        this.add(btnRetryGame1);
        
        btnRetryGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resetGame();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnRetryGame1.setForeground(Color.WHITE);
				btnRetryGame1.setBounds(290, 225, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnRetryGame1.setForeground(Color.BLACK);
				btnRetryGame1.setBounds(290, 220, 200, 60);
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
        
        btnMainMenuGame1 = new JButton("Main menu");
        btnMainMenuGame1.setForeground(Color.BLACK);
        btnMainMenuGame1.setVisible(false);
        btnMainMenuGame1.setIcon(mainMenuIconGame1);
        btnMainMenuGame1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMainMenuGame1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        btnMainMenuGame1.setContentAreaFilled(false);
        btnMainMenuGame1.setFocusPainted(false);
        btnMainMenuGame1.setBorderPainted(false);
        btnMainMenuGame1.setBounds(290, 295, 200, 60);
        this.add(btnMainMenuGame1);
        
        btnMainMenuGame1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameGameScreen.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnMainMenuGame1.setForeground(Color.WHITE);
				btnMainMenuGame1.setBounds(290, 300, 200, 60);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMainMenuGame1.setForeground(Color.BLACK);
				btnMainMenuGame1.setBounds(290, 295, 200, 60);
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
        
        animate();
        checkIfCollided();
        
        removeAll();
        this.add(lblScoreGame1);
        this.add(fish); 
        this.add(btnPauseGame1);
        this.add(btnRetryGame1);
        this.add(btnMainMenuGame1);
        this.revalidate();
        this.repaint();
        timer.start();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImageGame1, 0, 0, this.getWidth(), this.getHeight(), this);
        
        g.drawImage(foodFish, xFoodFish, yFoodFish, foodFishWidth, foodFishHeight, this);
        
        g.drawImage(enemyFish1, xEnemyFish1, yEnemyFish1, enemyFish1Width, enemyFish1Height, this);
        g.drawImage(enemyFish2, xEnemyFish2, yEnemyFish2, enemyFish2Width, enemyFish2Height, this);
        g.drawImage(enemyFish3, xEnemyFish3, yEnemyFish3, enemyFish3Width, enemyFish3Height, this);
        g.drawImage(enemyFish4, xEnemyFish4, yEnemyFish4, enemyFish4Width, enemyFish4Height, this);
        g.drawImage(enemyFish5, xEnemyFish5, yEnemyFish5, enemyFish5Width, enemyFish5Height, this);
        g.drawImage(enemyFish6, xEnemyFish6, yEnemyFish6, enemyFish6Width, enemyFish6Height, this);
        g.drawImage(enemyFish7, xEnemyFish7, yEnemyFish7, enemyFish7Width, enemyFish7Height, this);
        g.drawImage(enemyFish8, xEnemyFish8, yEnemyFish8, enemyFish8Width, enemyFish8Height, this);
        g.drawImage(enemyFish9, xEnemyFish9, yEnemyFish9, enemyFish9Width, enemyFish9Height, this);
        g.drawImage(enemyFish10, xEnemyFish10, yEnemyFish10, enemyFish10Width, enemyFish10Height, this);
    }
}
