package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_UseDice {

	@Test
	public void test() {
		
		int n = 60000;
		
		Dice cup = new Dice();
		
		System.out.println("Antal 1'ere ud af " + n + " kast: " + cup.testDice(n,1));
		System.out.println("Antal 2'ere ud af " + n + " kast: " + cup.testDice(n,2));
		System.out.println("Antal 3'ere ud af " + n + " kast: " + cup.testDice(n,3));
		System.out.println("Antal 4'ere ud af " + n + " kast: " + cup.testDice(n,4));
		System.out.println("Antal 5'ere ud af " + n + " kast: " + cup.testDice(n,5));
		System.out.println("Antal 6'ere ud af " + n + " kast: " + cup.testDice(n,6));
		
		int r1 = cup.testDice(n,1);
		int r2 = cup.testDice(n,2);
		int r3 = cup.testDice(n,3);
		int r4 = cup.testDice(n,4);
		int r5 = cup.testDice(n,5);
		int r6 = cup.testDice(n,6);
		
		final int MAX, MIN;
		MAX = 10400;
		MIN = 9600;
		
		boolean approvedResult;
		
		if (r1 <= MAX && r1 >= MIN
				&& r2 <= MAX && r2 >= MIN
				&& r3 <= MAX && r3 >= MIN
				&& r4 <= MAX && r4 >= MIN
				&& r5 <= MAX && r5 >= MIN
				&& r6 <= MAX && r6 >= MIN)
		{
			approvedResult = true;
		}
		else
		{
			approvedResult = false;
		}
		
		assertEquals(true,approvedResult);
		
	}

}
