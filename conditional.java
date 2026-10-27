public class conditional {
    public static void main(String[] args) {

        // 1. Daily Practice Hours
        int dailyPractice_hours = 12;

        if (dailyPractice_hours >= 10) {
            System.out.println("Going in a good direction!");
        }


        // 2. Age - Driving
        int age1 = 19;

        if (age1 >= 18) {
            System.out.println("You can drive");
        }


        // 3. Marks
        int marks1 = 70;

        if (marks1 >= 80) {
            System.out.println("You got a good score!");
        } else {
            System.out.println("Wrong");
        }


        // 4. Positive or Negative
        int num = -7;

        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }


        // 5. Even Number
        int n = 8;

        if (n % 2 == 0) {
            System.out.println("Even");
        }


        // 6. Greater Number
        int a = 15;
        int b = 25;

        if (a > b) {
            System.out.println("a is greater than b");
        }


        // 7. Eligibility based on Age and Marks
        int age2 = 20;
        int marks2 = 50;

        if (age2 >= 18) {

            if (marks2 >= 60) {
                System.out.println("Eligible");
            } else {
                System.out.println("Marks kam hain");
            }

        } else {
            System.out.println("Age kam hai");
        }


        // 8. Voting Eligibility / Senior Citizen
        int age3 = 25;

        if (age3 >= 18) {

            if (age3 < 60) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are a senior citizen");
            }

        } else {
            System.out.println("Not eligible to vote");
        }
    }
}