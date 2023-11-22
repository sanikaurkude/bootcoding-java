package classtest;

public class PreException {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("value " + c);
        } catch (ArithmeticException e) {
        System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
            System.out.println("the end");
            String s="sanika";
            System.out.println(s);
    }
}
