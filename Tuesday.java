import java.util.Scanner;

public class Tuesday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // // Q1. Number Classification
        // System.out.print("Enter a number: ");
        // int n1 = sc.nextInt();

        // if (n1 > 0) {
        //     System.out.println("Positive");
        // } else if (n1 < 0) {
        //     System.out.println("Negative");
        // } else {
        //     System.out.println("Zero");
        // }


        // Q2. Divisibility Check 3 or 5
        // System.out.print("Enter a number: ");
        // int n2 = sc.nextInt();

        // if (n2 % 3 == 0 && n2 % 5 == 0) {
        //     System.out.println("Divisible by both 3 and 5");
        // } else {
        //     System.out.println("Not divisible by both");
        // }


        // // Q3. Largest of Three Numbers
        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.print("Enter third number: ");
        // int c = sc.nextInt();

        // if (a > b) {
        //     if (a > c) {
        //         System.out.println("Largest: " + a);
        //     } else {
        //         System.out.println("Largest: " + c);
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println("Largest: " + b);
        //     } else {
        //         System.out.println("Largest: " + c);
        //     }
        // }


        // // Q4. Student Result
        // System.out.print("Enter marks: ");
        // int marks = sc.nextInt();

        // if (marks < 40) {
        //     System.out.println("Fail");
        // } else {
        //     if (marks >= 75) {
        //         System.out.println("Distinction");
        //     } else {
        //         System.out.println("Regular Pass");
        //     }
        // }


        // // Q5. Even/Odd and Positive/Negative
        // System.out.print("Enter a number: ");
        // int n3 = sc.nextInt();

        // if (n3 > 0) {
        //     if (n3 % 2 == 0) {
        //         System.out.println("Positive Even");
        //     } else {
        //         System.out.println("Positive Odd");
        //     }
        // } else if (n3 < 0) {
        //     if (n3 % 2 == 0) {
        //         System.out.println("Negative Even");
        //     } else {
        //         System.out.println("Negative Odd");
        //     }
        // } else {
        //     System.out.println("Zero");
        // }


        // // Q6. Grade Calculator
        // System.out.print("Enter marks: ");
        // int marks2 = sc.nextInt();

        // if (marks2 >= 90 && marks2 <= 100) {
        //     System.out.println("Grade A");
        // } else if (marks2 >= 80) {
        //     System.out.println("Grade B");
        // } else if (marks2 >= 70) {
        //     System.out.println("Grade C");
        // } else if (marks2 >= 60) {
        //     System.out.println("Grade D");
        // } else {
        //     System.out.println("Grade F");
        // }


        // // Q7. Print Numbers Divisible by 3 and 5 loop
        // System.out.println("Numbers divisible by both 3 and 5:");

        // for (int i = 1; i <= 50; i++) {
        //     if (i % 3 == 0 && i % 5 == 0) {
        //         System.out.println(i);
        //     }
        // }


        // // Q8. Sum of Even Numbers
        // int sum = 0;

        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         sum = sum + i;
        //     }
        // }
        // System.out.println("Sum of even numbers: " + sum);


        // // Q9. Count Positive, Negative and Zero
        // int[] arr = {10, -5, 8, -2, 0, 15, -7};

        // int positive = 0;
        // int negative = 0;
        // int zero = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > 0) {
        //         positive++;
        //     } else if (arr[i] < 0) {
        //         negative++;
        //     } else {
        //         zero++;
        //     }
        // }

        // System.out.println("Positive: " + positive);
        // System.out.println("Negative: " + negative);
        // System.out.println("Zero: " + zero);


        // // Q10. Multiplication Tables
        // for (int i = 1; i <= 6; i++) {

        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println(i + " x " + j + " = " + (i * j));
        //     }

        //     System.out.println();
        // }

        // // Q11. Factorial
        // System.out.print("Enter a number: ");
        // int n4 = sc.nextInt();

        // int factorial = 1;
        // int i = 1;

        // while (i <= n4) {
        //     factorial = factorial * i;
        //     i++;
        // }
        // System.out.println("Factorial: " + factorial);

        // for (int i =1; i<=n4; i++){
        //     factorial = factorial *i;
        // }
        // System.out.println(factorial);


        // // Q12. Count Digits
        // System.out.print("Enter a number: ");
        // int n5 = sc.nextInt();

        int count = 0;

        // while (n5 != 0) {
        //     n5 = n5 / 10;
        //     count++;
        // }
        // System.out.println("Number of digits: " + count);

        // for (; n5!=0; n5=n5/10) {
        //     count++;
        // }
        // System.out.println(count);


        // Q13. Reverse a Number
        // System.out.print("Enter a number: ");
        // int n6 = sc.nextInt();

        // int reverse = 0;

        // while (n6 != 0) {
        //     int digit = n6 % 10;
        //     reverse = reverse * 10 + digit;
        //     n6 = n6 / 10;
        // }

        // System.out.println("Reverse: " + reverse);

        

        // // Q14. Palindrome Number
        // System.out.print("Enter a number: ");
        // int n7 = sc.nextInt();

        // int original = n7;
        // int reversed = 0;

        // while (n7 != 0) {
        //     int digit = n7 % 10;
        //     reversed = reversed * 10 + digit;
        //     n7 = n7 / 10;
        // }

        // if (original == reversed) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }


        // sc.close();
    }
}