import java.awt.*;

public class MyCanvas extends Canvas {
	public void paint(Graphics g) {
		setBackground(new Color(70, 102, 114));
		
		g.setColor(new Color(197, 236, 233));
		int xShape1[] = {577, 580, 576, 570, 438, 365,  371, 456};
		int yShape1[] = {85, 83, 83, 85, 164, 251, 256, 172};
		g.fillPolygon(new Polygon(xShape1, yShape1, xShape1.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape2[] = {577, 456, 371, 371, 387, 452, 500};
		int yShape2[] = {85, 172, 256, 265, 244, 178, 145};
		g.fillPolygon(new Polygon(xShape2, yShape2, xShape2.length));
		
		g.setColor(new Color(148, 196, 210));
		int xShape3[] = {371, 371, 374, 377, 379, 387, 432, 454, 483, 500, 452, 387};
		int yShape3[] = {265, 281, 273, 265, 268, 255, 207, 182, 161, 145, 178, 244};
		g.fillPolygon(new Polygon(xShape3, yShape3, xShape3.length));
		
		g.setColor(new Color(126, 172, 195));
		int xShape4[] = {577, 500, 483, 511};
		int yShape4[] = {85, 145, 161, 142};
		g.fillPolygon(new Polygon(xShape4, yShape4, xShape4.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape5[] = {483, 454, 432, 387, 379, 371, 381, 383, 402, 428, 456};
		int yShape5[] = {161, 182, 207, 255, 268, 281, 277, 270, 244, 218, 187};
		g.fillPolygon(new Polygon(xShape5, yShape5, xShape5.length));

		g.setColor(new Color(73, 116, 149));
		int xShape6[] = {383, 402, 428, 456, 483, 511, 464, 432, 392};
		int yShape6[] = {270, 244, 218, 187, 161, 142, 185, 218, 264};
		g.fillPolygon(new Polygon(xShape6, yShape6, xShape6.length));
	
		g.setColor(new Color(145, 14, 25));
		int xShape7[] = {392, 432, 485, 456, 516, 477, 450, 535, 543, 464, 438, 415};
		int yShape7[] = {264, 218, 187, 218, 193, 221, 240, 216, 218, 240, 249, 256};
		g.fillPolygon(new Polygon(xShape7, yShape7, xShape7.length));

		g.setColor(new Color(185, 36, 26));
		int xShape8[] = {432, 464, 511, 577, 535, 505, 485};
		int yShape8[] = {218, 185, 142, 85, 134, 164, 187};
		g.fillPolygon(new Polygon(xShape8, yShape8, xShape8.length));

		g.setColor(new Color(255, 143, 69));
		int xShape9[] = {485, 456, 516, 545, 577, 535, 505};
		int yShape9[] = {187, 218, 193, 138, 85, 134, 164};
		g.fillPolygon(new Polygon(xShape9, yShape9, xShape9.length));

		g.setColor(new Color(255, 201, 91));
		int xShape10[] = {577, 545, 516, 580};
		int yShape10[] = {85, 138, 193, 164};
		g.fillPolygon(new Polygon(xShape10, yShape10, xShape10.length));

		g.setColor(new Color(255, 133, 27));
		int xShape11[] = {447, 516, 577, 543, 535, 516};
		int yShape11[] = {242, 192, 208, 218, 217, 222};
		g.fillPolygon(new Polygon(xShape11, yShape11, xShape11.length));

		g.setColor(new Color(255, 171, 56));
		int xShape12[] = {580, 675, 652, 577, 516};
		int yShape12[] = {164, 189, 189, 208, 193};
		g.fillPolygon(new Polygon(xShape12, yShape12, xShape12.length));

		g.setColor(new Color(70, 0, 70));
		int xShape13[] = {432, 464, 438, 415, 392, 383, 396};
		int yShape13[] = {253, 240, 249, 256, 264, 270, 267};
		g.fillPolygon(new Polygon(xShape13, yShape13, xShape13.length));
		
		g.setColor(new Color(148, 196, 210));
		int xShape14[] = {379, 377, 374, 371};
		int yShape14[] = {268, 265, 273, 281};
		g.fillPolygon(new Polygon(xShape14, yShape14, xShape14.length));
		
        g.setColor(new Color(99, 147, 176));
        int xShape15[] = {381, 392, 419, 447, 524, 563, 601, 643, 675, 652, 577, 543, 464, 432, 396, 383};
        int yShape15[] = {277, 273, 265, 258, 233, 220, 208, 199, 189, 189, 208, 218, 240, 253, 267, 270};
        g.fillPolygon(new Polygon(xShape15, yShape15, xShape15.length));
        
		g.setColor(new Color(50, 0, 50));
		int xShape16[] = {415, 431, 447, 499, 459, 524, 447, 419, 392, 381};
		int yShape16[] = {275, 274, 273, 275, 258, 233, 258, 265, 273, 277};
		g.fillPolygon(new Polygon(xShape16, yShape16, xShape16.length));
        
		g.setColor(new Color(125, 4, 15));
		int xShape17[] = {499, 510, 536, 552, 563, 524, 459};
		int yShape17[] = {275, 266, 244, 229, 220, 233, 258};
		g.fillPolygon(new Polygon(xShape17, yShape17, xShape17.length));

		g.setColor(new Color(136, 19, 35));
		int xShape18[] = {510, 536, 552, 563, 601, 643, 601, 560};
		int yShape18[] = {266, 244, 229, 220, 208, 199, 222, 255};
		g.fillPolygon(new Polygon(xShape18, yShape18, xShape18.length));

		g.setColor(new Color(255, 171, 56));
		int xShape19[] = {675, 655, 638, 601, 649, 633, 605, 577, 560, 601, 643};
		int yShape19[] = {189, 202, 217, 244, 310, 302, 284, 266, 255, 222, 199};
		g.fillPolygon(new Polygon(xShape19, yShape19, xShape19.length));

		g.setColor(new Color(255, 133, 27));
		int xShape20[] = {633, 605, 577, 560, 510, 499, 530, 560, 612};
		int yShape20[] = {302, 284, 266, 255, 266, 275, 281, 286, 296};
		g.fillPolygon(new Polygon(xShape20, yShape20, xShape20.length));
		
        g.setColor(new Color(99, 147, 176));
        int xShape21[] = {371, 374, 371, 381, 415, 431, 447, 499, 530, 560, 612, 633, 649, 633, 612, 590, 580, 516, 494, 448, 425, 381};
        int yShape21[] = {281, 273, 281, 277, 275, 274, 273, 275, 281, 286, 296, 302, 310, 312, 307, 302, 299, 289, 287, 284, 284, 284};
        g.fillPolygon(new Polygon(xShape21, yShape21, xShape21.length));

		g.setColor(new Color(50, 0, 50));
		int xShape22[] = {381, 425, 448, 494, 516, 580, 511, 508, 452, 432, 464, 442, 414};
		int yShape22[] = {284, 284, 284, 287, 289, 299, 291, 291, 287, 291, 313, 302, 293};
		g.fillPolygon(new Polygon(xShape22, yShape22, xShape22.length));
		
		g.setColor(new Color(125, 4, 15));
		int xShape23[] = {432, 452, 511, 479, 470, 482, 496, 532, 565, 485, 464};
		int yShape23[] = {291, 287, 291, 301, 299, 315, 326, 344, 364, 323, 313};
		g.fillPolygon(new Polygon(xShape23, yShape23, xShape23.length));

		g.setColor(new Color(136, 19, 35));
		int xShape24[] = {511, 580, 590, 574, 541, 479};
		int yShape24[] = {291, 299, 302, 302, 315, 301};
		g.fillPolygon(new Polygon(xShape24, yShape24, xShape24.length));

		g.setColor(new Color(255, 171, 56));
		int xShape25[] = {633, 612, 590, 574, 533, 565, 601, 574};
		int yShape25[] = {312, 307, 302, 302, 318, 364, 388, 326};
		g.fillPolygon(new Polygon(xShape25, yShape25, xShape25.length));	

		g.setColor(new Color(255, 133, 27));
		int xShape26[] = {565, 532, 496, 482, 470, 479, 541, 533};
		int yShape26[] = {364, 344, 326, 315, 299, 301, 315, 318};
		g.fillPolygon(new Polygon(xShape26, yShape26, xShape26.length));

		g.setColor(new Color(99, 147, 176));
		int xShape27[] = {371, 381, 414, 442, 464, 485, 565, 601, 590, 560, 541, 508, 494, 480, 464, 383};
		int yShape27[] = {281, 284, 293, 302, 313, 323, 364, 388, 386, 370, 360, 343, 334, 328, 321, 290};
		g.fillPolygon(new Polygon(xShape27, yShape27, xShape27.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape28[] = {365, 358, 363};
		int yShape28[] = {251, 280, 279};
		g.fillPolygon(new Polygon(xShape28, yShape28, xShape28.length));
		
		g.setColor(new Color(197, 236, 233));
		int xShape29[] = {365, 363, 371};
		int yShape29[] = {251, 279, 281};
		g.fillPolygon(new Polygon(xShape29, yShape29, xShape29.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape30[] = {365, 371, 371, 371};
		int yShape30[] = {251, 281, 265, 256};
		g.fillPolygon(new Polygon(xShape30, yShape30, xShape30.length));
		
		g.setColor(new Color(73, 116, 149));
		int xShape31[] = {383, 394, 456, 508, 494, 480, 464};
		int yShape31[] = {290, 298, 321, 343, 334, 328, 321};
		g.fillPolygon(new Polygon(xShape31, yShape31, xShape31.length));
		
		g.setColor(new Color(197, 236, 233));
		int xShape32[] = {365, 358, 363, 371, 364, 352, 348, 347, 344, 342, 341, 332, 324, 323, 315, 295, 273, 295, 301, 315, 318, 325, 328, 339, 340, 344, 344, 346, 346, 346, 352};
		int yShape32[] = {251, 280, 279, 281, 282, 283, 313, 317, 332, 338, 346, 385, 413, 415, 426, 445, 460, 438, 432, 417, 413, 385, 370, 325, 318, 301, 300, 293, 270, 258, 258};
		g.fillPolygon(new Polygon(xShape32, yShape32, xShape32.length));
		
		g.setColor(new Color(73, 116, 149));
		int xShape33[] = {394, 414, 383};
		int yShape33[] = {298, 326, 290};
		g.fillPolygon(new Polygon(xShape33, yShape33, xShape33.length));
		
		g.setColor(new Color(70, 0, 70));
		int xShape34[] = {394, 414, 459, 475, 419, 454, 479, 541, 508, 456};
		int yShape34[] = {298, 326, 374, 391, 321, 335, 338, 360, 343, 321};
		g.fillPolygon(new Polygon(xShape34, yShape34, xShape34.length));
		
		g.setColor(new Color(255, 133, 27));
		int xShape35[] = {454, 479, 541, 560, 496};
		int yShape35[] = {335, 338, 360, 370, 368};
		g.fillPolygon(new Polygon(xShape35, yShape35, xShape35.length));

		g.setColor(new Color(255, 133, 27));
		int xShape36[] = {419, 454, 461, 475};
		int yShape36[] = {321, 335, 370, 391};
		g.fillPolygon(new Polygon(xShape36, yShape36, xShape36.length));

		g.setColor(new Color(255, 133, 27));
		int xShape37[] = {454, 461, 475, 499, 496};
		int yShape37[] = {335, 370, 391, 420, 368};
		g.fillPolygon(new Polygon(xShape37, yShape37, xShape37.length));

		g.setColor(new Color(255, 171, 56));
		int xShape38[] = {499, 496, 560, 590, 526, 518};
		int yShape38[] = {420, 368, 370, 386, 386, 447};
		g.fillPolygon(new Polygon(xShape38, yShape38, xShape38.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape39[] = {373, 371, 383, 414, 459, 475, 499, 518, 491, 487, 481, 472, 461, 427, 408, 405};
		int yShape39[] = {293, 281, 290, 326, 374, 391, 420, 447, 420, 416, 410, 400, 389, 355, 335, 332};
		g.fillPolygon(new Polygon(xShape39, yShape39, xShape39.length));
		
		g.setColor(new Color(73, 116, 149));
		int xShape40[] = {373, 405, 378, 370};
		int yShape40[] = {293, 332, 307, 326};
		g.fillPolygon(new Polygon(xShape40, yShape40, xShape40.length));
		
		g.setColor(new Color(50, 0, 50));
		int xShape41[] = {376, 405, 408, 427, 392, 392, 386, 372, 373, 365, 365, 367, 370};
		int yShape41[] = {302, 332, 335, 355, 335, 388, 397, 416, 398, 405, 354, 343, 326};
		g.fillPolygon(new Polygon(xShape41, yShape41, xShape41.length));
		
		g.setColor(new Color(70, 0, 70));
		int xShape42[] = {392, 427, 461, 472, 450, 414, 405, 392};
		int yShape42[] = {335, 355, 389, 400, 385, 374, 370, 388};
		g.fillPolygon(new Polygon(xShape42, yShape42, xShape42.length));
		
		g.setColor(new Color(255, 133, 27));
		int xShape43[] = {414, 427, 441, 461, 475, 482, 491, 487, 481, 472, 450};
		int yShape43[] = {374, 382, 385, 394, 410, 416, 420, 416, 410, 400, 385};
		g.fillPolygon(new Polygon(xShape43, yShape43, xShape43.length));
		
		g.setColor(new Color(255, 133, 27));
		int xShape44[] = {491, 518, 482};
		int yShape44[] = {420, 447, 416};
		g.fillPolygon(new Polygon(xShape44, yShape44, xShape44.length));	
		
		g.setColor(new Color(255, 133, 27));
		int xShape45[] = {414, 405, 404, 427, 432, 491, 475, 461, 441, 427};
		int yShape45[] = {374, 370, 427, 405, 400, 420, 410, 394, 385, 382};
		g.fillPolygon(new Polygon(xShape45, yShape45, xShape45.length));

		g.setColor(new Color(255, 171, 56));
		int xShape46[] = {432, 427, 419, 453, 518, 482};
		int yShape46[] = {400, 405, 448, 427, 447, 416};
		g.fillPolygon(new Polygon(xShape46, yShape46, xShape46.length));

		g.setColor(new Color(255, 133, 27));
		int xShape47[] = {392, 405, 404, 396};
		int yShape47[] = {388, 370, 427, 435};
		g.fillPolygon(new Polygon(xShape47, yShape47, xShape47.length));

		g.setColor(new Color(255, 161, 64));
		int xShape48[] = {427, 404, 396, 349, 392, 405, 415, 419};
		int yShape48[] = {405, 427, 435, 469, 457, 451, 450, 448};
		g.fillPolygon(new Polygon(xShape48, yShape48, xShape48.length));

		g.setColor(new Color(255, 161, 64));
		int xShape49[] = {415, 405, 392, 400, 408};
		int yShape49[] = {450, 451, 457, 457, 455};
		g.fillPolygon(new Polygon(xShape49, yShape49, xShape49.length));

		g.setColor(new Color(255, 161, 64));
		int xShape50[] = {400, 392, 349, 332};
		int yShape50[] = {457, 457, 469, 484};
		g.fillPolygon(new Polygon(xShape50, yShape50, xShape50.length));

		g.setColor(new Color(136, 19, 35));
		int xShape51[] = {396, 349, 332, 322, 352, 355, 372, 386, 392};
		int yShape51[] = {435, 469, 484, 483, 435, 441, 416, 397, 388};
		g.fillPolygon(new Polygon(xShape51, yShape51, xShape51.length));
		
		g.setColor(new Color(40, 0, 60));
		int xShape52[] = {352, 355, 372, 373, 365, 365, 363, 362, 356, 356};
		int yShape52[] = {435, 441, 416, 398, 405, 354, 364, 368, 398, 430};
		g.fillPolygon(new Polygon(xShape52, yShape52, xShape52.length));
		
		g.setColor(new Color(50, 10, 70));
		int xShape53[] = {356, 356, 352, 322, 346, 352};
		int yShape53[] = {398, 430, 435, 483, 430, 417};
		g.fillPolygon(new Polygon(xShape53, yShape53, xShape53.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape54[] = {346, 322, 307, 321};
		int yShape54[] = {430, 483, 479, 430};
		g.fillPolygon(new Polygon(xShape54, yShape54, xShape54.length));
		
		g.setColor(new Color(148, 196, 210));
		int xShape55[] = {307, 292, 287, 323, 321};
		int yShape55[] = {479, 475, 476, 424, 430};
		g.fillPolygon(new Polygon(xShape55, yShape55, xShape55.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape56[] = {287, 305, 323, 323, 323, 315, 295, 273, 259};
		int yShape56[] = {476, 450, 424, 422, 415, 426, 445, 460, 473};
		g.fillPolygon(new Polygon(xShape56, yShape56, xShape56.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape57[] = {323, 323, 321, 346, 352, 356, 362, 363, 360, 360, 358, 358, 354, 340};
		int yShape57[] = {422, 424, 430, 430, 417, 398, 368, 364, 304, 345, 349, 309, 311, 422};
		g.fillPolygon(new Polygon(xShape57, yShape57, xShape57.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape58[] = {323, 323, 324, 332, 341, 342, 344, 347, 348, 352, 364, 358, 357, 354, 340};
		int yShape58[] = {422, 415, 413, 385, 346, 338, 332, 317, 313, 283, 282, 287, 291, 311, 422};
		g.fillPolygon(new Polygon(xShape58, yShape58, xShape58.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape59[] = {341, 341, 344, 342};
		int yShape59[] = {346, 360, 354, 338};
		g.fillPolygon(new Polygon(xShape59, yShape59, xShape59.length));
		
		g.setColor(new Color(175, 217, 225));
		int xShape60[] = {344, 346, 347, 347};
		int yShape60[] = {332, 345, 335, 317};
		g.fillPolygon(new Polygon(xShape60, yShape60, xShape60.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape61[] = {363, 365, 367, 364, 358, 357, 360};
		int yShape61[] = {364, 354, 343, 282, 287, 291, 304};
		g.fillPolygon(new Polygon(xShape61, yShape61, xShape61.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape62[] = {367, 370, 373, 374, 374, 371, 364};
		int yShape62[] = {343, 326, 293, 293, 283, 281, 282};
		g.fillPolygon(new Polygon(xShape62, yShape62, xShape62.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape63[] = {354, 358, 358, 360, 360, 357};
		int yShape63[] = {311, 309, 349, 345, 304, 291};
		g.fillPolygon(new Polygon(xShape63, yShape63, xShape63.length));
		
		g.setColor(new Color(216, 187, 153));
		int xShape64[] = {318, 299, 299, 325};
		int yShape64[] = {413, 410, 397, 385};
		g.fillPolygon(new Polygon(xShape64, yShape64, xShape64.length));
		
		g.setColor(new Color(233, 212, 167));
		int xShape65[] = {299, 325, 328, 322, 299};
		int yShape65[] = {397, 385, 370, 368, 361};
		g.fillPolygon(new Polygon(xShape65, yShape65, xShape65.length));
		
		g.setColor(new Color(226, 200, 163));
		int xShape66[] = {328, 318, 312, 326, 339};
		int yShape66[] = {370, 334, 321, 325, 325};
		g.fillPolygon(new Polygon(xShape66, yShape66, xShape66.length));
		
		g.setColor(new Color(226, 200, 163));
		int xShape67[] = {340, 344, 344, 334};
		int yShape67[] = {318, 301, 300, 300};
		g.fillPolygon(new Polygon(xShape67, yShape67, xShape67.length));
		
		g.setColor(new Color(233, 212, 167));
		int xShape68[] = {344, 334, 325, 329, 336, 346};
		int yShape68[] = {300, 300, 283, 284, 291, 293};
		g.fillPolygon(new Polygon(xShape68, yShape68, xShape68.length));
		
		g.setColor(new Color(226, 200, 163));
		int xShape69[] = {346, 336, 329, 325, 319, 312, 312, 326, 332, 346};
		int yShape69[] = {293, 291, 284, 283, 274, 274, 272, 272, 271, 271};
		g.fillPolygon(new Polygon(xShape69, yShape69, xShape69.length));
		
		g.setColor(new Color(205, 183, 157));
		int xShape70[] = {352, 345, 327, 342, 369, 387, 396, 409, 365};
		int yShape70[] = {258, 249, 236, 228, 213, 202, 200, 199, 251};
		g.fillPolygon(new Polygon(xShape70, yShape70, xShape70.length));
		
		g.setColor(new Color(229, 210, 170));
		int xShape71[] = {327, 342, 369, 387, 396, 409, 418, 430, 369, 356, 342, 346, 329, 320, 311, 304, 317};
		int yShape71[] = {236, 228, 213, 202, 200, 199, 188, 174, 182, 189, 200, 202, 215, 218, 223, 228, 231};
		g.fillPolygon(new Polygon(xShape71, yShape71, xShape71.length));
		
		g.setColor(new Color(176, 170, 148));
		int xShape72[] = {369, 356, 342, 330, 342, 356, 377, 388, 398, 430};
		int yShape72[] = {182, 189, 200, 197, 191, 182, 168, 163, 164, 174};
		g.fillPolygon(new Polygon(xShape72, yShape72, xShape72.length));
		
		g.setColor(new Color(182, 176, 152));
		int xShape73[] = {388, 377, 356, 342, 330, 319, 305, 316, 338, 375, 422, 435};
		int yShape73[] = {163, 168, 182, 191, 197, 195, 190, 182, 166, 138, 106, 95};
		g.fillPolygon(new Polygon(xShape73, yShape73, xShape73.length));
		
		g.setColor(new Color(236, 222, 185));
		int xShape74[] = {305, 316, 338, 375, 422, 435, 418, 408, 383, 363, 334, 305, 304, 292, 281};
		int yShape74[] = {190, 182, 166, 138, 106, 95, 101, 107, 121, 130, 146, 158, 159, 176, 187};
		g.fillPolygon(new Polygon(xShape74, yShape74, xShape74.length));
		
		g.setColor(new Color(246, 230, 185));
		int xShape75[] = {234, 232, 217, 200, 160, 165, 181, 204, 228, 234};
		int yShape75[] = {63, 65, 78, 90, 156, 163, 143, 94, 78, 66};
		g.fillPolygon(new Polygon(xShape75, yShape75, xShape75.length));
		
		g.setColor(new Color(207, 184, 139));
		int xShape76[] = {234, 228, 204, 181, 165, 160, 163, 167, 184, 200, 211, 229};
		int yShape76[] = {66, 78, 94, 143, 163, 156, 178, 172, 148, 129, 96, 78};
		g.fillPolygon(new Polygon(xShape76, yShape76, xShape76.length));
		
		g.setColor(new Color(254, 245, 213));
		int xShape77[] = {290, 278, 275, 263, 256, 246, 238, 223, 208, 200, 204, 204, 229, 245, 252, 264, 268, 284};
		int yShape77[] = {48, 55, 59, 70, 91, 117, 127, 141, 158, 167, 166, 177, 148, 132, 120, 94, 74, 59};
		g.fillPolygon(new Polygon(xShape77, yShape77, xShape77.length));
		
		g.setColor(new Color(211, 186, 139));
		int xShape78[] = {284, 268, 264, 252, 245, 229, 204, 204, 200, 197, 210, 215, 229, 242, 248, 262, 270, 272};
		int yShape78[] = {59, 74, 94, 120, 132, 148, 177, 166, 167, 191, 179, 174, 160, 151, 147, 130, 102, 74};
		g.fillPolygon(new Polygon(xShape78, yShape78, xShape78.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape79[] = {134, 130, 125, 125, 125, 131, 135, 136};
		int yShape79[] = {151, 172, 195, 212, 221, 212, 174, 157};
		g.fillPolygon(new Polygon(xShape79, yShape79, xShape79.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape80[] = {131, 135, 136, 143, 140, 142, 138, 138, 135};
		int yShape80[] = {212, 174, 157, 178, 197, 225, 227, 214, 200};
		g.fillPolygon(new Polygon(xShape80, yShape80, xShape80.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape81[] = {143, 140, 142, 147, 159, 159, 144};
		int yShape81[] = {178, 197, 225, 191, 148, 143, 175};
		g.fillPolygon(new Polygon(xShape81, yShape81, xShape81.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape82[] = {142, 147, 159, 160, 163, 149, 144};
		int yShape82[] = {225, 191, 148, 156, 178, 207, 223};
		g.fillPolygon(new Polygon(xShape82, yShape82, xShape82.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape83[] = {163, 149, 144, 167, 186, 208, 209, 200, 184, 167};
		int yShape83[] = {178, 207, 223, 190, 163, 129, 120, 129, 148, 172};
		g.fillPolygon(new Polygon(xShape83, yShape83, xShape83.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape84[] = {144, 167, 186, 208, 208, 200, 173, 167};
		int yShape84[] = {223, 190, 163, 129, 158, 167, 197, 204};
		g.fillPolygon(new Polygon(xShape84, yShape84, xShape84.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape85[] = {235, 258, 263, 264, 255, 223, 217, 205, 219, 222, 224, 229};
		int yShape85[] = {199, 178, 177, 175, 175, 191, 197, 213, 203, 202, 203, 200};
		g.fillPolygon(new Polygon(xShape85, yShape85, xShape85.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape86[] = {235, 258, 263, 259, 250, 235, 217, 209, 235, 235};
		int yShape86[] = {199, 178, 177, 187, 200, 217, 228, 231, 211, 209};
		g.fillPolygon(new Polygon(xShape86, yShape86, xShape86.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape87[] = {259, 277, 266, 252, 235, 217, 235};
		int yShape87[] = {219, 212, 215, 216, 217, 228, 230};
		g.fillPolygon(new Polygon(xShape87, yShape87, xShape87.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape88[] = {259, 277, 261, 248, 235, 247};
		int yShape88[] = {219, 212, 226, 235, 232, 225};
		g.fillPolygon(new Polygon(xShape88, yShape88, xShape88.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape89[] = {218, 228, 253, 267, 262, 245, 227};
		int yShape89[] = {246, 246, 246, 249, 251, 251, 251};
		g.fillPolygon(new Polygon(xShape89, yShape89, xShape89.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape90[] = {227, 245, 262, 250, 246};
		int yShape90[] = {251, 251, 251, 258, 260};
		g.fillPolygon(new Polygon(xShape90, yShape90, xShape90.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape91[] = {203, 224, 232, 225};
		int yShape91[] = {273, 271, 282, 282};
		g.fillPolygon(new Polygon(xShape91, yShape91, xShape91.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape92[] = {184, 179, 170, 203};
		int yShape92[] = {279, 281, 288, 291};
		g.fillPolygon(new Polygon(xShape92, yShape92, xShape92.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape93[] = {205, 219, 222, 224, 223, 216};
		int yShape93[] = {213, 203, 202, 203, 204, 207};
		g.fillPolygon(new Polygon(xShape93, yShape93, xShape93.length));
		
		g.setColor(new Color(131, 179, 209));
		int xShape94[] = {250, 250, 235, 252, 266, 253, 251, 245};
		int yShape94[] = {203, 200, 217, 216, 215, 214, 211, 208};
		g.fillPolygon(new Polygon(xShape94, yShape94, xShape94.length));
		
		g.setColor(new Color(109, 160, 201));
		int xShape95[] = {266, 253, 251, 245, 250, 250, 262, 277};
		int yShape95[] = {215, 214, 211, 208, 203, 200, 201, 212};
		g.fillPolygon(new Polygon(xShape95, yShape95, xShape95.length));
		
		g.setColor(new Color(109, 160, 201));
		int xShape96[] = {277, 261, 276, 279, 291, 290, 283};
		int yShape96[] = {212, 226, 226, 226, 227, 224, 219};
		g.fillPolygon(new Polygon(xShape96, yShape96, xShape96.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape97[] = {205, 207, 224, 235, 247, 259, 235, 217, 209};
		int yShape97[] = {247, 239, 233, 232, 225, 219, 230, 228, 231};
		g.fillPolygon(new Polygon(xShape97, yShape97, xShape97.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape98[] = {207, 224, 235, 248, 232, 218};
		int yShape98[] = {239, 233, 232, 235, 241, 246};
		g.fillPolygon(new Polygon(xShape98, yShape98, xShape98.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape99[] = {232, 239, 252, 267, 253, 228, 218};
		int yShape99[] = {241, 241, 241, 249, 246, 246, 246};
		g.fillPolygon(new Polygon(xShape99, yShape99, xShape99.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape100[] = {205, 224, 203, 201};
		int yShape100[] = {251, 262, 262, 261};
		g.fillPolygon(new Polygon(xShape100, yShape100, xShape100.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape101[] = {224, 237, 238, 242, 246, 227, 218, 207, 205};
		int yShape101[] = {262, 262, 262, 262, 260, 251, 246, 239, 251};
		g.fillPolygon(new Polygon(xShape101, yShape101, xShape101.length));
		
		g.setColor(new Color(255, 220, 59));
		int xShape102[] = {201, 224, 203, 192};
		int yShape102[] = {261, 271, 273, 269};
		g.fillPolygon(new Polygon(xShape102, yShape102, xShape102.length));
		
		g.setColor(new Color(255, 183, 51));
		int xShape103[] = {192, 184, 225, 203};
		int yShape103[] = {269, 279, 282, 273};
		g.fillPolygon(new Polygon(xShape103, yShape103, xShape103.length));
		
		g.setColor(new Color(201, 225, 208));
		int xShape104[] = {135, 135, 129, 129, 131, 138, 138};
		int yShape104[] = {200, 217, 231, 239, 236, 227, 214};
		g.fillPolygon(new Polygon(xShape104, yShape104, xShape104.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape105[] = {135, 135, 129, 129, 131, 138, 142, 144, 167, 173, 166, 148, 141, 133, 118, 100, 89, 87, 85, 85, 82, 87, 96, 106, 108, 111, 112, 123, 125, 125, 131};
		int yShape105[] = {200, 217, 231, 239, 236, 227, 225, 223, 204, 197, 210, 233, 238, 247, 264, 286, 300, 314, 311, 303, 301, 291, 284, 275, 269, 264, 243, 226, 212, 221, 212}; 
		g.fillPolygon(new Polygon(xShape105, yShape105, xShape105.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape106[] = {148, 141, 133, 118, 100, 89, 85, 94, 94, 99, 106, 115, 127, 142, 146};
		int yShape106[] = {233, 238, 247, 264, 286, 300, 318, 326, 312, 300, 291, 285, 266, 247, 238}; 
		g.fillPolygon(new Polygon(xShape106, yShape106, xShape106.length));
		
		g.setColor(new Color(201, 225, 208));
		int xShape107[] = {115, 127, 142, 146, 145, 143, 126};
		int yShape107[] = {285, 266, 247, 238, 248, 264, 279}; 
		g.fillPolygon(new Polygon(xShape107, yShape107, xShape107.length));	
		
		g.setColor(new Color(190, 243, 235));
		int xShape108[] = {115, 129, 143, 144, 135, 111};
		int yShape108[] = {285, 279, 266, 283, 288, 302}; 
		g.fillPolygon(new Polygon(xShape108, yShape108, xShape108.length));	
		
		g.setColor(new Color(221, 252, 247));
		int xShape109[] = {115, 106, 99, 100, 111};
		int yShape109[] = {285, 291, 300, 322, 302}; 
		g.fillPolygon(new Polygon(xShape109, yShape109, xShape109.length));	
		
		g.setColor(new Color(201, 225, 208));
		int xShape110[] = {94, 94, 87, 87, 85, 85, 82, 85, 96, 111, 111, 98, 100, 100, 107, 115, 106, 99};
		int yShape110[] = {312, 326, 318, 314, 311, 303, 301, 318, 331, 330, 327, 327, 322, 301, 292, 285, 291, 300}; 
		g.fillPolygon(new Polygon(xShape110, yShape110, xShape110.length));	
		
		g.setColor(new Color(124, 219, 221));
		int xShape111[] = {111, 100, 98, 111, 118, 124};
		int yShape111[] = {302, 322, 327, 327, 318, 311}; 
		g.fillPolygon(new Polygon(xShape111, yShape111, xShape111.length));	
		
		g.setColor(new Color(177, 145, 89));
		int xShape112[] = {111, 118, 117, 111};
		int yShape112[] = {327, 318, 327, 330}; 
		g.fillPolygon(new Polygon(xShape112, yShape112, xShape112.length));
		
		g.setColor(new Color(177, 145, 89));
		int xShape113[] = {117, 118, 124, 142, 151, 170, 152, 131};
		int yShape113[] = {327, 318, 311, 297, 293, 288, 300, 314}; 
		g.fillPolygon(new Polygon(xShape113, yShape113, xShape113.length));	
		
		g.setColor(new Color(124, 219, 221));
		int xShape114[] = {111, 135, 131, 124};
		int yShape114[] = {302, 288, 301, 311}; 
		g.fillPolygon(new Polygon(xShape114, yShape114, xShape114.length));	
		
		g.setColor(new Color(190, 243, 235));
		int xShape115[] = {144, 143, 159, 159, 152};
		int yShape115[] = {283, 266, 266, 275, 278}; 
		g.fillPolygon(new Polygon(xShape115, yShape115, xShape115.length));	
		
		g.setColor(new Color(59, 79, 78));
		int xShape116[] = {126, 115, 129, 143, 159, 167, 159, 143};
		int yShape116[] = {279, 285, 279, 266, 266, 252, 263, 264}; 
		g.fillPolygon(new Polygon(xShape116, yShape116, xShape116.length));	
		
		g.setColor(new Color(206, 130, 73));
		int xShape117[] = {143, 159, 167, 168, 152, 151};
		int yShape117[] = {264, 263, 252, 241, 247, 250}; 
		g.fillPolygon(new Polygon(xShape117, yShape117, xShape117.length));
		
		g.setColor(new Color(64, 112, 116));
		int xShape118[] = {124, 131, 140, 179, 201, 192, 184, 179, 170, 151, 142};
		int yShape118[] = {311, 301, 293, 272, 261, 269, 279, 281, 288, 293, 297}; 
		g.fillPolygon(new Polygon(xShape118, yShape118, xShape118.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape119[] = {131, 140, 179, 201, 205, 209, 200, 192, 201, 195, 184, 159, 152, 144, 135};
		int yShape119[] = {301, 293, 272, 261, 251, 231, 232, 241, 241, 252, 263, 275, 278, 283, 288}; 
		g.fillPolygon(new Polygon(xShape119, yShape119, xShape119.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape120[] = {159, 159, 167, 192, 201, 195, 184};
		int yShape120[] = {275, 266, 252, 241, 241, 252, 263}; 
		g.fillPolygon(new Polygon(xShape120, yShape120, xShape120.length));
		
		g.setColor(new Color(143, 211, 212));
		int xShape121[] = {192, 200, 190, 179, 167};
		int yShape121[] = {241, 232, 233, 243, 252}; 
		g.fillPolygon(new Polygon(xShape121, yShape121, xShape121.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape122[] = {167, 168, 175, 187, 190, 198, 219, 198, 214, 229, 240, 240, 234, 232, 223, 205, 187, 197, 235, 235, 235,  209, 200, 190, 179};
		int yShape122[] = {252, 241, 238, 219, 207, 203, 207, 203, 188, 171, 159, 165, 175, 181, 191, 213, 230, 230, 199, 209, 211, 231, 232, 233, 243}; 
		g.fillPolygon(new Polygon(xShape122, yShape122, xShape122.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape123[] = {152, 157, 187, 175, 168};
		int yShape123[] = {247, 239, 219, 238, 241}; 
		g.fillPolygon(new Polygon(xShape123, yShape123, xShape123.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape124[] = {152, 157, 187, 146, 145, 143};
		int yShape124[] = {247, 239, 219, 238, 248, 264}; 
		g.fillPolygon(new Polygon(xShape124, yShape124, xShape124.length));
		
		g.setColor(new Color(124, 219, 221));
		int xShape125[] = {187, 146, 148, 160, 175, 181, 183, 200, 197, 210, 190};
		int yShape125[] = {219, 238, 233, 226, 214, 205, 197, 167, 191, 179, 207}; 
		g.fillPolygon(new Polygon(xShape125, yShape125, xShape125.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape126[] = {148, 160, 175, 181, 183, 200, 173, 166};
		int yShape126[] = {233, 226, 214, 205, 197, 167, 197, 210}; 
		g.fillPolygon(new Polygon(xShape126, yShape126, xShape126.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape127[] = {187, 197, 235, 229, 224, 223, 216, 205};
		int yShape127[] = {230, 230, 199, 200, 203, 204, 207, 213}; 
		g.fillPolygon(new Polygon(xShape127, yShape127, xShape127.length));
		
		g.setColor(new Color(221, 252, 247));
		int xShape128[] = {190, 198, 214, 229, 240, 242, 229, 215, 210};
		int yShape128[] = {207, 203, 188, 171, 159, 151, 160, 174, 179}; 
		g.fillPolygon(new Polygon(xShape128, yShape128, xShape128.length));
		
		g.setColor(new Color(234, 96, 21));
		int xShape129[] = {223, 232, 234, 255};
		int yShape129[] = {191, 181, 175, 175}; 
		g.fillPolygon(new Polygon(xShape129, yShape129, xShape129.length));

		g.setColor(new Color(255, 198, 65));
		int xShape130[] = {234, 240, 242, 276, 287, 292, 314, 302, 291, 279, 271, 264, 255};
		int yShape130[] = {175, 165, 163, 154, 153, 151, 147, 155, 163, 170, 175, 175, 175}; 
		g.fillPolygon(new Polygon(xShape130, yShape130, xShape130.length));

		g.setColor(new Color(242, 162, 57));
		int xShape131[] = {314, 302, 291, 279, 271, 264, 263, 259, 266, 267, 276, 281, 292, 304, 305};
		int yShape131[] = {147, 155, 163, 170, 175, 175, 177, 187, 185, 191, 187, 187, 176, 159, 158}; 
		g.fillPolygon(new Polygon(xShape131, yShape131, xShape131.length));

		g.setColor(new Color(234, 96, 21));
		int xShape132[] = {250, 264, 266, 267};
		int yShape132[] = {200, 175, 185, 191}; 
		g.fillPolygon(new Polygon(xShape132, yShape132, xShape132.length));

		g.setColor(new Color(242, 162, 57));
		int xShape133[] = {250, 267, 276, 281, 305, 319, 330, 342, 346, 340, 316, 276, 262, 259};
		int yShape133[] = {200, 191, 187, 187, 190, 195, 197, 200, 202, 207, 206, 203, 201, 201}; 
		g.fillPolygon(new Polygon(xShape133, yShape133, xShape133.length));

		g.setColor(new Color(234, 96, 21));
		int xShape134[] = {316, 276, 262, 277, 283, 290, 304};
		int yShape134[] = {206, 203, 201, 212, 219, 224, 228}; 
		g.fillPolygon(new Polygon(xShape134, yShape134, xShape134.length));

		g.setColor(new Color(242, 162, 57));
		int xShape135[] = {340, 316, 304, 311, 320, 329};
		int yShape135[] = {207, 206, 228, 223, 218, 215}; 
		g.fillPolygon(new Polygon(xShape135, yShape135, xShape135.length));

		g.setColor(new Color(242, 162, 57));
		int xShape136[] = {290, 304, 317, 327, 345, 352, 346, 346, 346, 332, 326, 334, 342, 330, 323, 306, 298};
		int yShape136[] = {224, 228, 231, 236, 249, 258, 258, 270, 271, 271, 272, 261, 261, 255, 253, 243, 235}; 
		g.fillPolygon(new Polygon(xShape136, yShape136, xShape136.length));

		g.setColor(new Color(234, 96, 21));
		int xShape137[] = {326, 334, 342, 330, 323, 306, 298, 290, 291, 294, 301, 303, 305, 310, 312};
		int yShape137[] = {272, 261, 261, 255, 253, 243, 235, 224, 227, 232, 248, 253, 257, 267, 272}; 
		g.fillPolygon(new Polygon(xShape137, yShape137, xShape137.length));

		g.setColor(new Color(242, 162, 57));
		int xShape138[] = {312, 319, 325, 334, 340, 323, 315};
		int yShape138[] = {274, 274, 283, 300, 318, 302, 291}; 
		g.fillPolygon(new Polygon(xShape138, yShape138, xShape138.length));

		g.setColor(new Color(234, 96, 21));
		int xShape139[] = {340, 323, 315, 312, 308, 312, 326, 339};
		int yShape139[] = {318, 302, 291, 274, 311, 321, 325, 325}; 
		g.fillPolygon(new Polygon(xShape139, yShape139, xShape139.length));

		g.setColor(new Color(242, 162, 57));
		int xShape140[] = {308, 312, 318, 328, 322, 305};
		int yShape140[] = {311, 321, 334, 370, 368, 321}; 
		g.fillPolygon(new Polygon(xShape140, yShape140, xShape140.length));
		
		g.setColor(new Color(234, 96, 21));
		int xShape141[] = {322, 305, 299, 299};
		int yShape141[] = {368, 321, 346, 361}; 
		g.fillPolygon(new Polygon(xShape141, yShape141, xShape141.length));
		
		g.setColor(new Color(242, 162, 57));
		int xShape142[] = {299, 299, 299, 299, 299, 285, 290, 295};
		int yShape142[] = {346, 361, 397, 410, 420, 380, 370, 360}; 
		g.fillPolygon(new Polygon(xShape142, yShape142, xShape142.length));
		
		g.setColor(new Color(234, 96, 21));
		int xShape143[] = {285, 299, 290, 279, 277, 277};
		int yShape143[] = {380, 420, 416, 417, 412, 403}; 
		g.fillPolygon(new Polygon(xShape143, yShape143, xShape143.length));
		
		g.setColor(new Color(242, 162, 57));
		int xShape144[] = {299, 318, 315, 308, 306, 303, 297, 292, 281, 279, 290, 299};
		int yShape144[] = {410, 413, 417, 425, 427, 427, 430, 430, 422, 417, 416, 420}; 
		g.fillPolygon(new Polygon(xShape144, yShape144, xShape144.length));
		
		g.setColor(new Color(242, 162, 57));
		int xShape145[] = {415, 442, 417, 417, 400, 408};
		int yShape145[] = {450, 450, 479, 462, 457, 455};
		g.fillPolygon(new Polygon(xShape145, yShape145, xShape145.length));

		g.setColor(new Color(234, 96, 21));
		int xShape146[] = {400, 417, 417, 400, 385};
		int yShape146[] = {457, 462, 479, 467, 462};
		g.fillPolygon(new Polygon(xShape146, yShape146, xShape146.length));

		g.setColor(new Color(242, 162, 57));
		int xShape147[] = {424, 446, 475, 455, 455};
		int yShape147[] = {484, 475, 475, 507, 487};
		g.fillPolygon(new Polygon(xShape147, yShape147, xShape147.length));

		g.setColor(new Color(234, 96, 21));
		int xShape148[] = {424, 455, 455, 431};
		int yShape148[] = {484, 487, 507, 489};
		g.fillPolygon(new Polygon(xShape148, yShape148, xShape148.length));

		g.setColor(new Color(242, 162, 57));
		int xShape149[] = {461, 487, 516, 498, 497};
		int yShape149[] = {511, 500, 496, 531, 513};
		g.fillPolygon(new Polygon(xShape149, yShape149, xShape149.length));

		g.setColor(new Color(234, 96, 21));
		int xShape150[] = {461, 497, 498, 467};
		int yShape150[] = {511, 513, 531, 516};
		g.fillPolygon(new Polygon(xShape150, yShape150, xShape150.length));

		g.setColor(new Color(242, 162, 57));
		int xShape151[] = {498, 530, 569, 550, 545};
		int yShape151[] = {531, 516, 511, 541, 530};
		g.fillPolygon(new Polygon(xShape151, yShape151, xShape151.length));

		g.setColor(new Color(234, 96, 21));
		int xShape152[] = {498, 545, 550, 544, 521, 510};
		int yShape152[] = {531, 530, 541, 538, 536, 535};
		g.fillPolygon(new Polygon(xShape152, yShape152, xShape152.length));

		g.setColor(new Color(255, 222, 117));
		int xShape153[] = {556, 589, 615, 635, 609, 576};
		int yShape153[] = {545, 540, 540, 543, 551, 551};
		g.fillPolygon(new Polygon(xShape153, yShape153, xShape153.length));

		g.setColor(new Color(241, 156, 29));
		int xShape154[] = {576, 609, 635, 624, 606};
		int yShape154[] = {551, 551, 543, 553, 565};
		g.fillPolygon(new Polygon(xShape154, yShape154, xShape154.length));

		g.setColor(new Color(255, 222, 117));
		int xShape155[] = {620, 645, 681, 643, 635};
		int yShape155[] = {574, 571, 591, 584, 583};
		g.fillPolygon(new Polygon(xShape155, yShape155, xShape155.length));

		g.setColor(new Color(241, 156, 29));
		int xShape156[] = {635, 643, 681, 650, 640};
		int yShape156[] = {583, 584, 591, 595, 586};
		g.fillPolygon(new Polygon(xShape156, yShape156, xShape156.length));

		g.setColor(new Color(241, 156, 29));
		int xShape157[] = {650, 681, 663};
		int yShape157[] = {595, 623, 632};
		g.fillPolygon(new Polygon(xShape157, yShape157, xShape157.length));

		g.setColor(new Color(109, 185, 208));
		int xShape158[] = {261, 248, 227, 239, 252, 267};
		int yShape158[] = {226, 235, 241, 241, 241, 249};
		g.fillPolygon(new Polygon(xShape158, yShape158, xShape158.length));

		g.setColor(new Color(131, 179, 209));
		int xShape159[] = {261, 276, 279, 294, 294, 273, 267};
		int yShape159[] = {226, 226, 226, 251, 264, 268, 249};
		g.fillPolygon(new Polygon(xShape159, yShape159, xShape159.length));

		g.setColor(new Color(109, 160, 201));
		int xShape160[] = {279, 294, 294, 312, 312, 310, 305, 303, 301, 294, 291};
		int yShape160[] = {226, 251, 264, 274, 272, 267, 257, 253, 248, 232, 227};
		g.fillPolygon(new Polygon(xShape160, yShape160, xShape160.length));
		
		g.setColor(new Color(109, 185, 208));
		int xShape161[] = {267, 273, 250, 262};
		int yShape161[] = {249, 268, 258, 251};
		g.fillPolygon(new Polygon(xShape161, yShape161, xShape161.length));

		g.setColor(new Color(148, 196, 210));
		int xShape162[] = {273, 250, 246, 242, 238, 237, 240, 237, 269};
		int yShape162[] = {268, 258, 260, 262, 262, 262, 266, 262, 296};
		g.fillPolygon(new Polygon(xShape162, yShape162, xShape162.length));

		g.setColor(new Color(109, 160, 201));
		int xShape163[] = {273, 294, 312, 308, 305, 295};
		int yShape163[] = {268, 264, 274, 311, 321, 307};
		g.fillPolygon(new Polygon(xShape163, yShape163, xShape163.length));

		g.setColor(new Color(240, 155, 120));
		int xShape164[] = {237, 240, 241, 242, 242, 240, 235, 226, 229, 232, 232, 229, 224};
		int yShape164[] = {262, 266, 271, 276, 301, 315, 328, 325, 317, 298, 282, 267, 262};
		g.fillPolygon(new Polygon(xShape164, yShape164, xShape164.length));

		g.setColor(new Color(235, 145, 115));
		int xShape165[] = {237, 242, 242, 240, 235, 265, 269};
		int yShape165[] = {262, 276, 301, 315, 328, 311, 296};
		g.fillPolygon(new Polygon(xShape165, yShape165, xShape165.length));

		g.setColor(new Color(109, 185, 208));
		int xShape166[] = {269, 273, 295, 276};
		int yShape166[] = {296, 268, 307, 335};
		g.fillPolygon(new Polygon(xShape166, yShape166, xShape166.length));

		g.setColor(new Color(235, 155, 110));
		int xShape167[] = {235, 265, 250};
		int yShape167[] = {328, 311, 349};
		g.fillPolygon(new Polygon(xShape167, yShape167, xShape167.length));

		g.setColor(new Color(195, 242, 234));
		int xShape168[] = {265, 250, 276, 269};
		int yShape168[] = {311, 349, 335, 296};
		g.fillPolygon(new Polygon(xShape168, yShape168, xShape168.length));

		g.setColor(new Color(109, 160, 201));
		int xShape169[] = {276, 295, 305, 299, 295, 285};
		int yShape169[] = {335, 307, 321, 346, 360, 364};
		g.fillPolygon(new Polygon(xShape169, yShape169, xShape169.length));

		g.setColor(new Color(235, 155, 110));
		int xShape170[] = {226, 235, 222, 220, 210, 200, 211, 220};
		int yShape170[] = {325, 328, 352, 356, 374, 372, 354, 338};
		g.fillPolygon(new Polygon(xShape170, yShape170, xShape170.length));

		g.setColor(new Color(235, 155, 110));
		int xShape171[] = {235, 250, 210, 220, 222};
		int yShape171[] = {328, 349, 374, 356, 352};
		g.fillPolygon(new Polygon(xShape171, yShape171, xShape171.length));

		g.setColor(new Color(195, 242, 234));
		int xShape172[] = {250, 276, 258};
		int yShape172[] = {349, 335, 374};
		g.fillPolygon(new Polygon(xShape172, yShape172, xShape172.length));

		g.setColor(new Color(148, 196, 210));
		int xShape173[] = {276, 285, 265, 258};
		int yShape173[] = {335, 364, 398, 374};
		g.fillPolygon(new Polygon(xShape173, yShape173, xShape173.length));

		g.setColor(new Color(255, 218, 175));
		int xShape174[] = {210, 196, 188, 184, 173, 178, 191, 200};
		int yShape174[] = {374, 396, 412, 422, 419, 408, 386, 372};
		g.fillPolygon(new Polygon(xShape174, yShape174, xShape174.length));

		g.setColor(new Color(255, 218, 175));
		int xShape175[] = {210, 196, 188, 184, 215, 250};
		int yShape175[] = {374, 396, 412, 422, 403, 349};
		g.fillPolygon(new Polygon(xShape175, yShape175, xShape175.length));

		g.setColor(new Color(230, 125, 65));
		int xShape176[] = {215, 250, 244, 235, 222, 210, 207, 207, 202, 203};
		int yShape176[] = {403, 349, 370, 388, 410, 435, 448, 459, 448, 435};
		g.fillPolygon(new Polygon(xShape176, yShape176, xShape176.length));

		g.setColor(new Color(195, 242, 234));
		int xShape177[] = {250, 244, 235, 222, 210, 207, 227, 242, 247, 258};
		int yShape177[] = {349, 370, 388, 410, 435, 448, 427, 415, 396, 374};
		g.fillPolygon(new Polygon(xShape177, yShape177, xShape177.length));

		g.setColor(new Color(148, 196, 210));
		int xShape178[] = {258, 247, 242, 265};
		int yShape178[] = {374, 396, 415, 398};
		g.fillPolygon(new Polygon(xShape178, yShape178, xShape178.length));

		g.setColor(new Color(41, 168, 211));
		int xShape179[] = {265, 273, 277, 277, 285, 290, 295, 285};
		int yShape179[] = {398, 435, 412, 403, 380, 370, 360, 364};
		g.fillPolygon(new Polygon(xShape179, yShape179, xShape179.length));

		g.setColor(new Color(255, 218, 175));
		int xShape180[] = {184, 171, 171, 162, 164, 169, 173};
		int yShape180[] = {422, 465, 470, 456, 445, 432, 419};
		g.fillPolygon(new Polygon(xShape180, yShape180, xShape180.length));
		
		g.setColor(new Color(255, 218, 175));
		int xShape181[] = {184, 171, 171, 202, 203, 215};
		int yShape181[] = {422, 465, 470, 448, 435, 403};
		g.fillPolygon(new Polygon(xShape181, yShape181, xShape181.length));

		g.setColor(new Color(197, 236, 233));
		int xShape182[] = {242, 236, 236, 236, 207, 227};
		int yShape182[] = {415, 440, 463, 463, 448, 427};
		g.fillPolygon(new Polygon(xShape182, yShape182, xShape182.length));

		g.setColor(new Color(175, 217, 225));
		int xShape183[] = {242, 236, 236, 258};
		int yShape183[] = {415, 440, 463, 445};
		g.fillPolygon(new Polygon(xShape183, yShape183, xShape183.length));

		g.setColor(new Color(153, 198, 217));
		int xShape184[] = {242, 258, 265};
		int yShape184[] = {415, 445, 398};
		g.fillPolygon(new Polygon(xShape184, yShape184, xShape184.length));

		g.setColor(new Color(131, 179, 209));
		int xShape185[] = {258, 259, 273, 273, 265};
		int yShape185[] = {445, 473, 460, 435, 398};
		g.fillPolygon(new Polygon(xShape185, yShape185, xShape185.length));

		g.setColor(new Color(109, 160, 201));
		int xShape186[] = {273, 273, 277, 279, 281, 295};
		int yShape186[] = {460, 435, 412, 417, 422, 438};
		g.fillPolygon(new Polygon(xShape186, yShape186, xShape186.length));

		g.setColor(new Color(235, 165, 90));
		int xShape187[] = {171, 173, 202};
		int yShape187[] = {470, 474, 448};
		g.fillPolygon(new Polygon(xShape187, yShape187, xShape187.length));

		g.setColor(new Color(255, 218, 175));
		int xShape188[] = {171, 173, 202, 191, 175, 164, 162, 160, 162};
		int yShape188[] = {470, 474, 448, 497, 537, 508, 489, 474, 456};
		g.fillPolygon(new Polygon(xShape188, yShape188, xShape188.length));

		g.setColor(new Color(235, 165, 90));
		int xShape189[] = {202, 191, 175, 190, 201, 208, 195, 201};
		int yShape189[] = {448, 497, 537, 504, 554, 573, 500, 476};
		g.fillPolygon(new Polygon(xShape189, yShape189, xShape189.length));

		g.setColor(new Color(230, 125, 65));
		int xShape190[] = {208, 195, 201, 202, 207, 209, 212, 218, 218, 219, 216, 212, 208};
		int yShape190[] = {573, 500, 476, 448, 459, 469, 489, 516, 519, 524, 521, 541, 562};
		g.fillPolygon(new Polygon(xShape190, yShape190, xShape190.length));

		g.setColor(new Color(230, 125, 65));
		int xShape191[] = {208, 201, 190, 175, 187, 197};
		int yShape191[] = {573, 554, 504, 537, 552, 563};
		g.fillPolygon(new Polygon(xShape191, yShape191, xShape191.length));

		g.setColor(new Color(175, 217, 225));
		int xShape192[] = {207, 207, 209, 212, 218, 236};
		int yShape192[] = {448, 459, 469, 489, 516, 463};
		g.fillPolygon(new Polygon(xShape192, yShape192, xShape192.length));

		g.setColor(new Color(97, 150, 190));
		int xShape193[] = {218, 236, 236, 258, 259, 240, 226};
		int yShape193[] = {516, 463, 463, 445, 473, 489, 504};
		g.fillPolygon(new Polygon(xShape193, yShape193, xShape193.length));

		g.setColor(new Color(195, 242, 234));
		int xShape194[] = {218, 218, 226, 240, 259, 275, 261, 247};
		int yShape194[] = {519, 516, 504, 489, 473, 498, 501, 506};
		g.fillPolygon(new Polygon(xShape194, yShape194, xShape194.length));

		g.setColor(new Color(175, 217, 225));
		int xShape195[] = {259, 287, 275};
		int yShape195[] = {473, 476, 498};
		g.fillPolygon(new Polygon(xShape195, yShape195, xShape195.length));

		g.setColor(new Color(148, 196, 210));
		int xShape196[] = {275, 287, 292, 307, 315};
		int yShape196[] = {498, 476, 475, 479, 504};
		g.fillPolygon(new Polygon(xShape196, yShape196, xShape196.length));

		g.setColor(new Color(204, 75, 40));
		int xShape197[] = {216, 219, 225, 245, 231, 216, 208, 208, 212};
		int yShape197[] = {521, 524, 542, 583, 575, 573, 573, 562, 541};
		g.fillPolygon(new Polygon(xShape197, yShape197, xShape197.length));

		g.setColor(new Color(109, 185, 208));
		int xShape198[] = {218, 222, 247, 273, 275, 261, 247};
		int yShape198[] = {519, 519, 508, 500, 498, 501, 506};
		g.fillPolygon(new Polygon(xShape198, yShape198, xShape198.length));

		g.setColor(new Color(148, 196, 210));
		int xShape199[] = {218, 222, 247, 248, 259, 262, 252, 233, 219};
		int yShape199[] = {519, 519, 508, 514, 554, 575, 558, 536, 524};
		g.fillPolygon(new Polygon(xShape199, yShape199, xShape199.length));

		g.setColor(new Color(126, 172, 195));
		int xShape200[] = {247, 248, 259, 262, 275, 273};
		int yShape200[] = {508, 514, 554, 575, 498, 500};
		g.fillPolygon(new Polygon(xShape200, yShape200, xShape200.length));
		
		g.setColor(new Color(109, 185, 208));
		int xShape201[] = {275, 262, 287, 291};
		int yShape201[] = {498, 575, 529, 524};
		g.fillPolygon(new Polygon(xShape201, yShape201, xShape201.length));

		g.setColor(new Color(97, 150, 190));
		int xShape202[] = {275, 291, 315};
		int yShape202[] = {498, 524, 504};
		g.fillPolygon(new Polygon(xShape202, yShape202, xShape202.length));

		g.setColor(new Color(230, 125, 65));
		int xShape203[] = {208, 218, 234, 254, 245, 231, 216};
		int yShape203[] = {573, 578, 585, 596, 583, 575, 573};
		g.fillPolygon(new Polygon(xShape203, yShape203, xShape203.length));

		g.setColor(new Color(148, 196, 210));
		int xShape204[] = {262, 252, 233, 219, 225, 245, 254, 254};
		int yShape204[] = {575, 558, 536, 524, 542, 583, 596, 614};
		g.fillPolygon(new Polygon(xShape204, yShape204, xShape204.length));

		g.setColor(new Color(175, 217, 225));
		int xShape205[] = {262, 286, 287};
		int yShape205[] = {575, 587, 529};
		g.fillPolygon(new Polygon(xShape205, yShape205, xShape205.length));

		g.setColor(new Color(148, 196, 210));
		int xShape206[] = {262, 254, 269};
		int yShape206[] = {575, 614, 614};
		g.fillPolygon(new Polygon(xShape206, yShape206, xShape206.length));

		g.setColor(new Color(126, 172, 195));
		int xShape207[] = {262, 286, 269};
		int yShape207[] = {575, 587, 614};
		g.fillPolygon(new Polygon(xShape207, yShape207, xShape207.length));

		g.setColor(new Color(109, 185, 208));
		int xShape208[] = {286, 287, 300, 272, 269};
		int yShape208[] = {587, 617, 629, 635, 614};
		g.fillPolygon(new Polygon(xShape208, yShape208, xShape208.length));

		g.setColor(new Color(97, 150, 190));
		int xShape209[] = {272, 280, 300};
		int yShape209[] = {635, 647, 629};
		g.fillPolygon(new Polygon(xShape209, yShape209, xShape209.length));

		g.setColor(new Color(195, 242, 234));
		int xShape210[] = {269, 202, 191, 254};
		int yShape210[] = {614, 662, 660, 614};
		g.fillPolygon(new Polygon(xShape210, yShape210, xShape210.length));

		g.setColor(new Color(175, 217, 225));
		int xShape211[] = {269, 202, 272};
		int yShape211[] = {614, 662, 635};
		g.fillPolygon(new Polygon(xShape211, yShape211, xShape211.length));

		g.setColor(new Color(148, 196, 210));
		int xShape212[] = {202, 272, 280, 206, 205};
		int yShape212[] = {662, 635, 647, 677, 666};
		g.fillPolygon(new Polygon(xShape212, yShape212, xShape212.length));

		g.setColor(new Color(109, 185, 208));
		int xShape213[] = {170, 152, 139, 146, 148, 152};
		int yShape213[] = {659, 659, 664, 666, 671, 668};
		g.fillPolygon(new Polygon(xShape213, yShape213, xShape213.length));

		g.setColor(new Color(195, 242, 234));
		int xShape214[] = {152, 170, 191, 173, 158};
		int yShape214[] = {668, 659, 660, 660, 668};
		g.fillPolygon(new Polygon(xShape214, yShape214, xShape214.length));

		g.setColor(new Color(175, 217, 225));
		int xShape215[] = {158, 173, 191, 202, 191, 175, 170, 166};
		int yShape215[] = {668, 660, 660, 662, 663, 668, 672, 676};
		g.fillPolygon(new Polygon(xShape215, yShape215, xShape215.length));

		g.setColor(new Color(148, 196, 210));
		int xShape216[] = {175, 191, 202, 180};
		int yShape216[] = {668, 663, 662, 668};
		g.fillPolygon(new Polygon(xShape216, yShape216, xShape216.length));

		g.setColor(new Color(109, 185, 208));
		int xShape217[] = {180, 202, 205, 206, 194, 183, 183, 182};
		int yShape217[] = {668, 662, 666, 677, 681, 684, 677, 672};
		g.fillPolygon(new Polygon(xShape217, yShape217, xShape217.length));

		g.setColor(new Color(252, 237, 156));
		int xShape218[] = {146, 133, 126, 120, 129, 139};
		int yShape218[] = {666, 674, 686, 688, 672, 664};
		g.fillPolygon(new Polygon(xShape218, yShape218, xShape218.length));

		g.setColor(new Color(218, 159, 59));
		int xShape219[] = {146, 133, 126, 133, 137, 139, 148};
		int yShape219[] = {666, 674, 686, 685, 685, 679, 671};
		g.fillPolygon(new Polygon(xShape219, yShape219, xShape219.length));

		g.setColor(new Color(252, 237, 156));
		int xShape220[] = {148, 139, 137, 135, 138, 145, 158, 152};
		int yShape220[] = {671, 679, 685, 691, 690, 680, 668, 668};
		g.fillPolygon(new Polygon(xShape220, yShape220, xShape220.length));
		
		g.setColor(new Color(218, 159, 59));
		int xShape221[] = {158, 145, 138, 154, 162, 164, 166};
		int yShape221[] = {668, 680, 690, 686, 685, 679, 676};
		g.fillPolygon(new Polygon(xShape221, yShape221, xShape221.length));

		g.setColor(new Color(252, 237, 156));
		int xShape222[] = {166, 164, 162, 161, 172, 174, 182, 180, 175, 170};
		int yShape222[] = {676, 679, 685, 692, 686, 679, 672, 668, 668, 672};
		g.fillPolygon(new Polygon(xShape222, yShape222, xShape222.length));

		g.setColor(new Color(218, 159, 59));
		int xShape223[] = {182, 176, 173, 174, 172, 183, 183};
		int yShape223[] = {672, 676, 681, 679, 686, 684, 677};
		g.fillPolygon(new Polygon(xShape223, yShape223, xShape223.length));

		g.setColor(new Color(175, 217, 225));
		int xShape224[] = {207, 197, 187, 175, 170, 185, 187};
		int yShape224[] = {598, 563, 552, 537, 523, 585, 592};
		g.fillPolygon(new Polygon(xShape224, yShape224, xShape224.length));

		g.setColor(new Color(148, 196, 210));
		int xShape225[] = {207, 197, 208};
		int yShape225[] = {598, 563, 573};
		g.fillPolygon(new Polygon(xShape225, yShape225, xShape225.length));

		g.setColor(new Color(109, 185, 208));
		int xShape226[] = {207, 208, 218, 234, 233, 230};
		int yShape226[] = {598, 573, 578, 585, 592, 606};
		g.fillPolygon(new Polygon(xShape226, yShape226, xShape226.length));

		g.setColor(new Color(195, 242, 234));
		int xShape227[] = {207, 187, 146, 152};
		int yShape227[] = {598, 592, 633, 633};
		g.fillPolygon(new Polygon(xShape227, yShape227, xShape227.length));

		g.setColor(new Color(175, 217, 225));
		int xShape228[] = {207, 152, 151, 202, 226, 230};
		int yShape228[] = {598, 633, 647, 622, 610, 606};
		g.fillPolygon(new Polygon(xShape228, yShape228, xShape228.length));

		g.setColor(new Color(175, 217, 225));
		int xShape229[] = {152, 146, 97, 91, 96, 99, 106, 111, 120};
		int yShape229[] = {633, 633, 633, 638, 639, 647, 641, 640, 638};
		g.fillPolygon(new Polygon(xShape229, yShape229, xShape229.length));

		g.setColor(new Color(195, 242, 234));
		int xShape230[] = {111, 120, 152, 149, 122, 118};
		int yShape230[] = {640, 638, 633, 634, 641, 643};
		g.fillPolygon(new Polygon(xShape230, yShape230, xShape230.length));

		g.setColor(new Color(109, 185, 208));
		int xShape231[] = {152, 149, 122, 118, 118, 135, 151};
		int yShape231[] = {633, 634, 641, 643, 659, 654, 647};
		g.fillPolygon(new Polygon(xShape231, yShape231, xShape231.length));

		g.setColor(new Color(218, 159, 59));
		int xShape232[] = {91, 80, 90, 97};
		int yShape232[] = {638, 649, 635, 633};
		g.fillPolygon(new Polygon(xShape232, yShape232, xShape232.length));

		g.setColor(new Color(218, 159, 59));
		int xShape233[] = {91, 80, 74, 88, 93, 99, 96};
		int yShape233[] = {638, 649, 660, 654, 654, 647, 638};
		g.fillPolygon(new Polygon(xShape233, yShape233, xShape233.length));

		g.setColor(new Color(218, 159, 59));
		int xShape234[] = {99, 93, 90, 111, 118, 118, 111, 106};
		int yShape234[] = {647, 654, 666, 657, 659, 643, 640, 641};
		g.fillPolygon(new Polygon(xShape234, yShape234, xShape234.length));

		g.setColor(new Color(195, 242, 234));
		int xShape235[] = {286, 294, 315, 291, 287};
		int yShape235[] = {587, 587, 504, 524, 529};
		g.fillPolygon(new Polygon(xShape235, yShape235, xShape235.length));

		g.setColor(new Color(148, 196, 210));
		int xShape236[] = {286, 294, 301, 304, 303, 302, 301, 300, 287};
		int yShape236[] = {587, 587, 583, 590, 606, 613, 617, 629, 617};
		g.fillPolygon(new Polygon(xShape236, yShape236, xShape236.length));

		g.setColor(new Color(126, 172, 195));
		int xShape237[] = {301, 319, 310, 304};
		int yShape237[] = {583, 561, 578, 590};
		g.fillPolygon(new Polygon(xShape237, yShape237, xShape237.length));

		g.setColor(new Color(109, 185, 208));
		int xShape238[] = {301, 319, 327, 315, 294};
		int yShape238[] = {583, 561, 546, 504, 587};
		g.fillPolygon(new Polygon(xShape238, yShape238, xShape238.length));

		g.setColor(new Color(99, 147, 176));
		int xShape239[] = {327, 315, 346};
		int yShape239[] = {546, 504, 529};
		g.fillPolygon(new Polygon(xShape239, yShape239, xShape239.length));

		g.setColor(new Color(99, 147, 176));
		int xShape240[] = {327, 346, 366};
		int yShape240[] = {546, 529, 546};
		g.fillPolygon(new Polygon(xShape240, yShape240, xShape240.length));
		
		g.setColor(new Color(99, 147, 176));
		int xShape241[] = {327, 366, 374};
		int yShape241[] = {546, 546, 575};
		g.fillPolygon(new Polygon(xShape241, yShape241, xShape241.length));

		g.setColor(new Color(109, 185, 208));
		int xShape242[] = {346, 366, 378, 356};
		int yShape242[] = {529, 546, 510, 498};
		g.fillPolygon(new Polygon(xShape242, yShape242, xShape242.length));

		g.setColor(new Color(175, 217, 225));
		int xShape243[] = {346, 356, 322, 307, 315};
		int yShape243[] = {529, 498, 483, 479, 504};
		g.fillPolygon(new Polygon(xShape243, yShape243, xShape243.length));

		g.setColor(new Color(175, 217, 225));
		int xShape244[] = {322, 392, 422, 460, 414, 378, 356};
		int yShape244[] = {483, 487, 489, 522, 504, 510, 498};
		g.fillPolygon(new Polygon(xShape244, yShape244, xShape244.length));

		g.setColor(new Color(99, 147, 176));
		int xShape245[] = {322, 392, 365, 332};
		int yShape245[] = {483, 487, 469, 484};
		g.fillPolygon(new Polygon(xShape245, yShape245, xShape245.length));

		g.setColor(new Color(148, 196, 210));
		int xShape246[] = {392, 365, 385, 400, 417, 424, 431, 422};
		int yShape246[] = {487, 469, 462, 467, 479, 484, 489, 489};
		g.fillPolygon(new Polygon(xShape246, yShape246, xShape246.length));

		g.setColor(new Color(148, 196, 210));
		int xShape247[] = {422, 431, 455, 461, 467, 498, 460};
		int yShape247[] = {489, 489, 507, 511, 516, 531, 522};
		g.fillPolygon(new Polygon(xShape247, yShape247, xShape247.length));

		g.setColor(new Color(148, 196, 210));
		int xShape248[] = {498, 460, 469, 486, 495};
		int yShape248[] = {531, 522, 533, 555, 553};
		g.fillPolygon(new Polygon(xShape248, yShape248, xShape248.length));

		g.setColor(new Color(99, 147, 176));
		int xShape249[] = {495, 521, 498};
		int yShape249[] = {553, 555, 531};
		g.fillPolygon(new Polygon(xShape249, yShape249, xShape249.length));

		g.setColor(new Color(99, 147, 176));
		int xShape250[] = {495, 521, 532, 486};
		int yShape250[] = {553, 555, 582, 555};
		g.fillPolygon(new Polygon(xShape250, yShape250, xShape250.length));

		g.setColor(new Color(99, 147, 176));
		int xShape251[] = {532, 486, 498};
		int yShape251[] = {582, 555, 588};
		g.fillPolygon(new Polygon(xShape251, yShape251, xShape251.length));

		g.setColor(new Color(148, 196, 210));
		int xShape252[] = {498, 476, 469, 486};
		int yShape252[] = {588, 570, 533, 555};
		g.fillPolygon(new Polygon(xShape252, yShape252, xShape252.length));

		g.setColor(new Color(99, 147, 176));
		int xShape253[] = {498, 476, 475, 455, 459};
		int yShape253[] = {588, 570, 581, 604, 625};
		g.fillPolygon(new Polygon(xShape253, yShape253, xShape253.length));

		g.setColor(new Color(197, 236, 233));
		int xShape254[] = {410, 414, 378};
		int yShape254[] = {524, 504, 510};
		g.fillPolygon(new Polygon(xShape254, yShape254, xShape254.length));

		g.setColor(new Color(148, 196, 210));
		int xShape255[] = {410, 414, 460};
		int yShape255[] = {524, 504, 522};
		g.fillPolygon(new Polygon(xShape255, yShape255, xShape255.length));

		g.setColor(new Color(175, 217, 225));
		int xShape256[] = {410, 378, 366, 374, 387};
		int yShape256[] = {524, 510, 546, 575, 561};
		g.fillPolygon(new Polygon(xShape256, yShape256, xShape256.length));

		g.setColor(new Color(99, 147, 176));
		int xShape257[] = {410, 460, 469, 455, 451};
		int yShape257[] = {524, 522, 533, 533, 541};
		g.fillPolygon(new Polygon(xShape257, yShape257, xShape257.length));

		g.setColor(new Color(195, 242, 234));
		int xShape258[] = {410, 421, 387};
		int yShape258[] = {524, 606, 561};
		g.fillPolygon(new Polygon(xShape258, yShape258, xShape258.length));

		g.setColor(new Color(152, 194, 203));
		int xShape259[] = {410, 421, 437};
		int yShape259[] = {524, 606, 562};
		g.fillPolygon(new Polygon(xShape259, yShape259, xShape259.length));

		g.setColor(new Color(99, 147, 176));
		int xShape260[] = {410, 451, 437};
		int yShape260[] = {524, 541, 562};
		g.fillPolygon(new Polygon(xShape260, yShape260, xShape260.length));

		g.setColor(new Color(197, 236, 233));
		int xShape261[] = {451, 455, 469, 476, 475, 455, 473};
		int yShape261[] = {541, 533, 533, 570, 581, 604, 579};
		g.fillPolygon(new Polygon(xShape261, yShape261, xShape261.length));

		g.setColor(new Color(175, 217, 225));
		int xShape262[] = {387, 406, 374};
		int yShape262[] = {561, 606, 575};
		g.fillPolygon(new Polygon(xShape262, yShape262, xShape262.length));

		g.setColor(new Color(152, 194, 203));
		int xShape263[] = {387, 406, 421};
		int yShape263[] = {561, 606, 606};
		g.fillPolygon(new Polygon(xShape263, yShape263, xShape263.length));

		g.setColor(new Color(197, 236, 233));
		int xShape264[] = {442, 437, 421};
		int yShape264[] = {604, 562, 606};
		g.fillPolygon(new Polygon(xShape264, yShape264, xShape264.length));

		g.setColor(new Color(148, 196, 210));
		int xShape265[] = {442, 437, 451, 455};
		int yShape265[] = {604, 562, 541, 604};
		g.fillPolygon(new Polygon(xShape265, yShape265, xShape265.length));

		g.setColor(new Color(152, 194, 203));
		int xShape266[] = {455, 451, 473};
		int yShape266[] = {604, 541, 579};
		g.fillPolygon(new Polygon(xShape266, yShape266, xShape266.length));

		g.setColor(new Color(152, 194, 203));
		int xShape267[] = {414, 406, 374, 411};
		int yShape267[] = {625, 606, 575, 626};
		g.fillPolygon(new Polygon(xShape267, yShape267, xShape267.length));

		g.setColor(new Color(152, 194, 203));
		int xShape268[] = {414, 406, 421, 428};
		int yShape268[] = {625, 606, 606, 624};
		g.fillPolygon(new Polygon(xShape268, yShape268, xShape268.length));

		g.setColor(new Color(197, 236, 233));
		int xShape269[] = {431, 442, 421, 428};
		int yShape269[] = {628, 604, 606, 624};
		g.fillPolygon(new Polygon(xShape269, yShape269, xShape269.length));

		g.setColor(new Color(148, 196, 210));
		int xShape270[] = {431, 442, 446};
		int yShape270[] = {628, 604, 626};
		g.fillPolygon(new Polygon(xShape270, yShape270, xShape270.length));

		g.setColor(new Color(148, 196, 210));
		int xShape271[] = {446, 442, 455, 459, 459, 462, 446};
		int yShape271[] = {626, 604, 604, 625, 628, 646, 626};
		g.fillPolygon(new Polygon(xShape271, yShape271, xShape271.length));

		g.setColor(new Color(195, 242, 234));
		int xShape272[] = {390, 431, 428, 414, 411, 392, 369};
		int yShape272[] = {646, 628, 624, 625, 626, 635, 646};
		g.fillPolygon(new Polygon(xShape272, yShape272, xShape272.length));

		g.setColor(new Color(175, 217, 225));
		int xShape273[] = {390, 431, 446, 462, 390};
		int yShape273[] = {646, 628, 626, 646, 650};
		g.fillPolygon(new Polygon(xShape273, yShape273, xShape273.length));

		g.setColor(new Color(148, 196, 210));
		int xShape274[] = {462, 457, 406, 387, 371, 390};
		int yShape274[] = {646, 658, 663, 668, 670, 650};
		g.fillPolygon(new Polygon(xShape274, yShape274, xShape274.length));

		g.setColor(new Color(109, 185, 208));
		int xShape275[] = {392, 353, 342, 328, 325, 320, 327, 349};
		int yShape275[] = {635, 642, 648, 659, 646, 645, 641, 635};
		g.fillPolygon(new Polygon(xShape275, yShape275, xShape275.length));

		g.setColor(new Color(175, 217, 225));
		int xShape276[] = {392, 353, 342, 349, 350, 351, 363, 369};
		int yShape276[] = {635, 642, 648, 655, 661, 663, 648, 646};
		g.fillPolygon(new Polygon(xShape276, yShape276, xShape276.length));

		g.setColor(new Color(148, 196, 210));
		int xShape277[] = {390, 369, 363, 371, 371, 390};
		int yShape277[] = {646, 646, 648, 662, 670, 650};
		g.fillPolygon(new Polygon(xShape277, yShape277, xShape277.length));

		g.setColor(new Color(231, 219, 167));
		int xShape278[] = {325, 317, 307, 313, 320};
		int yShape278[] = {646, 655, 670, 653, 645};
		g.fillPolygon(new Polygon(xShape278, yShape278, xShape278.length));

		g.setColor(new Color(218, 159, 59));
		int xShape279[] = {325, 317, 307, 322, 328};
		int yShape279[] = {646, 655, 670, 670, 659};
		g.fillPolygon(new Polygon(xShape279, yShape279, xShape279.length));

		g.setColor(new Color(231, 219, 167));
		int xShape280[] = {350, 334, 321, 322, 328, 342, 349};
		int yShape280[] = {661, 671, 672, 670, 659, 648, 655};
		g.fillPolygon(new Polygon(xShape280, yShape280, xShape280.length));
		
		g.setColor(new Color(218, 159, 59));
		int xShape281[] = {350, 334, 321, 336, 349, 351};
		int yShape281[] = {661, 671, 672, 673, 668, 663};
		g.fillPolygon(new Polygon(xShape281, yShape281, xShape281.length));

		g.setColor(new Color(231, 219, 167));
		int xShape282[] = {371, 361, 347, 349, 351, 363};
		int yShape282[] = {662, 670, 673, 668, 663, 648};
		g.fillPolygon(new Polygon(xShape282, yShape282, xShape282.length));

		g.setColor(new Color(218, 159, 59));
		int xShape283[] = {371, 361, 347, 361, 371};
		int yShape283[] = {662, 670, 673, 673, 670};
		g.fillPolygon(new Polygon(xShape283, yShape283, xShape283.length));

		g.setColor(new Color(195, 242, 234));
		int xShape284[] = {321, 305, 301, 301, 305, 315};
		int yShape284[] = {615, 614, 617, 613, 611, 612};
		g.fillPolygon(new Polygon(xShape284, yShape284, xShape284.length));

		g.setColor(new Color(175, 217, 225));
		int xShape285[] = {321, 305, 301, 305, 317, 327};
		int yShape285[] = {615, 614, 617, 617, 617, 617};
		g.fillPolygon(new Polygon(xShape285, yShape285, xShape285.length));

		g.setColor(new Color(109, 185, 208));
		int xShape286[] = {301, 309, 309, 305, 317, 327, 336, 366, 371, 361, 347, 327};
		int yShape286[] = {636, 631, 621, 617, 617, 617, 619, 622, 624, 628, 631, 635};
		g.fillPolygon(new Polygon(xShape286, yShape286, xShape286.length));

		g.setColor(new Color(218, 159, 59));
		int xShape287[] = {301, 309, 309, 305, 301, 300, 292};
		int yShape287[] = {636, 631, 621, 617, 617, 629, 636};
		g.fillPolygon(new Polygon(xShape287, yShape287, xShape287.length));

		g.setColor(new Color(200, 50, 30));
		int xShape288[] = {356, 327, 319, 310};
		int yShape288[] = {598, 546, 561, 578};
		g.fillPolygon(new Polygon(xShape288, yShape288, xShape288.length));

		g.setColor(new Color(204, 30, 40));
		int xShape289[] = {356, 327, 374, 411};
		int yShape289[] = {598, 546, 575, 626};
		g.fillPolygon(new Polygon(xShape289, yShape289, xShape289.length));

		g.setColor(new Color(223, 155, 75));
		int xShape290[] = {330, 356, 310, 304};
		int yShape290[] = {611, 598, 578, 590};
		g.fillPolygon(new Polygon(xShape290, yShape290, xShape290.length));

		g.setColor(new Color(180, 50, 20));
		int xShape291[] = {330, 356, 378, 357};
		int yShape291[] = {611, 598, 609, 616};
		g.fillPolygon(new Polygon(xShape291, yShape291, xShape291.length));

		g.setColor(new Color(240, 190, 95));
		int xShape292[] = {366, 357, 330, 304, 303, 315, 321, 327, 331};
		int yShape292[] = {622, 616, 611, 590, 606, 612, 615, 617, 619};
		g.fillPolygon(new Polygon(xShape292, yShape292, xShape292.length));

		g.setColor(new Color(160, 30, 35));
		int xShape293[] = {357, 378, 411, 402, 371, 366};
		int yShape293[] = {616, 609, 626, 631, 624, 622};
		g.fillPolygon(new Polygon(xShape293, yShape293, xShape293.length));

		g.setColor(new Color(37, 3, 19));
		int xShape294[] = {459, 481, 498};
		int yShape294[] = {625, 619, 588};
		g.fillPolygon(new Polygon(xShape294, yShape294, xShape294.length));

		g.setColor(new Color(40, 0, 14));
		int xShape295[] = {459, 481, 526, 511, 459};
		int yShape295[] = {625, 619, 609, 625, 628};
		g.fillPolygon(new Polygon(xShape295, yShape295, xShape295.length));

		g.setColor(new Color(62, 5, 27));
		int xShape296[] = {481, 498, 526};
		int yShape296[] = {619, 588, 609};
		g.fillPolygon(new Polygon(xShape296, yShape296, xShape296.length));

		g.setColor(new Color(134, 7, 28));
		int xShape297[] = {498, 526, 532};
		int yShape297[] = {588, 609, 582};
		g.fillPolygon(new Polygon(xShape297, yShape297, xShape297.length));

		g.setColor(new Color(52, 1, 18));
		int xShape298[] = {526, 549, 511};
		int yShape298[] = {609, 625, 625};
		g.fillPolygon(new Polygon(xShape298, yShape298, xShape298.length));

		g.setColor(new Color(169, 21, 21));
		int xShape299[] = {526, 532, 559};
		int yShape299[] = {609, 582, 613};
		g.fillPolygon(new Polygon(xShape299, yShape299, xShape299.length));

		g.setColor(new Color(52, 1, 18));
		int xShape300[] = {526, 549, 559};
		int yShape300[] = {609, 625, 613};
		g.fillPolygon(new Polygon(xShape300, yShape300, xShape300.length));

		g.setColor(new Color(52, 1, 18));
		int xShape301[] = {559, 549, 573};
		int yShape301[] = {613, 625, 630};
		g.fillPolygon(new Polygon(xShape301, yShape301, xShape301.length));

		g.setColor(new Color(186, 65, 8));
		int xShape302[] = {580, 559, 573};
		int yShape302[] = {623, 613, 630};
		g.fillPolygon(new Polygon(xShape302, yShape302, xShape302.length));

		g.setColor(new Color(130, 82, 52));
		int xShape303[] = {573, 580, 589, 587, 583, 583};
		int yShape303[] = {630, 623, 635, 645, 645, 636};
		g.fillPolygon(new Polygon(xShape303, yShape303, xShape303.length));

		g.setColor(new Color(235, 112, 19));
		int xShape304[] = {559, 564, 532};
		int yShape304[] = {613, 590, 582};
		g.fillPolygon(new Polygon(xShape304, yShape304, xShape304.length));

		g.setColor(new Color(253, 167, 46));
		int xShape305[] = {559, 564, 587, 587, 580};
		int yShape305[] = {613, 590, 604, 616, 623};
		g.fillPolygon(new Polygon(xShape305, yShape305, xShape305.length));

		g.setColor(new Color(248, 169, 64));
		int xShape306[] = {587, 587, 580, 589, 587, 601, 610, 610, 605};
		int yShape306[] = {604, 616, 623, 635, 645, 646, 633, 625, 619};
		g.fillPolygon(new Polygon(xShape306, yShape306, xShape306.length));

		g.setColor(new Color(50, 97, 125));
		int xShape307[] = {521, 521, 510, 498};
		int yShape307[] = {555, 536, 535, 531};
		g.fillPolygon(new Polygon(xShape307, yShape307, xShape307.length));

		g.setColor(new Color(50, 97, 125));
		int xShape308[] = {521, 521, 544};
		int yShape308[] = {555, 536, 564};
		g.fillPolygon(new Polygon(xShape308, yShape308, xShape308.length));

		g.setColor(new Color(50, 97, 125));
		int xShape309[] = {544, 521, 544, 550, 556};
		int yShape309[] = {564, 536, 538, 541, 545};
		g.fillPolygon(new Polygon(xShape309, yShape309, xShape309.length));

		g.setColor(new Color(50, 97, 125));
		int xShape310[] = {544, 532, 521};
		int yShape310[] = {564, 582, 555};
		g.fillPolygon(new Polygon(xShape310, yShape310, xShape310.length));

		g.setColor(new Color(130, 177, 170));
		int xShape311[] = {544, 576, 576, 556};
		int yShape311[] = {564, 574, 551, 545};
		g.fillPolygon(new Polygon(xShape311, yShape311, xShape311.length));

		g.setColor(new Color(130, 177, 170));
		int xShape312[] = {544, 576, 564, 532};
		int yShape312[] = {564, 574, 590, 582};
		g.fillPolygon(new Polygon(xShape312, yShape312, xShape312.length));

		g.setColor(new Color(202, 242, 234));
		int xShape313[] = {605, 576, 576, 604};
		int yShape313[] = {593, 574, 551, 570};
		g.fillPolygon(new Polygon(xShape313, yShape313, xShape313.length));

		g.setColor(new Color(175, 217, 225));
		int xShape314[] = {605, 576, 564, 587};
		int yShape314[] = {593, 574, 590, 604};
		g.fillPolygon(new Polygon(xShape314, yShape314, xShape314.length));

		g.setColor(new Color(188, 243, 237));
		int xShape315[] = {605, 604, 624, 627, 624, 610, 610, 605, 587};
		int yShape315[] = {593, 570, 584, 602, 616, 633, 625, 619, 604};
		g.fillPolygon(new Polygon(xShape315, yShape315, xShape315.length));

		g.setColor(new Color(128, 181, 191));
		int xShape316[] = {645, 627, 624, 604, 576, 606, 620, 635, 640};
		int yShape316[] = {604, 602, 584, 570, 551, 565, 574, 583, 586};
		g.fillPolygon(new Polygon(xShape316, yShape316, xShape316.length));

		g.setColor(new Color(138, 201, 213));
		int xShape317[] = {645, 627, 624, 610, 601, 589, 581, 564, 559, 580, 604, 635};
		int yShape317[] = {604, 602, 616, 633, 646, 653, 658, 662, 664, 660, 650, 622};
		g.fillPolygon(new Polygon(xShape317, yShape317, xShape317.length));

		g.setColor(new Color(148, 221, 235));
		int xShape318[] = {636, 635, 645, 640, 650, 663};
		int yShape318[] = {649, 622, 604, 586, 595, 632};
		g.fillPolygon(new Polygon(xShape318, yShape318, xShape318.length));

		g.setColor(new Color(158, 238, 249));
		int xShape319[] = {636, 635, 604};
		int yShape319[] = {649, 622, 650};
		g.fillPolygon(new Polygon(xShape319, yShape319, xShape319.length));

		g.setColor(new Color(40, 132, 172));
		int xShape320[] = {636, 663, 661};
		int yShape320[] = {649, 632, 656};
		g.fillPolygon(new Polygon(xShape320, yShape320, xShape320.length));

		g.setColor(new Color(46, 145, 197));
		int xShape321[] = {636, 645, 661};
		int yShape321[] = {649, 668, 656};
		g.fillPolygon(new Polygon(xShape321, yShape321, xShape321.length));

		g.setColor(new Color(46, 175, 217));
		int xShape322[] = {636, 645, 599};
		int yShape322[] = {649, 668, 665};
		g.fillPolygon(new Polygon(xShape322, yShape322, xShape322.length));

		g.setColor(new Color(15, 82, 127));
		int xShape323[] = {636, 599, 585, 537, 494, 510, 526, 546, 559, 580, 604};
		int yShape323[] = {649, 665, 670, 679, 681, 679, 675, 670, 664, 660, 650};
		g.fillPolygon(new Polygon(xShape323, yShape323, xShape323.length));

		g.setColor(new Color(85, 189, 226));
		int xShape324[] = {645, 599, 592};
		int yShape324[] = {668, 665, 683};
		g.fillPolygon(new Polygon(xShape324, yShape324, xShape324.length));

		g.setColor(new Color(11, 36, 93));
		int xShape325[] = {661, 645, 592, 610, 645};
		int yShape325[] = {656, 668, 683, 695, 679};
		g.fillPolygon(new Polygon(xShape325, yShape325, xShape325.length));

		g.setColor(new Color(55, 146, 193));
		int xShape326[] = {537, 555, 592, 599, 585};
		int yShape326[] = {679, 684, 683, 665, 670};
		g.fillPolygon(new Polygon(xShape326, yShape326, xShape326.length));

		g.setColor(new Color(119, 104, 153));
		int xShape327[] = {494, 476, 461, 454, 446, 437, 425, 420, 415, 410, 413, 420, 437, 481, 537};
		int yShape327[] = {681, 685, 688, 690, 692, 695, 700, 703, 707, 717, 722, 710, 703, 690, 679};
		g.fillPolygon(new Polygon(xShape327, yShape327, xShape327.length));

		g.setColor(new Color(93, 65, 106));
		int xShape328[] = {413, 420, 437, 481, 537, 555, 511, 481, 449, 424};
		int yShape328[] = {722, 710, 703, 690, 679, 684, 690, 695, 703, 713};
		g.fillPolygon(new Polygon(xShape328, yShape328, xShape328.length));

		g.setColor(new Color(57, 32, 90));
		int xShape329[] = {555, 511, 481, 449, 424, 469, 497, 537, 567, 592};
		int yShape329[] = {684, 690, 695, 703, 713, 706, 703, 698, 690, 683};
		g.fillPolygon(new Polygon(xShape329, yShape329, xShape329.length));

		g.setColor(new Color(28, 13, 56));
		int xShape330[] = {424, 469, 497, 537, 567, 592, 610, 567, 526, 426, 418, 415, 413};
		int yShape330[] = {713, 706, 703, 698, 690, 683, 695, 708, 713, 716, 721, 724, 722};
		g.fillPolygon(new Polygon(xShape330, yShape330, xShape330.length));

		g.setColor(new Color(241, 156, 29));
		int xShape331[] = {567, 581, 589, 601, 587, 583};
		int yShape331[] = {644, 658, 653, 646, 645, 645};
		g.fillPolygon(new Polygon(xShape331, yShape331, xShape331.length));

		g.setColor(new Color(255, 222, 117));
		int xShape332[] = {567, 581, 564};
		int yShape332[] = {644, 658, 662};
		g.fillPolygon(new Polygon(xShape332, yShape332, xShape332.length));

		g.setColor(new Color(241, 156, 29));
		int xShape333[] = {546, 537, 559};
		int yShape333[] = {670, 650, 664};
		g.fillPolygon(new Polygon(xShape333, yShape333, xShape333.length));

		g.setColor(new Color(255, 222, 117));
		int xShape334[] = {546, 537, 526};
		int yShape334[] = {670, 650, 675};
		g.fillPolygon(new Polygon(xShape334, yShape334, xShape334.length));

		g.setColor(new Color(241, 156, 29));
		int xShape335[] = {510, 504, 526};
		int yShape335[] = {679, 662, 675};
		g.fillPolygon(new Polygon(xShape335, yShape335, xShape335.length));

		g.setColor(new Color(255, 222, 117));
		int xShape336[] = {510, 504, 494};
		int yShape336[] = {679, 662, 681};
		g.fillPolygon(new Polygon(xShape336, yShape336, xShape336.length));

		g.setColor(new Color(241, 156, 29));
		int xShape337[] = {476, 467, 494};
		int yShape337[] = {685, 670, 681};
		g.fillPolygon(new Polygon(xShape337, yShape337, xShape337.length));

		g.setColor(new Color(255, 222, 117));
		int xShape338[] = {476, 467, 461};
		int yShape338[] = {685, 670, 688};
		g.fillPolygon(new Polygon(xShape338, yShape338, xShape338.length));

		g.setColor(new Color(241, 156, 29));
		int xShape339[] = {446, 441, 461, 454};
		int yShape339[] = {692, 675, 688, 690};
		g.fillPolygon(new Polygon(xShape339, yShape339, xShape339.length));

		g.setColor(new Color(255, 222, 117));
		int xShape340[] = {446, 441, 437};
		int yShape340[] = {692, 675, 695};
		g.fillPolygon(new Polygon(xShape340, yShape340, xShape340.length));

		g.setColor(new Color(241, 156, 29));
		int xShape341[] = {425, 417, 437};
		int yShape341[] = {700, 681, 695};
		g.fillPolygon(new Polygon(xShape341, yShape341, xShape341.length));

		g.setColor(new Color(255, 222, 117));
		int xShape342[] = {425, 417, 410, 420};
		int yShape342[] = {700, 681, 692, 703};
		g.fillPolygon(new Polygon(xShape342, yShape342, xShape342.length));
		
		g.setColor(new Color(241, 156, 29));
		int xShape343[] = {410, 412, 402, 410, 420, 415};
		int yShape343[] = {717, 702, 686, 692, 703, 707};
		g.fillPolygon(new Polygon(xShape343, yShape343, xShape343.length));

		g.setColor(new Color(255, 222, 117));
		int xShape344[] = {410, 412, 402, 400, 410};
		int yShape344[] = {717, 702, 686, 702, 703};
		g.fillPolygon(new Polygon(xShape344, yShape344, xShape344.length));

		g.setColor(new Color(241, 156, 29));
		int xShape345[] = {410, 410, 386, 402, 404, 407};
		int yShape345[] = {717, 703, 701, 705, 715, 713};
		g.fillPolygon(new Polygon(xShape345, yShape345, xShape345.length));

		g.setColor(new Color(255, 222, 117));
		int xShape346[] = {402, 386, 390, 394};
		int yShape346[] = {705, 701, 707, 713};
		g.fillPolygon(new Polygon(xShape346, yShape346, xShape346.length));

		g.setColor(new Color(255, 222, 117));
		int xShape347[] = {394, 390, 388, 388};
		int yShape347[] = {713, 707, 711, 716};
		g.fillPolygon(new Polygon(xShape347, yShape347, xShape347.length));

		g.setColor(new Color(241, 156, 29));
		int xShape348[] = {396, 404, 402, 394, 388, 382};
		int yShape348[] = {722, 715, 705, 713, 716, 720};
		g.fillPolygon(new Polygon(xShape348, yShape348, xShape348.length));

		g.setColor(new Color(241, 156, 29));
		int xShape349[] = {396, 404, 407, 410, 413, 415, 409, 389};
		int yShape349[] = {722, 715, 713, 717, 722, 724, 729, 729};
		g.fillPolygon(new Polygon(xShape349, yShape349, xShape349.length));

		g.setColor(new Color(241, 156, 29));
		int xShape350[] = {420, 425, 418, 415, 409, 400};
		int yShape350[] = {732, 728, 721, 724, 729, 732};
		g.fillPolygon(new Polygon(xShape350, yShape350, xShape350.length));

		g.setColor(new Color(241, 156, 29));
		int xShape351[] = {420, 425, 425, 434, 415};
		int yShape351[] = {732, 728, 722, 733, 735};
		g.fillPolygon(new Polygon(xShape351, yShape351, xShape351.length));
	}
}