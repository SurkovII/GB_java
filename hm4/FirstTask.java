package hm4;
/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список. */

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    Integer num;
    Scanner in = new Scanner(System.in);
    LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList<Integer> newList = new LinkedList<>();
    public void reversList() {
        System.out.println("Введите колличество элементов");
        num = in.nextInt();
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            linkedList.add(random.nextInt(100));
            
        }
        System.out.println(linkedList);

        for (int i = linkedList.size()-1 ; i >= 0 ; i--) {
            newList.add(linkedList.get(i));
        }

        
        System.out.println(newList);


        
    }
    
}
