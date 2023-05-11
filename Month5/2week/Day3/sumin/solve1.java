import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int goal = Integer.parseInt(br.readLine());
       int[] num = new int[goal+1];

       for(int x=1;x<goal;x++) {
           num[x] = x;
       }

       int sum=0;
       int lt = 1;
       int answer = 0;
       for(int rt = 1;rt<goal;rt++) {
           sum += num[rt];
           if(sum == goal) answer++;
           while(sum >= goal) {
               sum -= num[lt++];
               if(sum == goal) answer++;
           }
       }

        System.out.println(answer);

    }

}
