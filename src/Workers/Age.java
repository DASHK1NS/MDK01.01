package Workers;

import java.util.Random;

public class Age {
    public static int getRandomAge()
    {
        Random age = new Random();
        int maximum = 60;
        int minimum = 21;
        return (age.nextInt(maximum - minimum + 1) + minimum);
    }
}