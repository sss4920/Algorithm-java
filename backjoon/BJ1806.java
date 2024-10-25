package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1806 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		boolean isResultPresent = false;
		int answer = Integer.MAX_VALUE;
		int length = Integer.parseInt(input[0]);
		int goal = Integer.parseInt(input[1]);
		int[] array = new int[length+1];
		String[] numbers = br.readLine().split(" ");
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(numbers[i]);
		}
		int total = 0; //부분합
		while (startIndex <= length && endIndex <= length) {

			if (answer > endIndex - startIndex && total >= goal) {
				answer = endIndex - startIndex;
				isResultPresent = true;
			}
			if (total < goal) { //목표보다 작으면 오른쪽으로늘려야되. 그러면 지금꺼 end 위치를 더하고 ++
				total += array[endIndex++];
			} else {
				total -= array[startIndex++];
			}
		}

		if (isResultPresent) {
			System.out.println(answer);
		} else {
			System.out.println(0);
		}

	}
}
