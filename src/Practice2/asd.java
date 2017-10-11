package Practice2;

public class asd {
    public static void main(String[] args) {

        System.out.println("What's the number of the people attending?");

        int people = TextIO.getlnInt();

        System.out.println("What's the size of the groups?");

        int people2 = TextIO.getlnInt();

        int fullgroups = people / people2;

        int leftover = people % people2;

        System.out.format("You get %d groups and %d people are left over", fullgroups, leftover);
    }
}
