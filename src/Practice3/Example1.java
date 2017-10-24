package Practice3;


public class Example1 {

    public static void main(String[] args) {

        System.out.print("number :");

        int Number = TextIO.getlnInt();

        if (Number % 2 == 0)
            System.out.println("This number is even");
        else
            System.out.println("This number is odd");
    }
}

