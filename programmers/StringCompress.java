package programmers;

import java.util.*;

public class StringCompress {
	public static void main(String[] args) {
		System.out.println(main2("aabbaccc"));
	}

	public static int main2(String s) {
		// 최단 문자열의 길이
		int answer = s.length();
		int count = 1;
		// 0 ~ s.length() / 2 단위로 차례로 압축
		for (int i = 1; i <= s.length() / 2; i++) {
			StringBuilder result = new StringBuilder();
			String base = s.substring(0, i);

			for (int j = i; j <= s.length(); j += i) {
				int endIdx = Math.min(j + i, s.length());
				String pre = s.substring(j, endIdx);
				if (base.equals(pre)) {
					count++;
				} else {
					if (count >= 2) {
						result.append(count);
					}
					result.append(base);
					base = pre;
					count = 1;
				}
			}
			result.append(base);
			answer = Math.min(answer, result.length());
		}
		return answer;
	}
}
