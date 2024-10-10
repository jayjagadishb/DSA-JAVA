import java.util.*;

public class StackArrayList {
    
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }

           //push
        public static void push(int data){
            list.add(data);
        }

           //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

           //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
            Stack.push(1);
            Stack.push(2);
            System.out.println(Stack.peek());
            Stack.pop();
            System.out.println(Stack.peek());
            Stack.pop();
            System.out.println(Stack.peek());
    }
}
