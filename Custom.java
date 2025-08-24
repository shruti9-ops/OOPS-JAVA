// class Employee{
//     int id ;
//     String name;
//     int salary;
//     public void printdetails(){
//         System.out.println("My name is "+name);
//         System.out.println("My id is "+id);
//     }
//     public int getsalary(){
//         return salary;
//     }
//     public void getdetails(){
//         System.out.println(name + id + salary);
//     }
//     public String getname(){
//         return name;
//     }
//     public void setname(String name){
//          name = name;
//     }
// }
// class Cellphone{
//     public static void vibrating(){
//         System.out.println("Vibrating!!!!!!!!!!");
//     }
//     public static void calling(){
//         System.out.println("calling!!!!!!!!!!");
//     }
//     public static void ringing(){
//         System.out.println("Ringing!!!!!!!!!!");
//     }
//     public static void callfriend(){
//         System.out.println("calling friend!!!!!!!!!!");
//     }
    
// }
// class Square{
//      int side;
//     public  int area(){
//         return side*side;
//     }
//     public  int perimeter(){
//         return 4*side;
//     }

// }
// class Rectangle{
//     static int len;
//     static int breadth;
//     public static int area(){
//         return len*breadth;

//     }
//     public static int peri(){
//         int per = 2*(len + breadth);
//         return per;
//     }
// }
// class Circle{
//     int r;
//     public double area(){
//         double ar = 3.14*r*r;
//         return ar;
//     }
//     public double peri(){
//         double per = 2*3.14*r;
//         return per;    
//     }
// }
// class Tommyct{
// public void hit(){
//     System.out.println("hitting by the enemy");
// }
// public void run(){
//     System.out.println("running from the enemy");
// }
// public void fire(){
//     System.out.println("firing by the enemy");
// }
// }
// public class Custom{
//     public static void main(String[] args) {
//         Employee e1 = new Employee();//instatntiating hte new object of the Employee
//         // setting attributes
//         e1.id = 12;
//         e1.name = "Rajesh";
//         e1.salary = 12345;
//          Employee e2 = new Employee();
//          e2.name = "Ram";
//          e2.id = 24;
//          e2.salary = 89072;
//          e2.printdetails();
//          System.out.println(e2.getsalary());

//         //System.out.println(e1.id);
//         //System.out.println(e1.name);
//         e1.printdetails();
//         e2.getdetails();
//         e1.getdetails();
//         Employee e3 = new Employee();
//         e3.name = "raja";
//         e3.id = 19;
//         e3.salary = 24638;
//         e3.setname("Raja");
//         System.out.println(e3.getname());
//         // Cellphone c1 = new Cellphone();
//         // c1.ringing();
//         // c1.callfriend();
//         // c1.vibrating();
//         // c1.calling();

//         Square s1 = new Square();
//         s1.side  = 3;
//         System.out.println(s1.area());
//         System.out.println(s1.perimeter());

//         Rectangle r = new Rectangle();
//         r.len = 10;
//         r.breadth = 20;
//         System.out.println(r.area());
//         System.out.println(r.peri());
//         Circle c1 = new Circle();
//         System.out.println(c1.area());
//         System.out.println(c1.peri());
//         Tommyct p1 = new Tommyct();
//         p1.run();
//         p1.fire();
//         p1.hit();
//     }
// }
                // <----------------Access Modifiers--------------->
class Employee{
    private int id;
    private String name;
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setid(int n){
        this.id = n;
    }
    public int getid(){
        return id;
    }

}
class circle{
    private int radi;
    private double ar;
    public void setradi(int r){
        this.radi = r;
    }
    public int getradi(){
        return radi;
    }
    public void setar(int r){
        ar = 3.14*r*r;
    }
    public double getar(){
        return ar;
    }
}
public class Custom {

public static void main(String[] args) {
    Employee e1 = new Employee();
    // e1.id = 10;
    // e1.name = "johny"; throws an error due to the private modifiers
    e1.setname("Johny");
    e1.setid(12);
    System.out.println(e1.getname());
    System.out.println(e1.getid());
}
    
}
