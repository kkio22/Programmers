class Solution {
    public int solution(int n, int k) {
        int yang = 12000 * n;
        int cola = 2000 * k;
        int r = n/10;
        int min = 2000 * r;
        int answer = yang + cola - min;
        return answer;
    }
}