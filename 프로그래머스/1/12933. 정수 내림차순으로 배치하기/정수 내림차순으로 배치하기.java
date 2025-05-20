import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);// 문자열 전환 
        Long [] array = new Long[str.length()]; //정수 배열 선언 
        for(int i =0; i < str.length(); i++){ // 문자열 -> 정수 배열 
        array[i] = (long)str.charAt(i) -'0'; // 정수 배열에다 정리함 
            /*"0"은 문자인데 문자 0은 아스키 코드에서 48이기 때문에 만약 내가 문자열로 나타낸 '5'의 아스키 코드값이 53인데  -"0"으로 해주면 53-48을 해줘서 5인 숫자로 나타내게 해줌 
            */  }
       Arrays.sort(array, Collections.reverseOrder()); // Array.sort() void여서 반환값이 없다. 그냥 정렬을 바꿔주기만 함 
       
        StringBuilder sb = new StringBuilder();
        for(int x =0; x<array.length; x++){
            sb.append(array[x]);
        }
        return Long.parseLong(sb.toString());
          
            }
        
    }
/*
정수 정렬 코드 작성
1. n으로 들어온 정수를 문자열로 바꿔서 배열에 하나씩 넣는 코드 작성
2. 그리고 그 배열을 정수 배열로 바꿔서 내림차순을 정렬
3. 값을 순서대로 빼서 반환 
*/