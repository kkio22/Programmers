import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
       if (arr.length == 1) {
            return new int[]{-1};  // 배열에 -1 하나 담아서 반환
        }

        // 2. 최소값 찾기
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        // 3. 최소값 제외한 새 배열 만들기
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int num : arr) {
            if (num != minVal) {
                answer[idx++] = num;
            }
        }

        return answer;
    }
}