package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int x = 0;
		for (int i=0;i<a;i++){
			String[] operation = br.readLine().split(" ");
			switch (operation[0]){
				case "add":
					int k = Integer.parseInt(operation[1]);
					x |= (1<< k);
					break;
				case "check":
					k = Integer.parseInt(operation[1]);
					sb.append((x & (1<<k)) != 0?1:0).append("\n");
					break;
				case "remove":
					k = Integer.parseInt(operation[1]);
					x &= ~(1<<k);
					break;
				case "toggle":
					k = Integer.parseInt(operation[1]);
					x ^= (1<<k); //얘가 이해가 잘안감.
					break;
				case "all":
					x = (1 << 21) -1; // 21칸 까지 밀면 100000.. -> 1빼면 22번째줄 사라지면서 01111111..되겠지.
					break;
				case "empty":
					x = 0;
					break;
				default:
					break;
			}
		}
		System.out.println(sb);
	}
}
