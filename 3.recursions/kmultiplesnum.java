

import java.util.Scanner;

public class kmultiplesnum {
    static int seriesalternativesum(int num){
        if(num==0) return 0;
        else if(num%2==0){
            return seriesalternativesum(num-1) - num;
        }
        else{
            return seriesalternativesum(num-1)+num;
        }
    }
    static void kmultsum(int k, int num){
        if(k==1){
            System.out.println( num);
            return;
        }
        kmultsum(k-1, num);
        System.out.println(num*k); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k and num :  ");
        int k = sc.nextInt();
        int num = sc.nextInt();
        kmultsum(k, num);
        System.out.print("Series alternate sign sum:"+seriesalternativesum(num));
    }
}
