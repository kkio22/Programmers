class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int [] answer = new int[str.length()];
        for(int i=0; i < str.length(); i++){
        answer[str.length()-1-i]= Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}