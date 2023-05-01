public class accessmodifier1 {
    private int radius;

    private final double PI = 3.14;

   public void setRadius(int r){
       this.radius = r;
   }
   public int getRadius(){
       return radius;
   }
   public double getArea(){
       return PI* radius * radius;
   }
   public double getCircumference(){
       return 2 * PI * radius;
   }





   public static void main(String[] args) {
       accessmodifier1 ob2 = new accessmodifier1();
       ob2.setRadius(4);
       System.out.println(ob2.getRadius());

       System.out.println(ob2.getArea());

       System.out.println(ob2.getCircumference());

   }



    }

