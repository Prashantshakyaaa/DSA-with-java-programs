package twoDarray;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        int[][] arr1 = new int[r][c];
        System.out.print("Enter "+r*c+" Elements in this array");
        for(int i =0; i<r;i++){
            for(int j =0; j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        System.out.print("Enter number of rows: ");
        int ro= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int co=sc.nextInt();
        int[][] arr2 = new int[ro][co];
        System.out.print("Enter "+ro*co+" Elements in this array");
        for(int i =0; i<ro;i++){
            for(int j =0; j<co;j++){
                arr2[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        int[][] ans = new int[r][co];
        if(c != ro){
            System.out.println("Multiplivation not possible.");
            return;
        }else{
            for(int i = 0; i < r; i++){
                for(int j = 0; j < co;j++){
                    for(int k = 0; k < c; k++){
                        ans[i][j] = arr1[i][k] + arr2[k][j];
                    }
                }
            }
        }
        System.out.println("Multiplication array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < co; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
