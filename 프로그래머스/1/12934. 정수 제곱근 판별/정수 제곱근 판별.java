class Solution {
    public long solution(long n) {
        for(long i =1; i <= n; i++){
            
        if(i*i==n){
            return (i+1)*(i+1);
        }
        } 
        return -1;
    }
}
/*
1. for문을 나온 다음 return할 값이 있어야 하는데 없어서 처음에 오류 발생
=> else를 사용해서 return -1을 작성했는데 그러면 처음에 i값이 1일 때 실패하면 for문을 돌지 않고 바로 -1을 반환함 
그러기에 for문 밖에 return -1을 적음
2. 제곱안해서 오류 발생 
=> Math.pow는 항상 double 반환이어서 여기서는 long타입으로 반환하기에 사용 안함 
3. 정확성 33.3 나옴
=> i<=n 이여야하는데 i<=144로 예제 값을 그냥 적음 
4. 정확성 94.4 나옴
=> (n/i==i)는 n이 26이고 i가 5이면 i가 5가 나와서 제곱인 것처럼 보여서 true가 되지만 실제로 값은 5.2로 틀린 로직이다. 그래서 제곱수를 구할 때는 나누셈이 아니라 곱하기로 (i*i==n) 확인하는게 더 정확하다.

*/
