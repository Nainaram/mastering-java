

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <Integer> list = new Stack<Integer>();
        list.push(45);
        list.push(90);
        list.push(88);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.search(90));
        System.out.println(list.empty());


    }
}
