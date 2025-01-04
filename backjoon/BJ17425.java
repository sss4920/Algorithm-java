package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
