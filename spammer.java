package spammer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class spammer
{

static int Spamming;


	public static void Letters(int letter) throws AWTException
	{ // A-Z
		
	if (letter == 1)
	{ // A
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
	}
		
	if (letter == 2)
	{ // B
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
	}
	
	if (letter == 3)
	{ // C
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
	}
	
	if (letter == 4)
	{ // D
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
	}
	
	if (letter == 5)
	{ // E
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
	}
	
	if (letter == 6)
	{ // F
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
	}
	
	if (letter == 7)
	{ // G
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
	}
	
	if (letter == 8)
	{ // H
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
	}
	
	if (letter == 9)
	{ // I
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
	}
	
	if (letter == 10)
	{ // J
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
	}
	
	if (letter == 11)
	{ // K
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
	}
	
	if (letter == 12)
	{ // L
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
	}
	
	if (letter == 13)
	{ // M
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
	}
	
	if (letter == 14)
	{ // N
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
	}
	
	if (letter == 15)
	{ // O
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
	}
	// please end u
	//ps: kuno> george
	if (letter == 16)
	{ // P
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
	}
	
	if (letter == 17)
	{ // Q
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_Q);
	}
	
	if (letter == 18)
	{ // R
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
	}
	
	if (letter == 19)
	{ // S
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
	}
	
	if (letter == 20)
	{ // T
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	if (letter == 21)
	{ // U
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
	}
	
	if (letter == 22)
	{ // V
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
	}
	
	if (letter == 23)
	{ // W
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
	}
	
	if (letter == 24)
	{ // X
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
	}
	
	if (letter == 25)
	{ // Y
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
	}
	
	if (letter == 26)
	{ // Z
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_Z);
		robot.keyRelease(KeyEvent.VK_Z);
	}
	
	
	}
	
	public static void Specials(int special) throws AWTException
	{ // Special Stuff
		if (special == 1)
		{ // PERIOD
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyRelease(KeyEvent.VK_PERIOD);
		}
		
		if (special == 2)
		{ // ENTER
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	
		if (special == 3)
		{ // SPACE
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
		}
		
		if (special == 4)
		{ // CAPS LOCK IS FOR CRUISE CONTROL
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		}
	}
		
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		Spamming = 1;
		
		while (Spamming == 1)
		{
			Thread.sleep(1000);
			
			spammer.Letters(11);
			spammer.Letters(21);
			spammer.Letters(14);
			spammer.Letters(15);
			spammer.Specials(1);
			spammer.Letters(1);
			spammer.Letters(19);
			spammer.Letters(21);
			spammer.Letters(3);
			spammer.Letters(11);
			spammer.Letters(19);
			
		}

	}
}



//




