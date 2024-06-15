package programmers.stack;


import java.util.*;
class Solution {
	private static Stack<Character> stack = new Stack<>();
	boolean solution(String s) {
		boolean answer = true;
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(')
				stack.add(array[i]);
			else {
				if (stack.size() > 0){
					char temp = stack.pop();
				}
				else{
					return false;
				}
			}
		}
		if (stack.size() >0){
			answer = false;
		}

		return answer;
	}
}
