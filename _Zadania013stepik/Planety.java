package _Zadania013stepik;

import java.util.Scanner;

public class Planety {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final long sekundyNaZiemi = 31_557_600;
        long sekundy = in.nextLong();
        String planet = in.next();
        double lata = 0.0;

        switch (planet) {
            case "Ziemia" :
                lata = (double) sekundy / sekundyNaZiemi;
                break;
            case "Merkury" :
                lata = sekundy / (sekundyNaZiemi * 0.240_846_7);
                break;
            case "Wenus" :
                lata = sekundy / (sekundyNaZiemi * 0.615_197_26);
                break;
            case "Mars" :
                lata = sekundy / (sekundyNaZiemi * 1.880_815_8);
                break;
            case "Jowisz" :
                lata = sekundy / (sekundyNaZiemi * 11.862_615);
                break;
            case "Saturn" :
                lata = sekundy / (sekundyNaZiemi * 29.447_498);
                break;
            case "Uran" :
                lata = sekundy / (sekundyNaZiemi * 84.016_846);
                break;
            case "Neptun" :
                lata = sekundy / (sekundyNaZiemi * 164.791_32);
                break;
            default:
                break;
        }
        System.out.printf("%.2f", lata);
    }
}


