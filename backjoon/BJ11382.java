package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 10^12승이 입력으로 들어올 수 있기 때문에 long 타입으로 설정해줘야한다.
 */
public class BJ11382 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long sum=0;
		while (st.hasMoreTokens()){
			sum += Long.parseLong(st.nextToken());
		}
		System.out.println(sum);
	}
}
