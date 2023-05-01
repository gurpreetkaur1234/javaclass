//public class methodexercise {

//prbm1--write a prgm to print the multiplication table of number n

  /*  static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The table is " + n * i);
        }
    }

    public static void main(String[] args) {

        table(7);
    }

   */




//prbm 2 --write a prgm using function to print following * pattern

/*static void pattern1(int n) {
    for (int i = 1; i<=n; i++) {
        for (int j = 1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main (String[]args){
        pattern1(5);
    }

 */


//prbm 3-- write a recursive function to calculate the sum of first n number

/*static int sumRec(int n){
    if (n==1){
        return 1;

    }
    else {
        return n+ sumRec(n-1);    //3+1+2

    }
}

    public static void main(String[] args) {
    int c=sumRec(3);
        System.out.println(c);
        }
*/


//prbm 4-- write a function to print following reverse pattern

 /* static void pattern2(int n) {

        for (int i = n; i>0; i--) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        pattern2(5);
    }

  */
// reverse pattern of star with same logic

  /*  static void pattern2(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        pattern2(5);
    }

   */


    //prbm 5--- fibonacci series
//0 1 1 2 3 5  8 13....n
    /*static int fib(int n){

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }


    public static void main(String[] args) {
        int n = 10; // number of terms in the series
        System.out.print("Fibonacci series of " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}


     */









//prbm 6-- write a function to find avg of a set no. passed as arguments

//prbm 8-- repeat using 2 recursion----incomplete

   /* static void pattern1_rec(int n) {


       if (n>0) {
           pattern1_rec(n - 1);

           for (int i=0;i<n;i++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void main (String[]args){
        pattern1_rec(5);
    }
   */


// prbm 9 write a function to convert celius to fahrenheit
























