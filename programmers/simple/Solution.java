package programmers.simple;

import java.util.*;

/**
 * POINT: 만약 제곱수가 아니라면 sqrt한 값이 1로 나누어 떨어지지않는다.
 */
class Solution {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int a = brown +yellow;
		if (!(Math.sqrt(yellow)%1==0)){ //정사각형 형태가 아니면
			for (int i=3;i<a/2;i++){
				if (a%i==0){
					if ((a/i-2)*(i-2) ==yellow){
						return new int[]{a/i, i};
					}
				}
			}
			return answer;
		}
		answer = new int[]{(int)Math.sqrt(a), (int)Math.sqrt(a)};
		return answer;
	}
}
