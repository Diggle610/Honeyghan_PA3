import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class caiRandom {
    public static int quest() {
        SecureRandom rando = new SecureRandom();

        int rando_int1 = rando.nextInt(10);
        int rando_int2 = rando.nextInt(10);

        System.out.println("How much is " + rando_int1 + " times " + rando_int1 + "?");

        return rando_int1 * rando_int2;
    }

    public static void main(String args[]) {
        Random rand = new Random();
        int rand_int = rand.nextInt();


        System.out.println("Choose the difficulty level");

        System.out.println("Level 1");

        System.out.println("Level 2");

        System.out.println("Level 3");

        System.out.println("Level 4");

        Scanner scnr = new Scanner(System.in);

        int level = scnr.nextInt();

        System.out.println("Type of Arithmatic");


        System.out.println("Addition 1");

        System.out.println("Multiplication 2");

        System.out.println("Subtraction 3");

        System.out.println("Division 4");

        System.out.println("Mixer of all 5");

        int type_ar = scnr.nextInt();


        int userNum, num;

        while (true) {

            int count = 10;

            int countR = 0, countW = 0;

            while (count > 0) {

                num = quest();

                count--;

                userNum = scnr.nextInt();

                if (userNum == num) {
                    countR++;
                    switch (rand_int) {

                        case 1:

                            System.out.println("Very good!");

                            break;

                        case 2:

                            System.out.println("Excellent!");

                            break;

                        case 3:

                            System.out.println("Nice work!");

                            break;

                        case 4:

                            System.out.println("Keep up the good work!");

                            break;

                    }

                } else {

                    countW++;
                    switch(rand_int){

                        case 1:

                            System.out.println("No. Please try again.");

                            break;

                        case 2:

                            System.out.println("Wrong. Try once more.");

                            break;

                        case 3:

                            System.out.println("Don’t give up!");

                            break;

                        case 4:

                            System.out.println("No. Keep trying.");

                            break;

                    }

                }

            }

            if ((countR / 10.0) < 0.75) {

                System.out.println("Please ask your teacher for extra help.");

            } else {

                System.out.println("Congratulations, you are ready to go to the next level!");

            }

        }
    }
}
