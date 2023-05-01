//public class exercisemodifiers {

//prbm 1--> create a class cylinder and use getters & setters to set its radius & height

/*private int radius;
private int height;
private  final double PI = 3.14;

    public void setRadius(int r){
    this.radius = r;
}
public int getRadius(){
    return radius;
}
public void setHeight(int h){
   this.height=h;
}
public int getHeight(){
    return height;
}
public double getvolume()
{
    return  PI * radius * radius * height;
}
    public static void main(String[] args) {
        exercisemodifiers ob4 = new exercisemodifiers();
        ob4.setRadius(9);
       System.out.println( ob4.getRadius());
        ob4.setHeight(12);
        System.out.println(ob4.getHeight());
        System.out.println(ob4.getvolume());
    }

 */


// write a program to find cylinder volume by using constructor
   /* private int radius;
    private int height;
    private  final double PI = 3.14;


    public exercisemodifiers(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
    public double getvolume()
    {
        return  PI * radius * radius * height;
    }
    public static void main(String[] args) {
        exercisemodifiers ob4 = new exercisemodifiers( 9 , 12);
//        ob4.setRadius(9);
//        System.out.println( ob4.getRadius());
//        ob4.setHeight(12);
//        System.out.println(ob4.getHeight());
       System.out.println(ob4.getvolume());
    }

*/


//prbm 3--> Overload a constructor used to initialize a rectangle of length 4 and breadth 5
 //            for using custom parameters


  /*  private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    public int getarea(){
        return length * breadth;
    }

    public exercisemodifiers() {
        this.length = 4;
        this.breadth = 5;
    }


    public exercisemodifiers(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public static void main(String[] args) {
        exercisemodifiers ob5 = new exercisemodifiers(12,15);
        System.out.println(ob5.getLength());
        System.out.println(ob5.getBreadth());
        System.out.println(ob5.getarea());
    }
}


   */