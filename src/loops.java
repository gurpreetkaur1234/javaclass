import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 5) {
//            System.out.println("hello");
//            i++;
//        }


//prbm --Ask user to enter username based on user input print their password

//        String input;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your input");
//        input = sc.next();
//        System.out.println("user entered " + input);
//
//        System.out.println("\n\n");
//
//
//        switch (input) {
//            case "tom123":
//                System.out.println("Tompassword123");
//                break;
//            case "peter123":
//                System.out.println("peterpassword123");
//                break;
//            case "sam123":
//                System.out.println("sampassword123");
//                break;
//            default:
//                System.out.println("enter correct value");
//        }


//prbm ask user to enter a value and print the value is even or odd

      /*  int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("The integers is even");
        } else {
            System.out.println("The integer is odd");
        }

       */


//prbm --> if elseif elseif else example

//
//        if (i>0){
//            System.out.println("integer is positive");
//        }
//        else if (i>=10) {
//            System.out.println("the integer is greater positive");
//
//        } else if (i==0) {
//            System.out.println("the integer is zero");
//
//        }
//        else{
//            System.out.println("the integer is negative");
//        }


//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//      while (input != 5) {
//          System.out.println("please enter integer value for input");
//          input =sc.nextInt();
//
//     }

//prbm -- sum of 1 to 10 using while loop

       /* int x=1;
        int sum = 0;
        while (x<=10) {
            sum = sum + x;
            x++;
        }
            System.out.println("The total is "+ sum);

        */


//calculator sum sub mul div exit by using while loop n switch case

      /*  int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use a calculator");
        String yes = sc.next();


        System.out.println("what operation you want to perform");
        boolean flag = true;
        while (flag) {

            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for division");
            System.out.println("press 5 for exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the value of a");
                    a = sc.nextInt();
                    System.out.println("enter the value of b");
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println("addition of a and b is " + c);
                    break;
                case 2:
                    System.out.println("enter the value of a");
                    a = sc.nextInt();
                    System.out.println("enter the value of b");
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println("difference of a and b is " + c);
                    break;
                case 3:
                    System.out.println("enter the value of a");
                    a = sc.nextInt();
                    System.out.println("enter the value of b");
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println("multiplication of a and b is " + c);
                    break;
                case 4:
                    System.out.println("enter the value of a");
                    a = sc.nextInt();
                    System.out.println("enter the value of b");
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println("division of a and b is " + c);
                    break;
                case 5:
                    flag = false;
                    // System.out.println("you did not choose any opration");
                default:
                    System.out.println("choose the operation you want to run");
            }

            System.out.println("Hope you enjoyed\n Come Again");
        }
  */


// find the power of any number-->


       /* int power=1;
        int base;
        int exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want power of a number");
        String yes = sc.next();

        System.out.println("Please enter a base here");
        base = sc.nextInt();
        System.out.println("Please enter a exponent here");
        exponent = sc.nextInt();

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
            // System.out.println(exponent); //just for debugging
        }
        System.out.println("The number is " + power);

        */


//do while loop-->


     /*   int input = 0;
        Scanner sc = new Scanner(System.in);
    do{

        System.out.println("1.abc");
        System.out.println("2.abc");
        System.out.println("3.abc");
        System.out.println("4.exit");
        input = sc.nextInt();
    }
    while (input!=4);

      */


        //star print

        /*for (int i =1;i<=8;i++){
     for (int j=1;j<=i;j++){
         System.out.print(" * ");
     }
     System.out.println();
 }

         */

//reverse pattern of stars

/*for (int i=1;i<=5;i++)  {
    for (int j=5;j>=i;j--){
        System.out.print(" * ");
    }
    System.out.println();
}

 */

// triangle pattern

     /* for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");

            }

            System.out.println();
        }

      */

//code to generate fibonacci series using for loop ??

       /* int n0 = 0;
        int n1 = 1;
        int n2;
         for (int i=2;i<=10;i++){
            n2 = n0 + n1;
            System.out.print(" " +n2);
            n0 = n1;
            n1 = n2;
         }

        */


//code for sum of natural numbers using do while loop in java?

      /*  int n = 10;
        int i=1;
        int sum = 0;
        do {
            sum = sum +i;
            System.out.println("the ans is " + sum);
            i++;
        }
        while (i<=10);


       */


// print the table using for loop

       /* int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the table you want");
        n = sc.nextInt();

        System.out.println("the table of that number which you entered is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
 }
        */


//

    }
}


