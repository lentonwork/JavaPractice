package stack;

public class Stack {

    public static void main(String[] args) {
        System.out.println("main");
        Stack stack1 = new Stack();
        
        stack1.pancake();
        System.out.println("end");
    }

    public void pancake (){
        System.out.println("Tasty!!!");
        syrup();
    }

    public void syrup(){
        System.out.println("Extra tasty!!!!!!!!!!");
    }

}
