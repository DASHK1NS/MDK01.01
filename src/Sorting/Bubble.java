package Sorting;

public class Bubble {
    public static void main(String[] args)
    {
        Sorting one = new Sorting(10);
        one.add(10);
        one.add(6);
        one.add(2);
        one.add(7);
        one.add(3);
        one.add(1);
        one.add(9);
        one.add(5);
        one.add(8);
        one.add(4);
        one.display();
        one.bubble();
        one.display();
    }
}
