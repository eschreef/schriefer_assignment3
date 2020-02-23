package schriefer_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 
{
	public static void main(String[] args) 
	{
		//use a secure random object to produce 2 digits
				SecureRandom rand = new SecureRandom();
				int one = rand.nextInt(9) + 1;
				int two = rand.nextInt(9) + 1;
				
				//print out a question for the user
				System.out.printf("How much is %d times %d? ", one, two);
				
				//determine the actual answer
				int answer = one*two;
				
				//let the user answer the question
				Scanner scan = new Scanner(System.in);
				int userAnswer = scan.nextInt();
				
				//check their answer
				if(answer == userAnswer)
				{
					System.out.println("Very good!");
					scan.close();
					System.exit(answer);
				}
				else
				{
					while(answer != userAnswer)
					{
						System.out.print("No. please try again: ");
						userAnswer = scan.nextInt();
						if(answer == userAnswer)
						{
							System.out.println("Very good!");
							scan.close();
							System.exit(answer);
						}
				}
		}

	}
}
