package Massiv100;

import java.util.Random;


public class Array {
    private static int[] array;
    private static int size;

    public Array(int capacity)
    {
        array = new int[capacity];
        size = 0;
    }

    public static void fillArray()
    {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(101); // случайные числа от 0 до 100
        }
        size = array.length; // установление текущего размера массива
    }

    public void printArray() {
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean searchElement(int element)
    {
        for (int i = 0; i < size; i++)
        {
            if (array[i] == element)
            {
                return true; // элемент найден
            }
        }
        return false; // элемент не найден
    }

    public void removeElement(int element)
    {
        int index = -1;
        for (int i = 0; i < size; i++)
        {
            if (array[i] == element)
            {
                index = i;
                break;
            }
        }

        if (index != -1)
        {
            // сдвиг элементов
            for (int i = index; i < size - 1; i++)
            {
                array[i] = array[i + 1];
            }
            size--; // уменьшение размера массива
            System.out.println("Элемент " + element + " удален");
        } else {
            System.out.println("элемент " + element + " не найден");
        }
    }
}
