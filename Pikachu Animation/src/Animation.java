import java.awt.*;
import javax.swing.*;

public class Animation extends JPanel {
    int x = 0;
    String direction = "right"; 
    
    int y = 0;
    boolean goingUp = true;
    
    int angle1 = 0;
    boolean rotateClockwise1 = true;
    
    int angle2 = 0;
    boolean rotateClockwise2 = true;
  
    boolean enlargeRing = true;
    int h1 = 28;
    int h2 = 16;
    int h3 = 35;
    int h4 = 23;
    int w1 = 28;
    int w2 = 16;
    int w3 = 35;
    int w4 = 23; 
    
    boolean enlargeCircle = true;
    int h5 = 11;
    int w5 = 11;
    int h6 = 8;
    int w6 = 8;
    int h7 = 11;
    int w7 = 11;
    
    boolean enlargeCold = true;
    double maxSize1 = 1.0;
    double minSize1 = 0.01;
    double maxSize2 = 1.0;
    double minSize2 = 0.01;

    
    Image backgroundImage;

    public Animation() {	
    	
    	backgroundImage = new ImageIcon(getClass().getResource("Pokemon world.jpg")).getImage();
    	
    	//Timer for the platform
        Timer platform = new Timer(1000 / 100, e -> {
            int panelWidth = this.getSize().width;
            if(direction.equals("right")) {
                x += 1;
            } else {
                x -= 1;
            }

            if(x >= panelWidth - 775)
                direction = "left";

            if(x <= -55)
                direction = "right";
            
            repaint();
        });
        platform.start();
        
        //Timer for Oval/Rectangle Shape
        Timer jump = new Timer(1000 / 60, e -> {
            if (goingUp) {
            	y -= 1;
                if (y <= -15) {
                	goingUp = false;
                }
            } else {
            	y += 1;
                if (y >= 0) {
                	goingUp = true;
                }
            }
            repaint();
        });
        jump.start();
        
        //Timer for Ring 1 and Ring 2
        Timer enlargementRing = new Timer(1000 / 40, e -> {
            if (enlargeRing) {
                h1 += 1;
                w1 += 1;
                h2 += 1;
                w2 += 1;
                h3 += 1;
                w3 += 1;
                h4 += 1;
                w4 += 1;
                if (h1 >= 28) {
                	enlargeRing = false;
                }
            } else {
                h1 -= 1;
                w1 -= 1;
                h2 -= 1;
                w2 -= 1;
                h3 -= 1;
                w3 -= 1;
                h4 -= 1;
                w4 -= 1;
                if (h1 <= 14) {
                	enlargeRing = true;
                }
            }
            repaint();
        });
        enlargementRing.start();
        
        //Timer for Orange Circle 1, Orange Circle 2 and Light Circle
        Timer enlargementCircle = new Timer(1000 / 30, e -> {
            if (enlargeCircle) {
                h5 += 1;
                w5 += 1;
                h6 += 1;
                w6 += 1;
                h7 -= 1;
                w7 -= 1;
                if (h5 >= 15) {
                	enlargeCircle = false;
                }
            } else {
            	h5 -= 1;
                w5 -= 1;
                h6 -= 1;
                w6 -= 1;
                h7 += 1;
                w7 += 1;
                if (h5 <= 5) {
                	enlargeCircle = true;
                }
            }
            repaint();
        });
        enlargementCircle.start();
         
        //Timer for thunder1, thunder2 and Plus/X
        Timer rotation = new Timer(1000 / 75, e -> {
            if(rotateClockwise1) {
            	angle1 += 2;
                if(angle1 >= 15) {
                	rotateClockwise1 = false;
                }
            } else {
            	angle1 -= 2;
                if(angle1 <= -120) {
                	rotateClockwise1 = true;
                }
            }
            repaint();
        });
        rotation.start();
        
        //Timer for Pokeball shapes
        Timer pokeball = new Timer(1000 / 50, e -> {
            if (rotateClockwise2) {
            	angle2 += 1;
                if (angle2 >= 40) {
                	rotateClockwise2 = false;
                }
            } else {
            	angle2 -= 1;
                if (angle2 <= 0) { 
                	rotateClockwise2 = true;
                }
            }
            repaint();
        });
        pokeball.start();
        
        //Timer for Cold
        Timer enlargementCold = new Timer(1000 / 1500, e -> {
            if (enlargeCold) {
            	maxSize1 += minSize1;
            	maxSize2 += minSize2;
                if (maxSize1 >= 1.0 && maxSize2 >= 1.0) {
                	enlargeCold = false;
                }
            } else {
            	maxSize1 -= minSize1;
            	maxSize2 -= minSize2;
                if (maxSize1 <= 0.1 && maxSize2 <= 0.01) {
                	enlargeCold = true;
                }
            }
            repaint();
        });
        enlargementCold.start();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);
        
        Graphics2D g2d = (Graphics2D) g;
        
        int xCenter1 = 509;
        int yCenter1 = 449; 
        
        int xCenter2 = 213;
        int yCenter2 = 444;
        
        int xCenter3 = 547;
        int yCenter3 = 443;
        
        int xCenter4 = 302 + 175 / 2;
        int yCenter4 = 274 + 175 / 2;
        
        int xCenter5 = 226;
        int yCenter5 = 293;   		
        
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        
        // Plus/X
        g2d.rotate(Math.toRadians(angle1), xCenter1, yCenter1);
        g.setColor(new Color(91, 202, 248));
        int xPlus[] = {503, 504, 507, 509, 511, 514, 515, 516, 515, 512, 515, 516, 515, 514, 511, 509, 507, 504, 503, 502, 503, 506, 503, 502};
        int yPlus[] = {443, 442, 443, 446, 443, 442, 443, 444, 447, 449, 451, 454, 455, 456, 455, 452, 455, 456, 455, 454, 451, 449, 447, 444};
        g.fillPolygon(new Polygon(xPlus, yPlus, xPlus.length));
        g2d.rotate(-Math.toRadians(angle1), xCenter1, yCenter1);  
        
        //Thunder 1
        g2d.rotate(Math.toRadians(angle1), xCenter2, yCenter2);
        g.setColor(new Color(251, 242, 63));
        int xThunder1[] = {203, 215, 210, 230, 220, 223};
        int yThunder1[] = {449, 445, 441, 441, 445, 449};
        g.fillPolygon(new Polygon(xThunder1, yThunder1, xThunder1.length));
        g2d.rotate(-Math.toRadians(angle1), xCenter2, yCenter2);
        
        //Thunder 2
        g2d.rotate(Math.toRadians(angle1), xCenter3, yCenter3);
        g.setColor(new Color(251, 242, 63));
        int xThunder2[] = {550, 548, 552, 544, 545, 540};
        int yThunder2[] = {432, 442, 442, 456, 446, 446};
        g.fillPolygon(new Polygon(xThunder2, yThunder2, xThunder2.length));  
        g2d.rotate(-Math.toRadians(angle1), xCenter3, yCenter3);
        
        //Base of Pokeball
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        g.setColor(new Color(34, 61, 80));
        g.fillArc(293, 263, 194, 194, 202, 360);
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Lower Arc of Pokeball
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        g.setColor(new Color(250, 250, 250));
        g.fillArc(303, 275, 175, 175, 202, 180);
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Upper Arc of Pokeball
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        g.setColor(new Color(252, 23, 23));
        g.fillArc(301, 270, 175, 175, 22, 180);        
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Middle Rectangle of Pokeball
        g.setColor(new Color(34, 61, 80));
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xMiddle[] = {305, 484, 477, 298};
        int yMiddle[] = {406, 333, 317, 390};
        g.fillPolygon(new Polygon(xMiddle, yMiddle, xMiddle.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Outer Circle
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
		g.setColor(new Color(34, 61, 80));
		g.fillOval(367, 335, 50, 50);
		g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
		
        //Outer Circle of Pokeball
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
		g.setColor(new Color(250, 250, 250));
		g.fillOval(374, 342, 36, 36);
		g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
		
        //Outline of Inner Circle
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
		g.setColor(new Color(34, 61, 80));
		g.fillOval(381, 349, 22, 22);
		g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
		
        //Inner Circle of Pokeball
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
		g.setColor(new Color(250, 250, 250));
		g.fillOval(384, 352, 16, 16);
		g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
		
        //Head
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xHead[] = {308, 291, 281, 272, 267, 260, 256, 253, 251, 250, 251, 251, 250, 249, 245, 243, 243, 243, 244, 246, 250, 253, 257, 260, 264, 268, 274, 280, 284, 293, 301, 308, 303, 297, 296, 297, 299, 302, 303, 322, 320, 320, 322, 324, 325, 327, 310, 309, 307, 305, 304, 304, 305};
        int yHead[] = {306, 308, 306, 304, 302, 296, 292, 290, 285, 282, 279, 276, 269, 266, 259, 253, 251, 245, 237, 232, 226, 221, 217, 213, 208, 204, 199, 194, 192, 186, 182, 179, 188, 198, 202, 203, 205, 204, 202, 220, 222, 224, 226, 227, 227, 226, 296, 294, 294, 296, 298, 299, 301};
        g.fillPolygon(new Polygon(xHead, yHead, xHead.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Head
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xHeadOutline[] = {308, 291, 281, 272, 267, 260, 256, 253, 251, 250, 251, 251, 250, 249, 245, 243, 243, 243, 244, 246, 250, 253, 257, 260, 264, 268, 274, 280, 284, 293, 301, 308, 309, 310, 311, 312, 314, 315, 312, 310, 300, 298, 290, 282, 277, 270, 266, 260, 255, 246, 241, 238, 238, 238, 239, 241, 243, 244, 245, 246, 246, 245, 244, 245, 248, 251, 259, 262, 267, 271, 275, 283, 285, 289, 294, 296, 301, 309, 311};
        int yHeadOutline[] = {306, 308, 306, 304, 302, 296, 292, 290, 285, 282, 279, 276, 269, 266, 259, 253, 251, 245, 237, 232, 226, 221, 217, 213, 208, 204, 199, 194, 192, 186, 182, 179, 178, 176, 175, 174, 172, 170, 171, 172, 177, 177, 182, 187, 190, 196, 199, 205, 210, 221, 230, 238, 246, 253, 259, 264, 268, 270, 273, 276, 279, 282, 284, 288, 292, 297, 303, 305, 308, 309, 310, 312, 312, 312, 312, 312, 312, 312, 310};
        g.fillPolygon(new Polygon(xHeadOutline, yHeadOutline, xHeadOutline.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Eye
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xEye[] = {269, 271, 272, 274, 275, 277, 278, 280, 278, 274, 270, 264, 262, 260, 260, 262, 264, 266};
        int yEye[] = {263, 260, 259, 255, 253, 252, 253, 256, 263, 267, 271, 273, 272, 271, 268, 267, 266, 266};
        g.fillPolygon(new Polygon(xEye, yEye, xEye.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
		//Blush
		g.setColor(new Color(250, 96, 85)); 
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xBlush[] = {290, 292, 294, 295, 296, 297, 297, 297, 296, 295, 294, 292, 290, 288, 286, 285, 284, 283, 283, 283, 284, 285, 286, 288};
        int yBlush[] = {267, 267, 268, 269, 270, 272, 274, 276, 278, 279, 280, 281, 281, 281, 280, 279, 278, 276, 274, 272, 270, 269, 268, 267};
        g.fillPolygon(new Polygon(xBlush, yBlush, xBlush.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Ear 1
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xEar1[] = {303, 309, 313, 321, 328, 333, 341, 348, 353, 360, 365, 370, 375, 381, 385, 386, 387, 387, 386, 381, 374, 365, 357, 352, 344, 336, 322};
        int yEar1[] = {202, 191, 185, 175, 166, 162, 154, 147, 143, 138, 136, 135, 137, 139, 145, 149, 153, 157, 161, 171, 178, 187, 195, 198, 205, 211, 220};
        g.fillPolygon(new Polygon(xEar1, yEar1, xEar1.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Ear 1
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xEarOutline1[] = {303, 309, 313, 321, 328, 333, 341, 348, 353, 360, 365, 370, 375, 381, 385, 386, 387, 387, 386, 381, 374, 365, 357, 352, 344, 336, 322, 320, 320, 322, 324, 325, 327, 350, 362, 376, 384, 395, 401, 404, 409, 412, 413, 413, 413, 411, 410, 409, 406, 400, 397, 392, 385, 381, 375, 368, 364, 358, 345, 330, 317, 311, 305, 297, 296, 297, 299, 302};
        int yEarOutline1[] = {202, 191, 185, 175, 166, 162, 154, 147, 143, 138, 136, 135, 137, 139, 145, 149, 153, 157, 161, 171, 178, 187, 195, 198, 205, 211, 220, 222, 224, 226, 227, 227, 226, 213, 202, 189, 180, 163, 153, 148, 137, 129, 120, 117, 114, 112, 111, 110, 109, 108, 109, 110, 112, 114, 118, 122, 125, 129, 139, 154, 167, 175, 184, 198, 202, 203, 205, 204};
        g.fillPolygon(new Polygon(xEarOutline1, yEarOutline1, xEarOutline1.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Ear 2
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xEar2[] = {270, 277, 282, 290, 298, 300, 306, 310, 312, 315, 321, 330, 333, 337, 338, 339, 338, 337, 336, 333, 331, 327, 324, 321, 317, 314, 310, 304, 295, 291, 285, 283, 278, 275};
        int yEar2[] = {196, 190, 187, 182, 177, 177, 174, 172, 171, 170, 163, 154, 151, 147, 145, 143, 139, 135, 133, 130, 128, 126, 126, 126, 127, 128, 129, 136, 147, 154, 164, 169, 179, 186};
        g.fillPolygon(new Polygon(xEar2, yEar2, xEar2.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Ear 2
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xEarOutline2[] = {337, 338, 339, 338, 337, 336, 333, 331, 327, 324, 321, 317, 314, 310, 304, 295, 291, 285, 283, 278, 275, 270, 266, 260, 263, 266, 271, 275, 283, 288, 291, 296, 304, 310, 319, 324, 325, 330, 334, 336, 340, 343, 344, 346, 348, 348, 348, 348, 346, 343, 339};
        int yEarOutline2[] = {147, 145, 143, 139, 135, 133, 130, 128, 126, 126, 126, 127, 128, 129, 136, 147, 154, 164, 169, 179, 186, 196, 199, 205, 194, 187, 174, 166, 154, 147, 143, 137, 128, 122, 115, 111, 111, 108, 106, 105, 105, 105, 107, 110, 114, 118, 122, 129, 139, 142, 145};
        g.fillPolygon(new Polygon(xEarOutline2, yEarOutline2, xEarOutline2.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Body
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xBody[] = {327, 310, 328, 328, 328, 330, 332, 334, 334, 335, 343, 352, 361, 372, 372, 372, 374, 376, 376, 396, 396, 398, 362, 350};
        int yBody[] = {226, 296, 284, 282, 280, 279, 278, 279, 281, 285, 281, 276, 273, 269, 265, 262, 261, 260, 263, 255, 251, 251, 202, 213};
        g.fillPolygon(new Polygon(xBody, yBody, xBody.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Body
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xBodyOutline[] = {335, 342, 352, 362, 372, 372, 363, 354, 346, 336};
        int yBodyOutline[] = {284, 280, 276, 272, 271, 275, 276, 279, 282, 288};
        g.fillPolygon(new Polygon(xBodyOutline, yBodyOutline, xBodyOutline.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Butt
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xButt[] = {403, 407, 409, 411, 413, 416, 417, 418, 419, 419, 419, 418, 416, 416, 413, 409, 406, 400, 395, 387, 384, 376, 362, 398, 402, 402, 403};
        int yBUtt[] = {263, 258, 255, 252, 248, 242, 239, 232, 228, 222, 218, 214, 206, 204, 198, 191, 188, 183, 179, 175, 180, 189, 202, 251, 251, 255, 261};
        g.fillPolygon(new Polygon(xButt, yBUtt, xButt.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Butt
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xButtOutline[] = {403, 407, 409, 411, 413, 416, 417, 418, 419, 419, 419, 418, 416, 416, 413, 409, 406, 400, 395, 387, 390, 395, 398, 401, 404, 406, 407, 408, 416, 420, 422, 423, 424, 423, 422, 421, 419, 418, 417, 415, 413, 412, 409, 407, 404};
        int yButtOutline[] = {263, 258, 255, 252, 248, 242, 239, 232, 228, 222, 218, 214, 206, 204, 198, 191, 188, 183, 179, 175, 171, 173, 175, 177, 180, 182, 183, 184, 193, 202, 210, 216, 225, 231, 237, 241, 247, 251, 253, 257, 260, 262, 265, 267, 270};
        g.fillPolygon(new Polygon(xButtOutline, yButtOutline, xButtOutline.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
		
		//Tail
		g.setColor(new Color(251, 234, 58)); 
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xTail[] = {408, 413, 422, 438, 451, 480, 530, 492, 464, 449, 432, 422, 420, 416};
        int yTail[] = {184, 180, 195, 183, 200, 183, 248, 260, 207, 225, 203, 210, 202, 193};
        g.fillPolygon(new Polygon(xTail, yTail, xTail.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Tail
        g.setColor(new Color(34, 61, 80)); 
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xTailOutline[] = {408, 413, 422, 438, 451, 480, 530, 492, 464, 449, 432, 422, 423, 431, 449, 464, 489, 539, 482, 453, 440, 423, 413, 404, 406, 407};
        int yTailOutline[] = {184, 180, 195, 183, 200, 183, 248, 260, 207, 225, 203, 210, 216, 211, 232, 216, 267, 251, 173, 192, 173, 186, 171, 180, 182, 183};
        g.fillPolygon(new Polygon(xTailOutline, yTailOutline, xTailOutline.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Leg 1
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xLeg1[] = {310, 317, 323, 325, 326, 328, 329, 331, 332, 333, 328};
        int yLeg1[] = {296, 312, 318, 319, 319, 318, 317, 314, 311, 302, 284};
        g.fillPolygon(new Polygon(xLeg1, yLeg1, xLeg1.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Leg 1
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xLegOutline1[] = {310, 317, 323, 325, 326, 328, 329, 331, 332, 333, 328, 328, 328, 330, 332, 334, 334, 335, 337, 338, 338, 338, 334, 330, 326, 320, 317, 305, 304, 304, 305, 307, 309};
        int yLegOutline1[] = {296, 312, 318, 319, 319, 318, 317, 314, 311, 302, 284, 282, 280, 279, 278, 279, 281, 286, 297, 302, 307, 312, 321, 323, 325, 323, 319, 301, 299, 298, 296, 294, 294};
        g.fillPolygon(new Polygon(xLegOutline1, yLegOutline1, xLegOutline1.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Leg 2
        g.setColor(new Color(251, 234, 58)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xLeg2[] = {376, 378, 380, 382, 386, 390, 394, 396, 397, 398, 396};
        int yLeg2[] = {263, 283, 287, 291, 292, 291, 290, 288, 284, 275, 255};
        g.fillPolygon(new Polygon(xLeg2, yLeg2, xLeg2.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Leg 2
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xLegOutline2[] = {376, 378, 380, 382, 386, 390, 394, 396, 397, 398, 396, 396, 398, 402, 402, 403, 403, 404, 402, 401, 400, 399, 396, 393, 391, 389, 386, 382, 379, 376, 375, 374, 373, 372, 372, 372, 372, 374, 376};
        int yLegOutline2[] = {263, 283, 287, 291, 292, 291, 290, 288, 284, 275, 255, 251, 251, 252, 255, 261, 263, 270, 284, 287, 290, 293, 295, 297, 298, 298, 298, 297, 294, 291, 287, 284, 279, 273, 271, 265, 262, 261, 260};
        g.fillPolygon(new Polygon(xLegOutline2, yLegOutline2, xLegOutline2.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
		//Cold
		g.setColor(new Color(87, 190, 233)); 
		g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xCold[] = {226, 221, 216, 212, 210, 206, 203, 201, 197, 193, 187, 181, 176, 172, 169, 164, 161, 160, 159, 159, 159, 159, 160, 161, 162, 164, 167, 171, 177, 183, 185, 188, 190, 196, 205, 213, 222};
        int yCold[] = {293, 292, 289, 287, 284, 279, 274, 271, 267, 264, 261, 261, 261, 263, 265, 269, 275, 279, 282, 284, 287, 290, 293, 295, 297, 300, 302, 305, 306, 306, 306, 306, 306, 306, 308, 303, 299};
        for (int i = 0; i < xCold.length; i++) {
            xCold[i] = (int) ((xCold[i] - xCenter5) * maxSize1 + xCenter5);
            yCold[i] = (int) ((yCold[i] - yCenter5) * maxSize1 + yCenter5);
        }
        g.fillPolygon(new Polygon(xCold, yCold, xCold.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Outline of Cold
        g.setColor(new Color(34, 61, 80)); 
        g2d.rotate(Math.toRadians(angle2), xCenter4, yCenter4);
        int xColdOutline[] = {226, 237, 229, 226, 221, 220, 216, 212, 210, 206, 198, 186, 181, 176, 166, 159, 156, 155, 153, 160, 161, 164, 169, 172, 176, 181, 187, 193, 197, 202, 202, 206, 210, 212, 216, 221, 226, 222, 213, 205, 196, 190, 188, 185, 183, 177, 171, 167, 164, 162, 161, 160, 159, 159, 159, 159, 160, 153, 152, 152, 152, 152, 152, 153, 155, 159, 166, 171, 177, 183, 186, 190, 199, 205, 213, 218, 221, 226, 231, 237};
        int yColdOutline[] = {293, 289, 291, 289, 286, 283, 279, 274, 271, 266, 258, 254, 254, 254, 258, 265, 268, 270, 276, 279, 275, 269, 265, 263, 261, 261, 261, 264, 267, 271, 274, 279, 284, 287, 289, 292, 293, 299, 303, 306, 306, 306, 306, 306, 306, 306, 305, 302, 300, 297, 295, 293, 290, 287, 284, 282, 279, 276, 281, 282, 286, 290, 291, 295, 302, 305, 309, 312, 313, 313, 313, 313, 313, 312, 309, 307, 305, 302, 298, 289};
        for (int i = 0; i < xColdOutline.length; i++) {
        	xColdOutline[i] = (int) ((xColdOutline[i] - xCenter5) * maxSize2 + xCenter5);
        	yColdOutline[i] = (int) ((yColdOutline[i] - yCenter5) * maxSize2 + yCenter5);
        }
        g.fillPolygon(new Polygon(xColdOutline, yColdOutline, xColdOutline.length));
        g2d.rotate(-Math.toRadians(angle2), xCenter4, yCenter4);
        
        //Ring 1
        g.setColor(new Color(234, 83, 62));
		g.fillOval(160, 429, w1, h1);
        g.setColor(Color.WHITE);
		g.fillOval(166, 435, w2, h2);
		
		//Ring 2
        g.setColor(new Color(234, 83, 62));
		g.fillOval(583, 422, w3, h3);
        g.setColor(Color.WHITE);
		g.fillOval(589, 428, w4, h4);
		
		// Orange Circle 1
		g.setColor(new Color(234, 83, 62));
		g.fillOval(305, 442, w5, h5);
		
		// Orange Circle 2
		g.setColor(new Color(234, 83, 62));
		g.fillOval(455, 445, w6, h6);
		
		// Light Circle
		g.setColor(new Color(91, 202, 248));
		g.fillOval(470, 440, w7, h7);
        
        // Oval/Rectangle Shape
        g.setColor(new Color(91, 202, 248));
        int xOval[] = {237, 237, 239, 240, 260, 261, 263, 263, 263, 261, 260, 240, 239, 237};
        int yOval[] = {453 + y, 451 + y, 449 + y, 449 + y, 449 + y, 449 + y, 451 + y, 453 + y, 455 + y, 457 + y, 457 + y, 457 + y, 457 + y, 455 + y};
        g.fillPolygon(new Polygon(xOval, yOval, xOval.length));
        
        // Platform 1
        g.setColor(new Color(34, 61, 80));
        int xGround1[] = {153 + x, 153 + x, 156 + x, 157 + x, 189 + x, 190 + x, 193 + x, 193 + x, 193 + x, 190 + x, 189 + x, 157 + x, 156 + x, 153 + x};
        int yGround1[] = {460, 458, 457, 457, 457, 457, 458, 460, 462, 463, 463, 463, 463, 462};
        g.fillPolygon(new Polygon(xGround1, yGround1, xGround1.length));
        
        // Platform 2
        g.setColor(new Color(34, 61, 80));
        int xGround2[] = {200 + x, 200 + x, 202 + x, 204 + x, 609 + x, 610 + x, 613 + x, 613 + x, 613 + x, 610 + x, 609 + x, 204 + x, 203 + x, 200 + x};
        int yGround2[] = {460, 458, 457, 457, 457, 457, 458, 460, 462, 463, 463, 463, 463, 462};
        g.fillPolygon(new Polygon(xGround2, yGround2, xGround2.length));
        
        // Platform 3
        g.setColor(new Color(34, 61, 80));
        int xGround3[] = {621 + x, 621 + x, 623 + x, 625 + x, 646 + x, 647 + x, 650 + x, 650 + x, 650 + x, 647 + x, 646 + x, 625 + x, 623 + x, 621 + x};
        int yGround3[] = {460, 458, 457, 457, 457, 457, 458, 460, 462, 463, 463, 463, 463, 462};
        g.fillPolygon(new Polygon(xGround3, yGround3, xGround3.length));
        
        // Platform 4
        g.setColor(new Color(34, 61, 80));
        int xGround4[] = {652 + x, 652 + x, 654 + x, 656 + x, 665 + x, 666 + x, 669 + x, 669 + x, 669 + x, 666 + x, 665 + x, 656 + x, 654 + x, 652 + x};
        int yGround4[] = {460, 458, 457, 457, 457, 457, 458, 460, 462, 463, 463, 463, 463, 462};
        g.fillPolygon(new Polygon(xGround4, yGround4, xGround4.length));
    }
}
