package Practice7;

import Practice2.TextIO;

import java.util.ArrayList;

public class Excercise2 {
    public static void main(String[] args) {
        ArrayList<Athlete> humansList = new ArrayList<>();

        while (true) {
            System.out.println(("Please enter a name, press enter to exit"));

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {
                System.out.println("Please enter the result");

                String[] inputArray = input.split(" ");

                double result = Double.parseDouble(inputArray[1]);
                humansList.add(new Athlete(inputArray[0], Double.parseDouble[1]);
            }
        }
        for (Athlete person : humansList) {

            System.out.println(person.getName() + " " + person.getResult());

        }
    }
}
