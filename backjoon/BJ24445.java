package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//1-2-3-4
//  2-4
//1-4
public class BJ24445 {
	static Queue<Integer> q = new LinkedList<>();
	static int[] answer;
	static boolean[] visit;
	static int priority = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] array = br.readLine().split(" ");
		int point = Integer.parseInt(array[0]);
		int input = Integer.parseInt(array[1]);
		int start = Integer.parseInt(array[2]);
		ArrayList<Integer>[] arr = new ArrayList[point+1];
		answer = new int[point+1];
		visit = new boolean[point+1];
		for (int i=0;i<=point;i++){
			arr[i] = new ArrayList<>();
		}
		for (int i=0;i<input;i++){
			int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			arr[temp[0]].add(temp[1]);
			arr[temp[1]].add(temp[0]);
		}
		for (int i=1;i<=point;i++){
			if (!arr[i].isEmpty())
				arr[i].sort(Collections.reverseOrder());
		}
		q.add(start);
		answer[start] = ++priority;
		visit[start] = true;
		bfs(arr);
		for (int i=1;i<=point;i++){
			System.out.println(answer[i] == 0?0:answer[i]);
		}
	}
	static void bfs(ArrayList<Integer>[] arr){
		while(!q.isEmpty()){
			int present = q.poll();

			for (int i=0;i<arr[present].size();i++){
				if (!visit[arr[present].get(i)]){
					visit[arr[present].get(i)] = true;
					answer[arr[present].get(i)] = ++priority;
					q.add(arr[present].get(i));
				}
			}
		}

	}
}
