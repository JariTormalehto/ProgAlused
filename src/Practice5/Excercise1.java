package Practice5;

import Practice2.TextIO;

public class Excercise1 {
    public static void main(String[] args) {
     //   drawTable(11);

        // drawTable(13);

       // System.out.println(xCharacters('c', 5) + " " + xCharacters( 'j', 10)) ;

        System.out.println(getNumber("Please insert a number: ",2,5));
        System.out.println(getNumber("Palun sisestage number: ",2,5));
    }
    public static int getNumber(String message, int min, int max) {
        System.out.println(message);
    while(true) {
        int number = TextIO.getlnInt();

        if(number < min)
            System.out.println("Sorry your number wasnt viable");


        else if (number > max)
            System.out.println("Thats not what I asked for, give me another number!");
        else
            return number;

        }
    }

    private static String xCharacters(char inputCharacter, int timeRepeated) {
        String result = "";

        for(int start = 0; start < timeRepeated; start++){

                result += inputCharacter;
        }
        return result;
    }

    private static void drawTable(int linestart) {
        int input = 8;

        drawLine(input);
        System.out.println();

        for (int row = 0; row <= input; row++) {
            System.out.print("I ");
            for (int column = 0; column <= input; column++) {
                if (row == column || row + column == input)
                    System.out.print("x ");

                else
                    System.out.print(0 + " ");
            }

            System.out.println("I ");


        }

        drawLine(input);
    }

    private static void drawLine(int input) {
        int lineStart = 0;

        while (lineStart <= input + 2){
            System.out.print("--");
            lineStart++;
        }
    }
}
