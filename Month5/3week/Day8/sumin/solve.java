import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve {
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nmr = br.readLine().split(" ");
		int N = Integer.parseInt(nmr[0]);
		int M = Integer.parseInt(nmr[1]);
		int R = Integer.parseInt(nmr[2]);
		int round = Math.min(N, M)/2;
		
		int[][] map = new int[N][M];
		for(int i=0;i<N;i++) {
			String[] split = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		}
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};

		for(int t=0;t<R;t++) {
			for(int i=0;i<round;i++) {
				int cnt = 0;
				int now = map[i][i];
				int x = i, y = i;
				while(cnt<4) {
					int X = x +dx[cnt];
					int Y = y +dy[cnt];
					
					if(X>=i && Y>=i && X<N-i && Y<M-i ) {
						map[x][y] = map[X][Y];
						x = X;
						y = Y;
					}
					else {
						cnt++;
					}
				}
				map[i+1][i] = now;
			}
		}

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
 
