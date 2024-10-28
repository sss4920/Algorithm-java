package kakao.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {
	static Queue<String> q = new LinkedList<>();
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		int i=0;
		if (cacheSize ==0){
			return 5 * cities.length;
		}
		for (String city : cities){
			String presentString = city.toUpperCase();

			if (i<cacheSize && !q.contains(presentString)){
				i+=1;
				answer+=5;
				q.offer(presentString);
				continue;
			}else if (i<cacheSize && q.contains(presentString)){
				answer+=1;
				q.remove(presentString);
				q.offer(presentString);
				continue;
			} // 캐시가 다 차지 않았을 때;

			if (q.contains(presentString)){
				answer+=1;
				q.remove(presentString);
				q.offer(presentString);
			}else{
				answer+=5;
				q.poll();
				q.offer(presentString);
			}
		}

		return answer;
	}
}
