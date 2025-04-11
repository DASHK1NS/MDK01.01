package Workers;

import java.util.Random;

public class Array {

    public static String arrCompany()
    {
        String[] arrCompany = new  String[10];
        arrCompany[0] = "Apple";
        arrCompany[1] = "Google";
        arrCompany[2] = "Sony";
        arrCompany[3] = "Nike";
        arrCompany[4] = "Amazon";
        arrCompany[5] = "Asus";
        arrCompany[6] = "Intel";
        arrCompany[7] = "Samsung";
        arrCompany[8] = "Toyota";
        arrCompany[9] = "Microsoft";
        Random rand = new Random();

        return (arrCompany[rand.nextInt(arrCompany.length)]);
    }

    public static String arrName()
    {
        String[] arrName = new String[10];
        arrName[0] = "Emma";
        arrName[1] = "Alice";
        arrName[2] = "Sofya";
        arrName[3] = "Dmitry";
        arrName[4] = "Sergey";
        arrName[5] = "Daria";
        arrName[6] = "Mikhail";
        arrName[7] = "Mary";
        arrName[8] = "Viktor";
        arrName[9] = "Galina";
        Random rand = new Random();

        return (arrName[rand.nextInt(arrName.length)]);
    }
}
