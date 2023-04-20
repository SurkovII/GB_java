package hm4;

import java.util.LinkedList;
import java.util.Scanner;

public class ThirdTask {
    LinkedList<Double> linkedList = new LinkedList<>();
    Scanner in = new Scanner(System.in);
    public void calc() {     
        String sign = "";
        System.out.println("Input num1: ");
        Double num1 = in.nextDouble();
        do { 
            System.out.println("Input sign: ");
            sign = in.next();
            if (sign.equals("Q")) {
                break;
            }
            System.out.println("Input num2: ");
            Double num2 = in.nextDouble();                   
                if (sign.equals("+")) {
                    num1 = num1 + num2;
                    linkedList.add(num1);
                }
                else if (sign.equals("-")) {
                    num1 = num1 - num2;
                    linkedList.add(num1);
                }
                else if (sign.equals("*")) {
                    num1 = num1 * num2;
                    linkedList.add(num1);
                }
                else if (sign.equals("/")) {
                    num1 = num1 / num2;
                    linkedList.add(num1);
                }
                System.out.println(linkedList);
        } while (!sign.equals("Q"));
        System.out.println(linkedList.get(linkedList.size()-2));
    }
    
}
