package typesofvariable;

public class InstanceVariable {

        int x=100;         //Instance variable /global variable

        public static void main(String[] args) {

            InstanceVariable iv=new InstanceVariable();
            System.out.println(iv.x);
        }
    }