/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 
Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
 */

import java.util.Arrays;

public class ShuffleTheArray_1470 {

	public static void main(String[] args) {
		Solution_1470 solution = new Solution_1470();
		int[] nums= {1,2,3,4,4,3,2,1}; // Input
		int n=4;
		System.out.println(Arrays.toString(solution.shuffle(nums, n)));
	}
}

class Solution_1470 {
    public int[] shuffle(int[] nums, int n) {
    	int[] resullt = new int[nums.length];
    	int x=0;
    	int y=n;
    	int z=0;
    	for(int i=0;i<n;i++) {
    		resullt[z]=nums[x];
    		x++;
    		z++;
    		resullt[z]=nums[y];
    		y++;
    		z++;
    	}
    	return resullt;
    }
}
