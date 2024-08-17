package programmers.recursive;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.*;
/**
 * @접근방법: 재귀 설계를 잘하자!
 * 초반에 설계로 가장 작은 단위로 나누는 과정.f(n)과 f(n-1)로 나눠가면서 생각해보면
 * f(n) = 2 * f(n-1) +1 이라는 것을 알 수 있다.
 * n-1개의 원판을 가운데로 옮기고 f(n-1)
 * 맨 아래 원판을 오른쪽 끝으로 올리고 f(1)
 * 다시 가운데 n-1개의 원판을 오른쪽으로 다 옮긴다.f(n-1)
 * 따라서 f(n) = 2 * f(n-1) +1
 */
class Solution {
	public static ArrayList<int[]> array;

	public int[][] solution(int n) {
		array = new ArrayList<>();
		hanoi(n,1,3,2);
		int[][] answer = new int[array.size()][];
		for (int i=0;i<array.size();i++){
			answer[i] = array.get(i);
		}
		return answer;
	}
	public static int hanoi(int n){
		if (n==1){
			return 1;
		}
		return 2* hanoi(n-1) + 1;
	}
	public static void makeMove(int n, int start, int end, int via){
		int[] temp = new int[2];
		temp[0] = start;
		temp[1] = end;
		array.add(temp);
	}

	public static void hanoi(int n, int start, int end, int via){
		if (n==1){
			makeMove(1, start, end, via);
		}
		else{
			hanoi(n-1, start, via, end);
			makeMove(n, start, end, via);
			hanoi(n-1, via, end, start);
		}
	}
}