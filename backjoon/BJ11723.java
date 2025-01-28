package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class BJ11723 {
	public static HashSet<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<a;i++){
			String[] operation = br.readLine().split(" ");
			switch (operation[0]){
				case "add":
					int x = Integer.parseInt(operation[1]);
					add(x);
					break;
				case "check":
					x = Integer.parseInt(operation[1]);
					sb.append(check(x));
					sb.append("\n");
					break;
				case "remove":
					x = Integer.parseInt(operation[1]);
					remove(x);
					break;
				case "toggle":
					x = Integer.parseInt(operation[1]);
					toggle(x);
					break;
				case "all":
					all();
					break;
				case "clear":
					clear();
					break;
				default:
					break;
			}
		}
		System.out.println(sb);
	}

	public static void add(int x){
		if (check(x)==0){
			set.add(x);
		}
	}

	public static void remove(int x){
		if (check(x)==1){
			set.remove(x);
		}
	}

	public static int check(int x){
		if (set.contains(x)){
			return 1;
		}
		return 0;
	}

	public static void toggle(int x){
		if (check(x)==1){
			remove(x);
		}else{
			add(x);
		}
	}

	public static void all(){
		set = new HashSet<>();
		set.addAll(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
	}

	public static void clear(){
		set.clear();
	}
}
