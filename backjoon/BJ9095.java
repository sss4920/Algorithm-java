package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백트래킹으로 하기에는 비효율적인 문제.
// dp로 1,2,3,4의 케이스를 보며 3까지는 예외, 4부터 규칙이 보이는 문제.


public class BJ9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <= 11; i++){
			dp[i] += dp[i-1]+dp[i-2]+dp[i-3];
		}

		for (int i=0;i<test;i++){
			int k  = Integer.parseInt(br.readLine());
			System.out.println(dp[k]);
		}
	}
}
