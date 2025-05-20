class Solution {
    public boolean solution(int x) {//1234
        int n = 0;
        String str = String.valueOf(x); //문자열로 변환 ("1234")
        int [] array = new int [str.length()]; //4크기의 배열 생성 
         
        for(int i=0; i<str.length(); i++){
            array[i] = (int)str.charAt(i) -'0'; //charAt : 글자를 순서대로 하나씩 빼는 것, 빼서 int로 형변환 하고 배열에 하나씩 넣기 
        }
        // 문자열을 숫자로 배열에 넣기
        for(int i=0; i< array.length; i++){
            n += array[i];
        }
        // 배열에 넣은 값을 하나씩 더하기 
        if(x%n==0){ //더한 n 값으로 x 나눠서 나눠지면 true 반환, 아니면 false 반환
        return true;
        }else {
            return false;
            }
    }
}
/*
숫자를 바로 배열로는 만들 수 없음
=> 무조건, 숫자 -> 문자열로 바꿔서 하나씩 값을 숫자로 다시 변환시켜야 함 
*/