package leetcode.array;

/**
 * 26. Remove Duplicates from Sorted Array
 * 한 배열에서 중복되지않은 애들만 배열로 넣기.
 * 약간 깨달은게 배열 하나를 주고 이 안에서만 왔다갔다하는거라면 투포인터를 의심하는게 맞는듯하다.
 */
public class LeetCode3 {
	class Solution {
		public int removeDuplicates(int[] nums) {
			int lt = 1;
			int temp = nums[0];
			for (int rt=1;rt<nums.length;rt++){
				if (nums[rt] != temp){
					nums[lt] = nums[rt];
					temp = nums[rt];
					lt++;
				}
			}
			return lt;
		}
	}
}
