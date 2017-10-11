package Practice2;

public class Excercise2 {
    public static void main(String[] args) {

        System.out.println("Whats your first number?");

        int number1 = TextIO.getlnInt();

        System.out.println("Whats your second number?");

        int number2 = TextIO.getlnInt();
        System.out.println("The answer is " + number1 * number2);
    }
}

