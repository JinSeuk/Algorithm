/*
영어끝말잇기
*/
import java.util.*;

public class Main{
	public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank","kick","know","wheel","land","dream","mother","robot","tank"};
        //int n = 2;
        //String[] words = {"hello","one","even","never","now","world","draw"};
        //int n = 5;
        //String[] words = {"hello","observe","effect","take","either","recognize","encourage","ensure","establish","hang","gather","refer","reference","estimate","executive"};
        int result = -1;
        int[] answer = {0,0};


        for (int i = 1 ; i < words.length ; i++){
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                //System.out.println(words[i].charAt(words[i].length()-1));
                //System.out.println(words[i+1].charAt(0));
                result = i+1;
                //System.out.println(1);
                break;
            }
        }
        if (result < 0){
            for (int i = 0 ; i < words.length ; i++){
                for (int j = i+1 ; j < words.length ; j++){
                    if (words[i] == words[j]){
                        //System.out.println(j);
                        result = j+1;
                        //System.out.println(3);
                        break;
                    }
                }
                if (result > 0){
                    break;
                }
            }
        }
        if (result < 0){
            result = 0;
        }

        answer[0] = result/n>0 && result%n==0?n:result%n;
        answer[1] = result%n==0?result/n:result/n+1;

        for (int i = 0 ; i < answer.length ; i++){
        System.out.println(answer[i]);
        }
    }
} 
