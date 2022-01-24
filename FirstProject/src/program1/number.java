package program1;
import java.util.Scanner;
public class number {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    //Use Ternary Operator to check
    String check = (num % 2 == 0) ? "even" : "odd";

    System.out.println("The entered number "+ num + " is: " + check);
    }

}
