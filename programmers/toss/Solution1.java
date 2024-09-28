// package programmers.toss;
//
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
//
// public class Solution1 {
// 	static int[] dx = {0,0,1,-1}; //u,d,r,l
// 	static int[] dy = {-1,1,0,0};
//
// 	static boolean[][] visited;
//
// 	static Queue<int[]> q = new LinkedList<>();
// 	public static void main(int[][] map, int[] entrance){
// 		boolean answer = true;
// 		for (int i=0;i<map.length;i++){
// 			for (int j=0;j<map[0].length;j++){
// 				if (map[i][j] != 0 && map[i][j] !=8){
// 					q.add(new int[]{i,j,0});
// 				}
// 			}
// 		}
// 		bfs();
// 	}
// 	public void bfs(){
// 		while (!q.isEmpty()){
// 			int[] position = q.poll(); //y,x
// 			int y = position[0];
// 			int x = position[1];
// 			int level = position[2];
//
// 			for (int i=0;i<4;i++){
// 				if (level%2==0){ //짝수면 i=2부터
// 					i+=2;
// 					int ny = y+dy[i];
// 					int nx = x+dx[i];
// 				}
//
// 			}
// 		}
//
// 	}
//
//
// 	public static void main(String[] args) {
// 		Solution1.main();
// 	}
// }
