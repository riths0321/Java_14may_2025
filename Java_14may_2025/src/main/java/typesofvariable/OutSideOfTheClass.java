package typesofvariable;

public class OutSideOfTheClass {

    public static void main(String[] args) {

        //Static variable
        System.out.println(StaticVariable.z);

        //Instance variable
        InstanceVariable iv=new InstanceVariable();
        System.out.println(iv.x);

        //static method
        StaticMethod.method_2();
    }
}