/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]
Constraints:

    1 <= n <= 1000


 */

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero_1304 {

	public static void main(String[] args) {
		int n = 1;
		Solution_1304 soultion = new Solution_1304();
		System.out.println(Arrays.toString(soultion.sumZero(n)));
	}
}

class Solution_1304 {
	public int[] sumZero(int n) {
		int[] output = new int[n];
		int count = 0;
		for (int i = -n + 1; i < n; i += 2) { // printing -(n-1) to (n-1)
			output[count] = i;
			count++;
		}
		return output;
	}
}
