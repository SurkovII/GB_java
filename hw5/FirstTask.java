package hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */
public class FirstTask {
    Scanner in = new Scanner(System.in);
    public HashMap<String, String> phoneList = phoneBook();

    public HashMap<String, String> phoneBook() {
        HashMap<String, String> hashMap = new HashMap<>();
        return hashMap;
    }
    public void openPhoneBook() {
        System.out.println("Выберите пункт меню: \n1. Добаить абонетнта \n2. Удалить абонента \n3. Найти номер \n4. Вывести все номера");
        Integer numMenu = in.nextInt();
        if (numMenu.equals(1)) {
            addAbon();
        }
        else if (numMenu.equals(2)) {
            delAbon();
        }
        else if (numMenu.equals(3)) {
            delAbon();
        }
        else if (numMenu.equals(4)) {
            printPhoneBook();
        }else{
            System.out.println("Неерный пнкт!");
        }
        
    }
    public void addAbon() {
        System.out.println("Ведите фамилию человека ");
        String name = in.next();
        System.out.println("Ведите телефон человека ");
        String phone = in.next();
        phoneList.put(name, phone);
        System.out.println("Абонент добален!");
        openPhoneBook();
    }
    public void delAbon() {
        System.out.println("Ведите фамилию человека, которого необходимо удалить ");
        String name = in.next();
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
            if (entry.getKey().equals(name)) {
                phoneList.remove(entry.getKey());
            }  
        }
        openPhoneBook();
    }
    public void printPhoneBook() {
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
             System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        openPhoneBook();
    }
}
