import java.util.Stack;

public class StackJCF {

    //pushAtBottom Problem
    public static void pushAtBottom(Stack<String> s , String data){
        if(s.empty()){
           s.push(data);
           return;
        }

        String top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //reverse stack
    public static void reverseStack(Stack <String> s){
        if(s.empty()){
            return;
        }
        String top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    
    public static void main(String[] args) {
        Stack <String> s = new Stack<>();
        s.push("H");
        s.push("S");
        s.push("I");
        s.push("R");
        s.push("T");
        pushAtBottom(s, "A");
        //T R I S H A
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }
}
