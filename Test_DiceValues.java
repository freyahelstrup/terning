package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_DiceValues {

	@Test
	public void test() {
		Dice cup = new Dice();
		
		int n = 60000;
		boolean validResult = false;
		
		for (int i = 1;i<=n;i++)
		{
			if (cup.roll() == 1
					|| cup.roll() == 2
					|| cup.roll() == 3
					|| cup.roll() == 4
					|| cup.roll() == 5
					|| cup.roll() == 6)
			{
				validResult = true;
			}
			else
			{
				validResult = false;
			}	
		}
		assertEquals(true,validResult);
	}

}
