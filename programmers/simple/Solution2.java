package programmers.simple;

/**
 * 설계 : 2를 곱하거나 또는 1더하는 연산임. 즉, 거리를 역으로 계산하면 2로 나눠지면 나누고 안나눠지면 점프한거니까 1씩 뺀다.
 * 근데 더 쉬운방법은 Integer.bitCount(n) 쓰면 1의 개수를 셀 수 있어서 같은 값이 나온다.. 이건 발상하기 어렵지만 이진수로 바꿨을 때 1의 개수 세는게 있으면 이걸로 해보자.
 */
public class Solution2 {
	public int solution(int n){
		int ans = 0;
		while (n>0){
			if (n%2==0){
				n/=2;
				continue;
			}
			n-=1;
			ans++;
		}
		return ans;
	}
}
