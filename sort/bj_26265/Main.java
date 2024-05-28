package sort.bj_26265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	static class Node{
		String mento;
		String menti;

		public Node(String mento, String menti){
			this.mento = mento;
			this.menti = menti;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Node> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String [] keyValue = br.readLine().split(" ");
			Node node = new Node(keyValue[0], keyValue[1]);
			list.add(node);
		}
		Comparator comparator = new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.mento.compareTo(o2.mento) ==0){
					return - o1.menti.compareTo(o2.menti);
				}
				return o1.mento.compareTo(o2.mento);
			}
		};
		list.sort(comparator);
		for (Node a : list) {
			System.out.println(a.mento+" "+a.menti);
		}
	}
}
