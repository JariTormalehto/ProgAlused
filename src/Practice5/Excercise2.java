package Practice5;

import Practice2.TextIO;

public class Excercise2 {
    public static void main(String[] args) {
        reverseNumberArray();
    }
    private static void reverseNumberArray() {

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Give me 10 numbers ");
            numbers[index] = TextIO.getlnInt();
        }
        for (int index = numbers.length -1; index >= 0; index--) {
            System.out.println(numbers[index]);
        }
    }
}
