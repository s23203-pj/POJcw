package _Zadania012stepik;

import java.util.Scanner;

public class Gwiazdy {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n < 0){
            n = s.nextInt();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if (j<=i) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= n; j++) {
                if (i>=j){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if (j>=i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= n; j++) {
                if (i<=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

