package _Zadania013stepik;

public class Pangram {

    public static boolean sprPangram(String str)
    {

        boolean[] znak = new boolean[26];

        int ind = 0;

        for (int i = 0; i < str.length(); i++) {

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                ind = str.charAt(i) - 'A';

            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                ind = str.charAt(i) - 'a';

            else
                continue;
            znak[ind] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (znak[i] == false)
                return (false);

        return (true);
    }

    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog";

        if (sprPangram(str) == true)
            System.out.print("true");

    }
}


