


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       Stack<Character> check = new Stack<>();
       for(char c : s.toCharArray()) {
           if(c == '(') check.push(c);
           if(c == ')' && check.empty()) {
               System.out.println("NO");
               return;
           }
           if(c == ')' && check.peek() == '(') {
               check.pop();
           }

       }

        if(check.empty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }





}