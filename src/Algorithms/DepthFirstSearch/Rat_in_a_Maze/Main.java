package Algorithms.DepthFirstSearch.Rat_in_a_Maze;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*Consider a rat placed at (0, 0) in a square matrix of order N * N.
     It has to reach the destination at (N - 1, N - 1).
     Find all possible paths that the rat can take to reach from source to destination.
     The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right).
     Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it
     while value 1 at a cell in the matrix represents that rat can be travel through it.
     Note: In a path, no cell can be visited more than one time.
     If the source cell is 0, the rat cannot move to any other cell.*/

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[][] maze = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maze[i][j] = scan.nextInt();
            }
        }
        Solution sol = new Solution();
        ArrayList<String> paths = sol.findPath(maze,n);
        System.out.println("Paths:\n" + paths);
    }
}
