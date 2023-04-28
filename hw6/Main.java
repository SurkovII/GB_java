package hw6;

import java.util.Scanner;

/*

Подумать над структурой класса Ноутбук для магазина техники — выделить поля 
и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий 
(или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных 
критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и 
вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        Methods methods = new Methods();
        methods.addNotebook(new NoteBook( 16, 1024, "Windows", "black", "Dell"));
        methods.addNotebook(new NoteBook( 8, 512, "MacOs", "white", "Apple"));
        methods.addNotebook(new NoteBook( 32, 512, "Windows", "grey", "HP"));
        methods.addNotebook(new NoteBook( 16, 1024, "Windows", "black", "Lenovo"));
        methods.addNotebook(new NoteBook( 16, 512, "Windows", "grey","Acer"));
        methods.addNotebook(new NoteBook( 32, 1024, "Windows", "white","Asus"));
    

        methods.getList();
        methods.printListNotebook();
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - Объём ЖД\n3 - Операционная система\n4 - Цвет\n5 - Произодитель");
        int choise = in.nextInt();
        String searhFilter = "";
        int value = 0;
        if (choise == 1 || choise == 2 ) {
            System.out.println("Введите параметр для поиска: ");
            value = in.nextInt();
            } else if (choise == 3 || choise == 4 || choise == 5 ) {
                System.out.println("Введите параметр для поиска: ");
                searhFilter = in.next();
        } else {
            System.out.println("Введено неверное число! Поторите ввод! ");
            
        }
        methods.searchNotebookInt(choise, value);
        methods.searchNotebookString(choise, searhFilter);
        in.close();

    }
}
