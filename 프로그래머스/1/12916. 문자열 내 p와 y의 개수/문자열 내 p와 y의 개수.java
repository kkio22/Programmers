class Solution {
   boolean solution(String s) {

		// s가 대문자 소문자인지 구분 안하는 것 필요
		s = s.toLowerCase();

		int pCount = 0;
		int yCount = 0;

		// p와 y 갯수 세기
		for (char c : s.toCharArray()) {
			if ( c == 'p'){
				pCount ++;
			}
			else if (c == 'y') {
				yCount ++;
			}
		}
		// p와 y 갯수 비교
		boolean answer;

		answer = pCount == yCount;

		return answer;
	}
}