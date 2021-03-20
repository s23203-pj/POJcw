package _Zadania012stepik;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int num1;
        int num2;
        int wynik;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();

        wynik=num1+num2;
        System.out.println("Dodawanie: "+num1+" + "+num2+" = " +wynik);
        wynik=num1-num2;
        System.out.println("Odejmowanie: "+num1+" - "+num2+" = "+wynik);
        wynik=num1*num2;
        System.out.println("Mnożenie: "+num1+" * "+num2+" = "+wynik);
        wynik=num1%num2;
        System.out.println("Dzielenie modulo: "+num1+" mod "+num2+" = "+wynik);
    }
}


