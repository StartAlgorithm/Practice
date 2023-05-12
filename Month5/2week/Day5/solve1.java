
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int x=0;x<n;x++) {
            arr[x] = Integer.parseInt(st2.nextToken());
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x=0;x<k;x++){
            map.put(arr[x], map.getOrDefault(arr[x],0)+1);
        }
        int cnt = map.size();
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(cnt);
        int lt = 0;
        for(int rt=k;rt<n;rt++) {
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt++]) == 0) cnt--;
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            if(map.get(arr[rt]) == 1) cnt++;
            answer.add(cnt);
        }

        answer.forEach(s-> System.out.print(s + " "));

    }





}
