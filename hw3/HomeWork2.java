package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */
public class HomeWork2 {
    public void delEvenNum() {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 46, 25, 4, 6, 4, 1, 15, 10));
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) % 2 != 0) {
                result.add(list.get(index));
            }
        }
        System.out.println(result);
    }
}
