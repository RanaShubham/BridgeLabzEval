package BridgeLabzEval;

import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) 
	{
		TicTacToe board = new TicTacToe();
		board.createCheckBoard();
		int player = board.chooseXorO();
		int computer = 1 - player;
		
	}



	public void createCheckBoard()
	{
		char [] checkBoard = new char [10];
	}
	
	public int chooseXorO()
	{
		System.out.println("Enter y if you want to choose O, Enter n if you want to choose X");
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		
		if (choice.equals("y"))
			return 1;
		else
			return 0;
	}
}