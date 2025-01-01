package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11401 {
	private static final int MODULER = 1_000_000_007;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long [] array = new long[n+1];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		for (int i =3;i<=n;i++){
			array[i] = (array[i-1] * i)%MODULER;
		}

		System.out.println(array[n]/((array[k]) * (array[n-k]))%MODULER);
	}
}
