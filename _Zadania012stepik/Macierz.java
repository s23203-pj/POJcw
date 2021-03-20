package _Zadania012stepik;

import java.util.Scanner;

public class Macierz {

    public static void main(String args[]) {
        try{
            int i;
            int j;
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int y = s.nextInt();
            int matrix[][] = new int[x][y];
            for (i=0; i<x; i++)
            {
                for (j=0; j<y; j++)
                {
                    matrix[i][j] = s.nextInt();
                }
            }
            for (i=0; i<y; i++)
            {
                for (j=0; j<x; j++)
                {
                    if(j >= 5)
                    {
                        System.out.print(matrix[j][i]);

                    }else{

                        System.out.print(matrix[j][i] + " ");
                    }

                }
                System.out.println("");
            }
        }
        catch(Exception e) {
            System.out.printf("BŁĄD");
        }
    }
}


