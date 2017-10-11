package Practice2;

public class Excercise4 {
    public static void main(String[] args) {

        System.out.println("What's your name?");

        String name = TextIO.getlnString();

        int nameLength = name.length();

        System.out.println("There are " + nameLength + " letters in your name");
    }
}
