import java.util.logging.*;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Log logger = new Log();
        Scanner in = new Scanner(System.in);
        logger.info("Вводим знак выражения ");
        System.out.println("Input sign: ");
        char sign = in.next().charAt(0);
        logger.info("Вводим первое число выражения ");
        System.out.println("Input num1: ");
        int num1 = in.nextInt();
        logger.info("Вводим второе число выражения ");
        System.out.println("Input num2: ");
        int num2 = in.nextInt();
        float res = 0;
        logger.info("Проверяем знак. Выполняем операцию ");
        if (sign == '+') {
            res = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + res);
        }
        if (sign == '-') {
            res = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + res);
        }
        if (sign == '*') {
            res = num1 * num2;
            System.out.println(num1 + "*" + num2 + "=" + res);
        }
        if (sign == '/') {
            res = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + res);
        }
        in.close();
    }
}
