class Solution {
    public long solution(int a, int b) {
         long answer = 0;
        if(a<b){
        for(int i = a; i<=b; i++){
           answer += i; 
        }
        } else if(a>b){
             for(int j = b; j<=a; j++){
           answer += j; 
        }
        }
        else if(a==b){
           return a; 
        }    
         return answer;
    } 
}