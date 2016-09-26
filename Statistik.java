package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class Statistik {

	@Test
	public void percentageofvalues() {
		Dice cup = new Dice(); 						//Initialiser terning
		int nrofthrows = 10000; 					//Initialiser antal kast (bruges til at bestemme array længde)
		int [] dicethrows = new int[nrofthrows]; 	//Initialiser array
		double percentage;
		
		for (int i = 0; i < nrofthrows; i++){
			dicethrows[i] = cup.roll();
		}
		
		for (int v = 1; v <= 6; v++){
			percentage = getPercentage(checkforvalue(v, dicethrows), dicethrows.length);
			//assertEquals(percentage, (1.0/6.0), 0.1);
			System.out.print(v + " forekommer ");
			System.out.print( percentage + "% ");
			System.out.println("af kastene.");
		}
		
		
	}
	
	//Denne funktion tester antallet af gange en værdi er i et array
	public int checkforvalue(int v, int [] args){
		int occ = 0;
		for (int i = 0; i < args.length; i++){
			if (args[i] == v){++occ;}
		}
		return occ;
	}
	
	//Denne funktion giver procentdelen som et tal udgør af et andet
	public double getPercentage(int part, int whole){
		double dpart = (double)part;
		double dwhole = (double)whole;
		return (dpart/dwhole)*100;
	}

}
