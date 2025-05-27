package typesofvariable;

public class LocalVariable {

    public void method_1()
    {
        int x=100;
        System.out.println("hello sir");
    }

    public static void main(String[] args) {

        LocalVariable lv=new LocalVariable();
        lv.method_1();
    }
}
