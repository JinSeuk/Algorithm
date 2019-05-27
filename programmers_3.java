/*
행렬의 곱셈은, 곱하려는 두 행렬의 어떤 행과 열을 기준으로, 좌측의 행렬은 해당되는 행, 우측의 행렬은 해당되는 열을 
순서대로 곱한 값을 더한 값이 들어갑니다. 행렬을 곱하기 위해선 좌측 행렬의 열의 개수와 우측 행렬의 행의 개수가 같아야 합니다. 
곱할 수 있는 두 행렬 A,B가 주어질 때, 행렬을 곱한 값을 출력해보세요.
*/

import java.util.*;

public class Main{
    public static void main(String[] args){
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}; //예)입력받는수 
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}; //예)입력받는수

        int[][] result = new int[arr1.length][arr2[0].length]; //결과값
        int resultValue = 0;

        for (int i = 0; i < arr1.length ; i++){ //행 
            for (int j = 0 ; j < arr2[i].length ; j++){ //열
                resultValue = 0;
                for(int k = 0; k < arr2.length ; k++){ //곱해지는 사이값
                    resultValue += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = resultValue;
                //result[i][j] = arr1[i][j] * arr2[j][i];
            }
        }

        for (int i = 0; i < arr1.length ; i++){
            for (int j = 0 ; j < arr2[i].length ; j++){
                System.out.printf("%3d",result[i][j]);
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
} 
