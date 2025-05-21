import java.util.List;
import java.util.ArrayList;
//import 수동으로 해줘야 하는거 잊지 말기 
class Solution {
    public int[] solution(int[] arr, int divisor) {
        //List로 변환해서 가변적으로 바꾸기 
         List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0){
             list.add(i); //list에 값이 들어감 
            }
        } //일단 여기까지 한번 돌아 그리고 다시 if문으로 어떤 값을 return할지 생각하면 return 값이 두개인데 어떻게 return하지의 고민 해결 
        if(list.isEmpty()){
            return new int [] {-1}; //int 배열에 -1을 넣어서 반환 
        } //아니면 밑에 로직 실행 
        list.sort(null); // 오름차순 
        //list를 하나씩 빼서 배열에 넣기 
       int [] answer = list.stream().mapToInt(Integer::intValue).toArray(); // stream 잘 사용하자! Array는 배열이니까 
        return answer;
        }
    }



    