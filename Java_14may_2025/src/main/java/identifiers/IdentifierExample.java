package identifiers;

public class IdentifierExample {

    public static void main(String[] args) {

        int abc=100;
        int ABC=100;
        int abc1=100;
        int __abc=100;
        int $$abc1=100;
        //int float=100;   not support keyword as identifier
        // int 123abc=100;  not support identifier.

        System.out.println($$abc1);
    }
}