package hm4;
/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Scanner;

public class SecondTask {
    String string;
    Scanner in = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();
    
    
    public void enqueue() {
        do{ 
            System.out.println("Введите добавляемый элемент, или Q, для выхода ");
            string = in.next();
            linkedList.add(string);
            System.out.println(linkedList);
            
        } while (!string.equals("Q")); 
    }
    public void dequeue() {
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("1");
        linkedList2.add("2");
        linkedList2.add("3");

        System.out.println(linkedList2);
        System.out.println(linkedList2.get(0));
        linkedList2.remove(0);
        System.out.println(linkedList2);
    }
    public void first() {
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("1");
        linkedList3.add("2");
        linkedList3.add("3");
        System.out.println(linkedList3.get(0));
}
}
