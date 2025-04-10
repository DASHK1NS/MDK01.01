package Sorting;

public class Sorting {
    int[] sortArr;
    private int arElement;

    public Sorting(int lenght)
    {
        sortArr = new int[lenght];
        arElement = 0;
    }
    public void add(int newNum)
    {
        if (arElement >= sortArr.length)
        {
            display();
            System.out.println("Ошибка: элемент " + newNum + " не влез в массив");
            System.exit(0);
        }

        sortArr[arElement] = newNum;
        arElement++;
    }

    public void bubble()
    {
        for (int i = sortArr.length - 1; i >= 1; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (sortArr[j] > sortArr[j + 1])
                {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
        System.out.println();
    }
}
