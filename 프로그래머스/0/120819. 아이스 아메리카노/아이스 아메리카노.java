class Solution {
    public int[] solution(int money) {
        int result = (int)(money/5500);
        int rest = (int)(money%5500);
        int[] answer = {result, rest};
        return answer;
    }
}