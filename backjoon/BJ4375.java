package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ4375 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String inputStr;
		while ((inputStr = br.readLine()) != null) {
			int n = Integer.parseInt(inputStr);
			int temp = 1;
			int answer = 1;

			while (temp % n != 0) {
				temp = (temp * 10 + 1) % n;
				answer++;
			}

			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}
