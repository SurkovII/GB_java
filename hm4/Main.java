package hm4;

public class Main {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        firstTask.reversList();
        SecondTask secondTask = new SecondTask();
        secondTask.enqueue();
        secondTask.dequeue();
        secondTask.first();
        ThirdTask thirdTask = new ThirdTask();
        thirdTask.calc();
    }
    
}
