package Lec6;

import java.util.ArrayList;

public class RatInAMaze {
    static ArrayList <String> ans;
    public static void solve(int[][] board,int row,int col,String path,boolean[][] visited)
    {
        //negative base case
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == 0 || visited[row][col])
            return;

        //positive base case
        if(row == board.length - 1 && col == board[0].length - 1)
        {
            ans.add(path);
            return;
        }

        visited[row][col] = true;
        solve(board,row - 1,col,path + "U",visited);
        solve(board,row + 1,col,path + "D",visited);
        solve(board,row ,col - 1,path + "L",visited);
        solve(board,row ,col + 1,path + "R",visited);
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        ans = new ArrayList<>();
        int[][] board = new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        solve(board,0,0,"",new boolean[4][4]);
        System.out.println(ans);
    }
}
