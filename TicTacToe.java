package BridgeLabzEval;

import java.util.Scanner;

public class TicTacToe {
	
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		TicTacToe board = new TicTacToe();
		String [] checkBoard=board.createCheckBoard();

		int player = board.chooseXorO();
		int computer = 1 - player;

		board.showDefaultBoard(checkBoard);
		
	}


	public String[] createCheckBoard()
	{
		return new String [9];
	}
	
	public int chooseXorO()
	{
		System.out.println("Enter y if you want to choose O, Enter n if you want to choose X: ");
		String choice = s.next();
		
		if (choice.equals("y"))
			return 1;
		else
			return 0;
	}
	

	public void showDefaultBoard(String [] checkBoard)
	{
		for (int i=0;i<9;i++)
		{
			checkBoard[i]="S";
		}
		
		System.out.println("\n");
			for (int i=0;i<9;i=i+3)
			{
				for (int j=i;j<=i+2;j++)
				{
					System.out.print(checkBoard[i]+"	");
				}
				System.out.println("\n");
			}
	}
	

}