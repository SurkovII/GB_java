package hw3;
/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork3 {
    int minNum = 0;
    int maxNum = 0;
    int summ = 0;
    double aver;
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(12, 6, 4, 1, 15, 10));
    public void searchMax() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxNum < arrayList.get(i)) {
                maxNum = arrayList.get(i); 
            }            
        }
    System.out.println(maxNum);
    }
    public void searchMin() {
        minNum = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (minNum > arrayList.get(i)) {
                minNum = arrayList.get(i); 
            }            
        }
    System.out.println(minNum);
    }
    public void average() {
        for (int i = 0; i < arrayList.size(); i++) {
           summ += arrayList.get(i);
           aver = summ / arrayList.size();
        }
    System.out.println(aver);
    } 
}
