import java.util.Scanner;
//pbm1-- create a program of 5 floats and calculate their sum

public class arrayexercise {
    public static void main(String[] args) {
        /*float [] marks= { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };

        float sum=0;
        for (float element:marks) {
            sum = sum + element;
        }
            System.out.println("The value of sum is "+sum);
*/



//pbm2-- write a prgm to find out whether a given integer is present in array or not

     /*   float [] marks= { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };

        float num= 67.8f;
        boolean isInArray=false;
        for (float element:marks) {
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }

      */


//prbm3--calculate the avg marks of an array containing marks of all-
       // -students in physics using for each loop

       /* int[] marks ={45,68,86,95,78,73};
        int sum=0;
        for (int element:marks){
            sum=sum+element;
        }
        System.out.println("The value of average marks "+sum/marks.length);

*/


//prbm 4-- create a prgm to add two matrics of size 2x3

       /* int[][] mat1 ={{1,2,3},
                      {4,5,6}};
        int[][]mat2 ={{2,6,13},
                      {4,7,1}};
        int[][]result ={{0,0,0},
                        {0,0,0}};
        for (int i=0;i<mat1.length;i++){   //row number of time
            for (int j=0;j<mat1[i].length;j++){   //column number of time
         //       System.out.format("setting value for i=%d and j=%d\n",i,j);
                result[i][j] =mat1[i][j] +mat2[i][j];
            }
        }

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j] =mat1[i][j] +mat2[i][j];
            }
           System.out.println("");
        }
*/


//prbm5-- write a prgm to reverse an array

/*int[] marks={45,67,87,34,53,96};
for (int i=marks.length-1;i>=0;i--)
   System.out.print(marks[i]+" ");

 */


//prbm6--write a prgm to find maximum element in an array

/*int[] marks={45,86,59,92,78,85};
int max=0;    //for negative integers- Integer.MIN_VALUE;
for (int element:marks){
    if(element>max)
    {
        max=element;
    }
}
System.out.println("the maximum element is "+max);

 */



//prbm 7-- write a prgm to find the minimum element in an array


       /* int[] marks={45,86,59,92,33,78,85};
        int min = Integer.MAX_VALUE;
        for (int element: marks) {
            if (element < min) {
                min = element;
            }
        }
                System.out.println("The value of minimum element is "+min);

        */



//prbm 8-- write a prgm to find out whether an array is sorted or not?

/*boolean isSorted = true;
        int[] arr={1,2100,3,455,5,34,67};
        for(int i =0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
            isSorted = false;
             break;
    }
}
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }

 */


//user input program

      /*  Scanner scanner =new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("what is your favourite food");
        String food = scanner.nextLine();

        System.out.println("hello "+ name);
        System.out.println("you are "+age+ "years old");
        System.out.println("you like "+food);

*/







    }
}
