package BridgeLabzEval;

import java.util.Scanner;

public class TicTacToe {
	
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		TicTacToe board = new TicTacToe();
		String [] checkBoard=board.createCheckBoard();

		String playerChar = board.chooseXorO();
		String computerChar;
		
		if (playerChar.equals("X"))
			computerChar = "O";
		else
			computerChar = "X";

		board.showDefaultBoard(checkBoard);
		board.makeMove(checkBoard,playerChar);
		board.showBoard(checkBoard);
		
	}


	public String[] createCheckBoard()
	{
		return new String [9];
	}
	
	public String chooseXorO()
	{
		System.out.println("Enter y if you want to choose O, Enter n if you want to choose X: ");
		String choice = s.next();
		
		if (choice.equals("y"))
			return "O";
		else
			return "X";
	}
	

	public void showDefaultBoard(String [] checkBoard)
	{
		for (int i=0;i<9;i++)
		{
			checkBoard[i]="S";
		}
		
		System.out.println("This is default check board \n");
			for (int i=0;i<9;i=i+3)
			{
				for (int j=i;j<=i+2;j++)
				{
					System.out.print(checkBoard[i]+"	");
				}
				System.out.println("\n");
			}
	}
	public void showBoard(String [] checkBoard)
	{
		for (int i=0;i<9;i=i++)
		{
			for (int j=0;j<3;j++,i++)
			{
				System.out.print(checkBoard[i]+"	");
			}
			System.out.println("\n");
		}
	}
	
	public void makeMove(String [] checkBoard, String playerChar)
	{
		System.out.println("Enter a number 1 to 9 to make a move");
		int move=s.nextInt()-1;
		
		if ( checkBoard[move].equals("S") )
		{
			checkBoard[move]=playerChar;
		}
	}
}