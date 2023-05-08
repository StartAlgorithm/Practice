
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr1 = new ArrayList<>();
        addList(arr1,br);

        ArrayList<Integer> arr2 = new ArrayList<>();
        addList(arr2,br);

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while(p1 < arr1.size() && p2 < arr2.size() ) {
            if(arr1.get(p1) < arr2.get(p2)) {
                answer.add(arr1.get(p1++));
                continue;
            }

            answer.add(arr2.get(p2));
            p2++;
        }

        while(p1 < arr1.size()) answer.add(arr1.get(p1++));
        while(p2 < arr2.size()) answer.add(arr2.get(p2++));
        answer.forEach(s -> System.out.print(s + " "));


    }

    public static void addList(ArrayList<Integer> arr,BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int x=0;x<n;x++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
    }
}
