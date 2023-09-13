package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Start amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("Win chance?");
		double winChance = in.nextDouble(); 
		
		System.out.println("Win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many sims?");
		int totalSimulations = in.nextInt();
		
		int counter = 0; 
		double money = startAmount; 
		for (int Simulations = 1; Simulations <totalSimulations; Simulations++)
		{
			while (money < winLimit && money > 0)
			{
				counter = counter++;
				if (Math.random() <= winChance)
				{
					money = money - 1;

				}
				else 
				{
					money = money + 1; 
				}
			
		
				
				
			 
				if (money == winLimit)
				{
				System.out.println("win");
				}
				else
				{
				System.out.println("loss");
				}
				
				
			}
		
		System.out.println("how many trials " + counter);
		System.out.println("number of simulation " + Simulations );
			
		}
		
	}
}

		
	


