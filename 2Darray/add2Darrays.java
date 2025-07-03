package twoDarray;

import java.util.Scanner;

public class add2Darrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        System.out.println("Enter "+r*c+" Elements: ");
        for(int i =0; i<r; i++){
            for(int j = 0; j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Number of Rows: ");
        int ro = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int co = sc.nextInt();
        int[][] arr2 = new int[ro][co];
        System.out.println("Enter "+ro*co+" Elements: ");
        for(int i =0; i<ro; i++){
            for(int j = 0; j<co;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[r][c];
        if(r!=ro || c!=co){
            System.out.println("Enter valid Input!!!");
            return;
        }else{
            for(int i = 0;i<r;i++){
                for(int j = 0;j<c;j++){
                    sum[i][j] = arr1[i][j] +arr2[i][j]; 
                }
            }
        }
        System.out.println("Sum is: ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(" "+sum[i][j]);
            }
            System.out.println(" ");
        }
    }
}
