package hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int card = Integer.parseInt(br.readLine());
		String result = "";
		List<Integer> array = new ArrayList<>();

		for (int i = 0; i < card; i++) {
			array.add(i + 1);
		}
		int suffle = Integer.parseInt(br.readLine());
		for (int i = 0; i < suffle; i++) { //섞음.
			int n = Integer.parseInt(br.readLine()); //위 아래로 n개씩 뜯어낸 값으로 sublist
			array = suffleCard(array, n, card);
		}
		int size = 0;
		for (int j : array) {
			if (size ==5){
				break;
			}
			result+=j+" ";
			size++;
		}

		System.out.println(result.strip());
	}

	static List<Integer> suffleCard(List<Integer> array, int n, int card){
		List<Integer> mid = array.subList(n, array.size() - n);
		int size = mid.size();
		if (size >2*n){
			mid = suffleCard(mid, n, size);
		}
		List<Integer> front = array.subList(0, n);
		mid.addAll(front);
		List<Integer> back = array.subList(array.size() - n, array.size());
		mid.addAll(back);
		array = mid.subList(0,card);
		return array;
	}

}
