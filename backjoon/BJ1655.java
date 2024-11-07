package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class BJ1655 {
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;
		}
	});
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	});
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++){
			int temp = Integer.parseInt(br.readLine());
			if (maxHeap.size() == minHeap.size()){
				maxHeap.add(temp);
			}else{
				minHeap.add(temp);
			}
			if (!minHeap.isEmpty() && !maxHeap.isEmpty()){
				if (minHeap.peek() < maxHeap.peek()){
					int temp1 = maxHeap.poll();
					maxHeap.add(minHeap.poll());
					minHeap.add(temp1);
				}
			}
			System.out.println(maxHeap.peek());
		}
	}
}
