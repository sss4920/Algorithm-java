package programmers.simple.lv1;

/**
 * 문제: lv1 콜라츠 추측
 * 설명: 주어지는 num이 좀 커서 temp를 long으로 맞춰줘야 runtime error가 발생하지않았다.
 */
class Solution {
	public int solution(int num) {
		int answer = 0;
		long temp = num;
		if (temp ==1){
			return 0;
		}
		while (true){
			if (temp == 1){
				break;
			}
			if (answer >= 500){
				return -1;
			}
			if (temp%2==0){
				temp /= 2;
				answer+=1;
			}else{
				temp = temp*3 + 1;
				answer+=1;
			}
		}
		return answer;
	}
}