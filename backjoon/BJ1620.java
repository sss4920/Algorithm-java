package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * if(49 <= s.charAt(0) && s.charAt(0) <= 57) 들어온 문자열 첫글자가 1~9중 하나인지 찾음.
 */

public class BJ1620 {
	static HashMap<String, Integer> map = new HashMap<>();
	static HashMap<Integer, String> map2 = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		for (int i = 0; i < Integer.parseInt(a[0]); i++) {
			String temp = br.readLine();
			map.put(temp, i + 1);
			map2.put(i + 1, temp);
		}
		for (int i = 0; i < Integer.parseInt(a[1]); i++) {
			String aa = br.readLine();
			try {
				System.out.println(map2.get(Integer.parseInt(aa)));
			} catch (Exception e) {
				System.out.println(map.get(aa));
			}
		}

	}
}
