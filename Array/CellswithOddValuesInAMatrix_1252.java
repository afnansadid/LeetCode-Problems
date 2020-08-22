/*
Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the increment to all indices.

Example 1:
Input: n = 2, m = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.

Example 2:
Input: n = 2, m = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.
 
Constraints:

1 <= n <= 50
1 <= m <= 50
1 <= indices.length <= 100
0 <= indices[i][0] < n
0 <= indices[i][1] < m
 */
import java.util.Arrays;

public class CellswithOddValuesInAMatrix_1252 {

	public static void main(String[] args) {
		int n = 2;
		int m = 3; 
		int[][] indices = {{0,1},{1,1}};
		Solution_1252 solution = new Solution_1252();
		System.out.println(solution.oddCells(n, m, indices));
	}
}

class Solution_1252 {
    public int oddCells(int n, int m, int[][] indices) {
    	int[][] initialMatrix = new int[n][m]; // Initializing Array
        int oddCell=0;
        for(int i=0;i<indices.length;i++) {  // Increment
        	for(int j=0;j<m;j++) { // Increment Row
        		initialMatrix[indices[i][0]][j]+=1;
        	}
        	for(int k=0;k<n;k++) { // Increment Colum
        		initialMatrix[k][indices[i][1]]++;
        	}
        }
        for(int l=0;l<n;l++) { // Odd check
        	for(int p=0;p<m;p++) {
        		if((initialMatrix[l][p])%2 !=0) {
        			oddCell++;
        		}
        	}
        }
        return oddCell;
    }
}
