package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * https://storyofvector7.tistory.com/14
 * 풀이 접근방법은 똑같았는데 구현쪽에서 애를 먹었다.
 * 높이와 width를 구해야하는데 알고리즘은 다음과 같이 작동한다.
 * 1. 먼저 스택에 푸시를 하면서 인덱스를 넣는다. 이 때 stack의 꼭대기 인덱스값에 해당하는 빌딩 높이를 구해서 현재 빌딩과 높이를 비교해서 현재빌딩이 더 높으면 스택 로직을 실행한다.
 * 2. stack로직에서는 높이와 가로를 계산하는데 pop을 일단 해서 현재 높이를 구하고 내 앞단 높이가 내 빗물을 지탱할 수 있는지 확인한다. 만약 앞단 높이와 현재 높이중 최솟값을 찾아 현재 pop해놨던 높이를 빼면 그게 지탱할 수 있는 높이가 된다.
 * 3. 그럼 width는 막힌 인덱스 앞단까지로 계산해서 합을 구하면 된다.
 */

public class BJ26580 {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] arr = br.readLine().split(" ");
			int[] arr1 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			System.out.println(rainTrap(arr1));
		}
	}
	static int rainTrap(int[] arr){
		int total = 0;
		for (int i=0;i<arr.length;i++){
			while (!stack.empty() && arr[stack.peek()] < arr[i]){
				int top = stack.pop(); //1
				if (stack.empty()){
					break;
				}
				int depth = Math.min(arr[i], arr[stack.peek()]) - arr[top];
				int width = i - stack.peek() - 1;
				total += depth*width;
			}
			stack.push(i);
		}
		stack.clear();
		return total;
	}


}
