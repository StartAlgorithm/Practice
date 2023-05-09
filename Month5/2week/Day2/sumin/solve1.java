
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int window = Integer.parseInt(st.nextToken());

        int first = 0;
        int end = window -1;
        int[] cost = new int[num];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int x=0;x<num;x++) {
            cost[x] = Integer.parseInt(st2.nextToken());
        }

        int totalCost = 0;

        for(int x=first;x<=end;x++) {
            totalCost += cost[x];
        }
        int max = totalCost;

        end++;
        while(end < num) {

            totalCost += cost[end++];
            totalCost -= cost[first++];

            if(max < totalCost) max = totalCost;
        }

        System.out.println(max);
    }

    /* 강의 알고리즘
     * for(int x=end;x<num;x++) {
     *  totalCost+=(num[x] - num[x-end]);
     *  max = Max.max(max,totalCost);
     * }
     */

}