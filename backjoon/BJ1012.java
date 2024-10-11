package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1012 {
	static int[][] graph;
	static boolean[][] visited;
	static int n, m;
	static int paintcount = 0;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int testcase = Integer.parseInt(st.nextToken());

		for (int t = 0; t < testcase; t++) {
			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			graph = new int[m][n];
			visited = new boolean[m][n];

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(reader.readLine());
				int wid = Integer.parseInt(st.nextToken());
				int col = Integer.parseInt(st.nextToken());
				graph[col][wid] = 1;
			}

			for (int y = 0; y < m; y++) {
				for (int x = 0; x < n; x++) {
					if (graph[y][x] == 1 && !visited[y][x]) {
						paintcount++;
						dfs(x, y);
					}
				}
			}
			System.out.println(paintcount);
			paintcount = 0;
		}
	}

	static void dfs(int x, int y) {
		visited[y][x] = true; // 현재 위치를 방문한 것으로 마킹
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < n && 0 <= ny && ny < m) {
				if (graph[ny][nx] == 1 && !visited[ny][nx]) {
					dfs(nx, ny);
				}
			}
		}
	}
}
