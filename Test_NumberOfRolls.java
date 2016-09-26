package terning;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class Test_NumberOfRolls {

	@Test
	public void test() {
		Dice cup = new Dice();
		
		int n = 60000;
		
		int counter = 0;
		
		for (int i=1; i<=n; i++) 
		{
			System.out.print(cup.roll() + " ");
			counter++;
		}
		
		assertEquals(counter,n);
		
	}

}
