package Practice3;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Enter password");

        String password = TextIO.getlnString();

        if (password.equals("dog"))
            System.out.println("Correct");
        else
            System.out.println("Not correct");
    }
}