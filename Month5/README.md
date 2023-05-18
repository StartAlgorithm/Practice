## 수민
- 0일차\_1[임시반장정하기] | [코드](/Month5/1week/Day0/sumin/solve1.java) ⭐️
- 0일차\_2[멘토링] | [코드](/Month5/1week/Day0/sumin/solve2.java) ⭐️
- 1일차\_1[두 배열 합치기] | [코드](/Month5/2week/Day1/sumin/solve1.java) ⭐️
- 1일차\_2[공통 원소 구하기] | [코드](/Month5/2week/Day1/sumin/solve2.java)
- 2일차\_1[최대매출] | [코드](/Month5/2week/Day2/sumin/solve1.java)
- 2일차\_2[연속부분수열] | [코드](/Month5/2week/Day2/sumin/solve2.java) ⭐️
- 3일차\_1[연속된 자연수의 합] | [코드](/Month5/2week/Day3/sumin/solve1.java)
- 3일차\_2[최대 길이 연속부분수열] | [코드](/Month5/2week/Day3/sumin/solve2.java) ⭐️
- 4일차\_1[학급 회장] | [코드](/Month5/2week/Day4/sumin/solve1.java)
- 4일차\_2[아나그램] | [코드](/Month5/2week/Day4/sumin/solve2.java)
- 5일차\_1[매출액 종류] | [코드](/Month5/2week/Day4/sumin/solve1.java)
- 5일차\_2[모든 아나그램 찾기] | [코드](/Month5/2week/Day4/sumin/solve2.java)⭐️
- 7일차_1[K번째 큰 수] | [코드](/Month5/3week/Day7/sumin/solve1.java)⭐️
- 7일차_2[올바른 괄호] | [코드](/Month5/3week/Day7/sumin/solve2.java) 
- 8일차[배열 돌리기 1](https://www.acmicpc.net/problem/16926) | [코드](/Month5/3week/Day8/sumin/solve.java)⭐️
- 9일차[배열 돌리기 2](https://www.acmicpc.net/problem/16927) | [코드](/Month5/3week/Day9/sumin/solve.java)⭐️
- 10일차[괄호문자제거] | [코드](/Month5/3week/Day10/sumin/solve1.java)
- 10일차[크레인 인형뽑기] | [코드](/Month5/3week/Day10/sumin/solve2.java)⭐️

## 예은

- 1일차\_1[세수중최솟값] | [코드] (/Month5/2week/Day1/yeeun/solve1.html) ⭐️
- 1일차\_2[삼각형판별하기] | [코드](/Month5/2week/Day1/yeeun/solve2.html) ⭐️
- 2일차\_1[연필개수] | [코드](/Month5/2week/Day2/yeeun/solve1.html) ⭐️
- 2일차\_2[1부터N까지의합] | [코드](/Month5/2week/Day2/yeeun/solve2.html) ⭐️
- 3일차\_1[최소값구하기] | [코드](/Month5/2week/Day3/yeeun/solve1.html) ⭐️
- 3일차\_2[(보충)내장함수로최솟값,최댓값구하기] | [코드](/Month5/2week/Day3/yeeun/solve2.html) ⭐️
- 4일차\_1[홀수] | [코드](/Month5/2week/Day4/yeeun/solve1.html) ⭐️
- 4일차\_2[10부제] | [코드](/Month5/2week/Day4/yeeun/solve2.html) ⭐️
- 5일차\_1[forEach,map,filter,reduce메서드작동원리] | [코드](/Month5/2week/Day5/yeeun/solve1.html) ⭐️
- 5일차\_2[일곱난쟁이] | [코드](/Month5/2week/Day5/yeeun/solve2.html) ⭐️
- 7일차\_1[A를#으로] | [코드](/Month5/2week/Day7/yeeun/solve1.html) ⭐️
- 7일차\_2[문자찾기] | [코드](/Month5/2week/Day7/yeeun/solve2.html) ⭐️

# 📌 새로 알게된 메소드

## 수민

* arraylist에서 값 꺼내기 : list.get(인덱스);
* list 정렬하기 : Arrays.sort(list);
* map.getOrDefault(key, 0) : map에서 key값이 존재하면 해당 값이 나오고 존재하지 않으면 0이 나온다. 
* map.keySet() : map에 있는 전체 Key들을 꺼낸다.
* string.toCharArray() : 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에  집어넣는다
* map.equals(map2) : key와 value 모두를 비교하여 두 HashMap 객체가 동등한지 비교한다. 
* StringBuilder 선언 : StringBuilder sb = new StringBuilder();
* StringBuilder 에서 값 꺼내기 : charAt(인덱스)
* TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); : 중복 방지 + 정렬

## 예은

# 📌 오답노트

## 수민

- arraylist 람다 이용해서 출력하기 : list.forEach(s -> System.out.print(s + " "));
- 투포인터 유형은 반드시 오름차순을 하고 진행해야한다.
- StringTokenizer 대신, split(" ") 을 사용해도 된다.
  - String[] input = br.readLine().split(" ");
- stack.peek() 은 해당 스택이 empty인지 확인해야한다. 

## 예은
