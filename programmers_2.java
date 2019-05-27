/*
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 
배포될 때 함께 배포됩니다. 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 
주어질 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

입출력 예)
Progresses                  Speed                       Result
{93,30,55}                  {1,30,5}                    {2,1}

*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] progresses = {93,30,55}; //예)입력받는수 
        int[] speeds = {1,30,5};       //예)입력받는수
        int[] temp = new int[progresses.length]; //숫자담을거
        List<Integer> result = new ArrayList<>(); //결과값

        for (int i = 0 ; i < temp.length ; i++){
            temp[i] = (100 - progresses[i])/speeds[i] == 0 ? (100 - progresses[i])/speeds[i] : (100 - progresses[i])/speeds[i]+1;
        }

        int max = temp[0];
        int count = 0;
        for (int i = 0 ; i < temp.length ; i++){
            if (max >= temp[i]){
                ++count;
            }else{
                result.add(count);
                count = 1;
                max = temp[i];
            }
        }
        result.add(count);

        for (int i = 0 ; i < result.size() ; i++){
            System.out.println(result.get(i));
        }
    }
} 
