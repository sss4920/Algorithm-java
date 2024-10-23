package programmers.priorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 귤 고르기. 종류만 구하면 되고, value를 통해 가장 큰 애를 고르면 되는 문제.
 * 그래서 종류만 구하는것에서 Hashmap을 생각했고, value로 정렬 때문에 우선순위 큐를 떠올렸다.
 * 이때 우선순위큐를 사용하면 hashmap에 id값을 입력할 것 없이 value만 정렬해서 뽑아낼 수 있다.
 * comparable로 구현하기.
 */

public class Tangerine {

}

class Solution {

	class A implements Comparable<A> {
		private int x;
		private int y;

		public A() {
		}

		public A(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(A o1) {
			return o1.y - this.y;
		}

	}

	static PriorityQueue<A> q;

	public int solution(int k, int[] tangerine) {
		int answer = 0;
		q = new PriorityQueue<>();
		Arrays.sort(tangerine);
		int before = tangerine[0];
		int count = 0;
		for (int i = 0; i < tangerine.length; i++) {
			if (before == tangerine[i]) {
				count += 1;
			} else {
				q.add(new A(before, count));
				before = tangerine[i];
				count = 1;
			}
		}
		q.add(new A(before, count));
		int i = 0;
		while (i < k) {
			A a = q.poll();
			i += a.y;
			answer += 1;
		}
		return answer;
	}
}
