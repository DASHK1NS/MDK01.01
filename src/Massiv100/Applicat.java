package Massiv100;

import java.util.Scanner;

public class Applicat {
    public static void main(String[] args)
    {
        Array arrayManager = new Array(100);
        Array.fillArray();

        System.out.println("Сгенерированный массив: ");
        arrayManager.printArray();

        Scanner scanner = new Scanner(System.in);

        // Поиск элемента
        System.out.print("Ведите элемент для поиска: ");
        int searchElement = scanner.nextInt();
        if (arrayManager.searchElement(searchElement))
        {
            System.out.println("Элемент " + searchElement + " найден");
        } else {
            System.out.println("Элемент " + searchElement + " не найден");
        }

        // Удаление элемента
        System.out.print("Введите элемент для удаления: ");
        int removeElement = scanner.nextInt();
        arrayManager.removeElement(removeElement);

        // Вывод массива после удаления
        System.out.println("Массив после удаления: ");
        arrayManager.printArray();

        scanner.close();
    }
}
