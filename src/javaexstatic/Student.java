package javaexstatic;

public class Student {
    String name;
    int roll;
     String department;
     static String college;

    public void run(){
        //non static method
        System.out.println(name+"-"+roll+"-"+department+"-"+college);
    }
    public static void run(Student s1){
        //static method
        System.out.println(s1.name+"-"+s1.roll+"-"+s1.department+"-"+college);
    }

    public static void main(String[] args) {
        Student first=new Student();
        Student second=new Student();
        first.name="sanika";
        first.roll=209;
        first.department="cse";
        second.name="vaishnavi";
        second.roll=235;
        second.department="Etc";
        college="kdk";
        first.run();
        second.run();
        run(first);
        //static method can be call directely
        run(second);

    }
}
