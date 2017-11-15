package Practice7;

import Practice2.TextIO;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<TEX1> humansList = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a name, press enter to exit");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {

                System.out.println("Please enter the age");
                int age = TextIO.getlnInt();
                humansList.add(new TEX1(input, age));
            }

            }
            for (TEX1 person : humansList) {
                person.greet();
        }
    }
}

