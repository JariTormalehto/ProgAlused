package Practice2;

public class Excercise1 {
    public static void main(String[] args) {

        System.out.println("What's your name?");


        String name = TextIO.getlnString();

        System.out.println("What's your shoe size?");

        int shoeSize = TextIO.getlnInt();

        System.out.println("Your name is " + name + " and your shoe size is " + shoeSize);
}
}