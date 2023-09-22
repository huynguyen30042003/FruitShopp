package Common;

import java.util.Scanner;

public class Library {
    public static String validString(String promt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promt + ":");
        String Str = sc.nextLine();
        sc.close();
        return Str;
    }
    public static int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
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
        sc.close();
        return a;
    }


}
