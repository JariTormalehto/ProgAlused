package Practice6;

import Practice2.TextIO;

import java.util.Arrays;
import java.util.Random;

public class Excercise1 {
    public static void main(String[] args) {

        print10names();

    }

    private static void print10names() {

        System.out.println("How many names do you wish to add? ");


        String[] names = new String[TextIO.getlnInt()];

        for (int index = 0; index < names.length; index++) {

            System.out.println("Please enter a name: ");

            String name = TextIO.getlnString();

            names[index] = name;
        }
            System.out.println(Arrays.toString(names));


        System.out.println(names[new Random().nextInt(names.length)]);


        }

    }




