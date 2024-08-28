package programmers.dfs;

/**
 * 문제: 프로그래머스 lv2 타겟넘버
 * level을 올려나가야되는데, 머리속으로 과정을 상상하는게 생각보다 오래걸려서 어려웠다.
 */
class Solution {
	static int answer = 0;
	public int solution(int[] numbers, int target) {
		dfs(0,numbers,0, target);
		return answer;

	}
	public void dfs(int level, int [] numbers, int sum, int target){
		if (level == numbers.length){
			if (sum == target){
				answer++;
			}
		}else{
			dfs(level+1, numbers, sum+numbers[level], target);
			dfs(level+1, numbers, sum-numbers[level], target);
		}
	}
}
