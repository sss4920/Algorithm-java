package leetcode.array;

/**
 * 배열을 val와 일치하지않는 애들만 냅두는 문제.
 * 투포인터로 left가 일치하지않는 애들만 모으는 배열
 * right가 처음부터 배열 끝까지 탐색.
 * 일치하지않는애를 발견하면 현재 nums[left]값으로 nums[right]를 옮긴다.
 * left ++; 해줘서 넘긴다.
 */
public class LeetCode2 {
	class Solution {
		public int removeElement(int[] nums, int val) {
			int lt=0; //left포인터가 필요하다.
			for (int rt=0;rt<nums.length;rt++){
				if (nums[rt] != val){
					nums[lt] = nums[rt];
					lt ++;
				}
			}
			return lt;
		}
	}
}
