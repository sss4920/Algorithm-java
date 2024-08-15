package programmers.stack;

import java.util.*;

/**
 * PROBLEM: 짝지어 제거하기.
 * POINT: 문자열에서 연달아 있는 aa,bb 등과 같은애가 있으면 점점 문자열을 삭제한다. 연속해있는거 찾는거면 스택 상상해보기.
 */
class Solution2 {
	public int solution(String s)
	{
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (int i=0;i<s.length();i++){
			if (stack.isEmpty()){
				stack.push(s.charAt(i));
			}
			else{
				char ch = s.charAt(i);
				if (ch == stack.peek()){
					stack.pop();
				}else{
					stack.push(ch);
				}
			}
		}
		if (!stack.isEmpty()){
			return 0;
		}
		return 1;
	}
}
