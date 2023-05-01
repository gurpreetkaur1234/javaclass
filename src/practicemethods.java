import java.util.Scanner;

public class practicemethods {
   /* static int myMethod(int x, int y) {
        int z = x+y;
        return z;

    }

    public static void main(String[] args) {
       int a=5;
       int b=7;
       int c;
       c=myMethod(a,b);
       System.out.println(c);
    }

    */

  /*  static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b= 6;
        int c;
        c= logic(a,b);
        System.out.println(c);

    }
    */
//Method Overloading-- two methods have same name but different parameters

   /* static void foo(){
        System.out.println("Good morning foo");
    }
    static void foo(int a){
        System.out.println("Good morning "+ a +" bro!");

    }
    static int foo(int a, int b){    //we cannot change datatype
        int c=a*b;
        //System.out.println(a*b);
        return c;
    }
    public static void main(String[] args) {
        int x=5;
        int y=2;
        int z;
        z=foo(x,y);
        System.out.println(z);
    }
*/


//variable arguments(VarArgs)--------DOUBT not understand

/*static int sum(int ...arr){
    int result=0;
    for (int a: arr){     //a=element
        result += a;
    }
    return result;
}

    public static void main(String[] args) {
    System.out.println("the value is "+ sum( ...arr:1,2));
    }

 */

//java recursion-- a function in java can call itself .

   /* static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n=4;
       System.out.println("The value of factorial n is " + factorial(n));
    }

    */


// with iterative apporoch--

/*static int factorial_iterative(int n){
    if(n==0 || n==1){
        return 1;
    }
    else {
        int product=1;
        for (int i=1;i<=n;i++){
            product = i;
        }
        return  product;
    }
}

    public static void main(String[] args) {
    int x=4;
        System.out.println("The value of factorial n is "+ factorial_iterative(x));
    }

//with for loop same as above but by using method

/*static int logic(int n){
    int fact = 1;
    for (int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}

    public static void main(String[] args) {
    int a = 5;
    int result;
    result = logic(a);
    System.out.println("the ans is " + result);



 */

//fibonacci series nth term--0 1 1 2 3 5 8 13 by using recursion


    /*static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }

     */

// prbm fibonacci series nth term by using loop with methods

  /*  static int logic(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2 =  0;

        for (int i = 2; i <= n; i++) {
            n2 = n0 + n1;
            System.out.print(" " + n2);
            n0 = n1;
            n1 = n2;
        }

        return n2;
    }

    public static void main(String[] args) {
        int a = 12;
        int result;
        result = logic(a);
        System.out.println("");
    }

   */


// class question --> add two integers .if sum is even print sum is even ,if sum is odd
    // print sum is odd?

  /*  static int dosum(int a, int b) {


        int sum = a + b;

//        if (sum % 2 == 0) {
//            System.out.println(" The sum is even");
//        }
//        else {
//            System.out.println("The sum is odd");
//        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 7;
        int y = 4;               // we ca
        int result;
        result = dosum(x, y);
        System.out.println("The result is " + result);
        if (result % 2 == 0) {
            System.out.println(" The sum is even");
        }
        else {
            System.out.println("The sum is odd");
        }
    }

   */


// above prbm but with user input

   /* static int logic(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        int c = a + b;
        return  c;

    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int result;
        result = logic(x,y);
        System.out.println("the ans is " + result);
        if (result%2==0){
            System.out.println("the sum of a and b is even");
        }
        else {
            System.out.println(" the sum of a and b is odd");
        }
    }
*/
//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.
// (Do not use Java built-in method)

    /*static int myMethod(int base, int exponent) {
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        return power;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want power of a number");
        String yes = sc.next();

        System.out.println("Please enter a base here");
        int base = sc.nextInt();
        System.out.println("Please enter a exponent here");
        int exponent = sc.nextInt();
        int result = myMethod(base, exponent);


        System.out.println("the ans is " + result);


    }
    */




}
























