
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] num = new int[size];
        for (int x = 0; x < size; x++) {
            num[x] = Integer.parseInt(st2.nextToken());
        }
        int first = 0;
        int total = 0;
        int cnt = 0;

        for(int end =0; end<size; end++) {
            total+=num[end];
            if(total==goal) cnt++;
            while(total>=goal) {
                total -= num[first++];
                if(total==goal) cnt++;
            }
        }

        System.out.println(cnt);

    }

}