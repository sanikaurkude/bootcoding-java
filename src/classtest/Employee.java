package classtest;

public class Employee {
    String name;
   static String company;
    double salary;
    public void detail(){
        //non static method
        System.out.println(name+": "+salary+":"+company);
    }
    public static void detail(Employee employee){
        //static method
        System.out.println(employee.name+": "+company+": "+employee.salary);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        company="tcs";
        Employee e2=new Employee();
        e.name="vaishnavi";
        e.salary=10000;
        e2.salary=50000;
        e2.name="sanika";
        detail(e);
        detail(e2);

    }
}
