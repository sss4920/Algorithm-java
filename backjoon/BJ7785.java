package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	static TreeMap<String, String> map = new TreeMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] temp = br.readLine().split(" ");
			if (temp[1].equals("enter")){
				map.put(temp[0], temp[1]);
			}else{
				map.remove(temp[0]);
			}
		}
		map.descendingKeySet().forEach(
			System.out::println
		);

	}
}
