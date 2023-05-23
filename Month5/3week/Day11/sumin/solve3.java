import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve3 {
	static int N, M, R;
	static int[] dy = {1, 0, -1, 0}; // 하우상좌
	static int[] dx = {0, 1, 0, -1};
	static int[][] graph;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
\
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		graph = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		} 
		
		
		int n=N, m=M;
		for(int i=0; i<Math.min(N, M)/2; i++) {
			rotate(i, 2*n + 2*m -4);
			n-=2;
			m-=2;
		}
		
		
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < M; j++) {
				sb.append(graph[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static void rotate(int start, int len) {

		int rLen = R%len; 

		for (int j = 0; j < rLen; j++) {
			int y = start;
			int x = start;
			int idx = 0;
			int pre = graph[start][start];
			int tmp = 0;
			
			while (idx < 4) {
				int yy = y + dy[idx];
				int xx = x + dx[idx];
				if (yy >= start && yy < N - start && xx >= start && xx < M - start) {
					tmp = graph[yy][xx];
					graph[yy][xx] = pre;
					pre = tmp;
					y = yy;
					x = xx;
				} else idx++;
			}
			
		}

	}
}