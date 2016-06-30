/** Program:  Paper, Rock, Scissors
  * File:     game.java 
  * Summary:  plays Paper, Rock, Scissors game
  * Author:   Eric Roberts
  * Date:     June 28, 2016
**/
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		//pick paper, rock or scissors
		Scanner sc = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int player = sc.nextInt();
		
		//computer random number
		int computer = (int)(Math.random() * 3);
		
		//computer display
		System.out.println("The computer is ");
		switch (computer) {
		case 0: System.out.println("scissor"); break;
		case 1: System.out.println("rock"); break;
		case 2: System.out.println("paper");
		}
		
		//player display
		System.out.println("You are ");
		switch (player) {
		case 0: System.out.println("scissor"); break;
		case 1: System.out.println("rock"); break;
		case 2: System.out.println("paper");
		}
		
		//display outcome
		if (player == computer)
			System.out.println("Draw");
		else {
			boolean winner = (player == 0 && computer == 2) || (player == 2 && computer == 1) || (player == 1 && computer == 0);
			if (winner)
				System.out.println("You are the winner!!!");
			else
				System.out.println("You are the loser.");
				
		}
		

	}

}
