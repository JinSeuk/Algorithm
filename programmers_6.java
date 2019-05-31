/*
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. 

input                   return
3people unFollowed me	3people Unfollowed Me
for the last week	    For The Last Week

*/

public class Main{
	public static void main(String[] args) {
        String s = "3people unFollowed me";
        int count = 0;
        String answer = "";
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == ' '){
                answer += s.charAt(i);
                count = 0 ;
            }else{
                    if (count == 0){
                            answer += Character.toUpperCase(s.charAt(i));
                    }else{
                            answer += Character.toLowerCase(s.charAt(i));
                    }
                    count++;
                }
        }
        System.out.println(answer);
    }
} 
