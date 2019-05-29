//124마을 문제
//in   out 
// 1   1
// 2   2
// 3   4
// 4   11
// 5   12
// 6   14
// 7   21
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n = 12; //입력받는수
        int div;
        String answer = "";

        while(n>0){
            div = n%3;
            n = n/3;
            if (div==0){
                n-=1;
                div = 4;
            }
            answer = div + answer;
        }
        System.out.println(answer);

    }
} 
