package Common;

import java.util.Scanner;

public class Library {
    public static String validString(String promt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promt.trim() + ": ");
        String Str = sc.nextLine();
        return Str;
    }

    public static int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt.trim() + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

}
