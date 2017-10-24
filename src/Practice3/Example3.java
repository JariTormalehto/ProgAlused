package Practice3;

import ee.itcollege.ics0004.TextIO;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Enter age of a woman");

        int firstNumber = TextIO.getlnInt();

        System.out.println("Enter age of a man");

        int secondNumber = TextIO.getlnInt();

        int diff = Math.abs(firstNumber - secondNumber);

        if (5 <= diff && diff <= 10)
            System.out.println("Quite okay");

        else if (11 <= diff && diff <= 15)
            System.out.println("Not quite okay");

        else if (15 < diff)
            System.out.println("Not okay");

        else
            System.out.println("Very nice");
    }
}