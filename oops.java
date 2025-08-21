public class oops{
    public class Student{
        String name;
        int rollno;
        String address;
        public Student(String name , int rollno , String address){
            this.name = name;
            this.rollno = rollno;
            this.address = address;
        }
    }
    public static void main(String args[]){
        Student s1 = new Student("Shruti" , 12 , "Collector ganj");
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.address);
    }
}