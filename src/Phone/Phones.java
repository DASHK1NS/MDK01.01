package Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Phones {
    private String serialNumber;
    private String model;
    private double weight;
    private double price;

    public Phones(String serialNumber, String model, double weight, double price)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString()
    { //вывод хар-ик телефонов
        return "Телефон {" +
                "Серийный номер = '" + serialNumber + '\'' +
                ", Модель = '" + model + '\'' +
                ", Вес = " + String.format("%.0f", weight) + "g" +
                ", Цена = " + String.format("%.0f", price) + "$" +
                '}';
    }

    public double getWeight() { //возвращение веса
        return weight;
    }

    public double getPrice() { //возвращение цены
        return price;
    }

    public static List<Phones> generateRandomPhones(int count) //создание списка для хранения телефонов
    {
        List<Phones> phones = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++)
        {
            String serialNumber = "SN" + String.format("%07d", random.nextInt(10000));
            String model = "model" + (i + 1);
            double weight = 100 + (random.nextDouble() * 300);
            double price = 50 + (random.nextDouble() * 600);

            phones.add(new Phones(serialNumber, model, weight, price));
        }
        return phones;
    }
}
