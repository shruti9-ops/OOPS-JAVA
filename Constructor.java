class MyEmployee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public int  getid(){
        return id;
    }
    
    
    public MyEmployee(){
        id = 45;
      name = "Sakshi";
     }
    public MyEmployee(String name , int id){
        this.id = id;
        this.name = name;
    }
    public MyEmployee(String name){
        id = 10;
        this.name = name;
    }
   

}
class Cylinder{
    private int radii;
    private int h;
    public void setradius(int radius){
        radii = radius;
    }
    public void setheight(int height){
        h = height;
    }
    public int getradius(){
       return  radii;
    }
    public int getheight(){
       return h;
    }
    public double area(){
        double ar = 2*3.14*radii*h + 2*3.14*radii*radii;
        return ar;
    }
    public double volume(){
        double vol = 3.14*radii*radii*h;
        return vol;
    }
    


}
public class Constructor{
    public static void main(String args[]){
        MyEmployee e = new MyEmployee("Shruti" , 12);
        System.out.println(e.getid());
        System.out.println(e.getname());
        Cylinder c1 = new Cylinder();
        c1.setheight(10);
        c1.setradius(20);
        System.out.println(c1.getheight());
        System.out.println(c1.getradius());
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }
}