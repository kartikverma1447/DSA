package com.data.structure.backtracking;

public class NQueen {

	public static void nQueen(int size) {
		int[][] board = new int[size][size];
		placeQueen(board, 0, size);
	}

	private static void placeQueen(int[][] board, int row, int n) {
		if (row == n) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			if (isSafe(board, row, i)) {
				board[row][i] = 1;
				placeQueen(board, row + 1, n);
				board[row][i] = 0;
			}
		}
	}

	private static boolean isSafe(int[][] board, int row, int col) {
		int n = board.length;
		for (int i = row - 1, j = col - 1; i >= 0 && i >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == 1)
				return false;
		}
		for(int i = row+1;i<n;i++){
			if(board[i][col]==1)
				return false;
		}
		return true;
	}

}
