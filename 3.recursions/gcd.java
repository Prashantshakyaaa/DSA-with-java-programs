

import java.util.Scanner;

public class gcd {
    static int igcd(int x, int y){
        if(y == 0) return x;
        return igcd(y, x%y);
    }
    static int gcd1(int x, int y){
        while(x%y!=0){
            int rem =x%y;
            x = y;
            y = rem;
        }return y;
    }
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.print("Enter two values (x and y): ");
        int x = p.nextInt();
        int y = p.nextInt();
        System.out.println(gcd1(x,y));
        System.out.println(igcd(x,y));
    }
}
