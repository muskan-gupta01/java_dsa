import java.util.Scanner;
import java.math.BigInteger;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter the value of firstNum: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter the value of secondNum: ");
        int secondNum = sc.nextInt();

        System.out.print("Enter the value of thirdNum: ");
        int thirdNum = sc.nextInt();

        // Addition
        int ans = firstNum + secondNum + thirdNum;

        System.out.println("Answer is: " + ans);


        // ATM Withdrawal
        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            if (amount <= balance) {
                System.out.println("Withdrawal Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid Amount");
        }

        // Even Odd Numbers
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num > 0) {

        if (num % 2 == 0) {
        System.out.println("Positive Even");
        } else {
            System.out.println("Positive Odd");
        }

    } else {
        System.out.println("Number is not positive");
    }

    
    }
    
}