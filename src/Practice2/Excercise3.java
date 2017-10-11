package Practice2;

public class Excercise3 {
    public static void main(String[] args) {

        System.out.println("What's the number of the people attending?");

        int people = TextIO.getlnInt();

        System.out.println("What's the size of the groups?");

        int people2 = TextIO.getlnInt();

        double a = people / people2;

        System.out.println("You get " + a + " groups");
    }
}
