import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
  
public class solve1 {
  public static int solution(int n, int[][] arr) {
        int stuNum = -1; //학생 번호
        int max = -1; //같은 반이 된 최대 횟수

        for (int i = 0; i < n; i++) {
            //같은 친구와 여러 학년에 같은 반이 될 수 있기 때문에, 중복을 허용하지 않는 set 사용
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        set.add(j);
                    }
                }
            }

            if (set.size() > max) {
                max = set.size();
                stuNum = i+1;
            }
        }

        return stuNum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; st.hasMoreTokens(); j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, arr));
    }
}