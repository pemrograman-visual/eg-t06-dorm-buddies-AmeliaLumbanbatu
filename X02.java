// 12S24025 - Paula Gevriella Tambunan
// 12S24031 - Amelia Renata Lumbanbatu

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];
        int a;

        a = 0;
        roomBuddies(name, a);
        a = func_input(name, a);
        output(name, a);
    }
    
    public static int func_input(String[] name, int p) {
        int a;

        a = 0;
        for (p = 0; p <= 3; p++) {
            name[p] = input.nextLine();
            if (name[p].equals("---")) {
                p = 10;
            } else {
                p = p;
                a = a + 1;
            }
        }
        
        return a;
    }
    
    public static void output(String[] name, int a) {
        int q;

        for (q = 0; q <= a - 1; q++) {
            System.out.println(name[q]);
        }
    }
    
    public static void roomBuddies(String[] name, int a) {
        int p;

        p = 0;
        for (p = 0; p <= 3; p++) {
            name[p] = "";
        }
    }
}

