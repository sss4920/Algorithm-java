package map;

import java.util.HashMap;

public class poketmon {
	class Solution {

		public int solution(int[] nums) {
			HashMap<Integer, Integer> map = new HashMap<>();

			for (int i : nums){
				if (map.containsKey(i)){
					map.replace(i,map.get(i)+1);
				}else{
					map.put(i, 1);
				}
			}

			int answerLength = nums.length / 2;
			int keySize= map.keySet().size();

			if (keySize > answerLength){
				return answerLength;
			}else{
				return keySize;
			}

		}
	}
}
