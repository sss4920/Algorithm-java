package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ10815 {
	static HashMap<Long, Long> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()){
			map.put(Long.parseLong(st.nextToken()),1L);
		}
		long k = Long.parseLong(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		while (st2.hasMoreTokens()){
			if(map.containsKey(Long.parseLong(st2.nextToken()))){
				sb.append(1+" ");
			}else{
				sb.append(0+" ");
			}
		}
		System.out.println(sb.toString().strip());

	}
}
