// Вычислить n-ое треугольного число 
// (сумма чисел от 1 до n), 
//n! (произведение чисел от 1 до n)
package Sem1.hw1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        in.close();
        int result = 0;
        int multi =1;
        while (n!=0) {
            result += n;
            multi *= n;
            n --; 
        }
        System.out.println(result);
        System.out.println(multi);

    }

}
