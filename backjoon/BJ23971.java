package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 최대한 많은 칸에 애들이 앉아야한다. 가로와 세로가 결국 길이에 따라 띄어 앉아야하는 메커니즘은 비슷하나 길이가 다르다.
// 즉, 하나를 적용하고 해당 규칙을 가로와 세로에 따로 적용하고 * 연산으로 가능한 수를 센다.
// 5 / (n+1) 의 올림을 하면 해당 규칙이 나오고
// 해당 로직을 가로 * 세로를 수행하여 구한다.

public class BJ23971 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");

		double h = Integer.parseInt(a[0]);
		double w = Integer.parseInt(a[1]);
		double n = Integer.parseInt(a[2]);
		double m = Integer.parseInt(a[3]);
		double width = Math.ceil(w / (m+1));
		double height = Math.ceil(h / (n+1));

		System.out.println((int)(width * height));


	}
}
