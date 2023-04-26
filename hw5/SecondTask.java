package hw5;
/*    Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся 
имена с количеством повторений. 
Отсортировать по убыванию популярности. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SecondTask {
    ArrayList<String> peopls = new ArrayList<>(Arrays.asList("Иван Иванов",
    "Светлана Петрова",
    "Кристина Белова",
    "Анна Мусина",
    "Анна Крутова",
    "Иван Юрин",
    "Петр Лыков",
    "Павел Чернов",
    "Петр Чернышов",
    "Мария Федорова",
    "Марина Светлова",
    "Мария Савина",
    "Мария Рыкова",
    "Марина Лугова",
    "Анна Владимирова",
    "Иван Мечников",
    "Петр Петин",
    "Иван Ежов"));   

    public HashMap<String, Integer> nameCount = new HashMap<>();

    public void counter() {
        for (int i = 0; i < peopls.size(); i++) {
            Integer count =1;
            String name = peopls.get(i).split(" ")[0];
            for (int j = 1; j < peopls.size(); j++) {
                String secondName = peopls.get(j).split(" ")[0];
                if (name.equals(secondName)) {
                    count++;
                }
            }
            if (!nameCount.containsKey(name)) {
                nameCount.put(name, count);
            }
        }
        System.out.println(nameCount);
    }
    
    public void sortCount() {
        List<Map.Entry<String, Integer>> list = nameCount.entrySet().stream()
        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList());
        System.out.println(list);
    }
}

