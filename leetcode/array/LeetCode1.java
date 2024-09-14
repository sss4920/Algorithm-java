package leetcode.array;
import java.util.*;

public class LeetCode1 {
	class Solution {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			int[] answer = new int[m+n];
			for (int j=0;j<n;j++){
				nums1[j+m] = nums2[j];
			}
			Arrays.sort(nums1);
		}
		public Solution(){}
	}
	public void main(String[] args){
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		Solution solution = new Solution();
		solution.merge(nums1, 3, nums2, 3);
	}

}
