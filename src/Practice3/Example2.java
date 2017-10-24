package Practice3;


    public class Example2 {
        public static void main(String[] args) {
            System.out.println("Enter your grade average");

            double firstNumber = TextIO.getlnDouble();

            System.out.println("Enter your thesis average");

            int secondNumber = TextIO.getlnInt();

            if (firstNumber < 4.5)
                System.out.println("Sorry Your average grade isn't high enough");
            else {
                if (secondNumber == 5)
                    System.out.println("Alright, you got your CUM LAUDE!");
                else
                    System.out.println("Sorry, your thesis grade wasn't high enough");
            }
        }
    }

