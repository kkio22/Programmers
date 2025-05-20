class Solution {
    public String solution(String[] seoul) { //값이 이미 배열로 들어옴 
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
               answer = "김서방은" + " " + i+"에" + " " +"있다"; 
        }
    }
        return answer;
    }
}