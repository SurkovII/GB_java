package hw5;
public class Main {
    public static void main(String[] args) {
        // FirstTask firstTask = new FirstTask();
        // firstTask.openPhoneBook();
        // SecondTask secondTask = new SecondTask();
        // secondTask.counter();
        // secondTask.sortCount();
        FourTask task = new FourTask(8);
        task.placeQueens(0);
        task.printBoard();
    }
    
}
