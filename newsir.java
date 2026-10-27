// import java.util.Scanner;

// public class newsir {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the value of n:");
//         int n = sc.nextInt();

//         int sum = 0;
//         int product = 1;

//         while (n > 0) {
//             int digit = n % 10;

//             sum += digit;
//             product *= digit;

//             n /= 10;
//         }

//         if (sum == product) {
//             System.out.println("Sum and product are equal");
//         } else {
//             System.out.println("Not equal");
//         }
//     }
// }

import java.util.Scanner;
import java.math.BigInteger;

public class kunal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter the value of firstNum: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter the value of secondNum: ");
        int secondNum = sc.nextInt();

        // Addition
        int ans = firstNum + secondNum;

        System.out.println("Answer is: " + ans);
