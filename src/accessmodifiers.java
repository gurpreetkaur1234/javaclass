public class accessmodifiers {
    private int id;
    private String name;

    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        accessmodifiers ob1 = new accessmodifiers();
//        ob1.id = 45;
//        ob1.name = "code with gurpreet"; --> throws an error due to private access modifier
        ob1.setName("code with gurpreet");
        System.out.println(ob1.getName());
        ob1.setId(123);
        System.out.println(ob1.getId());



    }

}
