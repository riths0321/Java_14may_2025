package typesofvariable;

public class StaticMethod {


    public static void method_2( )
    {
        System.out.println("hello sir");
    }
    public void method_1()       //Normal method , jab call krenge tab aayegi
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {

        method_2();
        StaticMethod sm=new StaticMethod();
        sm.method_1();
    }
}
