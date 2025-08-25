class MyEmployee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public int  getid(\){
        return id;
    }
    public void  setname(String name){
        name = name;

    }
    public void setid(int id){
        id = id;
    }
   

}
public class Constructor{
    public static void main(String args[]){
        MyEmployee e = new MyEmployee();
        e.setid(10);
        System.out.println(e.getid());
        e.setname("Shruti");
        System.out.println(e.getname());
    }
}