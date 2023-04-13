/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

import java.util.logging.*;
public class homeWork2 {
    int[] arr = new int[] {1, 32, 43, 56, 33, 7};       
    public StringBuilder stringBuilder(){
        int temp = 0;
        boolean isSorted = false;
        StringBuilder stringBuilder = new StringBuilder();
        Log log = new Log();
        ConsoleHandler ch = new ConsoleHandler();
        log.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        log.info("Запускаем цикл while ");
        while (!isSorted) {
            isSorted = true;
            log.info("Запускаем цикл for ");
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    log.info("Меняем местами ");
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        log.log(Level.WARNING, "Записыаем данные stringBuilder");
        for (int j = 0; j < arr.length; j++) {
            stringBuilder.append(arr[j] + " ");             
        }            
        return stringBuilder;
    }       
}
