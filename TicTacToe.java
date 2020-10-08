package BridgeLabzEval;

import java.util.Scanner;

public class TicTacToe {
	
	static Scanner s = new Scanner(System.in);
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

		System.out.println("Do you want to toss to decide who makes first move ? Enter y or n");
		String userTossChoice= s.next();
		
		if (userTossChoice.equals("y"))
		{
			board.doToss();
		}
		
		board.showDefaultBoard(checkBoard);
		board.makeMove(checkBoard,playerChar);
		board.showBoard(checkBoard);
		
	}


	
	public void doToss() 
	{
		int tossResult=(int) Math.round(Math.random());
		
		if (tossResult == 1)
			System.out.println("You will make the first move");
		else
		{
			System.out.println("Computer will make the first move");
			System.exit(0);
		}
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
			checkBoard[i] = "$";
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
		for (int i=0;i<9;)
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
		System.out.println("Enter a number 1 to 9 to make a move: ");
		int move=s.nextInt()-1;
		
		System.out.println("\n");
		if ( checkBoard[move].equals("$") )
		{
			checkBoard[move] = playerChar;
		}
		else
		{
			System.out.println("Select another position");
			makeMove(checkBoard, playerChar);
		}
	}
}