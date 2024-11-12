package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 와 녹일때는 방문여부가 필요없네; 이것때문에 계속 무한루프를 돌았음..
 */

public class BJ3197 {

	static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};

	static char[][] rake; //맵.

	static int row;
	static int col;
	static int[][] visit; //방문맵.
	static Queue<int[]> meltQueue = new LinkedList<>();
	static Queue<int[]> swanQueue = new LinkedList<>();
	static int endy = 1501;
	static int endx = 1501;

	static int startx = 1501;
	static int starty = 1501;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		rake = new char[row][col];
		visit = new int[row][col];
		makeRake(row, br); //맵을 만들고
		int level = 0;
		visit[starty][startx]=1;
		while (level < 10000) {
			if(findSwan()){
				break;
			}
			melting();
			level++;
		}
		System.out.println(level);

	}

	private static void makeRake(int row, BufferedReader br) throws IOException {
		for (int i = 0; i < row; i++) {
			char[] b = br.readLine().toCharArray();
			for (int j = 0; j < b.length; j++) {
				rake[i][j] = b[j]; //맵을 저장.
				if (b[j] == '.' || b[j] == 'L') { //백조 위치도 물이므로.
					meltQueue.add(new int[] {i, j});//만약에 물이면 물 위치를 저장.
					if (b[j] == 'L') { //만약 백조면 백조 위치를 큐에 등록.
						rake[i][j] = '.';
						if (startx >1500){
							starty = i;
							startx = j;
							swanQueue.add(new int[] {i, j});
						}else{
							endy =i;
							endx =j;
						}
					}
				}
			}
		}
	}

	//물이 퍼지는 메소드
	//level을 늘려가면서 하는 방식으로 해보자.
	public static void melting() {
		int size = meltQueue.size();
		int j = 0;
		while (j<size) {
			int[] position = meltQueue.poll();
			j++;
			int y = position[0];
			int x = position[1];
			// visit[y][x] = 1;
			for (int i = 0; i < 4; i++) {
				int ny = dy[i] + y;
				int nx = dx[i] + x;
				if (0 <= ny && ny < row && 0 <= nx && nx < col) { //범위에 있고
					if (rake[ny][nx] == 'X') {
						//내가 이 자리에 방문한적없고, X이면 벽을 부숴.
						rake[ny][nx] = '.';
						meltQueue.add(new int[] {ny, nx}); //벽을 부수고 다음에 녹일 부분으로 지정.
					}
				}
			}
		}
	}

	// 백조를 찾는 메소드.
	private static boolean findSwan() {
		Queue<int[]> nextDayQueue = new LinkedList<>();
		while (!swanQueue.isEmpty()) {
			int[] position = swanQueue.poll();
			int y = position[0];
			int x = position[1];

			if (y == endy && x == endx) { //백조를 찾으면
				return true;
			}
			for (int i = 0; i < 4; i++) {
				int ny = dy[i] + y;
				int nx = dx[i] + x;
				if (0 <= ny && ny < row && 0 <= nx && nx < col && visit[ny][nx]==0) { //범위에 있고 방문한적없고
					visit[ny][nx]=1;
					if (rake[ny][nx] == 'X') { //벽이면 내일 뚫릴수있음. 즉, 다시 탐색해야됨.
						nextDayQueue.add(new int[] {ny, nx});
					}
					else if (rake[ny][nx] == '.') { //물이고, 방문한적없으면 백조 탐색.
						swanQueue.add(new int[] {ny, nx});
					}
				}
			}
		}
		swanQueue = nextDayQueue;
		return false;
	}
}
