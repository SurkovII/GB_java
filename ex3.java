// Реализовать простой калькулятор
package Sem1.hw1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input calc: ");
        String s = in.nextLine().replace(" ", "");
        in.close();
        int x = -1;
        int num1;
        int num2 = 0;
        float res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                x = s.indexOf("+");
                num1 = Integer.valueOf(s.substring(0, x));
                num2 = Integer.valueOf(s.substring(x+1, s.length()));
                res = (num1 + num2);
            } 
            if (s.charAt(i) == '-') {
                x = s.indexOf("-");
                num1 = Integer.valueOf(s.substring(0, x));
                num2 = Integer.valueOf(s.substring(x+1, s.length()));
                res = (num1 - num2);

            } 
            if (s.charAt(i) == '*') {
                x = s.indexOf("*");
                num1 = Integer.valueOf(s.substring(0, x));
                num2 = Integer.valueOf(s.substring(x+1, s.length()));
                res = (num1 * num2);

            }
            if (s.charAt(i) == '/') {
                x = s.indexOf("/");
                num1 = Integer.valueOf(s.substring(0, x));
                num2 = Integer.valueOf(s.substring(x+1, s.length()));
                res = (num1 / num2);

            }  
        }
        System.out.println(res);

    }
    
}
