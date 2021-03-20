package _Zadania012stepik;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String slowo;
        char[] znak = new char[100];

        slowo = in.nextLine();

        for (int i = 0; i < slowo.length(); i++)
        {
            znak[i] = slowo.charAt(i);
        }

        boolean x = true;
        for (int i = 0; i < slowo.length() / 2; i++)
        {
            if (znak[i] != znak[slowo.length() - i - 1])
            {
                x = false;
                break;
            }
        }
        if (x)
        {
            System.out.println("TAK");

        } else {

            System.out.println("NIE");
        }
    }
}


