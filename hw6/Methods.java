package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    Scanner in = new Scanner(System.in);
    private List<NoteBook> listNotebook = new ArrayList<>();
    public Methods addNotebook(NoteBook noteBook){
        listNotebook.add(noteBook);
        return this;
    }
    public List<NoteBook>getList(){
        return listNotebook;
    }
    public void printListNotebook(){
        for (NoteBook noteBook : listNotebook) {
            System.out.println(noteBook.toString());
        }
    }
    public void searchNotebookInt(int searchList, Object value) {
        for (int i = 0; i < listNotebook.size(); i++) {
            if (listNotebook.get(i).getListFilters().get(searchList-1).equals(value)) {
                System.out.println(listNotebook.get(i));
                
            }
        }
    }
    public void searchNotebookString(int searchList, Object value) {
        for (int i = 0; i < listNotebook.size(); i++) {
            if (listNotebook.get(i).getListFilters().get(searchList-1).equals(value)) {
                System.out.println(listNotebook.get(i));
            }
        }
    }
}
