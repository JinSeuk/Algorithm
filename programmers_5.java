/*

int[]               int     int
people              limit   return
[70, 50, 80, 50]	100	        3
[70, 80, 50]	    100	        3

people max값은 5만

*/

import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] people = {70,50,80,50};  //옮겨야될사람
        int limit = 100;               //한번에옮길수있는최대무게
        Arrays.sort(people);
        int max = people.length-1;
        int count = 0;
        for (int i = 0 ; i < people.length ; i++){
            for ( int j = max ; j > i ; j--){
                if (people[i]+people[j]<=limit){
                    ++count;
                    max = j-1;
                    people[i]=0;
                    people[j]=0;
                    break;    
                }
            }
        }
        for(int i = 0 ; i < people.length ; i++){
            if (people[i]>0){
                ++count;
            }
        }
        System.out.println(count);
    }
} 
