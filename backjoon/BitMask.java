package backjoon;

public class BitMask {
	public static void main(String[] args) {
		int A = 0;
		A = (1<<10); //1을 왼쪽으로 10칸을 밀고, 민 곳에 0으로 채운다.
		//이는 1 * 2**10과 같다.
		System.out.println(Integer.toBinaryString(A));


	}
}
