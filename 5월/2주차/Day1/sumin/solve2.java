

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int x=0;x<n1;x++) {
            arr1[x] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int x=0;x<n2;x++) {
            arr2[x] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr2);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int p1 = 0,p2 = 0;
        while(p1 < n1 && p2 < n2) {

            if(arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
                continue;
            }

            if(arr1[p1] < arr2[p2]) {
                p1++;
            }
            else {
                p2++;
            }

        }

        answer.forEach(s -> System.out.print(s + " "));


    }

}
