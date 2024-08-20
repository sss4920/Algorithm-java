package programmers.dp;

import java.util.*;

/**
 * @접근방법: 처음에는 n도 2000까지길래 그냥 queue에다가 넣고 dfs느낌으로 돌려도되지않을까하고 아래와 같이 작성했다가 시간초과가 남. memo로 부분합 느낌으로 다시도전.
 */
// class Solution {
// 	public long solution(int n) {
// 		long answer = 0;
// 		Queue q = new LinkedList<>();
// 		q.add(1);
// 		q.add(2);
// 		while (!q.isEmpty()){
// 			int temp = (int)q.poll();
// 			if (answer > 1000000){
// 				answer %= 1234567;
// 			}
// 			if (temp == n){
// 				answer+=1;
// 				continue;
// 			}else if (temp < n){
// 				q.add(temp+1);
// 				q.add(temp+2);
// 				continue;
// 			}
// 		}
// 		return answer;
// 	}
// }
/**
 * @접근방법: 두번째로 접근한 방법으로는 다음과 같이 메모이제이션으로 접근해서 부분합을 구하는 방식으로 했는데.. 케이스1에서 에러가 뜬다.
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2 테스트 케이스 1을 넣어보니 다음과 같은 에러가 떴다.
 */
import java.util.*;
// class Solution {
// 	public static long[] memo;
//
// 	public long solution(int n) {
// 		long answer = 0;
// 		memo = new long[n+1];
// 		memo[1] = 1L;
// 		memo[2] = 2L;
// 		if (n ==1){
// 			return 1;
// 		}else if(n==2){
// 			return 2;
// 		}
// 		answer = memoization(n);
// 		return answer;
// 	}
// 	public static long memoization(int n){
// 		for (int i=3;i<=n;i++){
// 			memo[i] = (memo[i-1] + memo[i-2])%1234567;
// 		}
// 		return memo[n];
// 	}
// }
/**
 * 배열 안쓰고 이렇게 피보나치를 구현하는 방법도 있다. 혹시 모르니 기억해둘만한듯.
 */
// public int jumpCase(int num) {
// 	int answer = 0;
// 	int n1 = 1, n2 = 1;
// 	for (int i=1; i<num; i++) {
// 	answer = n1 + n2;
// 	n1 = n2;
// 	n2 = answer;
// 	}
// 	return answer;
// 	}

/**
 * @접근방법: 세번째 걍 첫번째 케이스에서도 한칸 여유롭게 배열을 줘서 해결했다.
 */
class Solution {
	public static long[] memo;

	public long solution(int n) {
		long answer = 0;
		memo = new long[n+2];
		memo[1] = 1L;
		memo[2] = 2L;
		if (n ==1){
			return 1;
		}else if(n==2){
			return 2;
		}
		answer = memoization(n);
		return answer;
	}
	public static long memoization(int n){
		for (int i=3;i<=n;i++){
			memo[i] = (memo[i-1] + memo[i-2])%1234567;
		}
		return memo[n];
	}
}