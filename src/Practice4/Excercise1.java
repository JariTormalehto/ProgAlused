package Practice4;

import Practice2.TextIO;

public class Excercise1 {
    public static void main(String[] args) {
            /*EXCERCISE1 */
        for (int i=10; i > 0; i--){

            System.out.println(i + " ");
        }
            /*EXCERCISE2 */
        for (int i=0; i < 10; i++) {
            if(0 == i % 2)
            System.out.println(i + " ");
        }
            /*EXCERCISE3 */
        for (int i=30; i >= 0; i--){
            if(0 == i % 3)
                System.out.println(i + " ");
        }
        System.out.println("Please input the size of the table:");
        int input = TextIO.getlnInt();
        for (int i=0; i >= input; i++){
            System.out.print(i + " ");
            for (int j=0; j >= input; j++){
                System.out.print(j + " ");
            }
        }

    }
}
