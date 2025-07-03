package twoDarray;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter "+r*c+" elements:  ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        int[][] trans = new int[c][r];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of the array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               System.out.print(trans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
