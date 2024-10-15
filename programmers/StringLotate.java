package programmers;
import java.util.*;
public class StringLotate {
	public static void main(String[] args) {
		int a = solution("[](){}");
		System.out.println(a);
	}
	private static HashMap<String, String> map = new HashMap<>();

	public static int solution(String s) {
		int answer =0;
		String lotateString = s;
		map.put("{","}");
		map.put("(",")");
		map.put("[","]");
		for (int i=0;i<s.length();i++){
			if (validateStack(lotateString)){
				answer++;
			}
			lotateString = lotateStringMethod(lotateString);
		}

		return answer;
	}
	//스택에서 왼쪽 새끼 보이면 push 오른쪽 새끼 보이면 pop -> 남아있거나 없는데 푸시하려고 하면 false
	public static boolean validateStack(String s){
		Stack<String> stack = new Stack<>();
		String[] a = s.split("");
		System.out.println(s);
		for (String k : a){
			System.out.println(k);
			if(k.equals("{") || k.equals("(") || k.equals("[") ){
				stack.push(k);
				continue;
			}
			if(k.equals("}") || k.equals(")") || k.equals("]") ){
				if (stack.size()==0){
					return false;
				}
				String temp = stack.pop();
				if (!k.equals(map.get(temp))){
					return false;
				}
			}
		}
		if (stack.size()==0){
			return true;
		}
		return false;
	}


	//회전 -> sb에서 왼쪽삭제, 오른쪽추가
	public static String lotateStringMethod(String s){
		StringBuilder sb = new StringBuilder(s);
		String temp = String.valueOf(sb.charAt(0));
		sb.deleteCharAt(0);
		sb.insert(sb.length(), temp); // 원래 sb.length()-1 했는데, 생각해보니 삭제해서 렝스 한개씩 줄음.
		return sb.toString();
	}
}
