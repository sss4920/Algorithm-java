package dp.bj_1309;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [][] array = new long[n][3];
		for (int i = 0; i < 3; i++) {
			array[0][i] = 1;
		}
		for (int i=1;i<n;i++){
			for (int j = 0; j < 3; j++) {
				switch (j){
					case 0:
						array[i][0] = (array[i-1][0] + array[i-1][1] + array[i-1][2]) % 9901;
					case 1:
						array[i][1] = (array[i-1][0] + array[i-1][2]) % 9901;
					case 2:
						array[i][2] = (array[i-1][0] + array[i-1][1]) % 9901;
				}
			}
		}
		System.out.println((array[n-1][0]+array[n-1][1]+array[n-1][2])%9901);
	}
}
