/*
利用Java的二维数组实现回型数，即蛇形填充
 */


package com.piopik.exercise;

import java.util.Scanner;

public class huixingshu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] result = new int[num][num];
        int Xmin = 0;
        int Ymin = 0;
        int Xmax = num - 1;
        int Ymax = num - 1;
        int sum = 0;
        while(Xmin < Xmax && Ymin < Ymax){
            for(int i = Xmin;i < Xmax + 1;i++){
                result[Ymin][i] = ++sum ;
            }
            Ymin++;
            for(int i = Ymin;i < Ymax + 1;i++){
                result[i][Xmax] = ++sum;
            }
            Xmax--;
            for(int i = Xmax;i > Xmin - 1;i--){
                result[Ymax][i] = ++sum;
            }
            Ymax--;
            for(int i = Ymax;i > Ymin - 1;i--){
                result[i][Xmin] = ++sum;
            }
            Xmin++;
            if(Xmin == Xmax && Ymax == Ymin)
                result[Xmax][Ymax] = num * num ;
        }
        //System.out.println(Xmin +" "+ Xmax + " " + " "+Ymin +" "+ Ymax);
        for(int i = 0;i < num; i++){
            for(int j = 0;j < num; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
