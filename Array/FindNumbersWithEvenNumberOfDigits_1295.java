/*
Given an array nums of integers, return how many of them contain an even number of digits.
 
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 10^5
 */

public class FindNumbersWithEvenNumberOfDigits_1295 {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		Solution_1295 solution = new Solution_1295();
		System.out.println(solution.findNumbers(nums));
	}
}

class Solution_1295 {
    public int findNumbers(int[] nums) {
        int totalDigit=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
        	int currentNumber=nums[i];
        	while(currentNumber !=0) {
        		count++;
        		currentNumber/=10;
        	}
        	if((count)%2==0) {
        		totalDigit++;
        	}
        	count=0;
        }
        return totalDigit;
    }
}
