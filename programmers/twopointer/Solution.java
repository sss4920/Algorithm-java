package programmers.twopointer;

import java.util.*;

/**
 * @문제: 문제의 포인트는 보트에 2명까지 태울 수 있고, 넘치면 보트 1개가 더 필요하다.
 * @접근방법: 정렬을 한번 거치고, 제일 큰 인덱스부터 시작해서 맨 앞에 제일 몸무게 덜나가는 사람이랑 비교한다.
 * -> 만약 둘이 더했는데 공간이 남는다면 둘을 먼저 보트로 보내고, 앞에랑 뒤에를 한칸씩 밀고 당긴다. 공간이 없다면 무게가 많이 나가는 사람만 보낸다.
 */
class Solution {
	public int solution(int[] people, int limit) {
		Arrays.sort(people); //이렇게 하는 방법이랑
		int answer =0;
		// int[] numArr = Arrays.stream(people)
		//         	    .boxed()
		//         	    .sorted(Comparator.reverseOrder())
		//         	    .mapToInt(i -> i)
		//         	    .toArray();
		int idx = 0;
		for (int i = people.length-1;i>=idx;i--){
			if (people[i]+people[idx] <=limit){
				answer++;
				idx ++;
			}
			else{
				answer++;
			}
		}

		return answer;
	}
}
