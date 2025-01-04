package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 그냥 전에 했던 것과 같이 똑같이 진행을 하게 되면 100만번 * 테스트케이스 10만번으로 절대 1초안에 끝나지않는다. 다른 방법이 필요.
// 부분합의 규칙성을 찾아야하고, 찾아보니까 배수에 해당하는 애들은 유사 o(n^1/2)정도로 구하고 dp의 부분합을 사용하여 100만번의 테스트케이스 배열을 만들어주고
// 계산결과만 디피에 저장해놓고 o(1)로 찾아서 넣기.

public class BJ17425 {
	static final int MAX = 1_000_001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		long[] array = getDivisorSum();
		while(test-- > 0){
			sb.append(array[Integer.parseInt(br.readLine())]+"\n");
		}
		System.out.println(sb);

	}
	private static long[] getDivisorSum(){
		long[] dp = new long[MAX];
		Arrays.fill(dp, 1);
		for (int i=2;i<MAX;i++){

			for (int j=1;i*j<MAX;j++){
				dp[i*j] += i; //i의 배수에다가 i만큼 다 더해주기. 1은 이미 더해져있다.
			}
		}

		long[] answerSum = new long[MAX];
		for (int i=1;i<MAX;i++){
			answerSum[i] = answerSum[i-1]+dp[i];
		}
		return answerSum;

	}
}
