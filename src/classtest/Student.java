package classtest;

public class Student {
    int roll;
    String name;
  static  String depart;
  public void detail(){
      System.out.println(name+":"+roll+": "+depart);
  }
    public static void detail(Student student){
        System.out.println(student.name+":"+student.roll+": "+depart);
    }

    public static void main(String[] args) {
        Student s=new Student();
        Student v=new Student();
        s.name="sanika";
        v.name="vaishnavi";
        depart="cse";
        s.roll=30;
        v.roll=32;
        detail(s);
        detail(v);
        s.detail();
        v.detail();






    }
}
