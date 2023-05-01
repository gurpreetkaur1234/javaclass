public class classobject {
   /* int x= 5;

    public static void main(String[] args) {
        classobject myObj = new classobject();    // creating an object
        System.out.println(myObj.x);


    }
     */


//prbm --> creating multiple objects

   /* int x = 6;
    int y = 8;

    public static void main(String[] args) {
        classobject myObj1 = new classobject();
        classobject myObj2 = new classobject();
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
}

    */

//prbm -->modify attributes

    /*int x=10;

    public static void main(String[] args) {
        classobject myobj = new classobject();
        myobj.x = 40;
        System.out.println(myobj.x);
    }

     */

//multiple attributes---->

   /* String fname = "john";
    String lname = "doe";
    int age = 28;

    public static void main(String[] args) {
        classobject myobj = new classobject();
        System.out.println("fullname is "+ myobj.fname +" "+ myobj.lname);
        System.out.println("my age is " + myobj.age);
    }
    */

//..................................JAVA CLASS METHODS....................................


//Static VS Public methods---> if we create static method. ..which means it can be accessed without
//    creating objects....but public methods can only be accessed by creating objects.

        // Static method
      /*  static void myStaticMethod() {
            System.out.println("Static methods can be called without creating objects");
        }

        // Public method
        public void myPublicMethod() {
            System.out.println("Public methods must be called by creating objects");
        }

        // Main method
        public static void main(String[] args) {
            myStaticMethod(); // Call the static method
            // myPublicMethod(); This would compile an error

            classobject myObj = new classobject(); // Create an object of Main
            myObj.myPublicMethod(); // Call the public method on the object
        }
        */

//Access Methods With an Object---->
    /*public void fullthrottle(){
        System.out.println("the car is going as fast as it can go");
    }

 public void speed(int maxspeed){
        System.out.println("the maximum speed is " + maxspeed);
 }

    public static void main(String[] args) {
        classobject myCar = new classobject();
        myCar.fullthrottle();
        myCar.speed(200);
    }*/

//










}

