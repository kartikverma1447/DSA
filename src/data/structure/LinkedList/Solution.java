package data.structure.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	static ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();

	public static void placeNQueens(int n) {

		int[][] board = new int[n][n];
		for (int i = 0; i < board.length; i++) {
			if (placeNQueens(board, n, 0)) {
				for (int j = 0; j < board.length; j++) {
					for (int j2 = 0; j2 < board.length; j2++) {
						System.out.print(board[j][j2]);
					}
				}
			}
			Arrays.fill(board, 0);
		}
	}

	public static boolean placeNQueens(int[][] board, int n, int i){
		if(n==i-1){
			return true;
		}
		for (int j = 0; j < board.length; j++) {
			if(isSafe(i,j)){
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(i);
				arr.add(j);
				path.add(arr);
				board[i][j] = 1;
				return placeNQueens(board,n,i++);
			}else{
				board[i][j] = 0;
			}
		}
		return false;
	}

	private static boolean isSafe(int i,int j) {
		for (int j2 = 0; j2 < path.size(); j2++) {
			if(path.get(j2).get(1)==j && path.get(j2).get(0) == i){
				return false;
			}
			int row = path.get(j2).get(0);
			int column = path.get(j2).get(1);
			if(column == j-(j-row)|| column == j+(j-row)){
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		placeNQueens(5);
	}

}