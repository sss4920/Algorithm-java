package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ14425 {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int answer =0;
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);

		for (int i=0;i<n;i++){
			map.put(br.readLine(), i);
		}
		for (int i=0;i<m;i++){
			if (map.containsKey(br.readLine())){
				answer+=1;
			}
		}
		System.out.println(answer);
	}
}
