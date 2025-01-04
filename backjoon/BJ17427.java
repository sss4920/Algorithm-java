package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 100만이니까 n^2하면 무조건 시간초과.
// dp로 접근해서 각자 자신의 약수의 합을 저장.
// 1억을 1초라고 가정하면 N의 최악은 100만.
// 최악의 n이 100만, 최악의 n^2을 하면 10000초 즉, 결국 O(N)방식으로 1개에 대한 결과를 N번 반복하는 방식으로 하고 O(루트N)을 곱하는 방식으로 풀면 0.5초안에 절대못품.
// DP중에서도 수학적으로 제대로 줄일 수 잇는 기법이 필요함. 즉, 1의 약수면 1의 개수를 세야하고, 2의 약수면 전체 2의 개수가 몇개 들어가는지 등을
// 단순계산 시켜서 전체 로직이 O(N)안에 끝나도록 설계해야한다.
public class BJ17427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long res = 0;
		for (int i=1;i<=n;i++){
			res += (long)i * (n/i);
		}
		System.out.println(res);

	}

	private void makeGCD(){

	}
}
