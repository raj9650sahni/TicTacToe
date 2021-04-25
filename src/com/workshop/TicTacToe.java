package com.workshop;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[] board = cboard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = choose(userInput);
		char computerLetter = (userLetter == 'X') ? '0' : 'X';

	}

	public static char[] cboard() {

		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;

	}

	private static char choose(Scanner userInput) {
		System.out.println(" Choose your Letter");
		return userInput.next().toUpperCase().charAt(0);

	}

	public void showboard(char[] board) {
		System.out.println("\n" + board[1] + "|"+ board[2] + "|"+ board[3]);
		System.out.println("\n" + board[1] + "|"+ board[2] + "|"+ board[3]);
		System.out.println("\n" + board[1] + "|"+ board[2] + "|"+ board[3]);
	}

	public int getUserMove(char[] board ,Scanner userInput) {
		
		Integer [] validCells  = {1,2,3,4,5,6,7,8,9};
		while(true) {
			
			System.out.println("What is your next move Enter 1 to 9");
			int index= userInput.nextInt();
			if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
				return index;
		}
		
	}
	
	private static boolean isSpaceFree(char[] board,int index) {
		return board[index]  == ' ';
		
	}

}