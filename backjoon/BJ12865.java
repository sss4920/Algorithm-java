package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ12865 {
	static int[][] array;
	static int[] value;
	static int[] weight;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] n = br.readLine().split(" ");
		int maxWeight = Integer.parseInt(n[1]); //물품의 최대 무게
		int item = Integer.parseInt(n[0]); //물품의 총 개수
		array = new int[item+1][maxWeight+1];
		weight = new int[item+1];
		value = new int[item+1];
		for (int i=0;i<item;i++){
			n = br.readLine().split(" ");
			weight[i] = Integer.parseInt(n[0]);
			value[i] = Integer.parseInt(n[1]);
		}
		for (int i=0;i<item+1;i++){ //i는 탐색하는 인덱스
			for(int j=0;j<maxWeight+1;j++){ //j는 가능한 무게
				if(i ==0 || j==0){
					array[i][j] = 0;
				}
				else {
					array[i][j] = array[i-1][j];
					if(weight[i-1] <=j){
						array[i][j] = Math.max(array[i - 1][j],
							array[i - 1][j - weight[i-1]] + value[i-1]);//나를 넣기전의 최대가치 + 나를 넣은 가치 한것과 바로전 최대가치를 비교해서 큰값을 넣어.
					}
				}
			}
		}
		System.out.println(array[item][maxWeight]);

	}
}
