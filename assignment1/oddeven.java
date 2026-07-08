package assignment1;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
         Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        input.close();
    }
}
