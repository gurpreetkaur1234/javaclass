import java.util.Scanner;

public class loopassignment {
    public static void main(String[] args) {

// find factorial of a number using for loop-->

      /*  int n;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want factorial of a number");
        String yes = sc.next();

        System.out.println("Please enter a number here");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            factorial= factorial*i;
         // System.out.println(factorial); -->just for debugging
        }
        System.out.println("The factorial of number is "+ factorial);

       */


//Write a program to calculate the sum of first 10 natural number-->

     /*  int i;
       int sum =0;
        for (i=1;i<=10;i++){
            sum= sum+i;
        }
System.out.println(" The total is "+ sum);

      */


//prbm 3  Write a program that prompts the user to input an integer and then
//        outputs the number with the digits reversed. For example, if the input is
//        12345, the output should be 54321--->

      /*  int number=12345 ;
        int reversedNumber = 0;
        int reminder;
       //Scanner sc = new Scanner(System.in);
      // System.out.println("Please enter the number");
       // number = sc.nextInt();

        for (int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed number is " + reversedNumber);

       */


// prbm 4 -->Write a program that read the set of integers and print sum of even and odd integers


     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a set of integers separated by spaces: ");
        String input = sc.next();
        String[] token = input.split(" ");
        int sumEven = 0;
        int sumOdd = 0;


        for (String element : token) {
            int num = Integer.parseInt(token);

            if (num % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;

            }
        }


        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

      */


// prbm 5--> Write a program to keep asking for a number until you enter a negative
//           number. At the end, print the sum of all entered numbers.


       /* Scanner sc = new Scanner(System.in);
        int x = 0;
        int sum = 0;

        while (x >= 0) {
            System.out.println("Please enter the number");
            x = sc.nextInt();

            if (x >= 0) {
                sum = sum + x;


            }
        }
        System.out.println("the sum is " + sum);

        */


// prbm 6--> Using while loop print the following pattern

//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//solution--

for (int i=1;i<=5;i++){
    for (int j=1;j<=4;j++){
        System.out.print(" * ");
    }
    System.out.println();
}




    }
}

