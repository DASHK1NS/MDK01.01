package Phone;

import java.util.Comparator;
import java.util.List;

public class Applicat {
    public static void main(String[] args)
    {
        List<Phones> phones = Phones.generateRandomPhones(30);

        phones.sort(Comparator.comparingDouble(Phones::getPrice));
        System.out.println("Сортировка по цене: ");
        for (Phones phone : phones)
        {
            System.out.println(phone);
        }

        phones.sort(Comparator.comparingDouble(Phones::getWeight));
        System.out.println("Сортировка по весу: ");
        for (Phones phone : phones)
        {
            System.out.println(phone);
        }
    }
}
